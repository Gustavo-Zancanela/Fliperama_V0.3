
package fliperama;


public class FliperamaTeste {

    
   
    public static void main(String[] args) {
   
        Cartao cartao01 = new Cartao(1234);
        Cartao cartao02 = new Cartao(2345);
       
        Terminal.recarga(cartao01, 300);
        Terminal.recarga(cartao02, 200);
        
        Terminal.display(cartao01);
        Terminal.display(cartao02);
    
        Terminal.transferir(cartao01, cartao02, 100);
        
        Jogo.jogo(cartao01);
        Jogo.jogo(cartao01);
        
        Jogo.jogo(cartao02);
        Jogo.jogo(cartao02);
        
        Terminal.Premios(cartao02);
    }
}
