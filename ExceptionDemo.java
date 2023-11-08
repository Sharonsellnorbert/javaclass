package javaclass;

public class ExceptionDemo {
	 public static void main(String[]args) {
			try {
				String s="123";
				System.out.println(Integer.parseInt(s));
				System.out.println(10/0);
			
			}
	        catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("Sorry!! Number format");
			}
			catch(ArithmeticException e) {
				System.out.println("Sorry !! Arithmetic Exception");
			}
			catch(Exception e) {
				System.out.println("Unexpected Exception");
			}
			finally {
				System.out.println(" I am finally block");
			}
				
			
			
		}
}
