package entities;

public class Student {
	
	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public String aproved() {
		
		double finalGrade = score1 + score2 + score3;
		if (finalGrade >= 60) {
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade)
					+ String.format("%n")
					+ "PASS";
		} else {
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade)
					+ String.format("%n")
					+ "FAILED"
					+ String.format("%n")
					+ "MISSING "
					+ String.format("%.2f", (60.00 - finalGrade))
					+ " POINTS";
			
		}
				
		
		
	}
}
