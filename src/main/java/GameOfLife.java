import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {

        System.out.println("Let's Start Game Of Life!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("盤面の大きさを半角の数字で入力して下さい。");
        System.out.println("例) 3");
        final int boardSize = scanner.nextInt();
        System.out.println(boardSize + "が入力されました。");

        // 引数から盤面の大きさを受け取って、盤面を作成。
        Board board = createBoard(boardSize, boardSize);

        int endOrContinue = 1;
        Map<Integer, Integer> cellCoordinate = new HashMap<>();

        while (endOrContinue != 0) {
            System.out.println("生存しているセルの設定しない場合は0を入力して下さい。");
            System.out.println("まだ生存しているセルの設定を行う場合は1を入力して下さい。");
            endOrContinue = scanner.nextInt();
            System.out.println(endOrContinue + "が入力されました。");

            if(endOrContinue == 0) {
                System.out.println("生存しているセルの設定を終了します。");
                break;
            } else if (endOrContinue == 1) {
                System.out.println("生存しているセルのx座標を入力して下さい。");
                int x = scanner.nextInt();
                System.out.println(x + "が入力されました。");

                System.out.println("生存しているセルのy座標を入力して下さい");
                final int y = scanner.nextInt();
                System.out.println(y + "が入力されました。");

                cellCoordinate.put(x, y);
            } else {
                System.out.println("入力された内容が不適切です。");
                continue;
            }

        }

        // 各セルに生存・誕生・過疎・過密を適用
        // 生存しているセルのみを返却。

        // 生存している箇所を■、死んでいるセルを□としてprintln()する。

        // End.
        scanner.close();
        System.out.println("処理を終了します。");

    }

    // 盤面を作成
    public static Board createBoard(int width, int height) {
        return new Board(width, height);
    }

}