

package Lab_7.task3;


public class Father extends GrandFather {
    
    public char c;
    
    public Father(int a, char ch)
    {
        super(a);
        c = ch;
    }
    
    public void setFields(int a, char ch)
    {
        super.setFields(a);  // i = a;
        c = ch;
    }
       
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "\n" +
                "i = " + i + "\n" +
                "c = '" + c + "'";
    }
    
}
