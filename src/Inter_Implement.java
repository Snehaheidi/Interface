
public class Inter_Implement implements Addition , Subtraction
{
    public long addition(long a , long b)
    {
    	long add = a + b;
    	return add;
    }
	@Override
	public long subtraction(long a, long b) {
		long sub = a - b;
		return sub;
	}
	//@override  --> Default method override
	public void display()
	{
		System.out.println("Override the Interface Method...");
	}
}
