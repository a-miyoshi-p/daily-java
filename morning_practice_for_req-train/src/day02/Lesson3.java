//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

	public static void main(String[] args) throws IOException {

		int sum = 0;// 合計金額
		int average = 0;// 平均金額
		int inputCount = 0;//入力した回数

		/*ここから記入*/
		double tax = 1.08;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("金額①を入力してください");
		String str1 = reader.readLine();
		++inputCount;
		System.out.println("金額②を入力してください");
		String str2 = reader.readLine();
		++inputCount;
		System.out.println("金額③を入力してください");
		String str3 = reader.readLine();
		++inputCount;

		int price1 = Integer.parseInt(str1);
		int price2 = Integer.parseInt(str2);
		int price3 = Integer.parseInt(str3);

//		入力毎にインクリメント
//		inputCount = 3;
		sum = (price1 + price2 + price3);
		average = ((price1 + price2 + price3) / inputCount);
		
//		確認用計算出力
//		System.out.println(sum);
//		System.out.println(average);

		System.out.println("①から③の合計は税込み" + (int) (sum * tax) + "円");
		
		//		308円にならない→Math.ceilメソッドで切り上げ
		//		System.out.println("①から③の平均は税込み" + (int) (average * 1.08) + "円");
		System.out.println("①から③の平均は税込み" + (int) Math.ceil(average * tax) + "円");

	}

}
