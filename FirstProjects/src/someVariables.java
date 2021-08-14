import java.util.concurrent.TimeUnit;

//import java.time;
//

public class someVariables {
	
	public static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}

	public static void main(String[] args) {
		int bignum = 500;
		int smalnum = 50;
		while (bignum > smalnum) {
			System.out.println(bignum);
			wait(100);
			bignum -= 10;
		}
		
		if (bignum == smalnum) {
			System.out.println("They're equal");
		}
		else {
				System.out.println("They're not equal");
			}
			
		}

	}


