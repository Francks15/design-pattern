import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    private String name;
    private String type;
    public List<Repertoire> sousrepertoire;

    public Repertoire(String name, String type) {
        this.name = name;
        this.type = type;
        sousrepertoire = new ArrayList<Repertoire>();
    }

    public void add(Repertoire r) {
        sousrepertoire.add(r);
    }

    public void remove(Repertoire r) {
        sousrepertoire.remove(r);
    }

    public List<Repertoire> getSousrepertoire() {
        return sousrepertoire;
    }

    public String toString() {
        return ("Repository " + name + "The Type is" + type);
    }

    public void display() {
        System.out.println(name + "le repertoire");
    }
}
