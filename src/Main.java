public class Main {

    public static void main(String[] args) {

        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        objetGeometriques[0] = new Cercle(4.5);
        objetGeometriques[1] = new Rectangle(2.0, 4.0);

        for (ObjetGeometrique objetGeometrique : objetGeometriques) {
            System.out.println(objetGeometrique);
            System.out.println("surface : " + objetGeometrique.surface());
            System.out.println("perimetre : " + objetGeometrique.perimetre());
        }

    }

}
