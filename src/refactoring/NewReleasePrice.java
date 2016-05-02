/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

public class NewReleasePrice implements Price {
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        return (daysRented * 3 );
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 2;
    }

}