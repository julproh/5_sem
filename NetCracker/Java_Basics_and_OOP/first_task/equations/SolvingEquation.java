package equations;

import java.util.Scanner; // импортирую метод Scanner

public class SolvingEquation{ 
    public static void main (String[] args) {
        double[] coefficient = new double[3]; 
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < coefficient.length; i++) {
            coefficient[i] = in.nextDouble(); //считываю коэффициенты квадратного уравнения
        }
        in.close();
        if (coefficient[0] == 0 && coefficient[1] != 0  ) { // рассматриваю различные случаи
            System.out.println("Solution: " + -coefficient[2]/coefficient[1] );
        } 
        else if (coefficient[0] == 0 && coefficient[1] == 0 && coefficient[2]!=0) {
            System.out.println("The equation has no solution");
        }
        else if (coefficient[0] == 0 && coefficient[1] == 0 && coefficient[2]==0) {
            System.out.println("The equation has infinitely many solutions");
        }
        else {
            Equations equation_ = new Equations(coefficient[0], coefficient[1], coefficient[2]);
           equation_.answer(equation_.discriminant_.discriminant(equation_.a, equation_.b, equation_.c));

        }
    }
    
}

class Equations { // внешний класс - описывающий уравнение
    public double a, b, c; // a*x*x+b*x+c=0 - equation
    Discriminant discriminant_ = new Discriminant();

   Equations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
   }

    class Discriminant { // внутренний класс - для расчета дискриминанта
        public double discriminant (double a, double b, double c) {
            double q_discriminant = b*b - 4*a*c;
            double _discriminant;
            if (q_discriminant >= 0) {
                _discriminant =  Math.sqrt(q_discriminant);
            } 
            else {
                _discriminant = -1;
            }
           
            return _discriminant;
        };
    }

    public void answer (double _discriminant) {

        if (_discriminant < 0) {
        System.out.println("No Real Solutions");
        }
        else if (_discriminant == 0) {
            System.out.println("Solution: " + -this.b/2/this.a);
        }
        else {
            System.out.println("Solution: " + (-this.b+_discriminant)/2/this.a);
            System.out.println("Solution: " + (-this.b-_discriminant)/2/this.a);
        }
    }

}