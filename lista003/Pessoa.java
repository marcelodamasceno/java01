/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista003;


public class Pessoa {
            
      private  String  nome;
  
     private   int idade;
     private float peso;
     private double altura ;
    private String imc;

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
    this.nome = "fulano";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = (float) 1.80;
    }

    public String getImc() {
        return imc;
    }

    public float setImc(float imc) {
       return this.imc = peso/(altura * altura);
       
    }
    
     public setImprimirDados(){
         System.out.println("nome: "+nome);
       System.out.println("idade: "+idade);
        System.out.println("peso: "+peso);
                System.out.println("altura: "+altura);
  
            System.out.println("o IMC e: " +imc);


}
}

    
   