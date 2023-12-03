package decorateur;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle= new Circle();
        Shape redCircle= new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator( new Rectangle());
        System.out.println("cercle de simple bordure");
        circle.draw();
        System.out.println("\n cercle de bordure rouge");
        redCircle.draw();
        System.out.println("\n Rectangle de couleur rouge");
        redRectangle.draw();
        }
}
