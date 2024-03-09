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
     public String Positivo(double dat1) {
      if (dat1>0) {
         return ("Positivo");
      } else {
         return ("Negativo");}
         }
     public String enter(double dt1, double dt2) { 
      if (dt1>dt2) {
         return ("El numero mayor es: "+dt1+ "El numero menor es:" +dt2);
            }
            else {
            return ("El numero mayor es: "+dt2+ "El numero menor es:" +dt1);
            }
      }
      public String tres(double da1, double da2, double da3) {
         if(da1>da2 && da1>da3){
            if(da2>da3){
                  return (+da1+" Numero Mayor "+da3+" Numero menor");
            } else{
                  return(+da1+" Numero mayor y "+da2+" Numero menor");
            }
      }  else if(da2>da1 && da2>da3){
            if(da3>da1){   
                  return(+da2+" Numero mayor y "+da1+" Numero menor");
            } else{
                  return(+da2+" Numero mayor y "+da3+" Numero menor");
            }
      } else {
      
            if(da2>da1){   
                  return(+da3+" Numero mayor y "+da1+" Numero menor");
            } else{
                  return(+da3+" Numero mayor y "+da2+" Numero menor");
            }
      }
     
      }
      public String cuatro (double dt1, double dt2){
            if(dt1<dt2) {
                double rta=dt1-dt2;
                  return ("La operacion entre estos dos numeros daria: "+rta);

            }else{

                double rta= dt1+dt2;
                return ("La operacion entre estos dos numeros daria "+rta);
            }
      }
      public String cinco (double dt1, double dt2){
            if (dt1==0||dt2==0){
                  return ("La division no es posible ya que alguno de los numeros es cero");
            }else {
                  double solucion=dt1/dt2;
                  return ("El resultado de la division"+solucion);
            }
      }
      public String seis (double dt1, double dt2){
            if (dt1<0 || dt2<0){
                  double sol=dt1+dt2;
                  return ("El resultado de esta operacion es: ");
            } else {
                  double sol=dt1*dt2;
                  return ("El resultado de esta operacion es: ");
            }
      }
      public String siete (double dt1){
            if ((dt1 %4 == 0 && dt1 %100 !=0) || (dt1 % 400 ==0)) {
                  return (dt1 + "El año que digistaste es uno bisiesto.");
            } else {
                  return (dt1 + "El año que digitaste no es bisiesto");
            }
      }
      }