package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.BluePrinter;
import com.devtiro.colours.services.ColourPrinter;
import com.devtiro.colours.services.GreenPrinter;
import com.devtiro.colours.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinterImpl();
        this.greenPrinter = new EnglishGreenPrinterImpl();
        this.bluePrinter = new EnglishBluePrinterImpl();

    }
    @Override
    public String print() {
        return redPrinter.print() + ", " + greenPrinter.print() + ", " + bluePrinter.print();
    }
}
