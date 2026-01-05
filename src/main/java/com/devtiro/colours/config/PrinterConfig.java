package com.devtiro.colours.config;

import com.devtiro.colours.services.BluePrinter;
import com.devtiro.colours.services.ColourPrinter;
import com.devtiro.colours.services.GreenPrinter;
import com.devtiro.colours.services.RedPrinter;
import com.devtiro.colours.services.impl.ColourPrinterImpl;
import com.devtiro.colours.services.impl.EnglishBluePrinterImpl;
import com.devtiro.colours.services.impl.EnglishGreenPrinterImpl;
import com.devtiro.colours.services.impl.EnglishRedPrinterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinterImpl();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinterImpl();
    }

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinterImpl();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter){
        return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }

}
