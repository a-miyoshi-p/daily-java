//【Memberクラス】
//	・フィールド
//		- id:int
//		- name:String
//	・コンストラクタ（Eclipseの機能を用いて生成してもよい）
//		+ Member(id:int, name:String)  
//			・フィールドid,nameに引数の値を代入する
//	・メソッド
//		+ show():戻り値の型 void 
//			・会員情報としてフィールドの内容を表示します
//		+ 各フィールドのsetter,getter(Eclipseの機能を用いて生成してもよい)
package day07.q02;

public class Member {
	private int id;
	private String name;

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println(id + ":" + name);
	}

}
