package task3;

public class Task1_3 {

	public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
		int plus = 0;
		
		plus = 5 + 10;
				
		System.out.println(plus);
		
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
		int minus = 20;
		
		System.out.println( minus -= 7);
		
        // ③下記の処理について、何をしているのかコメントを記入してください。
		//  A. 10 と 2 をかけた値を代入して、変数multiplyを作成している。
         int multiply = 10 * 2;
         System.out.println(multiply);
      
		
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
		int remi = 20 % 6;
		
		System.out.println(remi);
		
        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // A. String型の変数 town と lineの初期値を設定している。 
		String town = "中央";
        String line = "線";
        
        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        
        String train = town + line;
        System.out.println( train );

	}

}
