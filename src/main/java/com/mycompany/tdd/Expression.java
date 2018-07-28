/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tdd;

/**
 *
 * @author dmalahov
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
    
    Expression times(int multiplier);
}
