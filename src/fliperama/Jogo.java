
package fliperama;

import java.util.Random;

/*
Jogo para ganhar tiquetes a partir do credito disponivel no cartao
*/

public class Jogo {

  

    private static int novosTiquetes;
    private static int temp;
    private Cartao cartao;
    private int pontos;
    
    
      public static int getNovosTiquetes() {
        return novosTiquetes;
    }

    public static void setNovosTiquetes(int aNovosTiquetes) {
        novosTiquetes = aNovosTiquetes;
    }
      public Cartao getCartao() {
        return cartao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
    public static void jogo(Cartao c)// o jogo consiste em trocar 100 creditos por um numero aleatorio entre 10 e 100, ele retira o credito do cartao e recebe os tiquetes
    {
        if (c.getCreditos() > 100)
        {
             temp = c.getCreditos();
            int resultado = temp - 100;
             c.setCreditos(resultado);
            
           novosTiquetes = c.getTiquetes();
          
            Random rng = new Random();
             int pontuado = rng.nextInt(91) + 10;
            
            novosTiquetes   += pontuado;
             c.setTiquetes(novosTiquetes);
             
             System.out.println("Você ganhou " + pontuado + " tiquetes!!");
             System.out.println("Seus tiquetes: " + c.getTiquetes() + " ,número do cartão: " + c.getNumCartao());
             System.out.println("Novo saldo: " + c.getCreditos());
             System.out.println();
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
}
