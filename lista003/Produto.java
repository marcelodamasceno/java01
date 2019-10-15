
package lista003;


public class Produto {
    private String nome;
    private  double  precoCusto ;
    private double precoVenda;
    private double margemLucro;
  double PERCENTUAL_LUCRO;
    private double margemlucroporcentagem;

    
    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
       this.nome = nome; 
        return nome;
    
    }
    
    public double getPrecoCusto(){
        return this.precoCusto;
    }
    public double setPrecoCusto(double precoCusto){
       this.precoCusto =precoCusto; 
        return precoCusto;
    }
      public double getPrecoVenda(){
          return this.precoVenda;
      }
  public double setPrecoVenda(double precoVenda){
          this.precoVenda =  precoVenda;
           return precoVenda;
  }
 public void calcularMargemlucro(){
       
     margemLucro = (precoVenda - precoCusto) / precoVenda;
     
 }
 public double getMargemLucroPorcentagem(){
        
       margemLucro= precoCusto / (1.0 - PERCENTUAL_LUCRO);
    return this.margemlucroporcentagem;
     
     
     }


}
