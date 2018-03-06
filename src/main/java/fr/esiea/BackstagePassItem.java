package fr.esiea;

public class BackstagePassItem extends Item {

	public BackstagePassItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateExpired() {
        this.quality = 0;
    }

    public void updateQuality() {
        this.incrementQuality();

        if (this.sellIn <= 10) {
            this.incrementQuality();
        }

        if (this.sellIn <= 5) {
            this.incrementQuality();
        }
    }

}