import java.util.Scanner;

public class Lampada {
    // Atributos privados
    private String marca;
    private int voltagem;
    private String tipo;
    private String modelo;
    private String cor;
    private double preco;
    private int garantia;
    private boolean ligada;

    // Construtor vazio
    public Lampada() {
        this.ligada = false; // A lâmpada começa desligada
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isLigada() {
        return ligada;
    }

    // Métodos para manipular o estado da lâmpada
    public void ligar() {
        ligada = true;
        System.out.println("# Lâmpada Ligada #");
    }

    public void desligar() {
        ligada = false;
        System.out.println("# Lâmpada Desligada #");
    }

    public void mostrarStatus() {
        if (ligada) {
            System.out.println("# Lâmpada Ligada #");
        } else {
            System.out.println("# Lâmpada Desligada #");
        }
    }

    public void mudarStatus() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    // Método para o usuário inserir os valores
    public void inserirValores() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca da lâmpada: ");
        setMarca(scanner.nextLine());

        System.out.print("Digite a voltagem da lâmpada: ");
        setVoltagem(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o tipo da lâmpada: ");
        setTipo(scanner.nextLine());

        System.out.print("Digite o modelo da lâmpada: ");
        setModelo(scanner.nextLine());

        System.out.print("Digite a cor da lâmpada: ");
        setCor(scanner.nextLine());

        System.out.print("Digite o preço da lâmpada: ");
        setPreco(scanner.nextDouble());

        System.out.print("Digite a garantia da lâmpada (em meses): ");
        setGarantia(scanner.nextInt());

        System.out.println("Valores da lâmpada foram inseridos com sucesso.");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        // Inserindo os valores da lâmpada
        lampada.inserirValores();

        Scanner scanner = new Scanner(System.in);
        int opcao; // Variável para armazenar a opção do usuário

        // Menu interativo para controlar a lâmpada
        do {
            System.out.print("Ligar/Desligar lâmpada? 0 – Sair / 1 – Sim / 2 – Não: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Liga ou desliga a lâmpada, dependendo do estado atual
                    if (lampada.isLigada()) {
                        lampada.desligar(); // Desliga se estiver ligada
                    } else {
                        lampada.ligar();    // Liga se estiver desligada
                    }
                    break;

                case 2:
                    // Apenas mostra o estado atual
                    lampada.mostrarStatus();
                    break;

                case 0:
                    // Sai do programa
                    System.out.println("*** Você encerrou o software. ***");
                    break;

                default:
                    // Mensagem se o usuário digitar algo inválido
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0); // Repete até o usuário escolher sair (0)

        scanner.close(); // Fecha o scanner
    }
}
