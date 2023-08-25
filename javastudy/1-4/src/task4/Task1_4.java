package task4;

public class Task1_4 {

	// 定数（アカウント情報）
    // ① 登録されている名前（USER_NAME）とパスワード（USER_PASSWORD）を定数で定義
	
	private static final String USER_NAME = "alice";
	private static final String USER_PASSWORD = "alice123";
	
	// 定数（メッセージ）
	private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
	private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";
	
	public static void main(String[] args) {
		
		String name = "alice";
		String pass = "alice123";
		
		 // ② 「name」の値が「USER_NAME」と等しく、「 pass 」の値が「USER_PASSWORD」と等しい場合。
        //      定数使用「 ログイン成功です 」と出力
		if ( name.equals(USER_NAME) && pass.equals( USER_PASSWORD )) {
			
			System.out.println( CONST_MSG_SUCCESS );
			
		} else if (name.equals(USER_NAME)){
			  // ③ 「USER_RNAME」の値のみ等しい場合。
		       //     定数使用「 パスワードに誤りがあります。 」 出力
			System.out.println(CONST_MSG_ERROR_PASS);
			
		} else if ( pass.equals(USER_PASSWORD)) {
		     // ④ 「USER_PASSWORD」の値のみ等しい場合。
		     //定数使用「 名前に誤りがあります。 」と出力
			System.out.println(CONST_MSG_ERROR_NAME);
		} else  {
			// ⑤ 「USER_NAME」も「USER_PASSWORD」の値も間違っていた場合。 
		       //定数を使用して「 入力情報に誤りがあります。 」と出力してください。
			System.out.println(CONST_MSG_ERROR_INPUT);
			
		}
		
	}

}
