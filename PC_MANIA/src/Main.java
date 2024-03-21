import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(); // Instanciação de um objeto Cliente
        cliente.nome = "João"; // Atribuição do nome do cliente
        cliente.cpf = 123456789; // Atribuição do CPF do cliente

        while (true) {
            System.out.println("Escolha o PC que deseja comprar (1 para Promoção 1, 2 para Promoção 2, 3 para Promoção 3, 0 para finalizar):");
            int escolha = scanner.nextInt(); // Leitura da escolha do usuário

            if (escolha == 0) {
                break; // Sai do loop se a escolha for 0
            }

            Computador pcPromocao = criarComputador(escolha); // Cria um computador com base na escolha
            if (pcPromocao != null) {
                cliente.comprarComputador(pcPromocao); // Adiciona o computador adquirido ao cliente
            }
        }

        cliente.mostraCompra(); // Mostra os detalhes da compra do cliente
    }

    // Método para criar um computador com base na escolha do usuário
    static Computador criarComputador(int escolha) {
        Computador pc = new Computador(); // Instanciação de um objeto Computador

        switch (escolha) {
            case 1:
                // Configurações do computador para a Promoção 1
                pc.marca = "Positivo";
                pc.preco = 3300.00f;

                // Adiciona hardware básico ao computador
                HardwareBasico hb1 = new HardwareBasico();
                hb1.nome = "Pentium Core i3";
                hb1.capacidade = 2200.0f;

                HardwareBasico hb2 = new HardwareBasico();
                hb2.nome = "8 Gb de Memória RAM";
                hb2.capacidade = 8;

                HardwareBasico hb3 = new HardwareBasico();
                hb3.nome = "500Gb de HD";
                hb3.capacidade = 500;

                pc.addHardwareBasico(hb1);
                pc.addHardwareBasico(hb2);
                pc.addHardwareBasico(hb3);

                // Configurações do sistema operacional e memória USB
                SistemaOperacional soPromocao1 = new SistemaOperacional();
                soPromocao1.nome = "Linux Ubuntu";
                soPromocao1.tipo = 32;

                pc.sistemaOperacional = soPromocao1;

                MemoriaUSB musb1 = new MemoriaUSB();
                musb1.nome = "Pen-drive";
                musb1.capacidade = 16;

                pc.addMemoriaUSB(musb1);
                break;

            case 2:
                // Configurações do computador para a Promoção 2
                pc.marca = "Acer";
                pc.preco = 8800.00f;

                // Adiciona hardware básico ao computador
                HardwareBasico hb4 = new HardwareBasico();
                hb4.nome = "Pentium Core i5";
                hb4.capacidade = 3370.0f;

                HardwareBasico hb5 = new HardwareBasico();
                hb5.nome = "16 Gb de Memória RAM";
                hb5.capacidade = 16;

                HardwareBasico hb6 = new HardwareBasico();
                hb6.nome = "1 TB de HD";
                hb6.capacidade = 1000;

                pc.addHardwareBasico(hb4);
                pc.addHardwareBasico(hb5);
                pc.addHardwareBasico(hb6);

                // Configurações do sistema operacional e memória USB
                SistemaOperacional soPromocao2 = new SistemaOperacional();
                soPromocao2.nome = "Windows 8";
                soPromocao2.tipo = 64;

                pc.sistemaOperacional = soPromocao2;

                MemoriaUSB musb2 = new MemoriaUSB();
                musb2.nome = "Pen-drive";
                musb2.capacidade = 32;

                pc.addMemoriaUSB(musb2);
                break;

            case 3:
                // Configurações do computador para a Promoção 3
                pc.marca = "Vaio";
                pc.preco = 4800.00f;

                // Adiciona hardware básico ao computador
                HardwareBasico hb7 = new HardwareBasico();
                hb7.nome = "Pentium Core i7";
                hb7.capacidade = 4500.0f;

                HardwareBasico hb8 = new HardwareBasico();
                hb8.nome = "32 Gb de Memória RAM";
                hb8.capacidade = 32;

                HardwareBasico hb9 = new HardwareBasico();
                hb9.nome = "2Tb de HD";
                hb9.capacidade = 2000;

                pc.addHardwareBasico(hb7);
                pc.addHardwareBasico(hb8);
                pc.addHardwareBasico(hb9);

                // Configurações do sistema operacional e memória USB
                SistemaOperacional soPromocao3 = new SistemaOperacional();
                soPromocao3.nome = "Windows 10";
                soPromocao3.tipo = 64;

                pc.sistemaOperacional = soPromocao3;

                MemoriaUSB musb3 = new MemoriaUSB();
                musb3.nome = "HD Externo";
                musb3.capacidade = 1000;

                pc.addMemoriaUSB(musb3);
                break;

            default:
                System.out.println("Opção inválida.");
                pc = null;
        }
        return pc;
        }
    }