/* Jonathan Dimmick & Steven Welch
   CSC 490 Assignment 4 */


abstract class business {
	protected int accnum = 0;
	protected double rectotal = 0;
	protected double taxes = 0;

	
	public business(int accnum) {
		this.accnum = accnum;
		
	}
	
	public business(int accnum, double rectotal) {
		this.accnum = accnum;
		this.rectotal = rectotal;
	}
	
	public double setReceipt(String type, double total) {
		// calculates receipt total for drinks
		if (type.equals("drink") == true) {
				Restaraunt.drinktotal += (Restaraunt.drinktax * total) + total;
			}
		// calculates receipt total for food
		else if (type.equals("food") == true) {
			Restaraunt.foodtotal += total;
		}
		// calculates receipt total for other items
		else if(type.equals("other") == true) {
			this.rectotal += (Convenience.othertax * total) + total;
		}
		else if(type.equals("occupancy") == true) {
			if(Hotel.occupancyrate > 90) {
				this.rectotal += (Hotel.occupancy * total) + total;
			}
		}
		
		else {
			this.rectotal += total;
		}
		
		return rectotal;
		}
}
class Restaraunt extends business {
	static double drinktax = .08;
	static double foodtotal;
	static double drinktotal;

	public Restaraunt(int accnum) {
		super(accnum);
	}
	
	public Restaraunt(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void totalReceipt() {
		if(Restaraunt.foodtotal > Restaraunt.drinktotal) {
			this.rectotal = (foodtotal + drinktotal)*.03;
		}
		
		else {
			this.rectotal = foodtotal + drinktotal;
		}
	}
}

class Hotel extends business {
	static double occupancy = .02;
	static int occupancyrate;
	
	public Hotel(int accnum) {
		super(accnum);
	}
	
	public Hotel(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void setOccupancyRate(int ocrate) {
		Hotel.occupancyrate = ocrate;
	}

}


class Convenience extends business {
	static double newspapertax = 0.0;
	static double othertax = .07;

	public Convenience(int accnum) {
		super(accnum);
	}
	
	public Convenience(int accnum, double rectotal) {
		super(accnum, rectotal);
	}

}
