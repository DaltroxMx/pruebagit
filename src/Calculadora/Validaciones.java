
package Calculadora;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Validaciones {
   
   public static void soloNumeros(java.awt.event.KeyEvent evt, JTextPane txtPantalla1){
       String a = txtPantalla1.getText();
       System.out.println(txtPantalla1.getText()+"|");
       if(!a.matches("^-?[0-9]{0,4}+([.][0-9]{0,4})?$")){
           txtPantalla1.setText(a.substring(0, a.length()-1));
           JOptionPane.showMessageDialog(null, "Orden inapropiado, verifique los numeros :v", null,2);
       }
        if(!Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != evt.VK_BACK_SPACE
                && evt.getKeyChar() != '-'
                && evt.getKeyChar() !='.'){
            System.out.println("Quitese alv compa :v");
            evt.consume();
            JOptionPane.showMessageDialog(null, "solo digitos");
        }
    }
   
   public static void cajasVacias(java.awt.event.KeyEvent evt, JTextPane txtPantalla1, JTextPane txtPantalla2){
       if(txtPantalla1.getText().length()==0){
           
       }
   }
   
   public static boolean FinVal(String a){
       if(a.matches("^-?[0-9]{0,4})+([.][0-9]{0,4)?$")){
           return true;
       }
       else{
           return false;
       }
   }
    
}
