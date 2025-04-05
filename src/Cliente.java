public class Cliente {
    String nome;
    long CPF;

    public Cliente(String nome, long CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public float calculaTotalCompra(Computador[] compras, int totalCompras) {
        float total = 0;
        for (int i = 0; i < totalCompras; i++) {
            total += compras[i].preco;
        }
        return total;
    }
}
