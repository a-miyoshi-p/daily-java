//【MemberManagerクラス】
//	・コンストラクタ（Eclipseの機能を用いて生成してもよい）
//		- MemberManager()  
//			・MemberManagerオブジェクト生成を不可にする
//	・メソッド
//		+ __show(list:Member[]):戻り値の型 void 
//			・"メンバー一覧を表示します"とコンソール上に表示
// 			・listから拡張for文でオブジェクトを取得しつつ、Member#show()を呼び出す。
//		+ __update(list:Member[], id:int, name:String):戻り値の型 void 
//			・"ID：" + id + "のメンバー名を" + name + "に更新します"とコンソール上に表示
// 			・listから拡張for文でオブジェクト取得しつつ、IDが一致したメンバーの名前を変更する
// 				※ヒント:ID比較は (member.getId() == id)のように比較する
package day07.q02;

public class MemberManager {

	private MemberManager() {
		//生成不可？
	}

	public static void show(Member[] list) {
		System.out.println("メンバー一覧を表示します");
		for (Member member : list) {
			member.show();
		}
	}

	public static void update(Member[] list, int id, String name) {
		System.out.println("ID：" + id + "のメンバー名を" + name + "に更新します");
		
	}
}
