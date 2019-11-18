public class GameOfLife {
    public static void main(String[] args) {
        System.out.println("Let's Start Game Of Life!");
    }

    // 盤面を作成
    public static Board createBoard(int width, int height) {
        return new Board(width, height);
    }

}