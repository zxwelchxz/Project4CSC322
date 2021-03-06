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
	double tempdrink;
	double tempfood;

	public Restaurant(int accnum) {
		super(accnum);
	}
	
	public Restaurant(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void totalReceipt() {
		this.rectotal = this.drinktotal + this.foodtotal;
		System.out.println(getName() + " receipt total: " + this.rectotal);
		
		this.rectotal = 0;
		this.tempdrink = 0;
		this.tempfood = 0;
		this.foodtotal = 0;
		this.drinktotal = 0;
		this.taxes = 0;
	}
	
	public void setReceipt(String type, double total) {
		if (type.equals("drink") == true) {
			this.tempdrink += total;
		}
	// calculates receipt total for food
		else if (type.equals("food") == true) {
		this.tempfood += total;
		}
	}
	
	public void addBarTax() {
		if(this.tempfood < this.tempdrink) {
			this.taxes += Restaurant.bartax * this.tempdrink; 
		}
		this.taxes += Restaurant.drinktax * this.tempdrink;
		this.foodtotal += this.tempfood;
		this.drinktotal += this.tempdrink;
		this.tempdrink = 0;
		this.tempfood = 0;
	}
	
	public void printTotals(String type) {
		
		if(type.equals("food") == true) {
			System.out.println(getName() + " food total: " + this.foodtotal);
		}
		else if (type.equals("drink") == true) {
			System.out.println(getName() + " drink total: " + this.drinktotal);
		}
		
		else {
			System.out.println(getName() + " taxes: " + this.taxes);
		}
	}
}

class Hotel extends business {
	static double occupancy = .02;
	static double totaltax = .06;
	int occupancyrate;
	double tempoccu = 0;
	
	public Hotel(int accnum) {
		super(accnum);
	}
	
	public Hotel(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public void setOccupancyRate(int ocrate) {
		this.occupancyrate = ocrate;
	}
	
	public void addOccuTax() {
		if(this.occupancyrate > 90) {
			this.taxes += Hotel.occupancy * this.tempoccu; 
		}
		this.taxes += Hotel.totaltax * this.tempoccu;
		this.rectotal += this.tempoccu;
		this.tempoccu = 0;
	}
	
	public void printTotals() {
		System.out.println(getName() + " taxes: " + this.taxes);
		System.out.println(getName() + " total receipt: " + this.rectotal);
		this.taxes = 0;
		this.tempoccu = 0;
		this.rectotal = 0;
	}
	
	public void setReceipt(String type, double total) {
		if(type.equals("occupancy") == true) {
		this.tempoccu = total;
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
		if(type.equals("newspaper") == true) {
			System.out.println(getName() + " newspaper total: " + this.newspapertotal);
		}
		else if (type.equals("other") == true) {
			System.out.println(getName() + " other total: " + this.othertotal);
		}
		
		this.rectotal = 0;
		this.taxes = 0;
	}
	
	public void setReceipt(String type, double total) {
		if(type.equals("other") == true) {
			this.taxes += (Convenience.othertax * total);
			this.othertotal += total;
		}
		else if (type.equals("newspaper") == true) {
			this.taxes += (Convenience.newspapertax * total);
			this.newspapertotal += total; 
		}
		
		else {
			System.out.println(getName() + " taxes: " + this.taxes);
		}
	}
	
	public void totalReceipt() {
		this.rectotal = this.othertotal + this.newspapertotal;
		System.out.println(getName() + " receipt total: " + this.rectotal);
		this.rectotal = 0;
		this.taxes = 0;
		this.othertotal = 0;
		this.newspapertotal = 0;
	}
}
