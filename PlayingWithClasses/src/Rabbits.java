
public class Rabbits {
	
	//instance lines
	
	int numberOfRabbits = 2;
	int numberOfBabies = 0;
	int multiplier = 2;
	
	//constructor method
	
	public Rabbits (int initialNumOfRabbits) {
		numberOfRabbits = initialNumOfRabbits;
	}
	
	// Rabbits producing more rabbits method
	
	public int rabbitsHump(int parentRabbits) {
		System.out.println("There are currently "+numberOfRabbits+" rabbits!");
		System.out.println(parentRabbits+" rabbits are humping.");
		numberOfBabies = parentRabbits * 3;
		System.out.println("They have made "+numberOfBabies+" new baby rabbits");
		numberOfRabbits += numberOfBabies;
		System.out.println("There are now a total of "+numberOfRabbits+" rabbits!");
		return (numberOfRabbits);
	}
	
	public void rabbitsHumpNB(int parentRabbits) {
		for (int i = parentRabbits; i > 0; i-- ) {
			System.out.println("Number of rabbits still humping: "+ i);
		}
		System.out.println("All rabbits done humping.");
		
		 
	}
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rabbits group1 = new Rabbits(10);
		group1.rabbitsHump(11);
		group1.rabbitsHump(10);
		
		group1.rabbitsHumpNB(10);
		
		
	}

}
