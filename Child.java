
package Lab_7.task4;


public class Child extends Parent {
    
    public int i;
    
    public Child(char ch, String s, int a)
    {
        super(ch, s);
        i = a;
    }
    
    public Child(Child sn)
    {
        super(sn);
        i = sn.i;
    }
    
}
