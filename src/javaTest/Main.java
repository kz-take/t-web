package javaTest;

public class Main {
	public static void main(String... args) {
		//メソッド参照を渡す側
		execPrinter(Main::printMessage, "foo");
	}

	//メソッド参照を受け取る側
	static void execPrinter(Printer printer, String str) {
		printer.print(str);

	}

	//メソッド参照の参照先メソッド
	static void printMessage(String message) {
		System.out.println(message);
	}

	@FunctionalInterface
	interface Printer {
		public void print (String msg)
		;
	}

}
