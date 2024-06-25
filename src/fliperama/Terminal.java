package fliperama;

public class Terminal {

  
    private static int temp;
    private static int novoCredito;
    private Cartao cartao;
    private int dinheiro;
    private static int credito;  
    //fim dos campos      
    
    public Terminal()
    {
      
    }
    
      public static int getNovoCredito() {
        return novoCredito;
    }

   
    
     public static int getTemp() {
        return temp;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public int getDinheiro() {
        return dinheiro;
    }
    
     public int getCredito() {
        return credito;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }
        
    
        public static void display(Cartao c)
          {
              System.out.println("Número do cartão: " +c.getNumCartao());
              System.out.println("Créditos: " +c.getCreditos());
              System.out.println("Tiquetes: " +c.getTiquetes());
              System.out.println();
          }
        
        public static void troca(Cartao t, int dinheiro)
        {
            
            if (dinheiro < 0)
            {
                System.out.println("Valor inválido");
            }
            int resultado = dinheiro * 2;
            credito += resultado;
            t.setCreditos(credito);
            credito = 0;
            System.out.println("Novo saldo do cartão "+ t.getNumCartao() + ": " +t.getCreditos() + " créditos");
            System.out.println();
           
        }
        
        public static void transferir(Cartao a, Cartao b, int trans)
        {
            
            if(trans > a.getCreditos())
            {
                System.out.println("Valor inválido");
            }
            else
            {
            temp = a.getCreditos();
           novoCredito = b.getCreditos();
            
            int resultado = temp - trans;
            trans += novoCredito;
          
            a.setCreditos(resultado);
            b.setCreditos(trans);
            
            System.out.println("Novo valor de: " + a.getNumCartao() + " = "  + a.getCreditos() + " créditos");
            System.out.println("Novo valor de: " + b.getNumCartao() + " = " + b.getCreditos() + " créditos");
            System.out.println();
            }
        }
       
}


