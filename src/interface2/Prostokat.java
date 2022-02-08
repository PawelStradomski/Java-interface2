
package interface2;
/**
 * 
 * @author pawelstradomski
 */

public class Prostokat implements ProjektFigury
{
    int a;
    int b;
    Prostokat(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public int Pole() {
        return a*b;
        
    }

    @Override
    public int Obwod() {
        return 2*(a+b);
        
    }
    
}
