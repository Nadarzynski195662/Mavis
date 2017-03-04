public class Calculator
{
	public static void main(String[] args)
	{
		int x = 2, y=3;
		int suma = x + y;
		String xa = "Wynik to " + String.valueOf(x+y);
		System.out.println(xa);
	}
	public int add(int x, int y)
	{
		return x + y;
	}
}