/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;
public class ChildrensPrice implements Price {


    public int getPriceCode(){
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented){
         if (daysRented > 3) return (daysRented - 3 ) * 1.5;
           else return 1.5;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
