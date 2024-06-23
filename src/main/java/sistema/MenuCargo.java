
package sistema;


public class MenuCargo {
    
    
   public void cadastrarCargo(dominio.Banco banco){
       System.out.println("CADASTRO DE CARGO");
       dominio.Banco.adicionaCargo(businessRules.Cargo.cadastrarCargo());
   }
    
}
