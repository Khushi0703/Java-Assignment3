interface P{
int p=1;
public void meth();
}
interface P1 extends P{
int a=5;
void meth1();
}
interface P2 extends P{
int b=7;
void meth2();
} 
interface P12 extends P1,P2{
int p12=9;
void meth3();
}
class C1 implements P12{
public void meth(){
System.out.println("meth of P interface");
}
public void meth1(){
System.out.println("meth1 of P1 interface");
}
public void meth2(){
System.out.println("meth2 of P2 interface");
}
public void meth3(){
System.out.println("meth3 of P12 interface");
}
}
public class p3 {
public static void main(String[] args) {
C1 obj=new C1();
obj.meth();
System.out.println("constant of interface P:"+obj.p);
obj.meth1();
System.out.println("constant of interface P1:"+obj.a);
obj.meth2();
System.out.println("constant of interface P2:"+obj.b);
obj.meth3();
System.out.println("constant of interface P12:"+obj.p12);
}
}