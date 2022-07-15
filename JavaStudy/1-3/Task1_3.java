public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int a = 5;
        a += 10;
        System.out.println(a);

        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int b = 20;
        b -= 7;
        System.out.println(b);

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [ここへ記述]
        int multiply = 10 * 2;
        System.out.println(multiply);
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int c;
        c = 20 % 6;
        System.out.println(c);

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [ここへ記述]
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = "有楽町" + "線";
        System.out.println(train);
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。

    }
}