public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() {
        if (this.message.toLowerCase().matches("(.*)sad(.*)")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
