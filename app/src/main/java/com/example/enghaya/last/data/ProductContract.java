package com.example.enghaya.last.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by ENG.HAYA on 10/7/2017 AD.
 */

public class ProductContract { // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.android.inventory";

    /**
     * Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
     * the content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);


    public static final String PATH_PRODUCTS = "products";

    /**
     * Inner class that defines constant values for the products database table.
     * Each entry in the table represents a single product.
     */
    public static final class ProductEntry implements BaseColumns {
        //The content URI to access the product data in the provider

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCTS);
        // The MIME type of the {@link #CONTENT_URI} for a list of products.
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;
//The MIME type of the {@link #CONTENT_URI} for a single product.

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;
        //Name of database table for products

        public final static String TABLE_NAME = "products";
// Unique ID number for the product (only for use in the database table).

        public final static String _ID = BaseColumns._ID;
// Name of the product.

        public final static String COLUMN_PRODUCT_NAME = "name";
        //Price of the product.
        public final static String COLUMN_PRODUCT_PRICE = "price";
//Quantity of the product

        public static final String COLUMN_PRODUCT_QUANTITY = "quantity";

        //Supplier of the product

        public static final String COLUMN_PRODUCT_SUPPLIER = "supplier";
        // Image of the item
        public static final String COLUMN_PRODUCT_IMAGE = "image";


    }


}
