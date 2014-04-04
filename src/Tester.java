public class Tester {

	public static void main(String[] args) {
		Restaurant moes = new Restaurant(1);
		moes.setName("Moe's");
		Restaurant joes = new Restaurant(2);
		joes.setName("Joe's");
		Hotel ritz = new Hotel(3);
		ritz.setName("Ritz");
		Hotel notel = new Hotel(4);
		notel.setName("Notel");
		Convenience six12 = new Convenience(612);
		six12.setName("six12");
		
		//Week1
		System.out.println("___WEEK1____");
		joes.setReceipt("food", 4000);
		joes.setReceipt("drink", 3500);
		joes.addBarTax();
		joes.printTotals("food");
		joes.printTotals("drink");
		joes.printTotals("taxes");
		joes.totalReceipt();
		System.out.println();
		
		moes.setReceipt("food", 14000);
		moes.setReceipt("drink", 9000);
		moes.addBarTax();
		moes.printTotals("food");
		moes.printTotals("drink");
		moes.printTotals("taxes");
		moes.totalReceipt();
		System.out.println();
		
		ritz.setOccupancyRate(98);
		ritz.setReceipt("occupancy",25000);
		ritz.addOccuTax();
		ritz.printTotals();
		System.out.println();
		
		notel.setOccupancyRate(93);
		notel.setReceipt("occupancy", 5500);
		notel.addOccuTax();
		notel.printTotals();
		System.out.println();
		
		six12.setReceipt("newspaper", 2400);
		six12.setReceipt("other", 6000);
		six12.printTotals("newspaper");
		six12.printTotals("other");
		six12.printTotals("taxes");
		six12.totalReceipt();
		System.out.println();
		
		//Week2
		System.out.println("___WEEK2____");
		joes.setReceipt("food", 2500);
		joes.setReceipt("drink", 3500);
		joes.addBarTax();
		joes.printTotals("food");
		joes.printTotals("drink");
		joes.printTotals("taxes");
		joes.totalReceipt();
		System.out.println();
		
		
		moes.setReceipt("food", 12500);
		moes.setReceipt("drink", 12500);
		moes.addBarTax();
		moes.printTotals("food");
		moes.printTotals("drink");
		moes.printTotals("taxes");
		moes.totalReceipt();
		System.out.println();
		
		ritz.setOccupancyRate(88);
		ritz.setReceipt("occupancy", 21500);
		ritz.addOccuTax();
		ritz.printTotals();
		System.out.println();
		
		notel.setOccupancyRate(98);
		notel.setReceipt("occupancy", 6575);
		notel.addOccuTax();
		notel.printTotals();
		System.out.println();
		
		six12.setReceipt("newspaper", 1700);
		six12.setReceipt("other", 5927);
		six12.printTotals("newspaper");
		six12.printTotals("other");
		six12.printTotals("taxes");
		six12.totalReceipt();
	}

}