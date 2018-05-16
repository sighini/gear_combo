import java.math.RoundingMode;
import java.text.DecimalFormat;

class Bicycle {
	
	public static void main(String[] args) {
		int[] f_cogs = {38, 30};
		int[] r_cogs = {28, 23, 19, 16};
		final float ratio = 1.6f;
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		//df.setRoundingMode(RoundingMode.DOWN);
		for (int i = 0; i < f_cogs.length; i++) {
			for (int j=0; j < r_cogs.length; j++) {
				float r = ((float) f_cogs[i] )/r_cogs[j];
				//System.out.println("Front: " + f_cogs[i] + ", Rear: " + r_cogs[j] + ", Ratio " + r + " Formatted=" + df.format(r));
				if (ratio == Float.parseFloat(df.format(r))) {
					System.out.println("Front: " + f_cogs[i] + ", Rear: " + r_cogs[j] + ", Ratio " + new DecimalFormat("#.###").format(r) );
				}
			}
		}
	}
}
