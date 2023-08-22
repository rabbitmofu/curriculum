package task2;

public class Task1_2 {


	public static void main(String[] args) {
		
		 // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成しなさい。
		 
		
		String[] country = {"jAPAN", "AMERICA", "KOREA", "ENGLAND"};
		
		// ② ①で作成した配列の要素数を出力してください。
		
		System.out.println("countryの要素数..." + country.length);
		
		//➂　要素数3のStringクラスの配列strArray
		//no1(先頭) リンゴ no2 もも no3 ぶどう
		String[] arr;
		arr = new String[3];
		
		arr[0] = "りんご"; //no1(先頭) りんご
		arr[1] = "もも"; //no2 もも
		arr[2] = "ぶどう"; //no3 ぶどう
		
		// ③三番目の要素出力
		System.out.println(arr[2]);
		
		 /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  intArrayという名前のint型配列を宣言
         */
        int[] intArray = { 10, 20, 30, 40, 50 };
        
        //⑥下記の処理について、何をしているのかコメントを記入してください。
        //1番目と5番目を足した数字を出力している 
        
        System.out.println(intArray[0] + intArray[4]);
		
	}

}

