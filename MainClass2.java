

package Lab_7.task2;


public class MainClass2 {
    
    public static void main(String[] args)
    {
        SuperClass sup = new SuperClass("Hello, world!");
        System.out.println(sup.getTextLength());
        
        SubClass sub = new SubClass(11, "These mountains are high");
        sub.setFields(12, "Low");
        System.out.println(sub.getTextLength());
    }
    
}
