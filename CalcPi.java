// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms=Integer.parseInt(args[0]);
		int i=0;
		Double pi=0.0;
		for(i=0;i<terms;i++)
		{
			pi += Math.pow(-1, i) / (2 * i + 1);
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*pi);
	}
}
