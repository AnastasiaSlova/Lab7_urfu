

package Lab_7.task2;


public class SubClass extends SuperClass {
    
    public int i;
    
    public SubClass(int a, String s)
    {
        super(s);
        i = a;
    }
    
    @Override
    public void setFields()
    {
        super.setFields();
        i = 0;
    }
    
    @Override
    public void setFields(String s)
    {
        super.setFields(s);
        i = 0;
    }
    
    public void setFields(int a)
    {
        super.setFields();
        i = a;
    }
    
    public void setFields(int a, String s)
    {
        super.setFields(s);
        i = a;
    }
    
}
