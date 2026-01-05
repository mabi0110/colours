package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.GreenPrinter;
import org.springframework.stereotype.Component;


public class EnglishGreenPrinterImpl implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
