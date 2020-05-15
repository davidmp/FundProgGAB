import java.util.Scanner;

class Suma10Numeros{

    static Scanner teclado=new Scanner(System.in);

    static void suma10NumerosMientras(){
        int contador=1;
        double numero, sumanumero=0;
        while(contador<=10){
            System.out.println("Ingrese el valor de la Posicion "+contador+":");
            numero=teclado.nextInt();
            sumanumero=sumanumero+numero;
            contador++;//contador=contador+1
        }
        System.out.println("La suma de los 10 numeros es: "+sumanumero);
    }

    static void suma10NumerosHacerMientras(){
        int contador=1;
        double numero, sumanumero=0;
        do{
            System.out.println("Ingrese el valor de la Posicion "+contador+":");
            numero=teclado.nextInt();
            sumanumero=sumanumero+numero;
            contador++;//contador=contador+1
        }while(contador<=10);
        System.out.println("La suma de los 10 numeros es: "+sumanumero);
    }

    static void suma10NumerosParaDesdeHasta(){        
        double numero, sumanumero=0;
        for(int contador=1;contador<=10;contador++){
            System.out.println("Ingrese el valor de la Posicion "+contador+":");
            numero=teclado.nextInt();
            sumanumero=sumanumero+numero;            
        }
        System.out.println("La suma de los 10 numeros es: "+sumanumero);
    }

    public static void main(String[] arg){
        System.out.println("Saludos");
        //suma10NumerosMientras();
        //suma10NumerosHacerMientras();
        suma10NumerosParaDesdeHasta();
    }
}