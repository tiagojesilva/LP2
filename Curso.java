
/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (tiagojesilva) 
 * @version (1)
 */
public class Curso
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    /*representado por um código, nome, duração (em semestres), valor total do curso e ano de criação do curso*/
    private int codigo;
    private String nome;
    private int semestre;
    private double valor_total;
    private int ano_criacao;

    /**
     * Construtor para objetos da classe Curso
     */
    public Curso(int codigo, String nome, int semestre, double valor_total, int ano_criacao)
    {
        // inicializa variáveis de instância
    this.codigo = codigo;
    this.nome = nome;
    this.semestre = semestre;
    this.valor_total = valor_total;
    this.ano_criacao = ano_criacao;
    }
    
    public Curso(int codigo, String nome, double valor_total, int ano_criacao) //sobrecarga
    {
        // inicializa variáveis de instância
    this.codigo = codigo;
    this.nome = nome;
    this.valor_total = valor_total;
    this.ano_criacao = ano_criacao;
    this.semestre = 8;
    }
    
    //SET
    public void setCodigo (int codigo){ //encapsulamento é isso
        this.codigo = codigo;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setSemestre (int semestre){
        this.semestre = semestre;
    }
    
    public void setValor_total (double valor_total){
        this.valor_total = valor_total;
    }
    
    public void setAno_criacao (int ano_criacao){
        this.ano_criacao = ano_criacao;
    }
    
    //GET
    
    public int getCodigo(){ //encapsulamento é isso
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getSemestre(){
        return semestre;
    }
    
    public double getValor_total(){
        return valor_total;
    }
    
    public int getAno_criacao(){
        return ano_criacao;
    }
    
    //calculo mensalidade
    
    public void calcularMensalidade(int semestre){
        double mensalidade = 0;
        double valor_total = 20000;
                
        mensalidade = (valor_total / semestre) ; 
        System.out.print("\nValor a ser pago mensalmente: " + mensalidade);
    }
 
}
