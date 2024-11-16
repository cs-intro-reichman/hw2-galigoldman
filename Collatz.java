// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		String str = args[1];
		int i=0,seed=0,count=1;
		for(i=1;i<=n;i++){
			seed=i;
			while(seed!=1||count==1){
				count++;
				if(str.equals("v")){
					System.out.print(seed + " ");
				}
				if(seed%2==0){
					seed = seed/2;
				}
				else{
					seed = seed * 3 + 1;
				}
			}
			if(str.equals("v")){
			System.out.print("1");
			System.out.println(" (" +count + ")");
			count=1;
			}
		}
		System.out.println("Every one of the first " + n +" hailstone sequences reached 1.");
	}
}
