
/**
 * numero da carteira, cpf, tipo (a,b,ab), data validade, data expedicao, pontos, situacao (valida, apreendida, vencida)
nota: quando uma pessoa passa no detran uma nova carteira � emitida com os dados do propriet�rio, neste momento o proprietario n possui pontos na carteira.

nota2: ao cometer infracao, pontos serao acumulado a carteira.

nota3: ultrapassando 20 pontos, a carteira � apreendida, e os pontos sao zerados.

nota4: metodo acrescentar pontos. consultar saldo pontos. zerar carteira. apreender a carteira. verificar se esta valida.



 * 
 * @author (Thomas e Tiago) 
 * @version (um número da versão ou uma data)
 */
public class Detran
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int num;
    private int cpf;
    private String tipo;
    private String situacao = "valida"; //(valida, apreendida, vencida)
    private Data dtvalidade;
    private Data dtexpedicao;
    private int pontos = 0;
    

    /**
     * Construtor para objetos da classe DETRAN
     */
    public Detran(int num, int cpf,String tipo/*,String Situacao*/,Data dtvalidade,Data dtexpedicao/*, int pontos */)
    {
        // inicializa variáveis de instância
        this.num = num;
        this.cpf = cpf;
        this.tipo = tipo;
        this.dtvalidade = dtvalidade;
        this.dtexpedicao = dtexpedicao;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    
    public int atualizarPontos(int qtde)
    {
        if(this.num != -1){
            this.pontos = this.pontos + qtde;
            
        
            if(pontos > 20){
            
                System.out.print("carteira apreendida! ");
                this.num = -1;
                this.situacao = "apreendida";
            
            
            }
        }else {
            System.out.print("Carteira invalida, regularize sua situacao junto ao Detran");
        }
        
     return this.pontos;
    }
   public void situacao()
    {  
           System.out.println(this.situacao);  
               
    } 
   public void consultaSaldoPontos(){
        System.out.print(this.pontos);
    }
    
   public void zerarCarteira () {
    
       if(this.situacao == "apreendida"){
           this.pontos = 0;
               if(this.pontos == 0){
                    this.situacao = "valida";
                    this.num = 0;
                }
       }
       
   }
   
}
