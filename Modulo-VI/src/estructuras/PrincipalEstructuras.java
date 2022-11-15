package estructuras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class PrincipalEstructuras {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};

        // <E> -> asignar cualquier tipo object (extends Object)
        List<String> listadoDeNumeros = new ArrayList<String>();
        listadoDeNumeros.isEmpty();
        listadoDeNumeros.add("new Object()");
        listadoDeNumeros.add("hola");

        TreeSet treeSet = new TreeSet();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(3);

        System.out.println(treeSet.size());

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "a");
        integerStringHashMap.put(2, "b");

        //System.out.println(integerStringHashMap.get(56));

        // unchecked
        //System.out.println(listadoDeNumeros.get(9));

        // checked
        try {
            //FileReader fileReader = new FileReader("/arg/excel.xls");
            System.out.println(listadoDeNumeros.get(9));
        } catch (IndexOutOfBoundsException ae) {
            System.out.println("Indice inexistente");
        }
        catch (ArithmeticException ae) {
            // alguien trato de dividir por 0
            System.out.println("No se puede dividir / 0");
        } catch (Exception e) {
            // cualquier otra exception
            System.out.println("Error de algun tipo");
        } finally {
            System.out.println("Fin del programa");
        }

    }

}
