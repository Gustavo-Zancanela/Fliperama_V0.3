
package fliperama;
/*
Cartao que armazena apenas informacao para outros objetos
*/

public class Cartao {

    
    private int creditos;
    private int tiquetes;
    private int numCartao;
    
    public Cartao(int numCartao)
    {
        this.numCartao = numCartao;
        creditos = 0;
        tiquetes = 0;
    }
    
      public int getCreditos() {
        return creditos;
    }

    public int getTiquetes() {
        return tiquetes;
    }
    
    public int getNumCartao() {
        return numCartao;
    }

     public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setTiquetes(int tiquetes) {
        this.tiquetes = tiquetes;
    }
   
   
   
}
