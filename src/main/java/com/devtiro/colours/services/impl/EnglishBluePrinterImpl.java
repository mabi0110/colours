package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.BluePrinter;
import org.springframework.stereotype.Component;


public class EnglishBluePrinterImpl implements BluePrinter {
    @Override
    public String print() {
        return "blue";
    }
}
