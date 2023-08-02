package Ex0702;

public class Ex0702 {

    public static void main(String[] args) {
        System.out.println("Tipos de Somas: ");
        System.out.println(somar(3));
        System.out.println(somarRecursivo(3));

        System.out.println("------------------------------------");
        System.out.println("Tipos de fatoriais: ");
        System.out.println(fatorial(10));
        System.out.println(fatorialRecursivo(10));
    }

    public static int somar(int limite) {
        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            soma += i;
        }
        return soma;
    }

    public static int somarRecursivo(int limite) {
        if (limite == 0) {
            return 0;
        }
        return limite + somarRecursivo(limite - 1);
    }

    public static int fatorial(int limite) {
        int fatorial = 1;

        for (int j = 1; j <= limite; j++) {
            fatorial *= j;
        }

        return fatorial;
    }

    public static int fatorialRecursivo(int limite) {
        if (limite == 0) {
            return 1;
        }

        return limite * fatorialRecursivo(limite - 1);
    }
}
