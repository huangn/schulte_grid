import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class Grid implements Map<Position, String> {
    private int size;

    public Grid(int size) {
        this.size = size;

    }


    @Override
    public int size() {
        return getSize();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String get(Object key) {
        return null;
    }

    @Override
    public String put(Position key, String value) {
        return null;
    }

    @Override
    public String remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Position, ? extends String> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Position> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<Position, String>> entrySet() {
        return null;
    }
}
