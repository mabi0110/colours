package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.BluePrinter;
import com.devtiro.colours.services.ColourPrinter;
import com.devtiro.colours.services.GreenPrinter;
import com.devtiro.colours.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private final RedPrinter redPrinter;
    private final GreenPrinter greenPrinter;
    private final BluePrinter bluePrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }
    @Override
    public String print() {
        return redPrinter.print() + ", " + greenPrinter.print() + ", " + bluePrinter.print();
    }
}
