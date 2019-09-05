package javaTest;

public class Main {
	public static void main(String... args) {
		execPrinter(Main::printMessage, "foo");
	}

	static void execPrinter(Printer printer, String str) {
		printer.print(str);
	}

	static void printMessage(String message) {
		System.out.println(message);
	}

	interface Printer {
		public void print(String msg);
	}

}
