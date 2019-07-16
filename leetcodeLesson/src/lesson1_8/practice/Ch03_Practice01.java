/*
 * 如果有 m 與 n 兩個 int 變數，分別儲存 1000 與 495 兩個值
 * 請使用程式算出最大公因數。
 */
package lesson1_8.practice;

public class Ch03_Practice01 {

	public static void main(String[] args) {
		int m = 1000, n = 495;
		System.out.println( m + ", "+ n +" 最大公因數 :" + GCD(m, n) );
	}
	
	private static Integer GCD( int m, int n ) {
		if( n == 0 )
			return m;
		return m%n == 0 ? n : GCD(n, m%n);
	}

}
