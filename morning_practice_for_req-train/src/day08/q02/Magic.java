package day08.q02;

import java.util.Random;

public class Magic {
	protected String name;

	// 問題解答
	public Magic(String name) {
		this.name = name;
	}

	//	・メソッド
	//	+ attack(mp:int,monster:Monster):戻り値の型 void 
	public void attack(int mp, Monster monster) {
		//・(name + "の攻撃！！")と表示
		System.out.println("\n" + name + "の攻撃！！");
		Random rand = new Random();
		//・モンスターに乱数（0-mpの間）+10の数値のダメージを与える（"モンスター名に・・・のダメージ!!"と表示）
		int randomDamage = rand.nextInt(mp) + 10;
		//int damege = (int) (Math.random() * mp) + 10;
		System.out.println("相手に" + randomDamage + "のダメージ！！");
		//・モンスターのhpにダメージを減算した後の数値をsetする
		monster.setHp(monster.getHp() - randomDamage);
		//モンスターHP確認用
//		System.out.println("monster hp:"+monster.getHp());
	}

}
