

package Lab_7.task4;


public class Grand {
    
    public char c;
    
    public Grand(char ch)
    {
        c = ch;
    }
    
    public Grand(Grand gr)
    {
        c = gr.c;
    }
    
}
