

package Lab_7.task3;


public class GrandFather {
    
    public int i;
    
    public GrandFather(int a)
    {
        i = a;
    }
    
    public void setFields(int a)
    {
        i = a;
    }
    
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "\n" +
                "i = " + i;
    }
    
}
