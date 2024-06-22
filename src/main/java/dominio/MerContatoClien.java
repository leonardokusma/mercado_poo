/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */
import java.util.ArrayList;
import java.util.List;

public class MerContatoClien {
    private int idMerContatoClien;
    private String telefone;
    private String telefoneEmp;
    private String email;

   public MerContatoClien(int idMerContatoClien, String telefone, String telefoneEmpresa) {
        this.idMerContatoClien = idMerContatoClien;
        this.telefone = telefone;
        this.telefoneEmp = telefoneEmpresa;
        this.email = email;
   }
    public int getIdMerContatoClien() {
        return idMerContatoClien;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTelefoneEmp() {
        return telefoneEmp;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTelefoneEmp(String telefoneEmp) {
        this.telefoneEmp = telefoneEmp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    //  gerenciamento de contatos 
   
    
    // Lista para armazenar os contatos (simulado - idealmente usar um banco de dados)
    private static List<MerContatoClien> listaContatos = new ArrayList<>();
    private static int proximoId = 1; // Simulando IDs autoincrementáveis

    // Método para incluir um novo contato
    public void incluir() throws Exception {
        // Validar dados antes de inserir (exemplo simples)
        if (this.telefone == null || this.telefone.isEmpty()) {
            throw new Exception("O telefone é obrigatório.");
        }

        // Atribuir um novo ID ao contato
        this.idMerContatoClien = proximoId++; 
        
        // Adicionar o contato à lista
        listaContatos.add(this);
    }

    // Método para consultar um contato por ID
    public static MerContatoClien consultar(int id) throws Exception {
        for (MerContatoClien contato : listaContatos) {
            if (contato.getIdMerContatoClien() == id) {
                return contato;
            }
        }
        throw new Exception("Contato não encontrado."); 
    }

    // Método para atualizar um contato existente
    public void atualizar() throws Exception {
        // Validar dados antes de atualizar ( semelhante à inclusão)
        if (this.idMerContatoClien == 0) {
            throw new Exception("ID inválido para atualização.");
        }

        // Encontrar o contato na lista pelo ID
        MerContatoClien contatoExistente = consultar(this.idMerContatoClien);

        // Atualizar os dados do contato
        contatoExistente.setTelefone(this.telefone);
        contatoExistente.setTelefoneEmp(this.telefoneEmp);
        contatoExistente.setEmail(this.email);
    }

    // Método para excluir um contato por ID
    public static void excluir(int id) throws Exception {
        MerContatoClien contatoParaRemover = null;
        for (MerContatoClien contato : listaContatos) {
            if (contato.getIdMerContatoClien() == id) {
                contatoParaRemover = contato;
                break; 
            }
        }

        if (contatoParaRemover != null) {
            listaContatos.remove(contatoParaRemover);
        } else {
            throw new Exception("Contato não encontrado para exclusão.");
        }
    }
}