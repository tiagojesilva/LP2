
/**
 * Lista 3, ques 2
 * Escreva uma descrição da classe LigacaoTelefonica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class LigacaoTelefonica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    /*
       guardar em um vetor ou em uma lista 
       
       */
    
    private int numeroTelefoneOrigem;
    private int numeroTelefoneDestino;
    private String nomeLocalidadeOrigem;
    private String nomeLocalidadeDestino;  
    private double valorTotalLigacao;
    
    private Tempo tempMomentoInicial;
    private Tempo tempMomentoTermino;
    
    private Tempo tmp;
    
    /**
     * Construtor para objetos da classe LigacaoTelefonica
     */
    public LigacaoTelefonica(int numeroTelefoneOrigem,int numeroTelefoneDestino, String nomeLocalidadeOrigem, String nomeLocalidadeDestino, double valorTotalLigacao, Tempo tempMomentoInicial, Tempo tempMomentoTermino)
    {
         // inicializa variáveis de instância
         this.numeroTelefoneOrigem = numeroTelefoneOrigem;
         this.numeroTelefoneDestino = numeroTelefoneDestino;
         this.nomeLocalidadeOrigem = nomeLocalidadeOrigem;
         this.nomeLocalidadeDestino = nomeLocalidadeDestino;         
         this.valorTotalLigacao = valorTotalLigacao;
         
         this.tempMomentoInicial = tempMomentoInicial;
         this.tempMomentoTermino = tempMomentoTermino;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    
    public void criarLigacaoTelefonica (Tempo tempMomentoInicial, Tempo tempMomentoTermino, String nomeLocalidadeOrigem, String nomeLocalidadeDestino, int numeroTelefoneOrigem, int numeroTelefoneDestino) {
    
    
    }
    

}
