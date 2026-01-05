package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.RedPrinter;
import org.springframework.stereotype.Component;


public class EnglishRedPrinterImpl implements RedPrinter {
    @Override
    public String print() {
        return "red";
    }
}
