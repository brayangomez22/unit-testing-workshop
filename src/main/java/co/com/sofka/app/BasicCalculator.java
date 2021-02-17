package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long res(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        try{
            logger.info( "Summing {} / {}", number1, number2 );
            return number1 / number2;
        } catch (ArithmeticException e){
            System.out.println("No es posible dividir por 0");
            return Long.parseLong("0");
        }
    }
}
