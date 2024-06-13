/*
 */
package roteiro6parte1;

/**
 *
 * @author wesll
 */
public class Principal {


    public static void main(String[] args) {
       
        Ligacao call = new Ligacao("121212","565656","A","B","10:15:02");
        call.setHoraFim("10:20:35");
        System.out.println(call.toString());
        
    }
    
}
