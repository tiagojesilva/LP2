/**
 * Escreva uma descrição da classe loja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Loja
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String fantasia;
    private String razaosocial;
    private int cnpj;
    private int digito_cnpj;
    private double valor_faturamento;
    private double area;
    private String publico;
    

    /**
     * Construtor para objetos da classe loja
     */
    public Loja(String fantasia,String razaosocial,int cnpj,int digito_cnpj)
    {
        this.fantasia = fantasia;
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.digito_cnpj = digito_cnpj;
        this.valor_faturamento = 0;
    }

    public Loja(String fantasia,int cnpj, int digito_cnpj,double valor_faturamento, String publico)
    {
        // ethisscreva seu código aqui
        this(fantasia,fantasia,cnpj,digito_cnpj);
        this.valor_faturamento = valor_faturamento;
        this.publico = publico;
        
        
    } 
    public int comparafat(Loja lojateste)
    { 
      if(this.valor_faturamento > lojateste.valor_faturamento)
      
      return 1;
      
      else 
       return 0;
       
    }
    public void setvalor_fat(double valor)
    { 
        this.valor_faturamento = valor;
    }
}
