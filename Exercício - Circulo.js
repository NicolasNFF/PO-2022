Slide dos exercicios no teams, 2 class no exercicio circulo- meio parecido com o exercicio retangulo. Criar Projeto prjCirculo, coloca ciclo.java   
1 semana pra fazer


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Nicolas
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double a){
        
        raio = a;
    
    }
    
    public double getRaio(){
    
            return raio;
    
    }
    
    public double calcArea(){
        
        return Math.PI * (Math.pow(raio, 2));
    }
    
    public double calcPerimetro(){
   
        return 2*(Math.PI * raio);
    
    }
    
    public double calcDiametro(){
        
        return 2 * raio;
        
    }
    
}

Aplica.java

/**
 *
 * @author Nicolas
 */

import fatec.poo.model.Circulo;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
       
        Circulo objCirculo = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        double raio;
        int opcao;
        
        System.out.println("Informe o valor do raio");
        raio = entrada.nextDouble();
        
        objCirculo.setRaio(raio);
        
        do{
            
            System.out.println("\nEscolha uma opção");
            System.out.println("1- Calcular Area");
            System.out.println("2- Calcular Perimetro");
            System.out.println("3- Calcular Diametro");
            System.out.println("4- Calcular Area");
            
            opcao = entrada.nextInt();
            
            switch(opcao){
            
                case 1: System.out.println("O valor da area é " + objCirculo.calcArea());  
                break;
                
                case 2: System.out.println("O valor do perimetro é " + objCirculo.calcPerimetro());
                break;
                
                case 3: System.out.println("O valor do diametro é " + objCirculo.calcDiametro());
                break;
                
            
            }
            
        
        }while(opcao < 4);
        
        
    }
    
}


