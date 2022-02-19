
package reto6_Refactorizado;

import java.util.*;
import java.util.Map.Entry;

public class Principal {
    public static void main(String[] args) {
        int cc;
        String nombreCliente;
        String pais;
        String numero;
        String nombreArticulo;
        String descripcion;
        double valor;
        Hashtable clientes = new Hashtable();
        ArrayList<Articulo> articulos = new ArrayList();
        int opcion;
        Scanner leer = new Scanner(System.in);
        boolean sw = true;
        
        do{
            System.out.println("\t Escoja una opción");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Quitar Cliente");
            System.out.println("3. Mostrar Cliente");
            System.out.println("4. Sumar valor estimado de los articulos de un cliente");
            System.out.println("5. Sumar valor estimado de todos los articulos del banco");
            System.out.println("0. Salir");
            try{
                opcion = leer.nextInt();
            
                switch(opcion){
                    case 1:
                        boolean sw1 = true;
                        System.out.println("Número de cédula: ");
                        cc = leer.nextInt();
                        System.out.println("Nombre completo: ");
                        nombreCliente = leer.nextLine();
                        System.out.println("País de procedencia: ");
                        pais = leer.nextLine();
                        System.out.println("Número de contacto: ");
                        numero = leer.nextLine();
                        System.out.println("\tIngrese la información del artículos del cliente");
                        System.out.println("Nombre: ");
                        nombreArticulo = leer.nextLine();
                        System.out.println("Descripción: ");
                        descripcion = leer.nextLine();
                        System.out.println("Valor: ");
                        valor = leer.nextDouble();
                        Articulo articulo = new Articulo(nombreArticulo, descripcion, valor);
                        articulos.add(articulo);
                        Cliente cliente = new Cliente(cc, nombreCliente, pais, numero, articulos);
                        do{
                            System.out.println("¿Desea agregar más articulos?");
                            System.out.println("1. Sí.");
                            System.out.println("2. No");
                            try{
                                opcion = leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        System.out.println("\tIngrese la información del artículos del cliente");
                                        System.out.println("Nombre: ");
                                        nombreArticulo = leer.nextLine();
                                        System.out.println("Descripción: ");
                                        descripcion = leer.nextLine();
                                        System.out.println("Valor: ");
                                        valor = leer.nextDouble();
                                        articulo = new Articulo(nombreArticulo, descripcion, valor);
                                        articulos.add(articulo);
                                    break;
                                    case 2:
                                        sw1 = false;
                                    break;
                                }
                            }
                            catch(InputMismatchException e){
                                System.out.println("Debe ingresar un número entero");
                                leer.next();
                            }
                        }while(sw1);
                        clientes.put(cc, cliente);
                        System.out.println("¡El cliente ha sido agregado!");
                    break;
                    
                    case 2:
                        System.out.println("\n Cédula del cliente a quitar: ");
                        cc = leer.nextInt();
                        clientes.remove(cc);
                        System.out.println("¡El cliente ha sido quitado!");
                    break;
                    
                    case 3:
                        System.out.println("\n Cédula del cliente a consultar: ");
                        cc = leer.nextInt();
                        if(clientes.containsKey(cc)){
                            System.out.println(clientes.get(cc));
                        }
                        else{
                            System.out.println("El cliente no existe");
                        }
                    break;
                    
                    case 4:
                        System.out.println("\n Cédula del cliente a consultar: ");
                        cc = leer.nextInt();
                    break;
                
                    case 5:
                        double suma = 0.0;
                        int i = 0;
                        while(i <= articulos.size()){
                            suma = articulos.get(i).getValor();
                            i++;
                        }
                        System.out.println("Valor estimado de todos los articulos del banco: " + suma);
                    break;
                    case 0:
                        sw = false;
                }
            }
            catch(InputMismatchException e){
               System.out.println("Debe ingresar un número entero");
               leer.next();
            }
        }while(sw);
    }
}
