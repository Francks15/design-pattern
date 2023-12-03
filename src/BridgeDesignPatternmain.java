public class BridgeDesignPatternmain{
    public static void main (String[] args) {
        Shape s1=new Rectangle(new RedColor());
        s1.Colorlt();
        Shape s2= new Circle(new BlueColor());
        s2.Colorlt();
    }
}