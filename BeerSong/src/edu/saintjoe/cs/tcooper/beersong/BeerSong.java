package edu.saintjoe.cs.tcooper.beersong;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0 ) {
			if (beerNum == 1) {
				word = "bottle"; // singular, as in one bottle.
				
			}
			
		System.out.println(beerNum + " " + word + " of beer on the wall");
		System.out.println(beerNum + " " + word + " of beer.");
		}

	}

}
