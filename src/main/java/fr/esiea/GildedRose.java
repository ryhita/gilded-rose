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
        return items[i].sellIn < 0
    }

    private void updateExpired(Item item) {
        if (!items[i].name.equals("Aged Brie")) {
                if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].quality > 0) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                } else {
                    items[i].quality = items[i].quality - items[i].quality;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
    }

    private void updateSellIn(Item item){
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

    private void updateQuality(Item item) {
        if (item.name.equals("Aged Brie")
         || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateAgeBrieOrConcert(item);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            }
        if (item.quality > 0) {
            item.quality = item.quality - 1;  
        }
    }

    private void updateAgeBrieOrConcert(item) {
        if (item.quality < 50) {
           item.quality = item.quality + 1;

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = items[i].quality + 1;
                    }
                }

                 if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

}

