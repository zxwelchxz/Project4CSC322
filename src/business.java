/* Jonathan Dimmick & Steven Welch
   CSC 322 Assignment 4 */


abstract class business {
	protected int accnum = 0;
	protected double rectotal = 0;
	protected double taxes = 0;
	private String name;
	
	public business(int accnum) {
		this.accnum = accnum;
		
	}
	
	public business(int accnum, double rectotal) {
		this.accnum = accnum;
		this.rectotal = rectotal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
class Restaurant extends business {
	static double drinktax = .08;
	static double bartax = .03;
	double foodtotal;
	double drinktotal;

	public Restaurant(int accnum) {
		super(accnum);
	}
	
	public Restaurant(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void totalReceipt() {
		
		// this needs to be calculated for evey week before total receipts are calculated and before drink tax is added
		if(this.foodtotal > this.drinktotal) {
			this.rectotal = (this.foodtotal + this.drinktotal) * Restaurant.bartax;
		}
		
		else {
			this.rectotal = this.foodtotal + this.drinktotal;
		}
		System.out.println(getName() + " receipt total: " + this.rectotal);
	}
	
	public void setReceipt(String type, double total) {
		if (type.equals("drink") == true) {
			this.drinktotal += (Restaurant.drinktax * total) + total;
		}
	// calculates receipt total for food
		else if (type.equals("food") == true) {
		this.foodtotal = this.foodtotal + total;
		}
	}
	
	public void printTotals(String type) {
		if(type.equals("food") == true) {
			System.out.println(getName() + " food total: " + this.foodtotal);
		}
		else if (type.equals("drink") == true) {
			System.out.println(getName() + " drink total: " + this.drinktotal);
		}
	}
}

class Hotel extends business {
	static double occupancy = .02;
	static double totaltax = .06;
	int occupancyrate;
	
	public Hotel(int accnum) {
		super(accnum);
	}
	
	public Hotel(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void setOccupancyRate(int ocrate) {
		this.occupancyrate = ocrate;
	}
	
	public void printTotals() {
		System.out.println(getName() + " total taxes: " + this.rectotal);
	}
	
	public void setReceipt(String type, double total) {
		if(type.equals("occupancy") == true) {
			if(this.occupancyrate > 90) {
				this.rectotal += (Hotel.occupancy * total) + total;
			}
			
		this.rectotal += (Hotel.totaltax * this.rectotal);
		}
	}

}


class Convenience extends business {
	static double newspapertax = 0.0;
	static double othertax = .07;
	double newspapertotal;
	double othertotal;

	public Convenience(int accnum) {
		super(accnum);
	}
	
	public Convenience(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void printTotals(String type) {
		if(type.equals("newspapertax") == true) {
			System.out.println(getName() + " newspaper total: " + this.newspapertotal);
		}
		else if (type.equals("other") == true) {
			System.out.println(getName() + " other total: " + this.othertotal);
		}
	}
	
	public void setReceipt(String type, double total) {
		if(type.equals("other") == true) {
			this.othertotal += (Convenience.othertax * total) + total;
		}
		else if (type.equals("newspaper") == true) {
			this.newspapertotal = Convenience.newspapertax + total;
		}
	}
}
