package be.demoTU;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculTests {

    private Calcul calcul = new Calcul();

    @Test
    void testerSiLeCalculDeLaSommeEstValide(){
        // Arrange
        int a = 5, b = 7;
        int expected = 12;
        // Act
        int result = calcul.somme(a, b);
        // Assert
        assertEquals(expected, result);

    }

}
