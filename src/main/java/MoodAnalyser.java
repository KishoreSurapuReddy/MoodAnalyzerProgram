public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.toLowerCase().matches("(.*)happy(.*)")) {
                return "HAPPY";
            }
            if (this.message.toLowerCase().matches("(.*)any(.*)")) {
                return "HAPPY";
            }
        }
        catch (Exception e){
            return "HAPPY";
        }
        return "SAD";
    }
}
