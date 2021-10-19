                                          
import javax.swing.JOptionPane;                                                                                
                                                                                                               
                                                                                                               
public class letraynumero{                                                                                     
    public static void main(String[] args) {                                                                   
                                                                                                               
        char valor =JOptionPane.showInputDialog("Inserte un valor:").charAt(0); 

        if(Character.isDigit(valor)){//Si detecta que has insertado un numero se cumplira la funcion

            JOptionPane.showMessageDialog(null,"USTED HA INGRESADO UN NUMERO :"+valor); 

        }else if(Character.isUpperCase(valor)){//Si detecta que es una letra mayuscula se cumplera la funcion

            
            JOptionPane.showMessageDialog(null,"USTED HA INGRESADO UNA LETRA MAYUSCULA : "+valor); 

        } else if(Character.isLowerCase(valor)){       //Si detecta que es una letra minuscula se cumplera la funcion                                                        
           
            JOptionPane.showMessageDialog(null,"USTED HA INGRESADO UNA LETRA MINUSCULA : "+ valor);  

        }else{                     //Si no se cumple niguna de las funciones entonces se ejecuta el else                                                                             
            JOptionPane.showMessageDialog(null,"VALOR NO RECONOCIDO :"+ valor);                                 
        }                                                                                                      
    }//main      

}//class