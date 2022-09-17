interface default_method{
abstract public void abs();
default void def()
{
System.out.println(" default ");
}
}
class Abst implements default_method{
public void abs()
{
System.out.println(" abstract");
}
}
public class Pract3_7 {
public static void main(String[] args) {
Abst a1= new Abst();
a1.abs();
a1.def();
}
}