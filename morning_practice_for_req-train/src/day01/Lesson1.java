/*問題
パッケージ名 day01
クラス名 Lesson1.java

"出力します"とコンソールに出力してください。
続けて12、 1.6、 "こんにちは"、 trueをそれぞれ変数に代入しコンソールに出力してください。
変数名は任意とします
また上記から変数を１つを選び、代入する値を1行コメントで記入しなさい。（コメント例 〇〇を代入する）

【出力例】
出力します
12
1.6
こんにちは
true
 * 
 */
package day01;

public class Lesson1 {

	public static void main(String[] args) {
		/*ここから記入*/
		System.out.println("出力します");

		int num1 = 12;
//		byte num1 = 12;
//		short num1 = 12;
		System.out.println(num1);

		double num2 = 1.6;
//		float num2 = 1.6;→型の不一致: double から float には変換できません
		System.out.println(num2);
		
//		こんにちはを代入する
		String hello = "こんにちは";
		System.out.println(hello);

		boolean quiz = true;
		System.out.println(quiz);

	}

}