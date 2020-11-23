
package Lab_7.task1;


public class MainClass {
    
    public static void main(String[] args) 
    { 
        SuperClassTest superClassObject = new SuperClassTest("передал в конструктор суперкласса"); 
        System.out.println(superClassObject);
        
        SubClassTest subClassObject1 = new SubClassTest("передал в конструктор подкласса"); 
        System.out.println(subClassObject1); 
        
        SubClassTest subClassObject2 = new SubClassTest("передал в конструктор подкласса", "где два параметра"); 
        System.out.println(subClassObject2); 
    }
    
}
