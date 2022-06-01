
package fatec.poo.model;

/**
 *
 * @author Manuel Italo
 */
public class Produto {
    private String codigo;
    private String descricao;
    private Double qtdeEstoque;
    private String unidadeMedida;
    private double preco;
    private double estoqueMinimo;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(Double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }
    
}
