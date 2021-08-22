import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Cell {
    private String content;
    private Position position;
    private boolean isCleared;
    public Cell() {

    }
}
