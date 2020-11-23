

package Lab_7.task2;


public class SuperClass {
    
    private String text;
    
    public SuperClass(String s)
    {
        text = s;
    }
    
    public void setFields()
    {
        text = "";
    }
    
    public void setFields(String s)
    {
        text = s;
    }
    
    public int getTextLength()
    {
        if (text == null)
            return 0;
        else
            return text.length();
    }
}
