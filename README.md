
<img width="200" alt="Screenshot 2024-06-20 at 11 23 26" src="https://github.com/kurtYmd/android-app/assets/86467744/af3e077c-a51f-4ba5-8b9a-06c3ef8487b7">
<img width="200" alt="Screenshot 2024-06-20 at 11 27 45" src="https://github.com/kurtYmd/android-app/assets/86467744/c6cf5a2f-ee36-424f-a972-e05cda4b11e1">
<img width="200" alt="Screenshot 2024-06-20 at 11 23 31" src="https://github.com/kurtYmd/android-app/assets/86467744/53b14d71-109c-47e2-980a-76b92c3e1e86">
<img width="200" alt="Screenshot 2024-06-20 at 11 30 01" src="https://github.com/kurtYmd/android-app/assets/86467744/7c03f081-a957-4357-887d-7f72f278915a">
<img width="200" alt="Screenshot 2024-06-20 at 11 35 13" src="https://github.com/kurtYmd/android-app/assets/86467744/2cd6815f-5988-46e3-ab42-5a8ebfd94ab7">

# CryptoList

## Introduction


CryptoList is a simple yet powerful application designed for cryptocurrency enthusiasts. The app leverages the CoinGecko API to provide real-time data on various cryptocurrencies. Users can easily add cryptocurrencies to their watchlist, receive notifications about price changes, and stay informed about the latest trends in the crypto market.

## Key Features:
* Real-time Data: Utilizes CoinGecko API to fetch up-to-date information on cryptocurrencies.
* Watchlist Management: Allows users to add and manage their favorite cryptocurrencies for quick access.
* Price Notifications: Enables users to set notifications for price changes of specific cryptocurrencies.
* User-friendly Interface: Designed with a clean and intuitive interface for seamless navigation and usability.

## Architecture

This project uses the MVVM architectural pattern.


## Libraries Used

### Architecture Components
* Data Binding: Declaratively bind observable data to UI elements.
* LiveData: Build data objects that notify views when the underlying database changes.
* Room: Access your app's SQLite database with in-app objects and compile-time checks.
* ViewModel: Store UI-related data that isn't destroyed on app rotations. 
* Dagger: For dependency injection.
* Navigation: Handle navigation.
* Glide: For image loading.
* Kotlin Coroutines: For managing background threads with simplified code and reducing needs for callbacks.
* MPAndroidChart: To chart the financial data.
* Retrofit: For making HTTP requests.


## Setup

* Clone the repository:
```bash
git clone https://github.com/kurtYmd/android-app.git
```


* Open the project in Android Studio.

* Build the project and resolve any dependencies.

* Run the project on an emulator or a physical device.
