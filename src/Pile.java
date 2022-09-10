import java.util.ArrayList;
import java.util.List;

public class Pile {
    private boolean _vide = true;
    private List<Integer> _listeElement = new ArrayList<Integer>();

    public boolean estVide() {
        return _vide;
    }

    public void empiler(int element) {
        _listeElement.add(element);
        _vide = false;
    }

    public int depiler() {
        int index = (_listeElement.size() - 1);
        int dernierElement = _listeElement.get(index);
        _listeElement.remove(index);
        return dernierElement;
    }
}
