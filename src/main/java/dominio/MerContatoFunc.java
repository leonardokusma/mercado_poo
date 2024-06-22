
package dominio;

import java.io.Serializable;

/**
 *
 * @author João Ferrari
 */
public class MerContatoFunc implements Serializable{
    private int idMerContatoFunc;
    private MerFuncionario funcionario;
    private String telefone;
    private String telefoneEmp;
    private String email;

    public MerContatoFunc(int id, String telefone, String telefoneEmpresa, String email) {
        this.idMerContatoFunc = id;
        this.telefone = telefone;
        this.telefoneEmp = telefoneEmpresa;
        this.email = email;
    }

    public int getIdMerContatoFunc() {
        return idMerContatoFunc;
    }

    public MerFuncionario getFuncionario() {
        return funcionario;
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

    public void setIdMerContatoFunc(int id) {
        this.idMerContatoFunc = id;
    }

    public void setFuncionario(MerFuncionario funcionario) {
        this.funcionario = funcionario;
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
}

/*
MerFuncionario func = new MerFuncionario(1, "João"); 

        incluirContato(new MerContatoFunc(1, "123456789", "987654321", "joao@email.com"));
        incluirContato(new MerContatoFunc(2, "456789123", "321654987", "maria@email.com"));
        incluirContato(new MerContatoFunc(2, "456789123", "321654987", "maria@email.com"));

        // Consultar todos os contatos
        System.out.println("Contatos:");
        List<MerContatoFunc> contatos = consultarContatos();
        for (MerContatoFunc contato : contatos) {
            System.out.println(contato); 
        }*/

/*
public static void incluirContato(MerContatoFunc contato) {
        try {
            // Validações (telefone, email, etc.)
            validarContato(contato);
            listaContatos.add(contato);
            System.out.println("Contato incluído com sucesso.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao incluir contato: " + e.getMessage());
        }
    }

    // ---------- CONSULTAR ----------
    public static List<MerContatoFunc> consultarContatos() {
        // Em um sistema real, você consultaria o banco de dados aqui
        return new ArrayList<>(listaContatos); 
    }

    // Consulta por ID (Exemplo)
    public static MerContatoFunc consultarContatoPorId(int id) {
        for (MerContatoFunc contato : listaContatos) {
            if (contato.getIdMerContatoFunc() == id) {
                return contato;
            }
        }
        return null; // Ou lançar uma exceção se o contato não for encontrado
    }

    // ---------- ATUALIZAR ----------
    public static void atualizarContato(MerContatoFunc contato) {
        try {
            validarContato(contato);

            // Encontra o índice do contato na lista
            int indice = -1;
            for (int i = 0; i < listaContatos.size(); i++) {
                if (listaContatos.get(i).getIdMerContatoFunc() == contato.getIdMerContatoFunc()) {
                    indice = i;
                    break;
                }
            }
            // Se encontrou o contato na lista atualiza o contato 
            if (indice != -1) {
              listaContatos.set(indice, contato);
              System.out.println("Contato atualizado com sucesso.");
            } else {
              System.out.println("Contato não encontrado.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao atualizar contato: " + e.getMessage());
        }
    }

    // ---------- EXCLUIR ----------
    public static void excluirContato(int id) {
        try {
            // Remove o contato da lista
            listaContatos.removeIf(contato -> contato.getIdMerContatoFunc() == id);
            System.out.println("Contato excluído com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao excluir contato: " + e.getMessage());
        }
    }

    // ---------- Validações (Exemplo) ----------
    private static void validarContato(MerContatoFunc contato) {
        if (contato.getTelefone() == null || contato.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("Telefone inválido.");
        }
        // Adicione outras validações conforme necessário (email, etc.)
    }
*/