
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        int n=1000;
        int suma=0;
        for(int i=0; i<=n; i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                suma=suma+i;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma de los multiplos de 3 y 5 por debajo de 1000= "+suma);
    }
    
}
