
package Lab_7.task4;

public class Parent extends Grand {
    
    public String text;
 
    public Parent(char ch, String s)
    {
        super(ch);
        text = s;
    }
    
    public Parent(Parent p)
    {
        super(p);
        text = p.text;
    }
    
}
