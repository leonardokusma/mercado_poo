
package dominio;


public class MerHistoricoSaida {
    private static long id = 1;
    private long idMerHistoricoSaida;
    private MerEstoqueProduto produto;
    private MerVenda venda;
    
    public MerHistoricoSaida(MerEStoqueProduto produto, MerVenda venda){
        this.idMerHistoricoSaida = MerHistoricoSaida.id;
        MerHistoricoSaida.setId(id++);
        this.produto = produto;
        this.venda = venda;
    }

    public static void setId(long id) {
        MerHistoricoSaida.id = id;
    }
    
    
}
