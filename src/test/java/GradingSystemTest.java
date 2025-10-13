import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class GradingSystemTest {

    private String runProgramWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outBytes);
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(out);
        System.setIn(in);
        
        try {
            GradingSystem.main(new String[]{});
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
        
        return outBytes.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void testProgramCompiles() {
        String output = runProgramWithInput("85");
        assertNotNull(output, "❌ Program should produce output!");
    }

    // A Grade Tests
    @Test
    public void testGradeA100() {
        String output = runProgramWithInput("100");
        assertTrue(output.contains("The grade is: A+"), 
            "❌ Score 100 should be grade A+!");
    }

    @Test
    public void testGradeA99() {
        String output = runProgramWithInput("99");
        assertTrue(output.contains("The grade is: A+"), 
            "❌ Score 99 should be grade A+!");
    }

    @Test
    public void testGradeA98() {
        String output = runProgramWithInput("98");
        assertTrue(output.contains("The grade is: A+"), 
            "❌ Score 98 should be grade A+!");
    }

    @Test
    public void testGradeA97() {
        String output = runProgramWithInput("97");
        assertTrue(output.contains("The grade is: A"), 
            "❌ Score 97 should be grade A!");
    }

    @Test
    public void testGradeA96() {
        String output = runProgramWithInput("96");
        assertTrue(output.contains("The grade is: A"), 
            "❌ Score 96 should be grade A!");
    }

    @Test
    public void testGradeA95() {
        String output = runProgramWithInput("95");
        assertTrue(output.contains("The grade is: A"), 
            "❌ Score 95 should be grade A!");
    }

    @Test
    public void testGradeA94() {
        String output = runProgramWithInput("94");
        assertTrue(output.contains("The grade is: A"), 
            "❌ Score 94 should be grade A!");
    }

    @Test
    public void testGradeA93() {
        String output = runProgramWithInput("93");
        assertTrue(output.contains("The grade is: A-"), 
            "❌ Score 93 should be grade A-!");
    }

    @Test
    public void testGradeA92() {
        String output = runProgramWithInput("92");
        assertTrue(output.contains("The grade is: A-"), 
            "❌ Score 92 should be grade A-!");
    }

    @Test
    public void testGradeA91() {
        String output = runProgramWithInput("91");
        assertTrue(output.contains("The grade is: A-"), 
            "❌ Score 91 should be grade A-!");
    }

    @Test
    public void testGradeA90() {
        String output = runProgramWithInput("90");
        assertTrue(output.contains("The grade is: A-"), 
            "❌ Score 90 should be grade A-!");
    }

    // B Grade Tests
    @Test
    public void testGradeB89() {
        String output = runProgramWithInput("89");
        assertTrue(output.contains("The grade is: B+"), 
            "❌ Score 89 should be grade B+!");
    }

    @Test
    public void testGradeB88() {
        String output = runProgramWithInput("88");
        assertTrue(output.contains("The grade is: B+"), 
            "❌ Score 88 should be grade B+!");
    }

    @Test
    public void testGradeB87() {
        String output = runProgramWithInput("87");
        assertTrue(output.contains("The grade is: B"), 
            "❌ Score 87 should be grade B!");
    }

    @Test
    public void testGradeB86() {
        String output = runProgramWithInput("86");
        assertTrue(output.contains("The grade is: B"), 
            "❌ Score 86 should be grade B!");
    }

    @Test
    public void testGradeB85() {
        String output = runProgramWithInput("85");
        assertTrue(output.contains("The grade is: B"), 
            "❌ Score 85 should be grade B!");
    }

    @Test
    public void testGradeB84() {
        String output = runProgramWithInput("84");
        assertTrue(output.contains("The grade is: B"), 
            "❌ Score 84 should be grade B!");
    }

    @Test
    public void testGradeB83() {
        String output = runProgramWithInput("83");
        assertTrue(output.contains("The grade is: B-"), 
            "❌ Score 83 should be grade B-!");
    }

    @Test
    public void testGradeB82() {
        String output = runProgramWithInput("82");
        assertTrue(output.contains("The grade is: B-"), 
            "❌ Score 82 should be grade B-!");
    }

    @Test
    public void testGradeB81() {
        String output = runProgramWithInput("81");
        assertTrue(output.contains("The grade is: B-"), 
            "❌ Score 81 should be grade B-!");
    }

    @Test
    public void testGradeB80() {
        String output = runProgramWithInput("80");
        assertTrue(output.contains("The grade is: B-"), 
            "❌ Score 80 should be grade B-!");
    }

    // C Grade Tests
    @Test
    public void testGradeC79() {
        String output = runProgramWithInput("79");
        assertTrue(output.contains("The grade is: C+"), 
            "❌ Score 79 should be grade C+!");
    }

    @Test
    public void testGradeC78() {
        String output = runProgramWithInput("78");
        assertTrue(output.contains("The grade is: C+"), 
            "❌ Score 78 should be grade C+!");
    }

    @Test
    public void testGradeC77() {
        String output = runProgramWithInput("77");
        assertTrue(output.contains("The grade is: C"), 
            "❌ Score 77 should be grade C!");
    }

    @Test
    public void testGradeC76() {
        String output = runProgramWithInput("76");
        assertTrue(output.contains("The grade is: C"), 
            "❌ Score 76 should be grade C!");
    }

    @Test
    public void testGradeC75() {
        String output = runProgramWithInput("75");
        assertTrue(output.contains("The grade is: C"), 
            "❌ Score 75 should be grade C!");
    }

    @Test
    public void testGradeC74() {
        String output = runProgramWithInput("74");
        assertTrue(output.contains("The grade is: C"), 
            "❌ Score 74 should be grade C!");
    }

    @Test
    public void testGradeC73() {
        String output = runProgramWithInput("73");
        assertTrue(output.contains("The grade is: C-"), 
            "❌ Score 73 should be grade C-!");
    }

    @Test
    public void testGradeC72() {
        String output = runProgramWithInput("72");
        assertTrue(output.contains("The grade is: C-"), 
            "❌ Score 72 should be grade C-!");
    }

    @Test
    public void testGradeC71() {
        String output = runProgramWithInput("71");
        assertTrue(output.contains("The grade is: C-"), 
            "❌ Score 71 should be grade C-!");
    }

    @Test
    public void testGradeC70() {
        String output = runProgramWithInput("70");
        assertTrue(output.contains("The grade is: C-"), 
            "❌ Score 70 should be grade C-!");
    }

    @Test
    public void testGradeD69() {
        String output = runProgramWithInput("69");
        assertTrue(output.contains("The grade is: D+"), 
            "❌ Score 69 should be grade D+!");
    }

    @Test
    public void testGradeD68() {
        String output = runProgramWithInput("68");
        assertTrue(output.contains("The grade is: D+"), 
            "❌ Score 68 should be grade D+!");
    }

    @Test
    public void testGradeD67() {
        String output = runProgramWithInput("67");
        assertTrue(output.contains("The grade is: D"), 
            "❌ Score 67 should be grade D!");
    }

    @Test
    public void testGradeD66() {
        String output = runProgramWithInput("66");
        assertTrue(output.contains("The grade is: D"), 
            "❌ Score 66 should be grade D!");
    }

    @Test
    public void testGradeD65() {
        String output = runProgramWithInput("65");
        assertTrue(output.contains("The grade is: D"), 
            "❌ Score 65 should be grade D!");
    }

    @Test
    public void testGradeD64() {
        String output = runProgramWithInput("64");
        assertTrue(output.contains("The grade is: D"), 
            "❌ Score 64 should be grade D!");
    }

    @Test
    public void testGradeD63() {
        String output = runProgramWithInput("63");
        assertTrue(output.contains("The grade is: D-"), 
            "❌ Score 63 should be grade D-!");
    }

    @Test
    public void testGradeD62() {
        String output = runProgramWithInput("62");
        assertTrue(output.contains("The grade is: D-"), 
            "❌ Score 62 should be grade D-!");
    }

    @Test
    public void testGradeD61() {
        String output = runProgramWithInput("61");
        assertTrue(output.contains("The grade is: D-"), 
            "❌ Score 61 should be grade D-!");
    }

    @Test
    public void testGradeD60() {
        String output = runProgramWithInput("60");
        assertTrue(output.contains("The grade is: D-"), 
            "❌ Score 60 should be grade D-!");
    }

    // F Grade Tests
    @Test
    public void testGradeF59() {
        String output = runProgramWithInput("59");
        assertTrue(output.contains("The grade is: F"), 
            "❌ Score 59 should be grade F!");
    }

    @Test
    public void testGradeF50() {
        String output = runProgramWithInput("50");
        assertTrue(output.contains("The grade is: F"), 
            "❌ Score 50 should be grade F!");
    }

    @Test
    public void testGradeF0() {
        String output = runProgramWithInput("0");
        assertTrue(output.contains("The grade is: F"), 
            "❌ Score 0 should be grade F!");
    }

    @Test
    public void testInputPrompt() {
        String output = runProgramWithInput("85");
        assertTrue(output.contains("Enter"), 
            "❌ Program should prompt user for score input!");
    }

    @Test
    public void testNoCompilationErrors() {
        String output = runProgramWithInput("85");
        assertFalse(output.contains("Exception"), "❌ Program should not throw exceptions!");
        assertFalse(output.contains("Error"), "❌ Program should not display error messages!");
        assertFalse(output.contains("Exception in thread"), "❌ Program should not crash!");
    }

    @Test
    public void testNestedIfLogic() {
        String output1 = runProgramWithInput("98");
        assertTrue(output1.contains("The grade is: A+"), 
            "❌ Score 98 should be A+!");
        
        String output2 = runProgramWithInput("91");
        assertTrue(output2.contains("The grade is: A-"), 
            "❌ Score 91 should be A-!");
        
        String output3 = runProgramWithInput("94");
        assertTrue(output3.contains("The grade is: A"), 
            "❌ Score 94 should be A!");
        
        String output4 = runProgramWithInput("45");
        assertTrue(output4.contains("The grade is: F"), 
            "❌ Score 45 should be F!");
    }

    @Test
    public void testAllGradeRanges() {
        String[] testCases = {
            "100", "A+",  
            "98", "A+",   
            "97", "A",   
            "93", "A-",   
            "90", "A-",   
            "89", "B+",   
            "88", "B+",   
            "87", "B",    
            "84", "B",    
            "83", "B-",   
            "80", "B-",   
            "79", "C+",   
            "78", "C+",   
            "77", "C",    
            "74", "C",    
            "73", "C-",   
            "70", "C-",   
            "69", "D+",   
            "68", "D+",   
            "67", "D",    
            "64", "D",    
            "63", "D-",   
            "60", "D-",  
            "59", "F",    
            "0", "F"      
        };
        
        for (int i = 0; i < testCases.length; i += 2) {
            String score = testCases[i];
            String expectedGrade = testCases[i + 1];
            String output = runProgramWithInput(score);
            assertTrue(output.contains("The grade is: " + expectedGrade), 
                "❌ Score " + score + " should be grade " + expectedGrade + "!");
        }
    }
}
