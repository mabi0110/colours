package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinterImpl implements BluePrinter {
    @Override
    public String print() {
        return "azul";
    }
}
