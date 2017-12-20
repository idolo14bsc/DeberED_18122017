package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * Nombre: Cristian Calle
 */
public class Examen {
    //Ejercicio 1
     private Integer elementos[];
     private String [] personasNombre;
     private Integer personasEdades[];
     private Integer menorElemento;
     private String [] paises;
     private Integer habitantes[];
     private Integer [] notasAlumnos;
     
     
    
    //1.Desarrollar un método que permita ingresar un arreglo de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos
    public void nElementos() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los elementos que desea sumar: "));
        elementos = new Integer[dim];
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
          
        }
        JOptionPane.showMessageDialog(null,"Lo Numeros Ingresados Fueron");
        JOptionPane.showMessageDialog(null,Arrays.toString(elementos));
        }
            
    public void sumanElementos(){
        int suma=0;
        for (int i = 0; i < elementos.length; i++) {
            suma=suma+elementos[i];
        }
        JOptionPane.showMessageDialog(null,"La suma de los Arreglos es: "+suma);
        
    }
    //2.-2.	Desarrollar un método que permita cargar 5 nombres de personas y sus respectivas edades. Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas mayores de edad
    public void personasInfo() {
        
        personasNombre=new String[5];
        personasEdades=new Integer[5];
        JOptionPane.showMessageDialog(null,"Ingrese Nombre y Edades de 5 personas: ");
        for (int i = 0; i < personasNombre.length; i++) {
            personasNombre[i] = JOptionPane.showInputDialog("Nombre: ");
            personasEdades[i]=Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            
        }
     }
     public void imprimirPersonas() {
          JOptionPane.showMessageDialog(null,"Las personas mayores de edad son: ");
          for (int i = 0; i < personasNombre.length; i++) {
              if (personasEdades[i] >= 18) 
                {
                 JOptionPane.showMessageDialog(null,personasNombre[i]+ " - " + personasEdades[i] +" años");  
                }
          }
     }
     //3.	Cargar un arreglo de n elementos. imprimir el menor y un mensaje si se repite dentro del vector.
     public void nElementos2() {
         int dim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los elementos : "));
        elementos = new Integer[dim];
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
          
        } 
        JOptionPane.showMessageDialog(null,Arrays.toString(elementos));
     }
     public void imprimirMenor(){ 
        menorElemento = elementos[0];
        for(int i=1;i<elementos.length;i++) {
            if (elementos[i]<menorElemento ) {
                menorElemento =elementos[i];
            }
        }
       JOptionPane.showMessageDialog(null,"El Numero Menor es: "+menorElemento );       
     }
     public void repetidoElemento() {
        int cant=0;
        for(int i=0;i<elementos.length;i++) {
            if (elementos[i]==menorElemento) {
                cant++;
            }
        }
        if (cant>1) {
             JOptionPane.showMessageDialog(null,"Se repite el Numero :"+menorElemento);    
        } else {
             JOptionPane.showMessageDialog(null,"No se repite ningun Numero .");
        }
    }
    // 4.Definir un arreglo donde almacenar los nombres de 5 países. Confeccionar el algoritmo de ordenamiento alfabético.
    public void paises(){
        paises=new String[5];
        JOptionPane.showMessageDialog(null,"Ingrese el nombre de 5 paises:"); 
         for(int i=0;i < paises.length;i++){
             paises[i]=JOptionPane.showInputDialog("Pais:");  
         }
         JOptionPane.showMessageDialog(null,"Paises"+Arrays.toString(paises)); 
    } 
    
    public void ordenAlfabetico() {
        for(int i=0;i<4;i++) {
            for(int j=0;j<4-i;j++) {
                if (paises[j].compareTo(paises[j+1])>0) {
                    String aux;
                    aux=paises[j];
                    paises[j]=paises[j+1];
                    paises[j+1]=aux;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Paises ordenados en forma alfabética:");
        JOptionPane.showMessageDialog(null,paises);
    }
    // 5.Confeccionar un método que permita cargar los nombres de 5 alumnos y sus notas respectivas. Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.
    public void alumnos(){
        personasNombre=new String[5];
        notasAlumnos=new Integer[5];
        JOptionPane.showMessageDialog(null, "Ingrese nombre y notas de 5 Alumnos:");
            for(int i=0;i < personasNombre.length;i++) 
            {
                personasNombre[i]=JOptionPane.showInputDialog("Nombre:");
                notasAlumnos[i]=Integer.parseInt(JOptionPane.showInputDialog("Nota:"));      
            }
            JOptionPane.showMessageDialog(null,"Nombres: "+Arrays.toString(personasNombre));  
            JOptionPane.showMessageDialog(null,"Notas: "+Arrays.toString(notasAlumnos));
    }
     public void ordenarNotas(){
        for(int i=0;i<notasAlumnos.length;i++) {
            for(int j=0;j<notasAlumnos.length-1-i;j++) {
                if (notasAlumnos[j]<notasAlumnos[j+1]) {
                    int auxnota;
                    auxnota=notasAlumnos[j];
                    notasAlumnos[j]=notasAlumnos[j+1];
                    notasAlumnos[j+1]=auxnota;
                    String auxnombre;
                    auxnombre=personasNombre[j];
                    personasNombre[j]=personasNombre[j+1];
                    personasNombre[j+1]=auxnombre;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Notas de Mayor a Menor");
        for(int k=0;k<notasAlumnos.length;k++) {
            JOptionPane.showMessageDialog(null,personasNombre[k]+ " - " + notasAlumnos[k]);
        }
     }
     //6.Cargar en un arreglo los nombres de 5 países y en otro vector paralelo la cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por último, ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
     public void paises2(){
        paises=new String[5];
        habitantes=new Integer[5];
        JOptionPane.showMessageDialog(null,"Ingrese el nombre de 5 paises y sus habitantes:"); 
         for(int i=0;i < paises.length;i++){
             paises[i]=JOptionPane.showInputDialog("Pais:");  
             habitantes[i]=Integer.parseInt(JOptionPane.showInputDialog("Habitantes:"));
         }
         
    }
     public void ordenarHabitantes() {
        for(int i=0;i<paises.length;i++) {
            for(int j=0;j<paises.length-1-i;j++) {
                if (habitantes[j]<habitantes[j+1]) {
                    String auxpais;
                    auxpais=paises[j];
                    paises[j]=paises[j+1];
                    paises[j+1]=auxpais;
                    int auxhabitante;
                    auxhabitante=habitantes[j];
                    habitantes[j]=habitantes[j+1];
                    habitantes[j+1]=auxhabitante;
                }
            }
        }
        for(int i=0;i<paises.length;i++) {
            JOptionPane.showMessageDialog(null,paises[i] + " - " + habitantes[i]);
        }
    }
    public  void menu(){
        int opciones;
         do {
        opciones=Integer.parseInt( JOptionPane.showInputDialog(
               "  MENU \n "
               + "1.- Ejercicio 1: Suma de n Elementos\n"
               + "2.- Ejercicio 2: Personas y Edades\n"
               + "3.- Ejercicio 3: Menor de n Elementos\n"
               + "4.- Ejercicio 4: Paises \n"
               + "5.- Ejercicio 5: Alumnos y Notas \n"
               + "6.- Ejercicio 6: Paises y Habitantes \n"
               + "7.- Salir\n"
               + "\n\nIngrese una Opcion"));
        switch(opciones) {
            case 1:
                nElementos();
                sumanElementos();
                break;
            case 2:
                personasInfo();
                imprimirPersonas();
                break;    
            case 3:
                nElementos2();
                imprimirMenor();
                repetidoElemento();
                break;    
            case 4:
                paises();
                ordenAlfabetico();
                break;
            case 5:
                alumnos();
                ordenarNotas();
                break;  
            case 6:
                paises2();
                ordenarHabitantes(); 
                break;    
        }
        }while (opciones!=7);
        
         
    }
       
}