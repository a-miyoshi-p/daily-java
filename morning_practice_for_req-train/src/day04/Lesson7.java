/*追加問題

パッケージ名 day4
クラス名 Lesson7.java

数当てゲームをします。
1から10の任意の整数をコンソールから入力をしてもらい、正解を当てられるまでコンソール入力を繰り返します。

以下の条件と出力例にあてはまるように記述を行ってください

【条件】
①繰り返し処理にはwhile文を使って下さい
②今回の解答の数値は「7」とします
③1以上10以下の整数に当てはまらない場合はcontinue文を用いて再度の入力をさせて下さい
④はずれの数値が入力された場合は「はずれです」という文言を出力し再度ループさせてください。
⑤「7」が入力された場合は「正解」を表示し、繰り返し処理から抜けてください

【出力例】
数当てゲームです。
1-10の整数を入力して下さい

input number?[1-10] >>11
error:1-10の整数を入力してください

input number?[1-10] >>1
残念、はずれです。。。もう一回！

input number?[1-10] >>7
正解！

ゲームを終了します
*/
package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7 {

	public static void main(String[] args) throws IOException {
		/*ここから記入*/
			//		解説解答
			//		正解とする整数の宣言
		int collectNum = 7;
			//		入力を代入する変数宣言	
		int inputNum = 0;

		System.out.println("数当てゲームです。");
		System.out.println("1-10の整数を入力して下さい");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//	ここから繰り返し処理
		while (true) {
			System.out.println("input number?[1～10]>>");
			//	入力値をinputで受け取る
			String input = reader.readLine();
			//	用意していたinputNumにint型変換しつつ代入
			inputNum = Integer.parseInt(input);
			//	ここから分岐処理
			//	入力値が10を超える場合、continueで処理を続ける（whileの最初へ）
			if (inputNum > 10) {
				System.out.println("error:1-10の整数を入力してください");
			//	whileの最初へ、次のif該当せず
				continue;
			}
			//	正解のパターン
			if (inputNum == collectNum) {
				System.out.println("正解！");
			//	While処理終わる
				break;
			}

			System.out.println("残念、はずれです。。。もう一回！");
		}

		/*ここまで記入*/

		System.out.println("\nゲームを終了します");
		//		残骸
		//		String str = reader.readLine();
		//		int num = Integer.parseInt(str);
		//
		//		while (num < 1 || num > 10) {
		//			System.out.println("数当てゲームです。");
		//			System.out.println("1-10の整数を入力して下さい");
		//
		//						String str = reader.readLine();
		//						int num = Integer.parseInt(str);
		//		}
		//
		//		if (num == 7) {
		//			System.out.println("正解！");
		//		} else if (1 <= num && num <= 10) {
		//			System.out.println("残念、はずれです。。。もう一回！");
		//			//			繰り返し処理
		//		} else if (1 > num || 10 < num) {
		//			System.out.println("error:1-10の整数を入力してください");
		//			//			繰り返し処理
		//
		//		}
		//					while (num < 1 || num > 10) {
		//								String str = reader.readLine();
		//									int num = Integer.parseInt(str);
		//				}

	}
}
