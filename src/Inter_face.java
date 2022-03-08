import java.util.Scanner;
public class Inter_face 
{
	public static void main(String[] args) 
	{
		long a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A value = ");
        a = scanner.nextLong();
        System.out.println("Enter B value = ");
        b = scanner.nextLong();
        scanner.close();
        
        Inter_Implement inter = new Inter_Implement();
  
        System.out.println("The Addition value is = "+inter.addition(a,b));
        System.out.println("The Subtraction value is = "+inter.subtraction(a,b));
        
        inter.display();
	}
}
