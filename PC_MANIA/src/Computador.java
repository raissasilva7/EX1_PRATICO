public class Computador {

    // Declaração da variável
    String marca;
    float preco;


    HardwareBasico[] hardwareBasicos; // array - composição
    SistemaOperacional sistemaOperacional; // composição
    MemoriaUSB memoriaUsb; // agregação

    // // Declaração da variável para armazenar a quantidade de componentes básicos
    int quantidadeHardwareBasico;

    public Computador() {
        hardwareBasicos = new HardwareBasico[10]; // Inicialização do array de componentes básicos com tamanho 10
        quantidadeHardwareBasico = 0; // Inicialização da quantidade de componentes básicos como 0
        sistemaOperacional = new SistemaOperacional(); //composição
    }

    void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware Básico:");
        for (int i = 0; i < quantidadeHardwareBasico; i++) { // Loop para percorrer os componentes básicos
            if (hardwareBasicos[i].nome.contains("Pentium Core i3") || // Verifica se o nome do componente contém informações específicas
                    hardwareBasicos[i].nome.contains("Pentium Core i5") ||
                    hardwareBasicos[i].nome.contains("Pentium Core i7")) {
                System.out.println("- " + hardwareBasicos[i].nome + " (" + hardwareBasicos[i].capacidade + " MHz)"); // Exibe o componente com MHz se for um processador
            } else {
                System.out.println("- " + hardwareBasicos[i].nome + " (" + hardwareBasicos[i].capacidade + ")"); // Exibe o componente sem MHz
            }
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)"); // Exibe o sistema operacional do computador
        if (memoriaUsb != null) { // Verifica se há memória USB
            System.out.println("Memória USB: " + memoriaUsb.nome + " (" + memoriaUsb.capacidade + "GB)"); // Exibe a memória USB
        }
    }

    void addHardwareBasico(HardwareBasico hb) {
        if (quantidadeHardwareBasico < hardwareBasicos.length) { // Verifica se o array de componentes básicos não está cheio
            hardwareBasicos[quantidadeHardwareBasico++] = hb; // Adiciona o componente básico e incrementa a quantidade
        } else {
            System.out.println("Limite de hardwares básicos atingido."); // Exibe uma mensagem se o limite de componentes básicos for atingido
        }
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUsb = musb; // Adiciona a memória USB ao computador
    }
}
