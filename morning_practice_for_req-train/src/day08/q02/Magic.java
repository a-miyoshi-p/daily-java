package day08.q02;

import java.util.Random;

public class Magic {
	protected String name;

	// 問題解答
	public Magic(String name) {
		this.name = name;
	}

	public void attack(int mp) {
		System.out.println(name + "の攻撃！！");
		Random rand =new Random();
		int randomDamage= rand.nextInt(0-mp)+10;
//		int damege = (int) (Math.random() * mp) + 10;
		System.out.println("相手に" + randomDamage + "のダメージ！！");
		
		
//		Monster.setHp();
	}
	
//	・メソッド
//	+ attack(mp:int,monster:Monster):戻り値の型 void 
//		・(name + "の攻撃！！")と表示
//		・モンスターに乱数（0-mpの間）+10の数値のダメージを与える（"モンスター名に・・・のダメージ!!"と表示）
//		・モンスターのhpにダメージを減算した後の数値をsetする

}
