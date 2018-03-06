package fr.esiea;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	Item[] items = new Item[] {
        new Item("Aged Brie", 2, 1), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), 
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        new Item("Conjured Mana Cake", 3, 6) };

    GildedRose gildedRose = new GildedRose(items);

    @Test
    public void updateQualityItemsTest() {
        gildedRose.updateQualityItems();
        assertEquals(0, gildedRose.items[0].quality);
	    assertEquals(78, gildedRose.items[1].quality);
	    assertEquals(14, gildedRose.items[2].sellIn);
	    assertEquals(50, gildedRose.items[3].quality);
	    assertEquals(50, gildedRose.items[4].quality);
	    assertEquals(0, gildedRose.items[5].quality);
    }

}