import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String color = "Rojo";
        int cantidad = 100;
        String marca = "Audi";
        String modelo = "Q3";
        String combustible = "Nafta";
        Scanner scanner = new Scanner(System.in);

        Coche francoAuto = new Coche(color, marca, modelo, combustible, cantidad);
        boolean arrancarCoche = francoAuto.arrancarMotor();
        boolean estaEncendido = francoAuto.isEncendido();
        System.out.println("Vehiculo Arrancado");
        do{
            System.out.println("Que queremos hacer?");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frenar");
            System.out.println("3 - Cargar combustible");
            System.out.println("4 - Apagar motor");
            System.out.println("5 - Tocar claxon");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion){
                case 1:
                    String acelero = francoAuto.acelerar();
                    System.out.println(acelero);
                    break;
                case 2:
                    String freno = francoAuto.frenar();
                    System.out.println(freno);
                    break;
                case 3:
                    String tipoCombustible = francoAuto.getCombustible();
                    francoAuto.llenarDeposito(tipoCombustible);
                    break;
                case 4:
                    boolean apagoMotor = francoAuto.apagarAuto();
                    estaEncendido = apagoMotor;
                    System.out.println("Auto apagado");
                    break;
                case 5:
                    francoAuto.tocarClaxon();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while (estaEncendido);
    }
}