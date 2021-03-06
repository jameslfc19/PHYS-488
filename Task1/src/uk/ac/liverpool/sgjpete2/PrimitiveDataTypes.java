package uk.ac.liverpool.sgjpete2;

class PrimitiveDataTypes
{
    public static void main (String [] args)
    {
	// declare some primitive variable types
	boolean b = false;
	char c = 'R';                   // single quotes '' for single characters!
	byte j = 127;                   // this is maximum value allowed (8 bits)
	short k = 32767;                // short integer maximum value (16 bits)
	int m = 2147483647+1;             // integer maximum value (32 bits)
	long n = 9223372036854775807L;	// maximum value for long integer (64 bits)
	float x = (float) Math.PI;      // float variables are accurate to about 7 decimals
	double y = Math.PI;             // double variables are accurate to about 15 decimals.

	System.out.println("The value of b = " + b);
	System.out.println("The value of c = " + c);
	System.out.println("The value of j = " + j);
	System.out.println("The value of k = " + k);
	System.out.println("The value of m = " + m);
	System.out.println("The value of n = " + n);
	System.out.println("The value of x = " + x);
	System.out.println("The value of y = " + y);
    }
}