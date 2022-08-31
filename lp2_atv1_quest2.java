
/**
 * Escreva uma descrição da classe Livros aqui.
 * 
 * @author (Tiago Silva)  (Thomas Gael)
 * @version (1)
 */
public class Livros
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome, autor;
    private double preco_custo, valor_venda = 0;
    private int ano, edicao;

    /**
     * Construtor para objetos da classe Livros
     */
    public Livros(String nome, String autor, double preco_custo, int edicao, int ano)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.autor = autor;
        this.preco_custo = preco_custo;
        this.edicao = edicao;
        this.ano = ano;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public double sampleMethod(double percentual)
    {
        
      
        // escreva seu código aqui
        
        valor_venda = preco_custo + preco_custo * percentual/100;
        
        return valor_venda;
    }
    
    public void imprimir(){
    
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);      
        System.out.println("Valor: " + preco_custo);
        System.out.println("Edição do livro: " + edicao);
        System.out.println("Ano de Publicação: " + ano);
        System.out.println("valor com desconto: " + this.valor_venda);
        
        
    }
}
