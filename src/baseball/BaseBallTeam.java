package baseball;

public class BaseBallTeam {
     // フィールド
     private String name; // チーム名
     private int win;     // 勝ち数
     private int lose;    // 負け数
     private int draw;    // 引分け数

     // コンストラクタ(念のため)
     BaseBallTeam(){
     }

     // コンストラクタ
     BaseBallTeam(String name, int win, int lose, int draw){
         this.name = name;
         this.win  = win;
         this.lose = lose;
         this.draw = draw;
     }

     // レポートメソッド
     public void report() {
         double rate = getRate(this.win, this.lose);
         System.out.println(name + "の2022年の成績は "
                                 + this.win  + "勝 " + this.lose + "敗 "+ this.draw + "分、"
                                 + "勝率は " + rate + "です。");
     }

     // 勝率 = 勝ち数/(勝ち数+負け数)
     public double getRate(double win, double lose) {
         double result = win / (win + lose);
         return result;
     }

}
