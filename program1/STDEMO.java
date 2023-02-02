// Implement a Java Program that reads a line of integers, and then displays each integer, and
// the sum of all the integers (Use String Tokenizer class of java.util)

import java.util.*;

class STDEMO {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum of all the integers: " + sum);
        sc.close();
    }
}