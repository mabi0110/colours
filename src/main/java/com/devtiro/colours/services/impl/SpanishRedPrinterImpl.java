package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishRedPrinterImpl implements RedPrinter {
    @Override
    public String print() {
        return "rojo";
    }
}
