package com.example.gongxuan.myapplication.fragment.dummy;

import com.example.gongxuan.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 18;
    public final static Integer[] iconResIds = new Integer[] {R.drawable.item_ic_1,R.drawable.item_ic_2,R.drawable.item_ic_3,R.drawable.item_ic_4,
            R.drawable.item_ic_5,R.drawable.item_ic_6,R.drawable.item_ic_7,R.drawable.item_ic_8,
            R.drawable.item_ic_9,R.drawable.item_ic_10,R.drawable.item_ic_11,R.drawable.item_ic_12,
            R.drawable.item_ic_13,R.drawable.item_ic_14,R.drawable.item_ic_15,R.drawable.item_ic_16,
            R.drawable.item_ic_17,R.drawable.item_ic_18};


    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.iconName, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(iconResIds[position-1], "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final int iconResId;
        public final String iconName;
        public final String details;

        public DummyItem(int iconResId, String iconName, String details) {
            this.iconResId = iconResId;
            this.iconName = iconName;
            this.details = details;
        }

        @Override
        public String toString() {
            return iconName;
        }
    }
}
