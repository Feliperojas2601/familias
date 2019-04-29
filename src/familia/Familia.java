/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Familia {
       private padre p1;
       private madre m1;
       private hijo1 h1;
       private hijo2 h2;

    public Familia(padre p1, madre m1, hijo1 h1, hijo2 h2) {
        this.p1 = p1;
        this.m1 = m1;
        this.h1 = h1;
        this.h2 = h2;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido, seleccione una opción:");
        System.out.println("1) Ingresar familia nueva");
        System.out.println("2) Buscar familia por apellido");
        System.out.println("3) Buscar integrante de familia");
        Scanner lectura = new Scanner(System.in);
        int a= lectura.nextInt();
        switch(a){
            case 1: 
                ingresarf();
                
                   break;
            case 2: 
                
                break;
            case 3:
                break;
            default: 
                System.out.println("Opción no valida intente de nuevo");
            break;
        }
    }
    

public static void ingresarf(){
    System.out.println("Por favor ingrese los datos del padre en orden de nombre, apellido,edad,sexo");
    Scanner lecturap = new Scanner (System.in);
    String nombrep= lecturap.nextLine();
    Scanner lecturapp =new Scanner (System.in);
    String apellidop= lecturapp.nextLine();
    Scanner lecturappp =new Scanner (System.in);
    int edadp= lecturappp.nextInt();
    Scanner lecturapppp =new Scanner (System.in);
    String sexop= lecturapppp.nextLine();
    padre padre1= new padre (nombrep,apellidop,edadp,sexop);
    System.out.println("Por favor ingrese los datos de la madre en orden de nombre, apellido,edad,sexo");
    Scanner lecturam = new Scanner (System.in);
    String nombrem= lecturam.nextLine();
    Scanner lecturamm =new Scanner (System.in);
    String apellidom= lecturamm.nextLine();
    Scanner lecturammm =new Scanner (System.in);
    int edadm= lecturammm.nextInt();
    Scanner lecturammmm =new Scanner (System.in);
    String sexom= lecturammmm.nextLine();
    madre madre1 = new madre (nombrem,apellidom,edadm,sexom);
    System.out.println("Por favor ingrese los datos del primer hijo en orden de nombre, apellido,edad,sexo");
    Scanner lecturah1 = new Scanner (System.in);
    String nombreh1= lecturam.nextLine();
    Scanner lecturahh1 =new Scanner (System.in);
    String apellidoh1= lecturahh1.nextLine();
    Scanner lecturahhh1 =new Scanner (System.in);
    int edadh1= lecturahhh1.nextInt();
    Scanner lecturahhhh1 =new Scanner (System.in);
    String sexoh1= lecturahhhh1.nextLine();
    hijo1 hijo11 = new hijo1 (nombreh1,apellidoh1,edadh1,sexoh1);
     System.out.println("Por favor ingrese los datos del segundo hijo en orden de nombre, apellido,edad,sexo");
    Scanner lecturah2 = new Scanner (System.in);
    String nombreh2= lecturah2.nextLine();
    Scanner lecturahh2 =new Scanner (System.in);
    String apellidoh2= lecturahh2.nextLine();
    Scanner lecturahhh2 =new Scanner (System.in);
    int edadh2= lecturahhh2.nextInt();
    Scanner lecturahhhh2 =new Scanner (System.in);
    String sexoh2= lecturahhhh2.nextLine();
    hijo2 hijo22 = new hijo2 (nombreh1,apellidoh1,edadh1,sexoh1);
    Familia f1 =new Familia (padre1,madre1,hijo11,hijo22);
    conjuntofamilias fami= new conjuntofamilias();
    fami.añadirfami(f1);
}
 public static void buscarf (){
     System.out.println("Ingrese el apellido principal de la familia a buscar");
     Scanner bfamilia = new Scanner (System.in);
     String familia= bfamilia.nextLine();
     
     }
 }
}