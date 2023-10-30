public class CompositeRepertoire {
    public static void main(String[] args) {
        Repertoire folder = new Repertoire("fichier1", "TXT");
        folder.add(new Repertoire("fichier2", "pdf"));
        System.out.println(folder);
        for (Repertoire r : folder.getSousrepertoire()) {
            System.out.println(r);
        }
    }
}
