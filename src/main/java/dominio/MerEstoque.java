
package dominio;

import java.io.Serializable;
import java.util.Objects;


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
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.idMerEstoque ^ (this.idMerEstoque >>> 32));
        hash = 47 * hash + Objects.hashCode(this.descricao);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MerEstoque other = (MerEstoque) obj;
        if (this.idMerEstoque != other.idMerEstoque) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }

    @Override
    public String toString() {
        return "MerEstoque{" + "idMerEstoque=" + idMerEstoque + ", descricao=" + descricao + ", endereco=" + endereco + '}';
    }

}
