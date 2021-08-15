public class MyDeskObject {
		
		// instance field, 
		//here we place what variables or things are created with every instance of the class
		
		int size;
		String color;
		boolean cool;
		
		//now follows the constructor method
		
		public MyDeskObject (int objectSize, String objectColor, boolean objectCool) {
			size = objectSize;
			color = objectColor;
			cool = objectCool;
		}
		
		

	public static void main(String[] args) {
		// here we can create an instance on the class
		
		MyDeskObject phone = new MyDeskObject(20, "black", true);
		MyDeskObject mouse = new MyDeskObject(15, "blackgrey", true);
		MyDeskObject remote = new MyDeskObject(25, "grey", false);
		MyDeskObject pencil = new MyDeskObject(24, "white", false);
		
		
		System.out.println("My phone is on my desk and is " + phone.size + "CM long. It is " + phone.color +" and it's coolness is " + phone.cool);
		System.out.println("Is phone larger than pencil? " + (phone.size > pencil.size));
		
	}

}
	

