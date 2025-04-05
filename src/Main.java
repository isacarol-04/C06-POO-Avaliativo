// Isabelle Caroline Pereira 2097 - GEC

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float matricula = 2097;

        HardwareBasico[] hardware1 = {
            new HardwareBasico("Pentium Core i3", 2200),
            new HardwareBasico("Memoria RAM", 8),
            new HardwareBasico("HD", 500)
        };
        SistemaOperacional sistemaOperacional1 = new SistemaOperacional("Linux Ubuntu", 32);
        Computador computador1 = new Computador("Apple", matricula, hardware1, sistemaOperacional1);
        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive", 16);
        computador1.addMemoriaUSB(memoriaUSB1);

        HardwareBasico[] hardware2 = {
            new HardwareBasico("Pentium Core i5", 3370),
            new HardwareBasico("Memoria RAM", 16),
            new HardwareBasico("HD", 1000)
        };
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional("Windows 8", 64);
        Computador computador2 = new Computador("Samsung", matricula + 1234, hardware2, sistemaOperacional2);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive", 32);
        computador2.addMemoriaUSB(memoriaUSB2);

        HardwareBasico[] hardware3 = {
            new HardwareBasico("Pentium Core i7", 4500),
            new HardwareBasico("Memoria RAM", 32),
            new HardwareBasico("HD", 2000)
        };
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional("Windows 10", 64);
        Computador computador3 = new Computador("Dell", matricula + 5678, hardware3, sistemaOperacional3);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1000);
        computador3.addMemoriaUSB(memoriaUSB3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à PCMania! Estamos com promoções, aproveite!");
        System.out.print("Qual é seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("E o seu CPF? ");
        long cpf = scanner.nextLong();
        scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        Computador[] compras = new Computador[10];
        int totalCompras = 0;

        while (true) {
            System.out.println("Opções disponiveis: ");
            System.out.println("1 - Computador Apple");
            System.out.println("2 - Computador Samsung");
            System.out.println("3 - Computador Dell");
            System.out.println("0 - Finalizar compras");
            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Finalizando compras...");
                break;
            }

            if (totalCompras >= compras.length) {
                System.out.println("Limite de compras atingido!");
                break;
            }

            switch (escolha) {
                case 1:
                    compras[totalCompras++] = computador1;
                    System.out.println("Computador Apple adicionado ao carrinho.");
                    break;
                case 2:
                    compras[totalCompras++] = computador2;
                    System.out.println("Computador Samsung adicionado ao carrinho.");
                    break;
                case 3:
                    compras[totalCompras++] = computador3;
                    System.out.println("Computador Dell adicionado ao carrinho.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        System.out.println("\nResumo da Compra:");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.CPF);
        System.out.println("\nComputadores adquiridos:");
        if (totalCompras == 0) {
            System.out.println("Nenhum computador comprado.");
        } else {
            for (int i = 0; i < totalCompras; i++) {
                compras[i].mostraPCConfigs();
            }
        }

        System.out.println("\nTotal da compra: R$ " + cliente.calculaTotalCompra(compras, totalCompras));
        scanner.close();
    }
}
