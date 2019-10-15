
package lista003;

public class Conta {
    int numero;
    String nome;
    double saldo,deposita;
    private String Conta;
    double valor;
    private String imprimir;
    private  double saldoatual;
    double sacar;
       double transfere;
   
  
   

    public String Conta(String nome,int numero,double saldo){
        
            return this.Conta;
    }
     boolean sacar(double valor) {
          if (saldo >= valor){ 
            saldo = this.saldo - valor;
    
              System.out.println(" Liberado  o valor pra o Saque !!");
            return true;
        } else {
            this.saldo = this.saldo - valor;
           System.out.println("Não posso sacar um valor maior que o saldo!");
            return false;
        
        }
          public double deposita(double valor){
              return this.saldo +=  valor;
              
          }
          
             boolean transfere(String Conta,double valor) {
          if (valor <= this.saldo){ 
            
              System.out.println(" Liberado  o valor pra a Transferencia !!");
            return true;
        } else {
           // this.saldo = this.saldo - valor;
           System.out.println("saldo insuficiente transferencia  pra a Conta !!");
            return false;
    }
             
         public String imprimirNome(String nome,double saldo){

     System.out.println("\nTitular: " + nome);
     System.out.println("\nSaldo…: " + saldo);
        return this.Conta;


}

 
  
}


    
   