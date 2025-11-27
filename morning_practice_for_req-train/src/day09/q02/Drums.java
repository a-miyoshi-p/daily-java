//【Piano、Drumsクラス（修正部のみ記述）】
//	・Instrumentクラスを継承してエラーが出ないか、確認すること。
//	・必要に応じて変更しても構わない。ただし、アクセサメソッド以外のもともとあったメソッドは残すこと。
//	・toString()をオーバーライドし出力例のように文字列表示できるようにする
package day09.q02;

public class Drums extends Instrument{

//	private String maker;
	private String constitution;// ドラムの構成

	// Instrumentのコンストラクタを呼び出し
	public Drums(String maker) {
		super(maker);
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}


	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	}

	public void playMusic() {
		System.out.println(maker + "のドラムを演奏します。");
	}
}



/*package day09.q02;

public class Drums extends Instrument{

	private String maker;
	private String constitution;// ドラムの構成

	// Instrumentのコンストラクタを呼び出し
	public Drums(String maker) {
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}

	public void playMusic() {
		System.out.println(maker + "のドラムを演奏します。");
	}

	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	}

}*/
