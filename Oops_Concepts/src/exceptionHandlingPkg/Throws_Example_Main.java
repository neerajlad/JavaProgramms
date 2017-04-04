package exceptionHandlingPkg;

import java.io.IOException;

public class Throws_Example_Main {

	void FindDevice() throws IOException {
		throw new IOException("device Error");// checked exception
	}

	void Page() throws IOException {
		FindDevice();
	}

	void printPage() {
		try {
			Page();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Throws_Example_Main Printer = new Throws_Example_Main();
		Printer.printPage();
		System.out.println("normal flow...");
	}

}
