import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMoodAnalyser {
    static MoodAnalyser analyser;
    String happyMessage = "I am in Happy mood";
    String sadMessage = "I am in SAD mood";
    String anyMessage = "I am in Any mood";

    @BeforeClass
    public static void init(){
        analyser = new MoodAnalyser();
    }

    @Test
    public void givenHappyMessage_WhenAnalyse_ReturnHappy(){
        analyser = new MoodAnalyser(happyMessage);
        String validateMessage = analyser.analyseMood();
        Assert.assertEquals("HAPPY",validateMessage);
    }

    @Test
    public void givenSadMessage_WhenAnalyse_ReturnSad(){
        analyser = new MoodAnalyser(sadMessage);
        String validateMessage = analyser.analyseMood();
        Assert.assertEquals("SAD",validateMessage);
    }

    @Test
    public void givenAnyMessage_WhenAnalyse_ReturnHappy(){
        analyser = new MoodAnalyser(anyMessage);
        String validateMessage = analyser.analyseMood();
        Assert.assertEquals("HAPPY" , validateMessage);
    }
}
