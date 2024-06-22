/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */
import dominio.MerCliente;
import dominio.MerEnderecoClien;
import dominio.MerContatoClien;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class GerenciadorCliente {

    private List<MerCliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    // Método para encontrar um cliente pelo ID
    private Optional<MerCliente> encontrarClientePorId(int id) {
        return clientes.stream()
                .filter(cliente -> cliente.getIdMerCliente() == id)
                .findFirst();
    }

    // 1. Incluir novo cliente
    public void incluirCliente(String nome, String cpf, Date dataNascimento,
                                String telefone, String email,
                                String logradouro, String numero, String cidade, String estado)
            throws IllegalArgumentException {

        // Validar CPF 
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        // Criar instâncias de MerContatoClien e MerEnderecoClien
        MerContatoClien contato = new MerContatoClien(1,telefone, email);
        MerEnderecoClien endereco = new MerEnderecoClien(1,logradouro, numero, cidade, estado);

        // Criar instância de MerCliente
        MerCliente novoCliente = new MerCliente(nome, cpf, dataNascimento, contato, endereco);
        novoCliente.setIdMerCliente(proximoId++);

        // Adicionar o cliente à lista
        clientes.add(novoCliente);
    }

    // Método auxiliar para validação de CPF 
   


    // 2. Consultar cliente por ID
    public MerCliente consultarCliente(int id) throws ClienteNaoEncontradoException {
        Optional<MerCliente> clienteEncontrado = encontrarClientePorId(id);
        return clienteEncontrado.orElseThrow(() -> new ClienteNaoEncontradoException("Cliente não encontrado."));
    }

    // 3. Atualizar cliente
    public void atualizarCliente(int id, String nome, String cpf, Date dataNascimento,
                                String telefone, String email, String logradouro,
                                String numero, String cidade, String estado)
            throws ClienteNaoEncontradoException, IllegalArgumentException {

        // Encontrar cliente a ser atualizado
        MerCliente cliente = encontrarClientePorId(id)
                .orElseThrow(() -> new ClienteNaoEncontradoException("Cliente não encontrado."));

        // Validar CPF se ele foi alterado
        if (!cliente.getCpf().equals(cpf) && !validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        // Atualizar dados do cliente
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setDataNascimento(dataNascimento);
        cliente.getMerContatoClien().setTelefone(telefone);
        cliente.getMerContatoClien().setEmail(email);
        cliente.getMerEnderecoClien().setLogradouro(logradouro);
        cliente.getMerEnderecoClien().setNumero(numero);
        cliente.getMerEnderecoClien().setCidade(cidade);
        cliente.getMerEnderecoClien().setEstado(estado);
    }

    // 4. Excluir cliente
    public void excluirCliente(int id) throws ClienteNaoEncontradoException {
        // Remover cliente da lista se encontrado
        boolean removido = clientes.removeIf(cliente -> cliente.getIdMerCliente() == id);
        if (!removido) {
            throw new ClienteNaoEncontradoException("Cliente não encontrado.");
        }
    }
}

// Exceção customizada para cliente não encontrado
class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
