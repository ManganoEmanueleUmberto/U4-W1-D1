public class Exercise3 {
    public static void main(String[] args) {
        double side1=12.5;
        double side2=15.3;
        double perimeter= perimetroRettangolo(side1,side2);
        System.out.println(perimeter);
        if(evenOdd(23) == 0){
            System.out.println("Il numero è pari");
        }else {
            System.out.println("Il numero è dispari");
        }
        System.out.println("Area del triangolo: "+areaTriangolo(10,9,12));

    }

    public static double perimetroRettangolo(double side1, double side2){
        return (2*side1)+(2*side2);
    }
    public static int evenOdd(int num){
        if(num % 2 == 0){
            return 0;
        }else{

        return 1;
        }
    }
    public static double areaTriangolo(double side1, double side2, double side3){
        double semiperimeter= (side1+side2+side3)/2;
        return Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));

    }
}
