import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMoodAnalyser {
    MoodAnalyser analyser;

    @AfterEach
    public void init() {
        analyser = new MoodAnalyser();
    }

    @Test
    public void givenSadMessage_WhenAnalyse_ReturnSad() throws MoodAnalysisException {
        String sadMessage = "I am in SAD mood";
        analyser = new MoodAnalyser(sadMessage);
        String validateMessage = analyser.analyseMood();
        assertEquals("SAD",validateMessage);
    }

    @Test
    public void givenAnyMessage_WhenAnalyse_ReturnHappy() throws MoodAnalysisException {
        String anyMessage = "I am in Any mood";
        analyser = new MoodAnalyser(anyMessage);
        String validateMessage = analyser.analyseMood();
        assertEquals("HAPPY" , validateMessage);
    }

    @Test
    public void givenNullMessage_WhenAnalyse_ThrowMoodAnalysisException(){
        analyser = new MoodAnalyser();
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class , () -> analyser.analyseMood());
        assertEquals(exception.type , MoodAnalysisException.Invalid.NULL);
    }
}
