class ComplexNumber {
 
		int real;

		int imaginary;


		public ComplexNumber (int _real, int _imaginary) {

			real = _real;

			imaginary = _imaginary;
		}

		ComplexNumber sum (ComplexNumber first, ComplexNumber second) {

			ComplexNumber result = new ComplexNumber ((first.real + second.real), (first.imaginary + second.imaginary));

			return result;
		}

ComplexNumber difference (ComplexNumber first, ComplexNumber second) {

			ComplexNumber result = new ComplexNumber ((first.real - second.real), (first.imaginary - second.imaginary));

			return result;
		}

ComplexNumber product (ComplexNumber first, ComplexNumber second) {

			ComplexNumber result = new ComplexNumber ((first.real*second.real) - (first.imaginary*second.imaginary), (first.imaginary*second.real) + (first.real*second.imaginary));

			return result;
		}

ComplexNumber conjugate (ComplexNumber first) {

	ComplexNumber result = new ComplexNumber (first.real, (0 -  first.imaginary));

			return result;
		}

/*

(x+iy) / (u+iv) = ((x+iy)*(u-iv))/((u-iv)*(u+iv))

*/


ComplexNumber division (ComplexNumber first, ComplexNumber second) {

		ComplexNumber temp = pruduct (first, conjugate(second));

		ComplexNumber divisor = pruduct (second, conjugate(second));

ComplexNumber result = new ComplexNumber (temp.real/divsor.real, temp.imaginary/divsor.real);

			return result;
		}


}



class star {
      
	public static void main(String[] arguments) {

		ComplexNumber obj = new ComplexNumber (0, 0);

		ComplexNumber objCN1 = new ComplexNumber (2, 3); // 2+3i

		ComplexNumber objCN2 = new ComplexNumber (8, 7); // 8+7i

		ComplexNumber objSum = obj.sum (objCN1, objCN2);

		System.out.print("real: " + objSum.real + "  "); 

		System.out.println("imaginary: " + objSum.imaginary);
		
	}
}

/*
import java.io.BufferedReader; 

import java.io.IOException; 

import java.io.InputStreamReader; 


try {
        		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
         
        		String name = reader.readLine(); 
   
        		System.out.println("The input entered is:  " + name); 

		} catch (IOException ioe) {

			 System.out.println("IOException caught in Catch block"); 
		}


*/


