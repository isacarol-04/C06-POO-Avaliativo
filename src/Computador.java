public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    HardwareBasico[] hardware;
    SistemaOperacional sistemaOperacional;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistemaOperacional = sistemaOperacional;
    }

    void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$ %.2f%n", preco);

        System.out.println("Configuração de Hardware:");
        for (HardwareBasico h : hardware) {
            System.out.println("- " + h.nome + " (" + h.capacidade + (h.nome.equals("Memoria RAM") ? " Gb" : " Mhz") + ")");
        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");

        if (memoriaUSB != null) {
            System.out.println("Acompanha " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb");
        }

        System.out.println();
    }

    void addMemoriaUSB(MemoriaUSB memoria){
        this.memoriaUSB = memoria;
    }
}
