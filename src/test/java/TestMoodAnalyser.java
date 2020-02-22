import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMoodAnalyser {
    MoodAnalyser analyser;

    @BeforeClass
    public void init(){
        analyser = new MoodAnalyser();
    }

    @Test
    public void givenSadMessage_WhenAnalyse_ReturnSad(){
        String sadMessage = "I am in SAD mood";
        analyser = new MoodAnalyser(sadMessage);
        String validateMessage = analyser.analyseMood();
        Assert.assertEquals("SAD",validateMessage);
    }

    @Test
    public void givenAnyMessage_WhenAnalyse_ReturnHappy(){
        String anyMessage = "I am in Any mood";
        analyser = new MoodAnalyser(anyMessage);
        String validateMessage = analyser.analyseMood();
        Assert.assertEquals("HAPPY" , validateMessage);
    }
}
