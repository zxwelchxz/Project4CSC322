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
		joes.setReceipt("food", 4000);
		joes.setReceipt("drink", 3500);
		moes.setReceipt("food", 14000);
		moes.setReceipt("drink", 9000);
		
		ritz.setOccupancyRate(98);
		ritz.setReceipt("occupancy",25000);
		notel.setOccupancyRate(93);
		notel.setReceipt("occupancy", 5500);
		
		six12.setReceipt("newspaper", 2400);
		six12.setReceipt("other", 6000);
		
		//Week2
		joes.setReceipt("food", 2500);
		joes.setReceipt("drink", 3500);
		moes.setReceipt("food", 12500);
		moes.setReceipt("drink", 12500);
		
		ritz.setOccupancyRate(88);
		ritz.setReceipt("occupancy", 21500);
		notel.setOccupancyRate(98);
		notel.setReceipt("occupancy", 6575);
		
		six12.setReceipt("newspaper", 1700);
		six12.setReceipt("other", 5927);
		
		//Display Totals
		moes.printTotals("food");
		moes.printTotals("drink");
		moes.totalReceipt();
		joes.printTotals("food");
		joes.printTotals("drink");
		joes.totalReceipt();
		
		ritz.printTotals();
		notel.printTotals();
		
		six12.printTotals("newspaper");
		six12.printTotals("other");
	}

}
