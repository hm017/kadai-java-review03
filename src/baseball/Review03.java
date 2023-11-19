package baseball;

public class Review03 {

    public static void main(String[] args) {

        // 東京ヤクルトスワローズ (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        swallows.report();

        // 横浜DeNAベイスターズ (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        baystars.report();

        // 阪神タイガース (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        tigers.report();

        // 読売ジャイアンツ (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        giants.report();

        // 広島東洋カープ (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        carp.report();

        // 中日ドラゴンズ (引数にチーム名、勝ち数、負け数、引き分け数)
        BaseBallTeam dragpns = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        // レポート 『~の2022年の成績は ~勝 ~敗 ~分、勝率は~です。』
        dragpns.report();
    }

}
