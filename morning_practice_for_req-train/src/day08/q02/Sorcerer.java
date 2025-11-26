package day08.q02;

public class Sorcerer extends Magic {

	public Sorcerer(String name) {
		super(name);
	}
	//	・メソッド
	//	+ attack(int mp):戻り値の型 void 
	//	→Magic#attack(mp:int,monster:Monster)をオーバーライドする（Eclipseの機能を用いて生成してもよい）
	@Override
	public void attack(int mp, Monster monster) {
		//ここが変
		//・super.attack(mp,monster)を呼び出す
		super.attack(mp, monster);
		/*Magicのsuper()の呼び出し確認用
				 
			(name + "の攻撃！！")と表示
			System.out.println("\n" + name + "の攻撃！！");
			Random rand = new Random();
			・モンスターに乱数（0-mpの間）+10の数値のダメージを与える（"モンスター名に・・・のダメージ!!"と表示）
			int randomDamage = rand.nextInt(mp) + 10;
			int damege = (int) (Math.random() * mp) + 10;
			System.out.println("相手に" + randomDamage + "のダメージ！！");
			・モンスターのhpにダメージを減算した後の数値をsetする
			monster.setHp(monster.getHp() - randomDamage);
		*/

		//super()で重複文はコメントアウト

		//		System.out.println("\n" + name + "の攻撃！！");
		//		Random rand = new Random();
		//		int randomDamage = rand.nextInt(mp) + 10;
		//	　　int damege = (int) (Math.random() * mp) + 10;

		//(mp*0.5)した数値を追加ダメージとして与える("追加で・・・のダメージ!!"と表示)
		int addAttack = (int) (Math.random() * mp * 0.5);
		monster.setHp(monster.getHp() - addAttack);

		//		System.out.println("相手に" + randomDamage + "のダメージ！！");

		System.out.println("追加で" + addAttack + "のダメージ！！");

		//モンスターの体力がちゃんと減るか確認用
		//		System.out.println("monster hp:"+monster.getHp());

		//・モンスターのhpに追加ダメージを減算した後の数値をsetする
		//				monster.setHp(monster.getHp() - (addAttack + randomDamage));

	}

}
