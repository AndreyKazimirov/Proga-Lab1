public class Laba1 {
	public static void main(String[] args) {

		int[] c = new int[] {16, 14, 12, 10, 8, 6};
		double[] x = new double[15];
		double[][] m =new double[6][15];
		
		for (int n = 0; n<15;n++) {
			x[n]=((double)(Math.random()*(7.0-(-13.0))+(-13.0)));
		}
		for (int i=0; i<6; i++){
			for (int j=0; j<15; j++){
				if (c[i]==6) {
					m[i][j]=(Math.asin(Math.pow(Math.E,(Math.cbrt(-Math.pow((Math.abs(x[j])/(Math.abs(x[j])+1)),2))))));
				} else if (c[i]==8 || c[i]==12 || c[i]==16) {
					m[i][j]=(Math.pow(((2*(3/4))+Math.cos(x[j])),2));
				} else {
					m[i][j]=(Math.log((Math.acos(Math.pow((((x[j]-3.0)/2.0)*Math.E+1.0),2)))));
				}
			}
		}
		for (int i=0; i<6;i++){
			for (int j=0; j<15; j++){
				System.out.printf("%.3f ", m[i][j]);
			}
			System.out.println("\n");
		}

	}
}
