import java.util.Scanner;
class Series
{
	double x;
	int n;
	Series(double z, int l)
	{
		x = z;
		n = l;
	}
	int factorial(int num)
	{
		int f = 1;
		for(int i=2;i<=n;i++)
		f = f * i;
		return f;
	}
	void calc()
	{
		double s = 0;
		for(int i=1;i<=n;i++)
		{
			s = s + (Math.pow(-1,i))*((Math.pow(x,i))/factorial(i+1));
		}
		System.out.println("Req sum:"+s);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and n");
		double z = sc.nextDouble();
		int l = sc.nextInt();
		Series obj = new Series(z,l);
		obj.calc();
        sc.close();
	}
}

