package day09.q01;

import java.io.IOException;

//	・Playableインタフェースを実装する
public class ComPlayer implements Playable {
	
	public final String name = "com";

	//	・メソッド
	//	+ doJanken():戻り値の型 int throws IOException
	@Override
	public int doJanken() throws IOException {
		//	・Math.random()を用い、0-2の値を取得する
		int min = 0;
		int max = 2;

		int randomNum = (int) (Math.random() * (max - min + 1)) + min;

		String hand[] = { "グー", "チョキ", "パー" };

		//	・"コンピュータはxxxを選んだ"と出力する
		System.out.println("コンピュータは" + hand[randomNum] + "を選んだ");
		//	・取得した値をreturnする
		return randomNum;
	}

	public String getName() {
		return name;
	}
	
	
	
}

/*String hand[] = { "グー", "チョキ", "パー" };
int choiceNumber = -1;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println(name + "さん、じゃんけんの手を選んで下さい");
for (int i = 0; i < hand.length; i++) {
	System.out.println("\t" + i + "\t" + hand[i]);
}
System.out.print("input number[0-2]? >>");
choiceNumber = Integer.parseInt(br.readLine());
if (0 > choiceNumber || choiceNumber > 2) {
	throw new IllegalStateException("不正な値が入力されました");
}
return choiceNumber;
}*/