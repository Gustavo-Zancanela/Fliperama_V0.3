
package fliperama;

/*
secao de premio que sera instanciada na classe Terminal
*/

public class Premios {

   
    private Cartao cartao;
    private  String nomePremio;
    private  int preco;
    private  int quantidade;
    
    public Premios(int p, int q, String n)
    {
        this.preco = p;
        this.nomePremio = n;
        this.quantidade = q;
    }
    
    
     public String getNomePremio() {
        return nomePremio;
    }

   
     public Cartao getCartao() {
        return cartao;
    }

    public String getPremio() {
        return getNomePremio();
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
            
}
