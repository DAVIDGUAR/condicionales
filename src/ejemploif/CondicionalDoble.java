package ejemploif;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class CondicionalDoble {
    
    Scanner res = new Scanner(System.in);
    
    public void maiorMenorEdade(){
        
        System.out.println("teclea edade :");
        int edade= res.nextInt();
        if(edade < 18)//{
            System.out.println("e menor de edade");
        //}
            else
            
            System.out.println("e maior de edade");
            
            System.out.println(" ***remata o programa**");
            
            
        }
    
    
    public void maiorMenor(){
        
        System.out.println("teclea edade :");
        int ed= res.nextInt();
        String resposta;
        if(ed < 18)//{
           resposta =("e menor de edade");
        //}
            else
            
            resposta =("e maior de edade");
            System.out.println(resposta);
            System.out.println(" ***remata o programa**");
        
    }
    
    public void maiorMenorOperador(){
        System.out.println("teclea edade :");
        int ed= res.nextInt();
        String resposta;
        resposta=(ed<18)?"e menor":"e maior ";
        
        System.out.println(resposta);
        System.out.println("remata");
    }
    }
    

