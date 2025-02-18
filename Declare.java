public class Declare{
	public static void main(String[] args){

	double daaa [][][] = new double[3][][];
	double d = 100.0;
	double[][] daa = new double[1][1];
	daaa[0] = daa;
	daa = daaa[0];
}
}
