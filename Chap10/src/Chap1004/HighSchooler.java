package Chap1004;

public class HighSchooler extends Student {
	private String rank;
	public HighSchooler(String rank,int grade,int age) {
		super(grade,age);
		this.rank=rank;
	}
	public String getRank() {
		return rank;
	}
}
