package dto;

public class BatterDto extends HumanDto {

	private int batcount;
	private int hit;
	private double hitAvg;
	
	public BatterDto() {
	}

	public BatterDto(int number, String name, int age, double height, 
				int batcount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}

	public int getBatcount() {
		return batcount;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}
	
	public void delete() {
		setNumber(0);
		setName("");
		setAge(0);
		setHeight(0.0);
		setBatcount(0);
		setHit(0);
		setHitAvg(0.0);
	}

	@Override
	public String toString() {
		return "타자:" + super.toString() + " batcount=" + batcount + ", hit=" + hit + ", hitAvg=" + hitAvg + "]";
	}
	
	@Override
	public String alldata() {
		return getNumber() + "-" + getName() + "-" + getAge() + "-" + getHeight()
					+ "-" + batcount + "-" + hit + "-" + hitAvg; 
	}
	
}






