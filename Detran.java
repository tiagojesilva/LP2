
/**
 * Escreva uma descrição da classe DETRAN aqui.
 * 
 * @author (Thomas e Tiago) 
 * @version (um número da versão ou uma data)
 */
public class DETRAN
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int num;
    private int cpf;
    private String tipo;
    private String situacao;
    private Data dtvalidade;
    private Data dtexpedicao;
    private int pontos;
    

    /**
     * Construtor para objetos da classe DETRAN
     */
    public DETRAN(int num, int cpf,String tipo,String Situacao,Data dtvalidade,Data dtexpedicao, int pontos )
    {
        // inicializa variáveis de instância
        this.num = num;
        this.cpf = cpf;
        this.tipo = tipo;
        this.situacao = Situacao;
        this.dtvalidade = dtvalidade;
        this.dtexpedicao = dtexpedicao;
        this.pontos = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void atualizarpontos(int qtde)
    {
        this.pontos = this.pontos + qtde;
        this.atualizarSituacao();
        
    }
    public void atualizarSituacao()
    {  
        if (this.pontos > 20)
           this.situacao = "dtexpedicao";
         
    
    }
   // public void zerarCarteira(String  ) 
}
