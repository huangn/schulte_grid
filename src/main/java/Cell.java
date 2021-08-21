import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Cell {
    private String content;
    private int x;
    private int y;
    private boolean isCleared;
    public Cell() {

    }
}
