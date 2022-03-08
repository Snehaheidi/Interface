
public interface Addition 
{
	//public Addition() //--> interface no use constructors
	public long addition(long a,long b);
	default void display()
	{
		System.out.println("The Interface Using Default Method...");
	}
}
