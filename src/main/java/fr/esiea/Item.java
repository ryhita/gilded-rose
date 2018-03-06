package fr.esiea;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void incrementQuality() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }

    public void decrementQuality() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }

    public void updateExpired() {
        this.decrementQuality();
    }

    public void updateSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    public void updateQuality() {
        this.decrementQuality();
    }

    public void updateItem() {
        updateQuality();
        updateSellIn();

        if (this.sellIn < 0) {
            this.updateExpired();
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}