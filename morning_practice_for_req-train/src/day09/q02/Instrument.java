//※「+」はpublic、「-」はprivate、「__」はstaticメンバを表す
//【Instrumentクラス】
//	・抽象クラスとして定義する
//	・フィールド、コンストラクタ、メソッドはPiano、Drumsから共通部を抽出し定義すること
//	・最低一つは抽象メソッドを定義すること
package day09.q02;

public abstract class Instrument {
	//	private String maker;
	protected String maker;

	public Instrument(String maker) {
		this.maker = maker;
	}

	public abstract void playMusic();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	//	abstract void doExplaanation();

	//	@Override
	//	public String toString() {
	//		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	//	}
	//
	//	public void playMusic() {
	//		System.out.println(maker + "のピアノを弾きます。");
	//
	//	}
	//	
	//	public Drums(String maker) {
	//		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	//	}
	//
	//	public void playMusic() {
	//		System.out.println(maker + "のドラムを演奏します。");
	//	}
	//
	//	@Override
	//	public String toString() {
	//		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	//	}
}
