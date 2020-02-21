public class MoodAnalyser {
    public String analyseMood(String happyMessage) {
        if (happyMessage.toLowerCase().matches("(.*)happy(.*)")){
            return "HAPPY";
        }
        if (happyMessage.toLowerCase().matches("(.*)any(.*)")){
            return "HAPPY";
        }
        return "SAD";
    }
}
