package day08.q02;

public class Monster {
	//【Monsterクラス】

	//	・フィールド
	//		- name:String
	//		- hp:int
	private String name;
	private int hp;

	//	・コンストラクタ
	//	+public Monster(name:String, hp:int) {
	public Monster(String name, int hp) {
	//	・フィールドに引数の値を代入する
		this.name = name;
		this.hp = hp;
	//	・(name + "が現れた！！")と表示
		System.out.println(name + "が現れた!!");
	//	・toString()を表示
		System.out.println(toString());
	}

	//	・メソッド
	//	+ 各フィールドのsetter,getter(Eclipseの機能を用いて生成してもよい)
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

	//	+ toString()をオーバーライドする（Eclipseの機能を用いて生成すること）
	@Override
	public String toString() {
		//Monster [name=スライム, hp=10000]
		String str = "Monster[name="+name+",hp="+hp+"]";
		return str;
	}
	
	
	
}
