import java.math.RoundingMode;
import java.text.DecimalFormat;

class Bicycle {
	
	public static void main(String[] args) {
		int[] f_cogs = {38, 30};
		int[] r_cogs = {28, 23, 19, 16};
		final float ratio = 1.6f;
		float result_ratio = 0;
		int result_f = 0;
		int result_r = 0;
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.CEILING);
		for (int i = 0; i < f_cogs.length; i++) {
			for (int j=0; j < r_cogs.length; j++) {
				float r = ((float) f_cogs[i] )/r_cogs[j];
				if (r <= ratio) {
					if (r > result_ratio) {
						result_ratio = Float.parseFloat(new DecimalFormat("#.###").format(r));
						result_f = f_cogs[i];
						result_r = r_cogs[j];
					}
				}
			}
		}

		System.out.println("Front: " + result_f + ", Rear: " + result_r + ", Ratio " + result_ratio );

	}
}
