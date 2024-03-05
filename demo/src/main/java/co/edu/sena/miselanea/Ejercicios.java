package co.edu.sena.miselanea;

public class Ejercicios {
    public double areaTriangulo(double d1, double d2) {
        return (d1 * d2) / 2;
     }
  
     public double sumaNumeros(double date1, double date2) {
        return (date1 + date2);
     }
  
     public double conversionEuroDolar(double date1) {
        return (date1 * 1.08);
        
     }
     public double elevado(double date1) {
        return (date1 * date1);
     }
     public double [] ladotri (double date1) {
      double ar = (date1 *date1) ;
      double per = (4 * date1);
      return new double[] {ar,per};
     }

     public double [] cilindro(double date1, double date2) {
      double radio = 2* Math.PI *date1* (date1+date2);
      double altura = Math.PI * Math.pow(date1, 2) *date2;
      return new double [] {radio,altura};
     }
     public double [] radio(double date1) {
      double log = (2 * Math.PI * date1);
      double are = (Math.PI *Math.pow(date1, 2));
      return new double [] {log,are};
     }
     public double promedio(double date1, double date2, double date3){
      return (date1+date2+date3)/3;
     }
  }
