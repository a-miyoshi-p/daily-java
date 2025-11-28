//問題
//ArrayListに1～任意の整数値（コンソール入力）までの値を代入し表示する
//また、1～入力値までの合計を求めなさい。
//※入力値に整数以外が含まれていた場合、NumberFormatExceptionをキャッチし例外処理を行うこと
//【出力例】
//1から任意の値までの合計を求めます
//input num? >>13
//1から13までの合計は91
//listの要素を表示します
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13

package day10.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1から任意の値までの合計を求めます");
		System.out.println("input num? >>");
		//入力値の取得
		String str = br.readLine();

		try {
			//整数型にキャスト
			//※入力値に整数以外が含まれていた場合、NumberFormatExceptionをキャッチし例外処理を行うこと
			int num = Integer.parseInt(str);

			//合計値計算用変数宣言
			int sum = 0;
			//リスト作成
			List<Integer> numbers = new ArrayList<>();
			//入力値までの要素を追加
			for (int i = 1; i <= num; ++i) {
				numbers.add(i);
			}
			//要素の総和計算
			//代替例）int sum = numbers.stream().mapToInt(Integer::intValue).sum();
			for (int i : numbers) {
				sum += i;
			}
			//各要素を取り出す
			System.out.println("1から" + num + "までの合計は" + sum);
			System.out.println("listの要素を表示します");
			for (int value : numbers) {
				System.out.println(value);
			}
		} catch (NumberFormatException e) {
			e.getStackTrace();
			System.out.println("整数を入力してください");
		}
		//53,58は共通化
		//
	}

}
