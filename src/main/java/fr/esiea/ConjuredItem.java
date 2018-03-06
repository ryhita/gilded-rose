package fr.esiea;

public class ConjuredItem extends Item {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name,sellIn, quality);
	}

	public void updateExpired() {
        this.decrementQuality();
        this.decrementQuality();
    }

    public void updateQuality() {
        this.decrementQuality();
        this.decrementQuality();
    }
}