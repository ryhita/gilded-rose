package fr.esiea;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQualityItems() {
        for (Item item: items) 
            item.updateItem();
    }    

}

