package ejemploif;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class CondicionalAnimados {
    
    public void avaliarConAnimados(){
        int num1,num2;
        String numero1=JOptionPane.showInputDialog("teclea numero1 :");
        
       num1=Integer.parseInt(numero1);
       num2=Integer.parseInt(JOptionPane.showInputDialog("tecle num2"));
       if (num1>num2)
           System.out.println(num1 +"e maior");
       
//       else{
//           if(num1<num2)
//               System.out.println("e maior");
//           
//           else 
//               System.out.println("son iguales");
//       }
       
       
       
       //tamen se pode hacer:
       
       else if(num1<num2)
           System.out.println(num1+ "e menor");
       else 
           System.out.println("son iguales");
    }
    
}
