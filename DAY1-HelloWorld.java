/**
 * Input Format

 *A single line of text denoting inputString (the variable whose contents must be printed).

*Output Format

*Print Hello, World. on the first line, and the contents of *inputString on the second line.

*Sample Input

*Welcome to 30 Days of Code!
*Sample Output

*Hello, World. 
**Welcome to 30 Days of Code!
*Explanation

*On the first line, we print the string literal Hello, World.. *On the second line, we print the contents of the inputString  *variable which, for this sample case, happens to be Welcome to *30 Days of Code!. If you do not print the variable's contents *to stdout, you will not pass the hidden test case.
 *
 */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
	public static void main(String[] args) 
     {
        
		Scanner scan = new Scanner(System.in); 
		
		String inputString = scan.nextLine(); 
		scan.close(); 
      
		System.out.println("Hello, World." + "\n" + inputString);
       
	    
	}
}