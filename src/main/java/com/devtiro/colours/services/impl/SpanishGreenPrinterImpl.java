package com.devtiro.colours.services.impl;

import com.devtiro.colours.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreenPrinterImpl implements GreenPrinter {
    @Override
    public String print() {
        return "verde";
    }
}
