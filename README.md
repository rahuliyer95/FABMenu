# FABMenu

FABMenu adds a whole new dimension to the original [FloatingActionButton](https://www.github.com/makovkastar/FloatingActionButton). Now, do even more with your beloved FAB. Each button shall reveal more options, giving the user a radical new way of communicating. With crisp animations and customizable buttons to boot, FABMenu is designed to give your app the pizzazz that you always wanted!

## Working

<img src="art/FABMenu.gif">

## [Sample](https://raw.githubusercontent.com/rahuliyer95/FABMenu/master/sample.apk)

## Requirements

API 14+
[FloatingActionButton](https://github.com/makovkastar/FloatingActionButton)

## Installation

Copy the 'FABMenuUtil.java' file to your project

## Usage

``` java
setupFABMenu(FloatingActionButton menuBase, int[] menuItemDrawables, int menuItemStyle, View.OnClickListener menuItemClickListener);
```

Use the above function to create a menu for your FAB.
menuBase - The FAB you want to add menu to
menuItemDrawables - List of the drawables you want to add to the menu
menuItemStyle - Style the menu items your way
menuItemClickListener - Handle the menu item that is selected. The 'id' of the menu item is its index in the 'menuItemDrawables' array

See the example for better understanding

## Author

rahuliyer95, rahuliyer573@gmail.com

## License

FABMenu is available under the MIT license, See the LICENSE file for more info.
