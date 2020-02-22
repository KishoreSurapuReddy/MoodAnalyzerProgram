import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMoodAnalyser {
    MoodAnalyser analyser;

    @AfterEach
    public void init(){
        analyser = new MoodAnalyser();
    }

    @Test
    public void givenSadMessage_WhenAnalyse_ReturnSad(){
        String sadMessage = "I am in SAD mood";
        analyser = new MoodAnalyser(sadMessage);
        String validateMessage = analyser.analyseMood();
        assertEquals("SAD",validateMessage);
    }

    @Test
    public void givenAnyMessage_WhenAnalyse_ReturnHappy(){
        String anyMessage = "I am in Any mood";
        analyser = new MoodAnalyser(anyMessage);
        String validateMessage = analyser.analyseMood();
        assertEquals("HAPPY" , validateMessage);
    }
}
