class MyTestClass{

    public static void main(String args[]){

      	for (int i = 0; i <= 40; i++) {

		for (int j = 0; j <= 40; j++) {

			if (i + j < 20 || j < i - 20 || i < j - 20 || i + j > 60) {

				System.out.print(" ");

			} else {

				System.out.print("1");

			}	

		}

		System.out.println();
	} 
    }
}

			/*if ((i + j < 20) || (j > i + 20) || (i > j + 20) || (i + j >= 60) || ((i + j > 30) && (j < i + 10) && (i < j + 10) && (i + j < 50))) {

				System.out.print(" ");

			} else {

				System.out.print("1");
			}*/
