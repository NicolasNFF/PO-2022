
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Matheus Barth
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String cpf, String nome, double limiteCred ) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred; 
        pedidos = new ArrayList<Pedido>();
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    } 

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }
    public void addPedido(Pedido f){
    pedidos.add(f); 
    f.setCliente(this);
}
}
