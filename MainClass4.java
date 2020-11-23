
package Lab_7.task4;


public class MainClass4 {
    
    public static void main(String[] args)
    {
        Grand gr = new Grand('8');
        Grand grNew = new Grand(gr);
        System.out.println(grNew.c);
        System.out.println();
        
        Parent p = new Parent('+', "parent parent");
        Parent p1 = new Parent(p);
        System.out.println(p1.c);
        System.out.println(p1.text);
        System.out.println();
        
        Child s = new Child(']', "son son son", 389);
        Child s2 = new Child(s);
        System.out.println(s2.c);
        System.out.println(s2.text);
        System.out.println(s2.i);  
        System.out.println();   
    }
    
}
