import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio utilizando if
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroIf = scanner.nextInt();

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        }
        if (numeroIf == 0) {
            System.out.println("El numero es cero");
        }
        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }

        //Ejercicio utilizando While
        int numeroWhile = 0;
        while (numeroWhile > 0) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Ejercicio utilizando el buble Do While
        do {
            numeroWhile++;
        } while (numeroWhile == 1);


        //Ejercicio utilizando el bucle for
        for(int numeroFor = 0; numeroFor<=3; numeroFor++)
        {
            System.out.println(numeroFor);
        }

        //Ejercicio utilizando el bucle switch
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una de las cuatro estaciones: ");
        String estacion = dato.nextLine();

        switch(estacion){
            case "verano":
                System.out.println("La estacion es verano");
                break;

            case "invierno":
                System.out.println("La estacion es invierno");
                break;

            case "otoño":
                System.out.println("La estacion es otoño");
                break;

            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("No es una estacion del año");
        }
    }
}
