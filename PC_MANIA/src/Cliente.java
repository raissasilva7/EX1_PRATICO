public class Cliente {

    // Variavies
    String nome;
    long cpf;

    Computador[] pcsAdquiridos; // array para armazenar os pcs adquiridos
    int quantidadePcsAdquiridos; //quantidade pcs adquiridos

    Cliente() {
        pcsAdquiridos = new Computador[10]; // Inicialização do array de computadores adquiridos com tamanho 10
        quantidadePcsAdquiridos = 0; // Inicialização da quantidade de computadores adquiridos como 0
    }

    void comprarComputador(Computador pc) {
        if (quantidadePcsAdquiridos < pcsAdquiridos.length) { // Verifica se o array de computadores não está cheio
            pcsAdquiridos[quantidadePcsAdquiridos++] = pc; // Adiciona o computador adquirido e incrementa a quantidade
        } else {
            System.out.println("Limite de PCs adquiridos atingido."); // Exibe uma mensagem se o limite de computadores adquiridos for atingido
        }
    }

    void mostraCompra() {
        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("PCs Adquiridos:");
        for (int i = 0; i < quantidadePcsAdquiridos; i++) {
            System.out.println("PC " + (i + 1) + ":");
            pcsAdquiridos[i].mostraPCConfigs(); // Chama o método para exibir as configurações do PC
            System.out.println();
        }
        float totalCompra = calculaTotalCompra(); // Calcula o total da compra
        System.out.println("Total da compra: R$" + totalCompra); // Exibe o total da compra
    }

    float calculaTotalCompra() {
        float total = 0; // Variável para armazenar o total da compra
        for (int i = 0; i < quantidadePcsAdquiridos; i++) {
            total += pcsAdquiridos[i].preco; // Soma o preço de cada computador ao total
        }
        return total; // Retorna o total da compra
    }
}
