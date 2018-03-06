package fr.esiea;

public class AgedBrieItem extends Item {

	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateExpired() {
        this.incrementQuality();
    }

    public void updateQuality() {
        this.incrementQuality();
    }

}