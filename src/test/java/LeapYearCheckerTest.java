import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LeapYearCheckerTest {

    private String runProgramWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(out);
        System.setIn(in);
        
        try {
            LeapYearChecker.main(new String[]{});
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
        
        return outBytes.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void testProgramCompiles() {
        String output = runProgramWithInput("2000");
        assertNotNull(output, "❌ Program should produce output!");
    }

    @Test
    public void testLeapYear2000() {
        String output = runProgramWithInput("2000");
        
        assertTrue(output.contains("2000 is a leap year"), 
            "❌ Year 2000 should be identified as a leap year!");
    }

    @Test
    public void testLeapYear2004() {
        String output = runProgramWithInput("2004");
        
        assertTrue(output.contains("2004 is a leap year"), 
            "❌ Year 2004 should be identified as a leap year!");
    }

    @Test
    public void testLeapYear2020() {
        String output = runProgramWithInput("2020");
        
        assertTrue(output.contains("2020 is a leap year"), 
            "❌ Year 2020 should be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear1900() {
        String output = runProgramWithInput("1900");
        
        assertTrue(output.contains("1900 is NOT a leap year"), 
            "❌ Year 1900 should NOT be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear1800() {
        String output = runProgramWithInput("1800");
        
        assertTrue(output.contains("1800 is NOT a leap year"), 
            "❌ Year 1800 should NOT be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear2001() {
        String output = runProgramWithInput("2001");
        
        assertTrue(output.contains("2001 is NOT a leap year"), 
            "❌ Year 2001 should NOT be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear2019() {
        String output = runProgramWithInput("2019");
        
        assertTrue(output.contains("2019 is NOT a leap year"), 
            "❌ Year 2019 should NOT be identified as a leap year!");
    }

    @Test
    public void testLeapYear1600() {
        String output = runProgramWithInput("1600");
        
        assertTrue(output.contains("1600 is a leap year"), 
            "❌ Year 1600 should be identified as a leap year!");
    }

    @Test
    public void testLeapYear2400() {
        String output = runProgramWithInput("2400");
        
        assertTrue(output.contains("2400 is a leap year"), 
            "❌ Year 2400 should be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear2100() {
        String output = runProgramWithInput("2100");
        
        assertTrue(output.contains("2100 is NOT a leap year"), 
            "❌ Year 2100 should NOT be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear2200() {
        String output = runProgramWithInput("2200");
        
        assertTrue(output.contains("2200 is NOT a leap year"), 
            "❌ Year 2200 should NOT be identified as a leap year!");
    }

    @Test
    public void testLeapYear2024() {
        String output = runProgramWithInput("2024");
        
        assertTrue(output.contains("2024 is a leap year"), 
            "❌ Year 2024 should be identified as a leap year!");
    }

    @Test
    public void testNotLeapYear2023() {
        String output = runProgramWithInput("2023");
        
        assertTrue(output.contains("2023 is NOT a leap year"), 
            "❌ Year 2023 should NOT be identified as a leap year!");
    }

    @Test
    public void testInputPrompt() {
        String output = runProgramWithInput("2000");
        
        assertTrue(output.contains("Enter a year:"), 
            "❌ Program should prompt user for year input!");
    }

    @Test
    public void testNoCompilationErrors() {
        String output = runProgramWithInput("2000");
        
        assertFalse(output.contains("Exception"), "❌ Program should not throw exceptions!");
        assertFalse(output.contains("Error"), "❌ Program should not display error messages!");
        assertFalse(output.contains("Exception in thread"), "❌ Program should not crash!");
    }

    @Test
    public void testNestedIfLogic() {
        String output1 = runProgramWithInput("2004");
        assertTrue(output1.contains("2004 is a leap year"), 
            "❌ Years divisible by 4 but not 100 should be leap years!");

        String output2 = runProgramWithInput("1900");
        assertTrue(output2.contains("1900 is NOT a leap year"), 
            "❌ Years divisible by 4 and 100 but not 400 should NOT be leap years!");

        String output3 = runProgramWithInput("2000");
        assertTrue(output3.contains("2000 is a leap year"), 
            "❌ Years divisible by 4, 100, and 400 should be leap years!");
        
        String output4 = runProgramWithInput("2001");
        assertTrue(output4.contains("2001 is NOT a leap year"), 
            "❌ Years not divisible by 4 should NOT be leap years!");
    }
}
