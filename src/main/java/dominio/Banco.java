package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Banco implements Serializable {

    final private static List<MerCliente> clientes = new ArrayList<>();
    final private static List<MerFuncionario> funcionario = new ArrayList<>();
    final private static List<Cargo> cargos = new ArrayList<>();
    final private static List<MerEstoque> estoques = new ArrayList<>();
    final private static List<MerEstoqueProduto> estoComProd = new ArrayList();
    final private static List<MerHistoricoSaida> saidasProd = new ArrayList();
    final private static List<MerVenda> vendas = new ArrayList();
    final private static List<MerProduto> produtos = new ArrayList();

    public Banco() {
    }

    ;

    public static List<MerProduto> getProdutos() {
        return produtos;
    }

    public static List<MerCliente> getClientes() {
        return clientes;
    }

    public static List<MerFuncionario> getFuncionario() {
        return funcionario;
    }

    public static List<Cargo> getCargos() {
        return cargos;
    }

    public static List<MerEstoque> getEstoques() {
        return estoques;
    }

    public static List<MerEstoqueProduto> getEstoComProd() {
        return estoComProd;
    }

    public static List<MerHistoricoSaida> getSaidasProd() {
        return saidasProd;
    }

    public static List<MerVenda> getVendas() {
        return vendas;
    }

    public MerCliente buscaCliente(long id) {
        for (MerCliente cliente : Banco.getClientes()) {
            if (cliente.getIdMerCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    public MerCliente buscaCliente(String cpf) {
        for (MerCliente cliente : Banco.getClientes()) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public MerFuncionario buscaFuncionario(long id) {
        for (MerFuncionario funcionario : Banco.getFuncionario()) {
            if (funcionario.getIdFuncionario() == id) {
                return funcionario;
            }
        }
        return null;
    }
    
    public MerFuncionario buscaFuncionario(String cpf){
        for(MerFuncionario funcionario : Banco.getFuncionario()){
            if(funcionario.getCpf().equals(cpf)){
                return funcionario;
            }
        }
        return null;
    }

    public MerVenda buscaVendaCliente(long id) {
        for (MerVenda venda : Banco.getVendas()) {
            if (venda.getCliente().getIdMerCliente() == id) {
                return venda;
            }
        }
        return null;
    }

    public List<MerHistoricoSaida> busacaHistoricoVenda(long id) {
        List<MerHistoricoSaida> historico = new ArrayList();
        for (MerHistoricoSaida historicoVenda : Banco.getSaidasProd()) {
            if (historicoVenda.getIdMerHistoricoSaida() == id) {
                historico.add(historicoVenda);
            }
        }
        return historico;
    }

    public MerEstoqueProduto buscaProdutoEstoque(long id) {
        for (MerEstoqueProduto prod : Banco.getEstoComProd()) {
            if (prod.getIdMerEstoqueProduto() == id) {
                return prod;
            }
        }
        return null;
    }

    public MerEstoqueProduto buscaProdutoEstoque(String nome) {
        for (MerEstoqueProduto prod : Banco.getEstoComProd()) {
            if (prod.getProduto().getNome().equals(nome)) {
                return prod;
            }
        }
        return null;
    }

    public MerProduto buscaProduto(long id) {
        return Banco.getProdutos().get((int) id - 1);
    }

    public MerProduto buscaProduto(String nome) {
        for (MerProduto prod : Banco.getProdutos()) {
            if (prod.getNome().equals(nome)) {
                return prod;
            }
        }
        return null;
    }
    
    public Cargo buscaCargo(long id){
        return Banco.getCargos().get((int) id - 1 );
    }
    
    public MerEstoque buscaEstoque(long id){
        return Banco.getEstoques().get((int)id - 1);
    }

    public static void adicionaCliente(MerCliente cliente) {
        Banco.getClientes().add(cliente);
    }

    public static void adicionaFuncionario(MerFuncionario fun) {
        Banco.getFuncionario().add(fun);
    }

    public static void adicionaEstoque(MerEstoque estoque) {
        Banco.getEstoques().add(estoque);
    }

    public static void adicionaEstoqueProd(MerEstoqueProduto prod) {
        Banco.getEstoComProd().add(prod);
    }

    public static void adicionaHistoricoDeSaida(MerHistoricoSaida saida) {
        Banco.getSaidasProd().add(saida);
    }

    public static void adicionaProduto(MerProduto produto) {
        Banco.getProdutos().add(produto);
    }

    public static void adicionaVenda(MerVenda venda) {
        Banco.getVendas().add(venda);
    }
    
    public static void adicionaCargo(Cargo cargo){
        Banco.getCargos().add(cargo);
    }

    public static MerVenda removeVenda(long id) {
        return Banco.getVendas().remove((int) id - 1);
    }

    public static MerCliente removeCliente(long id) {
        return Banco.getClientes().remove((int)id - 1);
    }

    public static MerFuncionario removeFuncionario(long id) {
        return Banco.getFuncionario().remove((int) id -1);
    }

    public static MerVenda removeEstoqueProduto(long id) {
        return Banco.getVendas().remove((int)id - 1);
    }

    public static MerEstoque removeEstoque(long id) {
        return Banco.getEstoques().remove((int)id - 1);
    }

    public static MerProduto removeProduto(long id) {
        return Banco.getProdutos().remove((int)id - 1);
    }

    public static boolean isRegistroCliente(String cpf) {
        for (MerCliente cliente : Banco.getClientes()) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistroFuncionario(String cpf) {
        for (MerFuncionario funcionario : Banco.getFuncionario()) {
            if (funcionario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistroCargo(String nome) {
        for (Cargo cargo : Banco.getCargos()) {
            if (cargo.getCargo().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistroEstoque(String descricao) {
        for (MerEstoque estoque : Banco.getEstoques()) {
            if (estoque.getDescricao().equals(descricao)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistroEstoqueProduto(String nome, MerEstoque estoque) {
        for (MerEstoqueProduto prod : Banco.getEstoComProd()) {
            if (prod.getProduto().getNome().equals(nome) && prod.getEstoque().equals(estoque)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRegistroProduto(String nome) {
        for (MerProduto produto : Banco.getProdutos()) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

}
