
/**
 * Lista 3, ques 2
 * Essa classe representa o momento.
 * 
 * @author (Tiago Silva "tiagojesilva") 
 * @version (um número da versão ou uma data)
 */
public class Tempo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Construtor para objetos da classe Tempo
     */
    
    public Tempo(int hora, int minuto, int segundo)
    {
        // inicializa variáveis de instância
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    
    public int convertSegundos( )
     {
        return this.hora*3600 + this.minuto*60 + this.segundo;
     }
    
    
    public int calculaDuracaoSeg (Tempo tempMomentoInicial, Tempo tempMomentoTermino){
        
        double resultado = 0;
        
        int duracaoSeg = tempMomentoTermino.convertSegundos() - tempMomentoInicial.convertSegundos();
        
        return duracaoSeg;
        }
}
