package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
		int powerResult = 1;
		for (int i = 1; i <= power; ++i) {
			powerResult *= numberToPrint;
		}
		System.out.println(powerResult);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
