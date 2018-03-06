class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item: items) 
            updateItem(items[i]);
    }


    private void updateItem(Item item) {
        updateQuality(item);

        updateSellIn(item);

        if (hasExpired(item)) 
            updateExpired(item);
    }

    private boolean hasExpired(Item item) {
        return items[i].sellIn < 0;
    }

    private void updateExpired(Item item) {
        if (item.name.equals("Aged Brie")) {
            incrementQuality(item);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.quality=0;
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")){

        } else 
            decrementQuality(item);                     
    }

    private void updateSellIn(Item item){
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void updateQuality(Item item) {
        if (item.name.equals("Aged Brie") {
            incrementQuality(item);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            incrementQuality(item);

            if (item.sellIn < 11) {
                incrementQuality(item);
            }

             if (item.sellIn < 6) {
                incrementQuality(item);
            }
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            
        } else if (item.quality > 0) {
            item.quality = item.quality - 1;  
        }
    }

    private void incrementQuality(item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}

