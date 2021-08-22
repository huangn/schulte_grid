import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class Grid implements Map<Integer, Cell> {
    private int size;
    private int level;
    private Cell[] board;

    public Grid(int level) {
        this.level = level;

        //size is the square of level
        this.size = level * level;
        this.board = new Cell[size];

        //initiate grid according to level.
        for (int i=0; i<size; i++){
            put(i, new Cell()).setPosition(new Position(i%level, i/level));
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return getBoard().length == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return ((Integer) key).intValue() < size;
    }

    @Override
    public boolean containsValue(Object value) {
        //TODO
        return false;
    }

    @Override
    public Cell get(Object key) {
        return board[((Integer) key)];
    }

    @Override
    public Cell put(Integer key, Cell value) {
        board[key] = value;
        return value;
    }

    @Override
    public Cell remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Cell> m) {
        //TODO
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<Cell> values() {
        return null;
    }

    @Override
    public Set<Entry<Integer, Cell>> entrySet() {
        return null;
    }

    @Override
    public String toString(){
        String bar = "+";
        for (int i = 0; i < level; i++ ){
            bar += "——+";
        }

        String result = bar+"\n|";
        int row = 0;

        for (Cell cell: board) {
            if (cell.getPosition().getY() != row) {
                result += "\n"+bar+"\n|";
                row = cell.getPosition().getY();
            }
            if (cell.getContent() == null) {
                result += "  |";
            } else {
                result += cell.getContent() + "|";
            }
        }
        result += "\n"+bar;
        return result;
    }
}
