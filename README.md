# Toast and Snackbar Demo

An Android application demonstrating Toast and Snackbar user feedback notifications using Material Design buttons with custom icons.

## 📱 Features

* **Add to Wishlist**: Displays a standard Android `Toast` confirmation message.
* **Add to Cart**: Displays a `Snackbar` message with an **Undo** action.
* **Check Notifications**: Displays a `Snackbar` notification message with a **View** action.
* **Delete Item**: Displays a `Snackbar` message with an **Undo** action to restore items.
* **Custom Material Styling**: Natural text casing (`textAllCaps="false"`) and scaled icon sizes (`18dp`).

## 🛠️ Tech Stack

* **Language**: Kotlin
* **UI Component**: Material Components (`MaterialButton`)
* **Layout**: XML (`LinearLayout`)
* **Min SDK**: Android 7.0 (API level 24)

## 📂 Project Structure

```text
app/src/main/
├── java/com/example/toastandsnackbardemo/
│   └── MainActivity.kt
└── res/
    ├── layout/
    │   └── activity_main.xml
    └── drawable/
        ├── ic_wishlist.xml
        ├── ic_shopping_cart.xml
        ├── ic_notification.xml
        └── ic_delete.xml
