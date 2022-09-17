package MyPackage;
public class MyClass {
public int sum(int a,int b)
{
return a+b;
}
public int diff(int a,int b)
{
return a-b;
} 
}





import MyPackage.MyClass;
public class Pract3_5 {
public static void main(String[] args) {
MyClass m1= new MyClass();
System.out.println("SUM : "+m1.sum(5, 10));
System.out.println("DIFFERENCE :"+m1.diff(20, 10) );
}
}