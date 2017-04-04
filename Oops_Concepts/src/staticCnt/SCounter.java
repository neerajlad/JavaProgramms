package staticCnt;


public class SCounter {
		static int count=0; //will get memory only once
		//int count = 0; // //will get memory when instance is created


		SCounter() {
			count++;
			//count = count + 1;
			System.out.println(count);
		}

		public static void main(String args[]) {
			SCounter c1 = new SCounter(); //1
			SCounter c2 = new SCounter(); // 2
			SCounter c3 = new SCounter(); // 3
			
		}
	}
