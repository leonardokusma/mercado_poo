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
        MerContatoClien contato = new MerContatoClien(telefone, email);
        MerEnderecoClien endereco = new MerEnderecoClien(logradouro, numero, cidade, estado);

        // Criar instância de MerCliente
        MerCliente novoCliente = new MerCliente(nome, cpf, dataNascimento, contato, endereco);
        novoCliente.setIdMerCliente(proximoId++);

        // Adicionar o cliente à lista
        clientes.add(novoCliente);
    }

    // Método auxiliar para validação de CPF 
    private boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Validação dos dígitos verificadores
        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
            }
            int resto = soma % 11;
            int primeiroDigitoVerificador = (resto < 2) ? 0 : 11 - resto;

            if (Integer.parseInt(String.valueOf(cpf.charAt(9))) != primeiroDigitoVerificador) {
                return false;
            }

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
            }
            resto = soma % 11;
            int segundoDigitoVerificador = (resto < 2) ? 0 : 11 - resto;

            return Integer.parseInt(String.valueOf(cpf.charAt(10))) == segundoDigitoVerificador;

        } catch (NumberFormatException e) {
            return false;
        }
    }


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
