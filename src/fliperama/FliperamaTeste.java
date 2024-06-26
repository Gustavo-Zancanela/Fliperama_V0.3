
package fliperama;

public class FliperamaTeste {

   
    public static void main(String[] args) {

        
        
        Cartao cartao01 = new Cartao(1234);
        Cartao cartao02 = new Cartao(2345);
        
        Terminal.display(cartao01);
        Terminal.recarga(cartao01, 100);
        
       
       Terminal.display(cartao02);
       Terminal.recarga(cartao02, 200);
       
       Terminal.transferir(cartao01, cartao02, 20);
        
       
       Jogo.jogo(cartao02);
       Jogo.jogo(cartao02);
       
       Terminal.Premios(cartao02);
        
    }
    
}
