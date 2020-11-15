import java.util.Scanner;

public class CalculaAreaPerimetroFiguras {

    private static float area;
    private static float perimetro;
    
    
    
    public static void main(String[] args) {

    calculaAreaPerimetroCirculo();
    calculaAreaPerimetroRectangulo();
    calculaAreaPerimetroCuadrado();
    calculaAreaPerimetroTriangulo();
    
    
    }
    
    public static void calculaAreaPerimetroCuadrado() {

        boolean status = true;
        do {
            Scanner s = new Scanner(System.in);

            System.out.println("CALCULA EL AREA Y PERIMETRO DE UN CUADRADO.");

            System.out.println("Pon el numero de un lado:");
            int l = s.nextInt();

            area = (l * l);
            perimetro = l + l + l + l;
            System.out.println("El resultado del area es = " + area + " u2");
            System.out.println("El resultado del perimetro es = " + perimetro);
            System.out.println("---------------------------");
            System.out.println("Presiona la tecla ' s ' para salir");
            System.out.println("Presiona la tecla ' a ' para hacer otro calculo de un cuadrado");
            String word = s.next();
            if (word.equals("s") || word.equals("S")) {
                status = false;
            }

        } while (status);

    }

    public static void calculaAreaPerimetroRectangulo() {

        boolean status = true;
        do {
            Scanner s = new Scanner(System.in);

            System.out.println("CALCULA EL AREA Y PERIMETRO DE UN RECTANGULO.");

            System.out.println("Pon el numero de la Altura:");
            int a = s.nextInt();
            System.out.println("Pon el numero de la Base: ");
            int b = s.nextInt();
            System.out.println("Calculando .... ");

            area = (a * b);
            perimetro = a + a + b + b;
            System.out.println("El resultado del area es = " + area + " u2");
            System.out.println("El resultado del perimetro es = " + perimetro);
            System.out.println("---------------------------");
            System.out.println("Presiona la tecla ' s ' para salir");
            System.out.println("Presiona la tecla ' a ' para calcular area y perimetro de un rectangulo");
            String word = s.next();
            if (word.equals("s") || word.equals("S")) {
                status = false;
            }

        } while (status);

    }

    public static void calculaAreaPerimetroTriangulo() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN TRIANGULO.");
        
        System.out.println("Pon el numero de la Altura:");
        int h = s.nextInt();
        System.out.println("Pon el numero de la Base: ");
        int b = s.nextInt();
        System.out.println("Pon el numero de lado a: ");
        int a = s.nextInt();
        System.out.println("Pon el numero de lado b: ");
        int x = s.nextInt();
        System.out.println("Calculando .... ");
        
        float areat = (h*b);
        area = areat/2;
        perimetro = a+b+x;
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para hacer otro calculo de un triangulo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }
    
    public static void calculaAreaPerimetroCirculo() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN CIRCULO.");
        
        System.out.println("Pon el numero del diametro:");
        int d = s.nextInt();
        
        perimetro = (float) (3.14*d);
        float r = (d/2);   
        area = (float) (3.14*r*r);
        
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para hacer otro calculo de un circulo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }
    
}