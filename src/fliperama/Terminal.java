package fliperama;

import java.util.Scanner;

/*
aqui sera realizado as funcoes que o cartao pode desempenhar
como recarga, transferencia de creditos, ver os dados do cartao e comprar premios
*/

public class Terminal {

    
    private static int temp;
    private static int novoCredito;
    private Cartao cartao;
    private int dinheiro;
    private static int credito;  
    private Premios premio;
    //fim dos campos      
    
  
    public Premios getPremio() {
        return premio;
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
        
    
        public static void display(Cartao c)//mostra os dados do cartao
          {
              System.out.println("Número do cartão: " +c.getNumCartao());
              System.out.println("Créditos: " +c.getCreditos());
              System.out.println("Tiquetes: " +c.getTiquetes());
              System.out.println();
          }
        
        public static void recarga(Cartao t, int dinheiro)//recarrega o cartao trocando dinheiro por creditos, 1 para 2
        {
            
            if (dinheiro < 0)
            {
                System.out.println("Valor inválido");
            }
            int resultado = dinheiro * 2;
            credito += resultado;
            t.setCreditos(credito);
             System.out.println("Novo saldo do cartão "+ t.getNumCartao() + ": " +t.getCreditos() + " créditos");
            System.out.println();
            credito = 0;
           
           
        }
        
        public static void transferir(Cartao a, Cartao b, int trans)// transfere credito entre dois cartoes
        {
            
            if(trans > a.getCreditos())
            {
                System.out.println("Valor inválido");
            }
            else
            {
            temp = a.getCreditos(); //variavel para o cartao1
           novoCredito = b.getCreditos(); //variavel para o cartao2
            
            int resultado = temp - trans;
            trans += novoCredito;
          
            a.setCreditos(resultado);//novo saldo do cartao 1
            b.setCreditos(trans);//novo saldo do cartao 2
            
            System.out.println("Novo valor de: " + a.getNumCartao() + " = "  + a.getCreditos() + " créditos");
            System.out.println("Novo valor de: " + b.getNumCartao() + " = " + b.getCreditos() + " créditos");
            System.out.println();
            }
        }
        
        public static void Premios(Cartao c) //categoria de premios
        {
            Premios premio1 = new Premios(100, 2, "Prêmio 1"); // instanciacao de 3 premios diferentes
            Premios premio2 = new Premios(300, 4, "Prêmio 2");
            Premios premio3 = new Premios(500, 1, "Prêmio 3");
            
            System.out.println("Prêmio 1 custa " + premio1.getPreco() + " tiquetes, quantidade disponível: " + premio1.getQuantidade() + 
                    "\nPrêmio 2 custa " + premio2.getPreco()+ " tiquetes, quantidade disponível: " + premio2.getQuantidade() +
                    "\nPrêmio 3 custa " + premio3.getPreco()+ " tiquetes, quantidade disponível: " + premio3.getQuantidade());
            System.out.println("Selecione qual categoria de prêmio você gostaria de adquirir, 1, 2 ou 3");// terminal para mostrar preco e quantidade do premio
            
            Scanner sc = new Scanner(System.in);
            int categoria = sc.nextInt();
            sc.close();
            
            
           if (c.getTiquetes() >= premio1.getPreco() && categoria == 1) //avalia se pode ser comprado e retira os tiquetes do cartao e mostra o restante, retira 1 na quantidade de premios
    {
            premio1.getQuantidade();
            premio1.setQuantidade(premio1.getQuantidade() - 1); //retira 1 premio
            
            c.setTiquetes(c.getTiquetes() - premio1.getPreco()); //novo valor dos tiquetes
            
            System.out.println("Parabéns! Você ganhou o " + premio1.getNomePremio() + "!");
            System.out.println("Quantidade de tiquetes: " + c.getTiquetes());
            System.out.println();
    } 
        else if (c.getTiquetes() >= premio2.getPreco() && categoria == 2) //avalia se pode ser comprado e retira os tiquetes do cartao e mostra o restante, retira 1 na quantidade de premios
    {
            premio2.getQuantidade(); 
            premio2.setQuantidade(premio2.getQuantidade() - 1);//retira 1 premio
            
            c.setTiquetes(c.getTiquetes() - premio2.getPreco()); //novo valor dos tiquetes
            
            premio2.setQuantidade(premio2.getQuantidade() - 1);
            System.out.println("Parabéns! Você ganhou o " + premio2.getNomePremio() + "!");
            System.out.println("Quantidade de tiquetes: " + c.getTiquetes());
            System.out.println();
    } 
        else if (c.getTiquetes() >= premio3.getPreco() && categoria == 3) //avalia se pode ser comprado e retira os tiquetes do cartao e mostra o restante, retira 1 na quantidade de premios
    {
            premio3.getQuantidade();  
            premio3.setQuantidade(premio3.getQuantidade() - 1);//retira 1 premio
            
            c.setTiquetes(c.getTiquetes() - premio3.getPreco()); //novo valor dos tiquetes
            
            premio3.setQuantidade(premio3.getQuantidade() - 1);
            System.out.println("Parabéns! Você ganhou o " + premio3.getNomePremio() + "!"); 
            System.out.println("Quantidade de tiquetes: " + c.getTiquetes());
            System.out.println();
    } 
        else 
    {
            System.out.println("Você não possui tiquetes suficientes para participar desta categoria."); // caso nao tiver a quantidade de tiquetes para o premio
            System.out.println();
    }
        
        }
       
}


