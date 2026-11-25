
public class Main {

    public static void main(String[] args) {


        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado(
                "Juan Perez",
                "40123456",
                1001,
                850000
        );


        EmpleadoPorHora empleado2 = new EmpleadoPorHora(
                "Maria Gomez",
                "41234567",
                1002,
                5000,
                40
        );

        System.out.println("=== SISTEMA DE EMPLEADOS ===");

        System.out.println("\n--- EMPLEADO ASALARIADO ---");
        empleado1.mostrarInformacion();

        System.out.println("\n--- EMPLEADO POR HORA ---");
        empleado2.mostrarInformacion();
    }
}

