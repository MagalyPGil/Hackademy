
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        int posicion=0;
        int i=3;
        int j=0;
        while(posicion<10001)
        {
            boolean band=true;
            for(int k=2; k<i; k++)
            {
                if(i%k==0)
                {
                    band=false;
                }
            }
            if(band==true)
            {
                posicion=posicion+1;
            }
            j=i;
            i++;
        }
        JOptionPane.showMessageDialog(null,"En la posicion "+posicion+" se encuentra el número "+ j);
    }
    
}
