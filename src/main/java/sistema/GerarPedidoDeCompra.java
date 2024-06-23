
package sistema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class GerarPedidoDeCompra {
    public void gerarRelatorio(dominio.Banco banco){
        Date data = new Date();
        int valor = 0;
        String cabecalho = "------MERCADINHO BIG BOM------\n";
        String sub = "          uma EXXXPLOSÃÃÃO DE OFERTAS!!!!!!!!!!!\n";
        File file = new File("pedidoCompras.txt");
        try{
            FileWriter escrever = new FileWriter(file);
            escrever.write(data.toString() + " \n");
            escrever.write(cabecalho);
            escrever.write(sub);
            for(dominio.MerEstoqueProduto prod : dominio.Banco.getEstoComProd()){
                if(prod.getQtd() < 15){
                    escrever.write(prod.toString() + " \n");
                    valor += prod.getPrecoUnitario();
                }
            }
            escrever.write("VALOR TOTAL: "+ valor);
            escrever.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
                    
        }
        
    }
}
