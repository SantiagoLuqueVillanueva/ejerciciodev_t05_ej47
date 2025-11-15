public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura (número impar mayor o igual a 5): "));

        int ancho = 6;

        if (altura < 5 || altura % 2 != 0) {
            System.out.println("La altura introducida no es correcta.");
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == ancho - 1 || i == altura/2)
                    System.out.print("M");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
