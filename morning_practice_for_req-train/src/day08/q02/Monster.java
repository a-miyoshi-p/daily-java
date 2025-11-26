package day08.q02;

public class Monster {
	//【Monsterクラス】
	//	・フィールド
	//		- name:String
	//		- hp:int
	//	・コンストラクタ
	//		+ 	public Monster(name:String, hp:int) {
	//			・フィールドに引数の値を代入する
	//			・(name + "が現れた！！")と表示
	//			・toString()を表示
	//	・メソッド
	//	+ 各フィールドのsetter,getter(Eclipseの機能を用いて生成してもよい)
	//	+ toString()をオーバーライドする（Eclipseの機能を用いて生成すること）

	private String name;
	private int hp;

	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println(name + "が現れた!!");
		System.out.println(toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	@Override
	public void ts() {
		
	}
}
