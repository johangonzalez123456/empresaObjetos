import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EmpresaEstructurada {
    public static void main(String[] args) {
        String nombre, cargo;
        double salario;
        double totalSalarios = 0;
        double mayorSalario = Double.MIN_VALUE;
        double menorSalario = Double.MAX_VALUE;
        int posicionMayor = 0, posicionMenor = 0;

        // Definición de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));
        
        for (int emp = 0; emp < cantidad; emp++) {
            
            // Lectura de los datos de cada empleado
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            
            // Almacenamiento de datos
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
            
            // Cálculo total de salarios
            totalSalarios += salario;
            
            // Verificar mayor y menor salario
            if (salario > mayorSalario) {
                mayorSalario = salario;
                posicionMayor = emp;
            }
            if (salario < menorSalario) {
                menorSalario = salario;
                posicionMenor = emp;
            }
        }

        // Mostrar el número total de empleados
        System.out.println("El número total de empleados es: " + cantidad);
        
        // Mostrar nombres y salarios de los empleados
        System.out.println("Los nombres y salarios de los empleados son:");
        for (int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + " | Salario: " + salarios.get(emp));
        }
        
        // Mostrar el total del dinero pagado con el salario de todos los empleados
        System.out.println("Total de salarios pagados: " + totalSalarios);
        
        // Mostrar el empleado con mayor salario
        System.out.println("Empleado con mayor salario: Nombre: " + nombres.get(posicionMayor) + 
                           " | Cargo: " + cargos.get(posicionMayor) + " | Salario: " + salarios.get(posicionMayor));
        
        // Mostrar el empleado con menor salario
        System.out.println("Empleado con menor salario: Nombre: " + nombres.get(posicionMenor) + 
                           " | Cargo: " + cargos.get(posicionMenor) + " | Salario: " + salarios.get(posicionMenor));
    }
}
