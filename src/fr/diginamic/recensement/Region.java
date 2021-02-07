package fr.diginamic.recensement;

public class Region {
	private String region;
	private int habitantsRegion;

	public Region(String region, int habitantsRegion) {
		super();
		this.region = region;
		this.habitantsRegion = habitantsRegion;
	}

	@Override
	public String toString() {
		return "Region [region=" + region + ", habitantsRegion=" + habitantsRegion + "]";
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getHabitantsRegion() {
		return habitantsRegion;
	}

	public void setHabitantsRegion(int habitantsRegion) {
		this.habitantsRegion = habitantsRegion;
	}

}
