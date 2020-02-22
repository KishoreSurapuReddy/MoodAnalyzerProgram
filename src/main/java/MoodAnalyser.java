public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.toLowerCase().matches("(.*)sad(.*)")) {
                return "SAD";
            }
            if (this.message.toLowerCase().matches("(.*)any(.*)")) {
                return "HAPPY";
            }
        }
        catch (Exception e){
            return "HAPPY";
        }
        return "HAPPY";
    }
}
