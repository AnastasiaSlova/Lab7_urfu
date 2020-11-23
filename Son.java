
package Lab_7.task3;


public class Son extends Father {
    
    public String text;
    
    public Son(int a, char ch, String s)
    {
        super(a, ch);
        text = s;
    }
    
    public void setFields(int a, char ch, String s)
    {
        super.setFields(a, ch); // i = a; c = ch;
        text = s;
    }
    
    public String toString()
    {
        return this.getClass().getSimpleName() + "\n" +
                "i = " + i + "\n" +
                "c = '" + c + "'" + "\n" +
                "text = \"" + text + "\"";
    }
    
}
