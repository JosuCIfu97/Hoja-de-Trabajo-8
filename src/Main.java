
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/*
*Josué Cifuentes 15275
*Pablo Muñoz 15258
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Josué Cifuentes 15275
 * Pablo Muñoz 15258
 * @author Josue
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al ordenador de pacientes de un hospital según prioridad.");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la dirección del archivo con el listado de pacientes.");
        System.out.println("Por ejemplo: C:\\Users\\User\\Documents\\pacientes.txt");
        String doc = teclado.nextLine();
        Lector listado = new Lector(doc);
        String[] lines = new String[0];
        try{
            lines = listado.openFile();
        }
        catch (IOException e){
            System.out.println("El archivo no existe o no se puede leer.");
        }
        
        if (listado.getLineas() != 0){
            Vector<Paciente> listado1 = new Vector<Paciente>();
            String[] info = new String[3];
            System.out.println("---------------------------------------------------------------------");
            System.out.println("El listado de pacientes a ordenar es: ");
            for (int i = 0; i < lines.length; i++){
                info = lines[i].split(","); //Separa los datos del paciente en Strings distintos. La separación ocurre en la coma.
                listado1.add(new Paciente(info[0],info[1],info[2]));
                Paciente temporal = listado1.get(i);
                System.out.println(temporal.toString());
            }
            System.out.println("---------------------------------------------------------------------");
            VectorHeap<Paciente> ordenado = new VectorHeap<Paciente>(listado1);
            System.out.println("Los pacientes deberán atenderse en este orden:");
            for (int i = 0; i < lines.length; i++){
                Paciente temp = ordenado.remove();
                System.out.println(temp.toString());
            }
            System.out.println("---------------------------------------------------------------------");
        }
        else
            System.out.println("No ingresaron pacientes al hospital.");
        System.out.println("Gracias por utilizar el programa. Esperamos haber mejorado su servicio de atención.");
    }
    
}
