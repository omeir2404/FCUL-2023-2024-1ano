public class ex02
{
	public static void main(String[] args)
	{
		int i = 15,n = 14,t = 18;
		int max1 = 0, max2 = 0;
		if (i >= n && i >= t)
		{
			max1 = i;
			if (n >= t)
				max2 = n;
			else
				max2 = t;
		}
		if (n >= i && n >= t)
		{
			max1 = n;
			if (i >= t)
				max2 = i;
			else
				max2 = t;
		}
		if (t >= n && t >= i)
		{
			max1 = t;
			if (n >= i)
				max2 = n;
			else
				max2 = i;
		}
		System.out.println("a tua nota final é:" + (( max1+max2)/2));

	}
}
