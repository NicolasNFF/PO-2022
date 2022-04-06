package fatec.poo.model;

/**
 *
 * @author Nicolas
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHortTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao,double valHorTrab) {
        super(registro, nome, dtAdmissao); // chamada do metodo construtor superclasse
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHortTrab(int qtdeHortTrab) {
        this.qtdeHortTrab = qtdeHortTrab;
    }
    
    @Override
    public double calcSalBruto() {
            return(valHorTrab * qtdeHortTrab);
    }
    
}
