
package Lab_7.task3;


public class MainClass3 {
    
    public static void main(String[] args)
    {
        GrandFather gr = new GrandFather(5);
        System.out.println(gr);
        System.out.println();
        gr.setFields(300);
        System.out.println(gr);
        System.out.println();
        
        Father f = new Father(0, '*');
        System.out.println(f);
        System.out.println();
        f.setFields(122, '+');
        System.out.println(f);
        System.out.println();
        
        Son chil = new Son(84, 'b', "child child child");
        System.out.println(chil);
        System.out.println();
        chil.setFields(30);
        chil.setFields(20, 'c');
        chil.setFields(10, 'a', "any text");
        System.out.println(chil);  
        System.out.println();   
    }
    
}
