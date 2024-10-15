/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priceitem;

/**
 *
 * @author Angel Vhugie
 */
public class PriceItem {

    public static void main(String[] args) {
        // Arrays for price and items
        int[] price = {200, 350, 700, 400};
        String[] item = {"Shirt", "Pants", "Sneakers", "Jacket"};
        
         //  Calculate the sum of all the elements in price
        int sum = 0;
        for (int i = 0; i < price.length; i++) {
            sum += price[i];
        }
        System.out.println("Total sum of prices: " + sum);
        
        // Calculate the average of the elements in price array
        double average = sum / (double) price.length;
        System.out.println("Average price: " + average);
        
        // Get the maximum price and the minimum price
        int maxPrice = price[0];
        int minPrice = price[0];
        
        for (int i = 1; i < price.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
            }
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
        }
        //print out maximum price and minimum price
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Minimum price: " + minPrice);
        
    }
}
