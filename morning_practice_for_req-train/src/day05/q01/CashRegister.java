//問題

//パッケージ名 day5.q1
//クラス名1 CashRegister.java
//クラス名2 Main.java

//税抜き金額をコンソール入力し、税込み金額を出力します。
//下記の条件を満たすクラスをそれぞれ作成しなさい

//【CashRegisterクラス】
//クラス内に以下の条件を満たすcalcPriceメソッドを作成しなさい。
//なお、消費税は10%で計算すること
//・戻り値の型 int
//・int型の引数
//・引数の値に10%を上乗せし計算後の値をreturnする。値はキャストして整数値で返すこと。

//【Mainクラス】
//メインメソッド内に以下の条件を記述する。
//①コンソールから税抜き価格を入力します。
//②入力値を税抜き価格として出力する
//③CashRegisterオブジェクトをnewする。
//④コンソールからの入力値を実引数にし、CashRegisterオブジェクトのcalcPriceメソッドを呼び出す
//⑤呼び出したメソッドの戻り値を変数に代入し税込価格として出力する。
//
//【出力例】
//商品の税込み金額（消費税10％）を計算します。
//税抜き金額を入力してください。
//input money? >>56789
//税抜き価格：\56789
//税込み価格：\62467
package day05.q01;

/**
 * 消費税計算クラス
 */
public class CashRegister {
	/**
	 * 入力金額
	 */
	int price;
	/**
	 * 税込み価格
	 */
	int inTaxPrice;
	/**
	 * 消費税率
	 */
	double tax = 1.1;

	/**
	 * 
	 * @param price 入力金額
	 */
	public CashRegister(int price) {
		this.price = price;
		calcPrice(price);
	}

	/**
	 * 消費税計算
	 * @param p 税抜き価格
	 * @return　税込み価格
	 * 
	 */
	//	この場合戻り値使用しなくても値は代入される→void型変換とreturn文の削除可)
	//	戻り値を使用して出力の必要あり
	//	出力をmain側で行うとできるか（戻り値を受ける変数を設定）→syso(その変数)
	public int calcPrice(int p) {
		//インスタンス変数への代入
		this.price = p;
		//税込み計算
		inTaxPrice = (int) (p * tax);
		return this.inTaxPrice;

	}

	/**
	 * 処理後出力
	 */
	public void show() {

		System.out.println("税抜き価格：\\" + price);

		System.out.println("税抜き価格：\\" + inTaxPrice);
	}
}
