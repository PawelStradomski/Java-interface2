
package interface2;
/**
 * 
 * @author pawelstradomski
 */

public class Interface2 {

    
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(7);
        Prostokat prostokat = new Prostokat(9,9);
        
        System.out.println(kwadrat.Obwod());
        System.out.println(prostokat.Obwod());
        
        ProjektFigury figura[] = {kwadrat, prostokat};
        for(int i=0; i<figura.length; i++)
        {
            System.out.println(figura[i].Pole());
        }
        
    }
    
}
