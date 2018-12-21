package exception;

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}

class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
public class Custom {
	
	public static void main (String args[])
	{
		int age=Integer.parseInt(args[0]);
		
		if(age>60)
		throw new TooYoungException("you are too young");
		
		else if(age<18) {
			throw new TooOldException("you are too old");
		}
		else
		{
			System.out.println("age criteria met");
			}
	}
}
