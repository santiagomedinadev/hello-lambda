package dev.santiagomedina;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage() {
        var sut = new HelloLambda();
        assertEquals("Hello, AWS Lambda!", sut.handleRequest());
    }
}