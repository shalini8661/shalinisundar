package expect;

import java.util.Scanner;

public class NullPointer {
public static void main(String[] args) {
	//String s=null;
	Scanner s=new Scanner(System.in);
	byte nextByte = s.nextByte(23);
	System.out.println(nextByte);
}
}
