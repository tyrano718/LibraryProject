//package helloWorld;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Factorial {
//
//	public static void main(String[] args) {
//		while (true) {
//			System.out.println("팩토리얼을 구하는 프로그램!");
//			System.out.print("팩토리얼할 수를 입력하세요. (0은 종료) >> ");
//
//			Scanner scan = new Scanner(System.in);
//			int num = scan.nextInt();
//			if (num == 0)
//				break;
//			System.out.println(num + "! = " + factorial(num) + "\n");
//		}
//	}
//
//	public static String factorial(String n) {
//		BigInteger result = BigInteger.ONE;
//		for (int i = 1; i <= n; i++)
//			result = result.multiply(BigInteger.valueOf(i));
//		return result;
//	}
//
//	public static String bigMultiply(String n1, String n2) {
//		int[] val = new int[n1.length()+1];
//		for(int i=n2.length()-1; i>=0; i--) {
//			int v = 0;
//			int carry = 0;
//			int n2Int = n2.charAt(i) - '0';
//			for(int j=n1.length()-1; j>=0; j--) {
//				int n1Int = n1.charAt(j) - '0';
//				v = (n2Int * n1Int + carry + val[n1.length()-j-1]) % 10;
//				carry = (n2Int * n1Int + carry + val[n1.length()-j-1]) / 10;
//			}
//		}
//	}
//}
