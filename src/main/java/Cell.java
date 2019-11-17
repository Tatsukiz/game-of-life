// セル
public class Cell {

    // 生死の状態
    private Boolean alive = false;

    // 横の位置
    private Integer x;

    // 縦の位置
    private Integer y;

    public Cell(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Boolean isAlive() {
        return this.alive;
    }

    public void live() {
        alive = true;
    }

    public void kill() {
        alive = false;
    }

}
