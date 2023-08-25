package task5;

public class Task1_5 {


	public static void main(String[] args) {
        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fruits を作成してください。
		
		String [] fruits = {"みかん", "りんご" , "ぶどう" ,"メロン"};

		// ② for文を使って①で作成した配列を出力しなさい。
		for ( int i = 0 ; i < fruits.length; i++){
			System.out.println(  fruits[i] );
		}
		// ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        /*
        * 1 から 100までの数字を出力している。" i++ "は無限ループを止める役割をしている。
        */
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();
	
        /* ④ 行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
       	*/
           
        for (int A =1 ; A<= 9; A++){
        	//段
        	System.out.print( A + " || ");
    
        	for (int B = 1; B <=9; B++) {
				
        		
				System.out.print( ( A * B) + " | ");
        	}
        		System.out.println();
        	
        }
	
	}

}
