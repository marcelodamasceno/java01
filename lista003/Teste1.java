/*
 Para finalizar, no método main() da classe de teste, crie um novo objeto da classe
Produto, peça para o usuário informar os preços de custo e de venda e exiba a margem
de lucro em moeda e em percentual. Sua saída deverá ser algo parecido com o mostrado
na imagem abaixo:
 */
package lista003;
  // import java.util .Scanner
 import java.util.Scanner;


/**
 *
 * @author macelo
 */
public class Teste1 {
   

   
   
 

    
    public static void main(String[] args) {
       
       
        Scanner sc = new Scanner(System.in);
       
       
        double  precoVenda; 
        double precocusto;
         double margemLucro = 10.0;
        double margemLucroPercentual= 0.50 ;
       double percentualLucro = (int) 0.01;
        
        System.out.printf("informe o preco de Custo:  ");
        double precoCusto = sc.nextDouble();
          System.out.printf("informe o preco de Venda: ");
          precoVenda= sc.nextDouble();
        
      // 
        
       
          
           System.out.print("o preco do custo e: "+precoCusto);
           System.out.print("o preco da venda e: "+precoVenda);
           System.out.print(" a margem do lucro e: "+margemLucro);
          
          System.out.print(" a margem do lucro percentual e: "+margemLucroPercentual);
        margemLucro= precoCusto / (1.0 - margemLucroPercentual);
    
      
      String setImprimirNome(String nome,double saldo );
     
     
}

}