import java.util.List;

public class HashMap<K, V> {

    private List[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

}

