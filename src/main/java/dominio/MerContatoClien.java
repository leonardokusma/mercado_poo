
package dominio;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MerContatoClien implements Serializable{
    private static long id = 1;
    private long idMerContatoClien;
    private String telefone;
    private String email;

   public MerContatoClien(String telefone, String email) {
        this.idMerContatoClien = MerContatoClien.id;
        MerContatoClien.setId(id++);
        this.telefone = telefone;
        this.email = email;
   }

    public static void setId(long id) {
        MerContatoClien.id = id;
    }


    public String getTelefone() {
        return telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}