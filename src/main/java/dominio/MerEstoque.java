
package dominio;

import java.io.Serializable;


public class MerEstoque implements Serializable{
    private static long id = 1;
    private long idMerEstoque;
    private String descricao;
    private MerEnderecoEstoque endereco;
    
    public MerEstoque(String descricao, MerEnderecoEstoque endereco){
        this.idMerEstoque = MerEstoque.id;
        MerEstoque.setId(id++);
        this.descricao = descricao;
        
    }

    public static void setId(long id) {
        MerEstoque.id = id;
    }

    public long getIdMerEstoque() {
        return idMerEstoque;
    }

    public void setIdMerEstoque(long idMerEstoque) {
        this.idMerEstoque = idMerEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MerEnderecoEstoque getEndereco() {
        return endereco;
    }

    public void setEndereco(MerEnderecoEstoque endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "MerEstoque{" + "idMerEstoque=" + idMerEstoque + ", descricao=" + descricao + ", endereco=" + endereco + '}';
    }

}
