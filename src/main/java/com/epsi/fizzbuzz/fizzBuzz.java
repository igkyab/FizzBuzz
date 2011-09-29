/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.fizzbuzz;

import java.util.List;
import com.google.common.collect.Lists;
import java.util.ArrayList;

/**
 *
 * @author shadow16
 */
class fizzBuzz {

    private List<String> listeRetour;

    public fizzBuzz() {
    }

    public List<String> fizzBuzz(final int estMultiple) {

        listeRetour = Lists.newArrayList();
        String libelle = "";

        if ((estMultiple % 5) == 0) {
            libelle = libelle + "Fizz";
        }

        if ((estMultiple % 3) == 0) {
            libelle = libelle + "Buzz";
        }
        
        if(libelle.isEmpty()){
            libelle = Integer.toString(estMultiple);
        }

        listeRetour.add(libelle);
        return listeRetour;
    }
}
