package Pro1;

import org.testng.annotations.Test;

public class String_rev 
{
@Test
public void primenumber()
{
	int num=5;
	if(num%1==0 && num%num==0)
	{
		System.out.println("it is prime number");
	}
	else
	{
		System.out.println("it is not a prime number");
	}
}
}
