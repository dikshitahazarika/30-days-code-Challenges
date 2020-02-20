Read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
        Scanner sc=new Scanner(System.in);
       while(sc.hasNextInt())
       //for(int i = 0; i <= sc.hasNextInt() ; i++)
        {
        int a=sc.nextInt();
        System.out.println(a);
        }
        
    }
}