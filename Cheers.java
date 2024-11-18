// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String str=args[0];
            int length = str.length(), i=0, times=Integer.parseInt(args[1]);
            String[] letters = str.split("");
            for(i=0;i<length;i++)
            {
                switch (letters[i]) {
                        case "A":
                        case "E":
                        case "F":
                        case "H":
                        case "I":
                        case "L":
                        case "M":
                        case "N":
                        case "O":
                        case "R":
                        case "S":
                        case "X":
                        case "a":
                        case "e":
                        case "f":
                        case "h":
                        case "i":
                        case "l":
                        case "m":
                        case "n":
                        case "o":
                        case "r":
                        case "s":
                        case "x":
                                System.out.println("Give me an "+letters[i] + ": " + letters[i] + "!");
                                break;
                
                        default:
                                System.out.println("Give me a  "+letters[i] + ": " + letters[i] + "!");
                                break;
                }
            }
            System.out.println("What does that spell?");
            for(i=0;i<times;i++)
            {
                System.out.println(str+"!!!");
            }
        }
}
