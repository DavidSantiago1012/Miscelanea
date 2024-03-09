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
      String date5 ;
      int ejr;


      //Instanciar a la clase Ejercicios:
      Ejercicios ejercicios = new Ejercicios();
      //Menu
      System.out.println("1.Operadores:");
      System.out.println("2.Condicionales");
      ejr =scanner.nextInt();
      
      switch (ejr){
        case 1: //Operadores 
        System.out.println("Bienvenido a Operadores: ");
        System.out.println("Operadores");
      System.out.println("1.areaTriangulo");
      System.out.println("2.SumaNumeros");
      System.out.println("3.conversionEuroDolar");
      System.out.println("4.elevado");
      System.out.println("4.ladoTri");
      System.out.println("5.cilindro");
      System.out.println("7.radio");
      System.out.println("8.promedio");
      ejr =scanner.nextInt();
        switch (ejr) {

          case 1: //areaTriangulo
          System.out.println("Ingrese la base del triangulo: ");
          date1 = scanner.nextDouble();
    
          System.out.println("Ingrese la altura del triangulo: ");
          date2 = scanner.nextDouble();
          date3 = ejercicios.areaTriangulo(date1, date2) ;
          System.out.println("El area del triangulo: " + date3);
          break;
          case 2://SumaNumeros
        System.out.println("Ingrese un numero: ");
        date1 = scanner.nextDouble();
  
        System.out.println("Ingrese un segundo numero:");
        date2 = scanner.nextDouble();
        date3 = ejercicios.sumaNumeros(date1, date2);
      System.out.println("El resultado de los dos numeros sumados es: " + date3);
      break;
          case 3://conversionEuroDolar
        System.out.println("Ingrese el valor de euros que quiere cambiar: ");
        date1 = scanner.nextDouble();
        date3 = ejercicios.conversionEuroDolar(date1);
        System.out.println("El valor de euros en dolares es: " + date3);
        break;
          case 4://elevado
        System.out.println("Ingrese numero que quiere elevar al cuadrado: ");
        date1 =scanner.nextDouble();
        date4 =ejercicios.elevado(date1);
        System.out.println("El numero ingresado al cuadrado es: " + date4);
        break;
        case 5://ladoTri
      System.out.println("Ingrese valor del lado del triangulo: ");
      date1 = scanner.nextDouble();
      double[] resultados = ejercicios.ladotri(date1);
      double ar = resultados[0];
      double per = resultados [1];
      System.out.println("El area del cuadrado es" +ar+" y el perimetro es" +per);
      break;
      case 6://cilindro
     System.out.println("Ingrese el radio del cilindro: ");
     date1 =scanner.nextDouble();
     System.out.println("Ingrese la altura del cilindro: ");
     date2 =scanner.nextDouble();
     double [] resultado = ejercicios.cilindro(date1,date2);
     double radio = resultado[0];
     double altura = resultado[1];
     System.out.println("El area del cilindro es: "+radio+"y el volumen es: "+altura);
     break;
      case 7://radio
    System.out.println("Ingrese el radio de la circunferencia");
    date1 = scanner.nextDouble();
    double [] solucion = ejercicios.radio(date1);
    double log = solucion[0];
    double are = solucion[1];
    System.out.println("La longitud de esta circunferencia es: "+log+"y el area de la circunferencia es"+are);
    break;
      case 8://promedio 
    System.out.println("Ingrese primer numero: ");
    date1 =scanner.nextDouble();
  
    System.out.println("Ingrese segundo numero: ");
    date2 =scanner.nextDouble();
  
    System.out.println("Ingrese tercer numero: ");
    date3 =scanner. nextDouble();
    
    date4 = ejercicios.promedio(date1, date2, date3);
  
    System.out.println("El promedio de los numeros: "+date4);
    break;
    }
        break;
        case 2: //Condicionales
        System.out.println("Bienvenido a Condicionales");
  System.out.println("Condicionales");
  System.out.println("1.Positivo");
  System.out.println("2.enter");
  System.out.println("3.tres");
  System.out.println("4.cuatro");
  System.out.println("5.cinco");
  System.out.println("6.seis");
  System.out.println("7.siete");
  ejr=scanner.nextInt();
  switch (ejr) {
  case 1://Positivo
  System.out.println("Ingrese un numero");
  date1=scanner.nextDouble();
   String respuesta = ejercicios.Positivo(date1);
  System.out.println("El numero es: "+respuesta);
  break;
 case 2://enter
 System.out.println("Ingrese un numero");
 date1=scanner.nextDouble();
 System.out.println("Ingrese otro numero");
 date2=scanner.nextDouble();
 String re = ejercicios.enter(date1,date2);
 System.out.println(re);
 break;
case 3://tres
System.out.println("Ingrese un numero");
date1=scanner.nextDouble();

System.out.println("Ingrese otro numero");
date2=scanner.nextDouble();

System.out.println("ingrese el ultimo numero");
date3=scanner.nextDouble();

String r=ejercicios.tres(date1,date2,date3);
System.out.println(r);
break;
case 4://cuatro
System.out.println("Ingrese un numero");
date1=scanner.nextDouble();

System.out.println("Ingrese segundo numero");
date2=scanner.nextDouble();
String rta =ejercicios.cuatro(date1,date2);
System.out.println(rta);
break;
case 5://cinco 
System.out.println("Ingrese un numero");
date1=scanner.nextDouble();
System.out.println("Ingrese otro numero");
date2=scanner.nextDouble();
date5 =ejercicios.cinco(date1,date2);
System.out.println(date5);
break;
case 6://seis
System.out.println("Ingrese un numero");
date1=scanner.nextDouble();
System.out.println("Ingrese segundo numero");
date2=scanner.nextDouble();
date5 =ejercicios.seis(date1,date2);
System.out.println(date5);
break;
case 7://siete 
System.out.println("Digite un año");
date1=scanner.nextDouble();
date5=ejercicios.siete(date1);
System.out.println(date5);
break;
}
break;
}


}

}