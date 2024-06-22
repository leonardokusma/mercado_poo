package dominio;

public class MerHistoricoSaida {

    private static long id = 1;
    private long idMerHistoricoSaida;
    private MerEstoqueProduto produto;
    private MerVenda venda;

    public MerHistoricoSaida(MerEStoqueProduto produto, MerVenda venda) {
        this.idMerHistoricoSaida = MerHistoricoSaida.id;
        MerHistoricoSaida.setId(id++);
        this.produto = produto;
        this.venda = venda;
    }

    public static void setId(long id) {
        MerHistoricoSaida.id = id;
    }

    public long getIdMerHistoricoSaida() {
        return idMerHistoricoSaida;
    }

    public void setIdMerHistoricoSaida(long idMerHistoricoSaida) {
        this.idMerHistoricoSaida = idMerHistoricoSaida;
    }

    public MerEstoqueProduto getProduto() {
        return produto;
    }

    public void setProduto(MerEstoqueProduto produto) {
        this.produto = produto;
    }

    public MerVenda getVenda() {
        return venda;
    }

    public void setVenda(MerVenda venda) {
        this.venda = venda;
    }

}
