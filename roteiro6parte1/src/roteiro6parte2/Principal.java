/*
 */
package roteiro6parte2;

import roteiro6parte1.*;

/**
 *
 * @author wesll
 */
public class Principal {


    public static void main(String[] args) {
       
      
        Ligacao call = new Ligacao("121212","565656","A","B",new Tempo(10,15,02));
        call.setHoraFim(new Tempo (10,25,35));
        System.out.println(call.toString());
    
}
}
