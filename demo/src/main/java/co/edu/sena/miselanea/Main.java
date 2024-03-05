package co.edu.sena.miselanea;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main 
{
    public static void main( String[] args )
    {
        
    Scanner scanner = new Scanner(System.in);

      double date1 ;
      double date2 ;
      double date3 ;
      double date4 ;


      //Instanciar a la clase Ejercicios:
      Ejercicios ejercicios = new Ejercicios();

      /*Hallar el area de un triangulo:

      System.out.println("Ingrese la base del triangulo: ");
      date1 = scanner.nextDouble();

      System.out.println("Ingrese la altura del triangulo: ");
      date2 = scanner.nextDouble();
      date3 = ejercicios.areaTriangulo(date1, date2) ;
      System.out.println("El area del triangulo: " + date3);*/
      /* Sumar dos numeros ingresados 
      System.out.println("Ingrese un numero: ");
      date1 = scanner.nextDouble();

      System.out.println("Ingrese un segundo numero:");
      date2 = scanner.nextDouble();
      date3 = ejercicios.sumaNumeros(date1, date2);
    System.out.println("El resultado de los dos numeros sumados es: " + date3);*/
      /*Conversion de euro a dolar 
      System.out.println("Ingrese el valor de euros que quiere cambiar: ");
      date1 = scanner.nextDouble();
      date3 = ejercicios.conversionEuroDolar(date1);
      System.out.println("El valor de euros en dolares es: " + date3);*/
       /*Numero elevado al cuadrado 

      System.out.println("Ingrese numero que quiere elevar al cuadrado: ");
      date1 =scanner.nextDouble();
      date4 =ejercicios.elevado(date1);
      System.out.println("El numero ingresado al cuadrado es: " + date4);*/
    /*Algoritmo que muestre el valor del area y del perimetro 

    System.out.println("Ingrese valor del lado del triangulo: ");
    date1 = scanner.nextDouble();
    double[] resultados = ejercicios.ladotri(date1);
    double ar = resultados[0];
    double per = resultados [1];
    System.out.println("El area del cuadrado es" +ar+" y el perimetro es" +per);*/
/*Area y volumen del cilindro 
   System.out.println("Ingrese el radio del cilindro: ");
   date1 =scanner.nextDouble();

   System.out.println("Ingrese la altura del cilindro: ");
   date2 =scanner.nextDouble();

   double [] resultado = ejercicios.cilindro(date1,date2);
   double radio = resultado[0];
   double altura = resultado[1];

   System.out.println("El area del cilindro es: "+radio+"y el volumen es: "+altura);*/
  /* Algoritmo que lea el radio de una circunferencia, longitud y area 

  System.out.println("Ingrese el radio de la circunferencia");
  date1 = scanner.nextDouble();

  double [] resultados = ejercicios.radio(date1);
  double log = resultados[0];
  double are = resultados[1];

  System.out.println("La longitud de esta circunferencia es: "+log+"y el area de la circunferencia es"+are);*/
  // Promedio 
  System.out.println("Ingrese primer numero: ");
  date1 =scanner.nextDouble();

  System.out.println("Ingrese segundo numero: ");
  date2 =scanner.nextDouble();

  System.out.println("Ingrese tercer numero: ");
  date3 =scanner. nextDouble();
  
  date4 = ejercicios.promedio(date1, date2, date3);

  System.out.println("El promedio de los numeros: "+date4);
}
}