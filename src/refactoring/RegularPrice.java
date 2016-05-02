/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

public class RegularPrice implements Price {
    public int getPriceCode(){
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented){
        if (daysRented > 2) return (daysRented - 2 ) * 1.5;
        else return 2;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}