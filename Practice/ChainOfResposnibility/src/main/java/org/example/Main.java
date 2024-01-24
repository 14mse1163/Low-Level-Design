package org.example;

import Chain.Chain;
import Chain.Number;

public class Main {
    public static void main(String[] args) {
        Number request = new Number(0);

        Chain chain = new Chain();

        chain.process(request);
    }
}