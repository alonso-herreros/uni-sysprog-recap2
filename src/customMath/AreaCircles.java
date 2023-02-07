package customMath;

import java.math.BigDecimal;
import customMath.AreaCircle;

public class AreaCircles {

	public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("At least two command-line arguments expected: number of digits and radii of the circles.");
        } else {
        	int nDigits = Integer.parseInt(args[0]);
        	BigDecimal totalArea = new BigDecimal(0);
        	
        	for (int i=1; i<args.length; i++) {
          		BigDecimal area = AreaCircle.compute(nDigits, Float.parseFloat(args[i]));
        		totalArea = totalArea.add(area);
        	}
            System.out.println(totalArea);
        }
	}

}
