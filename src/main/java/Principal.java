
public class Principal {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            System.out.println("Tabuado do: " + i);

            for (int j = 0; j <= 10; j++) {
                int resultado = (i * j);
                System.out.println(i + "*" + j + "=" + resultado);
            }
            System.out.println();

        }

    }

}
