
package fatec.poo.model;

/**
 *
 * @author Nicolas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[]; //representa a multiplicidade 1..*
    private int numFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc]= f;
        numFunc = numFunc + 1; // ou numFunc++ = soma , numFunc-- tira 1
        
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("\nRegistro\tNome\tCargo");
        for (int x = 0; x < numFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "\t");
            System.out.print(funcionarios[x].getNome() + "\t");
            System.out.println(funcionarios[x].getCargo());
        }
    }
}
