import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo:");
        Float r = Float.valueOf(scanner.nextLine());
        areaCirculo(r);

    }

    private static void areaCirculo(Float r) {
        double areaCirc = Math.PI * Math.pow(r, 2);
        String resultado = String.format("%.3f", areaCirc);
        System.out.println("A area do circ é: "+resultado);
    }
}


/**
 * Problema "circulo"
 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
 * círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟
 * ଶ
 * . Você pode
 * usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
 * diretamente o valor 3.14159.
 */