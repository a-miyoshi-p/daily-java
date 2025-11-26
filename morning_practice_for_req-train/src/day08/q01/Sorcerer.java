package day08.q01;

public class Sorcerer extends Magic {

	public Sorcerer(String name) {
		super(name);

	}

	//	+ attack(mp:int):戻り値の型 void 
	//		→Magic#attack(mp:int)をオーバーライドする（Eclipseの機能を用いて生成してもよい）
	//		・super.attack(mp)を呼び出す
	//		・(mp*0.5)した数値を追加ダメージとして与える
	@Override
	public void attack(int mp) {
		System.out.println("\n" + name + "の攻撃！！");
		int damege = (int) (Math.random() * mp) + 10;
		//追加攻撃もランダム要素欲しい
		int addAttack = (int) (Math.random() * mp * 0.5);
		System.out.println("相手に" + damege + "のダメージ！！");
		System.out.println("追加で" + addAttack + "のダメージ！！");

	}

}
