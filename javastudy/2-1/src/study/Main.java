package study;

public class Main {

	public static void main(String[] args) {
		
		// ① 名前の変数定義と初期化
		

		String firstName = "Mari";
		String lastName = "Hasegawa";
		
		System.out.println(getName(firstName, lastName));
		
		int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};//配列定義と初期化
		
		for(int i=0;i<arr.length;i+=2) {
            isOdd(arr[i]);
        }
		
			 
		//② 関数を定義しなさい。
	    //   関数名：getName
	    //  修飾子：public
	    //   引数には①で定義したfirstNameとlastNameを引数で受け取り、
	    //  連結した値を返り値とする変数を定義しなさい。
        //getName関数の呼び出しと出力
	}

	public static String getName(String firstName, String lastName) {
			String ans = firstName + " "+ lastName;
			return ans;
	}
	
	//③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
    //   要素が奇数の場合には「nは奇数です。」と出力されます。
	//	 奇数の判定を行う。
    public static void isOdd(int arr) {
            System.out.println(arr + "は奇数です。");
            
        }
        

	 	
	
   
  }   
	


