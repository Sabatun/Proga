import java.math.*;

class proga_1 {
	public static void main(String[] args) {
		long[] a = {22,20,18,16,14,12,10,8,6,4};
		double[] x = new double[20];
		for (int i=0;i<20;i++){
			x[i] = -4 + Math.random()*7;
		}
		double[][] k = new double[10][20];
		for (int i=0;i<10;i++){
			for (int j=0;j<20;j++){
				if (a[i]==20){
					k[i][j] = Math.tan(Math.tan(Math.atan((x[j]-0.5)/7)));
				} else if (a[i]==6 || a[i]==8 || a[i]==10 || a[i]==18 || a[i]==22){
					k[i][j] = Math.cos(Math.pow((Math.PI/Math.cos(x[j])),3));
				} else{
					k[i][j] = Math.cbrt(Math.atan(1/Math.pow(Math.E,Math.abs(x[j]))));
				}
			}
		}
		for (int i=0;i<10;i++){
			for (int j=0;j<20;j++){
				System.out.printf("%.2f \t", k[i][j]);
			}
			System.out.println();
		}
       	}
}