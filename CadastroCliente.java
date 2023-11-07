public class CadastroCliente {
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        Cliente c = new Cliente(221, "Produtos excelentes LTDA", "Rua sem fim, 200", 5000.0);
        // Inserindo elementos na Lista Ligada
        listaClientes.insereInicio(c); // Usando a variável cliente
        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(185, "Negócios Importantes SA", "Avenida Principal, 10", 12000.0));
        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(443, "Parceiros Críticos LTDA", "Rua dos Negócios, 2000", 7000.0));
        listaClientes.imprimeLista();
        c = (Cliente) listaClientes.buscaElemento(2);
            if (c != null) {
                System.out.println("Elemento da posição 2 da Lista Lidaga");
                System.out.println(c);
            }
        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println("Elemento removido da Lista Ligada");
        System.out.println(c);
        listaClientes.imprimeLista();
        System.out.println("Liberando toda a lista");
        listaClientes.liberaLista();
        listaClientes.imprimeLista();
    }
}
