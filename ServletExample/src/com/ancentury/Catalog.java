package com.ancentury;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
	private static Map<String, CatalogItem> catalogItems = new HashMap<>();

	public static void addItem(CatalogItem catalogItem) {
		catalogItems.put(catalogItem.getSku(), catalogItem);
	}

	public static CatalogItem getItem(String sku) {
		return catalogItems.get(sku);
	}

	public static List<CatalogItem> getItems() {
		//Add a comment
		return new ArrayList<CatalogItem>(catalogItems.values());
	}
}
