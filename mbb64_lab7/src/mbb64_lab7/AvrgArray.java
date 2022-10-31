package mbb64_lab7;

public class AvrgArray {
	public static double ave(double [] data) {
		SumArray ave = new SumArray();
		double counter = 0;
		for (double i = 0; i < data.length; i ++)
		    if (data[i] != null)
		        counter ++;
		ave = average/counter;
		return ave;
		
	}
}
