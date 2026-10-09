package com.example.toastandsnackbardemo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val mainLayout = findViewById<View>(R.id.mainLayout)
        val btnWishlist = findViewById<MaterialButton>(R.id.btnWishlist)
        val btnAddToCart = findViewById<MaterialButton>(R.id.btnAddToCart)
        val btnNotification = findViewById<MaterialButton>(R.id.btnNotification)
        val btnDeleteItem = findViewById<MaterialButton>(R.id.btnDeleteItem)

        // 1. Wishlist Action (Toast)
        btnWishlist.setOnClickListener {
            Toast.makeText(this, "Item added to Wishlist!", Toast.LENGTH_SHORT).show()
        }

        // 2. Add to Cart Action (Snackbar with Undo)
        btnAddToCart.setOnClickListener {
            Snackbar.make(mainLayout, "Item added to Cart", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    Toast.makeText(this, "Item removed from Cart", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        // 3. Notification Action (Snackbar with Action)
        btnNotification.setOnClickListener {
            Snackbar.make(mainLayout, "You have 3 unread notifications", Snackbar.LENGTH_LONG)
                .setAction("View") {
                    Toast.makeText(this, "Opening Notifications...", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        // 4. Delete Action (Snackbar with Undo)
        btnDeleteItem.setOnClickListener {
            Snackbar.make(mainLayout, "Item deleted", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    Toast.makeText(this, "Item restored", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}