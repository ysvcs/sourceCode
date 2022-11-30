// Java Code for Position of rightmost set bit
class GFG {

	/*public static int getFirstSetBitPos(int n)
	{
		return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1;
	}*/

	// Drive code
	public static void main(String[] args)
	{
		int n = 3;
		//System.out.println(getFirstSetBitPos(n));
		System.out.print(n & (n>>1));
	}
}

