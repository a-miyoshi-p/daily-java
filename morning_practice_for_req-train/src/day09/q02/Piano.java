//【Piano、Drumsクラス（修正部のみ記述）】
//	・Instrumentクラスを継承してエラーが出ないか、確認すること。
//	・必要に応じて変更しても構わない。ただし、アクセサメソッド以外のもともとあったメソッドは残すこと。
//	・toString()をオーバーライドし出力例のように文字列表示できるようにする
package day09.q02;

public class Piano extends Instrument{

	private double weight;

	public Piano(String maker) {
		super(maker);
		weight = 80.5;
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	}

	public void playMusic() {
		System.out.println(getMaker() + "のピアノを弾きます。");

	}

}



/*package day09.q02;

public class Piano extends Instrument{

	private String maker;
	private double weight;

	public Piano(String maker) {

		this.maker = maker;
		weight = 80.5;
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	}
	@Override
	public void playMusic() {
		System.out.println(maker + "のピアノを弾きます。");

	}

}*/