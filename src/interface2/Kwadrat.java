
package interface2;
/**
 * 
 * @author pawelstradomski
 */

public class Kwadrat implements ProjektFigury
{
    int a;
    Kwadrat(int a)
    {
        this.a=a;
    }

    @Override
    public int Pole() {
        return a*a;
        
    }

    @Override
    public int Obwod() {
        return 4*a;
        
    }
    
}
