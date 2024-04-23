/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 04/14/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jean Claude Djeugang
*/

public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {

		double bonus[] = new double[data.length];

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);

				if (data[row][col] > 0) {
					if (data[row][col] == highest) {
						bonus[row] += 5000;
					} else if (data[row][col] == lowest) {
						bonus[row] += 1000;
					} else {
						bonus[row] += 2000;
					}

				}
			}
		}

		return bonus;
	}

  
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {

		double[] bonus = calculateHolidayBonus(data, high, low, other);

		double sum = 0;

		for (int i = 0; i < bonus.length; i++) {
			sum += bonus[i];
		}

		return sum;
	}
}