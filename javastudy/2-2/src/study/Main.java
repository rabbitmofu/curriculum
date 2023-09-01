package study;

public class Main {

	public static void main(String[] args) {
		
		 // ① 以下のルールに従いUserクラスのインスタンスを生成してください。
        // 変数名:「user」
		User user = new  User("○○", 123, "pass123");
		
        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
		user.printAccountName();
		user.printAccountId();
		user.printAccountPass();
	}

}
