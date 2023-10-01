//Adam Shaltout
class ETOX
{
    public static void main(String[] args)
    {
	while (true)
	{
	    final double constant = 1/power(10,15);
	    System.out.print("\nPlease input x (input number below 0 to stop): ");
	
	    double x = In.getDouble();
	    if (x < 0)
	    {
		break;
	    }
	
	    double runningTotal = 1;
	    double term = x;
	    double counter = 1;
	    while (term > Math.abs(runningTotal*constant))
	    {
		term = power(x,counter)/factorial(counter);
		runningTotal += term;
		counter += 1;
	    }
	
	    System.out.print(runningTotal);
	}
    }
    
    public static double power(double base, double exp)
    {
	if (exp == 0 && base > 0)
	{
	    return 1.0;
	}
	double finals = 1;
	for (int i = 0; i < Math.abs(exp); i++)
	{
	    finals *= base;
	}
	if (exp < 0)
	{
	    return 1/finals;
	}
	return finals;
    }
    
    public static double factorial(double base)
    {
	double total = base;
	for (double i = base-1; i > 0; i--)
	{
	    total *= base-i;
	}
	return total;
    }
}
