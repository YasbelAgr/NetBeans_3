import javax.swing.JOptionPane;
public class Ejercicio_4 {
    public static void main(String[] args){
        short Hip, CatA=0, CatB=0;
        CatA= Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de CatA"));
        CatB= Short.parseShort(JOptionPane.showInputDialog("ingresa el valor de CatB"));
        Hip= (byte) Math.sqrt(CatA + CatB);
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es de "+Hip);
        
    }
}

