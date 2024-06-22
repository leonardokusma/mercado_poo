package dominio;

import java.io.Serializable;

public class MerProduto implements Serializable{

    private static long id = 1;
    private long idMerProduto;
    private String nome;
    private String descricao;

    MerProduto(String nome, String descricao) {
        this.idMerProduto = MerProduto.id;
        MerVenda.setId(id++);
        this.nome = nome;
        this.descricao = descricao;
    }

    public static void setId(long id) {
        MerProduto.id = id;
    }

    public long getIdMerProduto() {
        return idMerProduto;
    }

    public void setIdMerProduto(long idMerProduto) {
        this.idMerProduto = idMerProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

}
