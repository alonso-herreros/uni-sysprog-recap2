package customMath;

import java.math.BigDecimal;
import customMath.PiCalc;

public class AreaCircle {
	
	public static BigDecimal compute(int nDigits, float radius) {
		return new BigDecimal(radius).pow(2).multiply(PiCalc.compute(nDigits));
	}

	public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Two command-line arguments expected: number of digits and radius of the circle.");
        } else {
            System.out.println(compute(Integer.parseInt(args[0]), Float.parseFloat(args[1])));
        }
	}

}
