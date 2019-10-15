
package lista003;


public class TesteConta {
  
     public static void main(String[] args){
     
        Conta minhaConta = new Conta();
        minhaConta.nome = "ana Lima";
        minhaConta.numero = 18465;
       
        minhaConta.saldo = 100;
        minhaConta.sacar = 2500;
        minhaConta.transfere  = 2500;
        
        System.out.println("\n nome: "+minhaConta.nome);
            System.out.println("\n Saldo: " +minhaConta.saldo);
        
        System.out.println("\n O  valor pra sacar e:  "+minhaConta.sacar);
           minhaConta.saldo -= minhaConta.sacar ;
           
           if (minhaConta.saldo >= minhaConta.sacar){ 
            
            System.out.println(" Liberado  o valor pra o Saque !!");
            
        } else {
         
           System.out.println("Não Foi possivel fazer o saque !!!");
            
        
        }  
             minhaConta.deposita(300); 
            System.out.println("valor depositado com sucesso Aguarde o comprante de deposito esta sendo procesado");
            System.out.println("novo saldo Atualizado e = "+minhaConta.saldo);
   
        //minhaConta.saldo = minhaConta.saldo - minhaConta.sacar;
    
       Conta minhaConta2= new Conta();
         minhaConta2.nome = "Lana";
         minhaConta2.numero = 15480;
         minhaConta2.saldo =  4000;
         minhaConta2.sacar = 1000;
          minhaConta2.transfere  = 2000;
          
          
        System.out.println("\n nome: "+minhaConta2.nome);
          System.out.println("\n Saldo: " +minhaConta2.saldo);
         
         System.out.println("\n O  valor pra sacar e:  "+minhaConta2.sacar);
             
       
            
           if (minhaConta2.saldo >= minhaConta2.sacar){ 
            
              System.out.println(" Liberado  o valor pra o Saque !!");
            
        } else {
         
           System.out.println("Não Foi possivel fazer o saque !!!");
            
        
        }  
           
           
           
           minhaConta2.sacar = 1000;
       minhaConta2.saldo -=   minhaConta2.sacar ;
    
         System.out.println("\" Liberado  o valor pra o Saque Aguarde o comprante de deposito esta sendo procesado");
            System.out.println(" saldo  = "+minhaConta2.saldo);
            System.out.println("\n O  valor pra transferi e:  "+minhaConta2.transfere);
            
            
            
             minhaConta2.saldo -= minhaConta2.transfere ;
              System.out.println("\" Liberado  o valor pra transferencia Aguarde o comprante de deposito esta sendo procesado");
            if (minhaConta2.saldo >= minhaConta2.transfere){ 
            
              System.out.println(" Liberado  o valor pra A Transferencia!!");
            
        } else {
         
           System.out.println("Não Foi possivel fazer transfarencia!!!");
            
        
        }  
            
                         System.out.println("\n Saldo: "+minhaConta.saldo);
          
    
          
             System.out.println("Saldo da Conta2 Atualizado e: "+minhaConta2.saldo);
          
       
          
          
           
            minhaConta.saldo -= minhaConta.transfere ;
              System.out.println("\" Liberado  o valor pra transferencia Aguarde o comprante de deposito esta sendo procesado");
            if (minhaConta.saldo >= minhaConta.transfere){ 
            
              System.out.println(" Liberado  o valor pra A Transferencia!!");
            
        } else {
         
           System.out.println("Não Foi possivel fazer transfarencia!!!");
            
        
        }  
          
    
        System.out.println("Saldo da Conta1 Atualizado e: "+minhaConta.saldo);
    
        
          
        
            minhaConta.nome = "ana Lima";
            minhaConta.saldo = 100;
            minhaConta2.nome = "lana";
            minhaConta2.saldo = 4000;
            
            
             System.out.println("\n nome: "+minhaConta.nome);
          System.out.println("\n Saldo: " +minhaConta.saldo);
             System.out.println("\n nome: "+minhaConta2.nome);
          System.out.println("\n Saldo: " +minhaConta2.saldo);
          
           System.out.println("\n nome: "+minhaConta.nome);
          System.out.println("\n Saldo: " +minhaConta.saldo);
       }
      
    }

       
           
    
    
    


