
#include <iostream>
#include <stdlib.h>
#include <unistd.h>

int main() {

	unsigned startX;

	unsigned startY;

	unsigned width = 4;
	
	unsigned depth = 6;

	for (unsigned k = 0; k < 30; k++) {
	
		startX = k;

		startY = k;
		
		for (unsigned i = 0; i < 40; i++) {

			for (unsigned j = 0; j < 40; j++) {


				if (i > startX && j > startY && i < startX+width && j < startY+depth) {	

					std::cout << "1"; 

				} else {

					std::cout << " "; 
				}
			}

			std::cout << "\n"; 
		}

		usleep (1000000);

		std::cout << "\033[2J\033[1;1H";

	}

    	return 0;
}
