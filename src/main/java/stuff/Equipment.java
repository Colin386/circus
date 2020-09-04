package main.java.stuff;

import main.java.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
