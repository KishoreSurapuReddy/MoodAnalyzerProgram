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
        String validateMessage = analyser.analyseMood(happyMessage);
        Assert.assertEquals("HAPPY",validateMessage);
    }

    @Test
    public void givenSadMessage_WhenAnalyse_ReturnSad(){
        String validateMessage = analyser.analyseMood(sadMessage);
        Assert.assertEquals("SAD",validateMessage);
    }

    @Test
    public void givenAnyMessage_WhenAnalyse_ReturnHappy(){
        String validateMessage = analyser.analyseMood(anyMessage);
        Assert.assertEquals("HAPPY" , validateMessage);
    }
}
