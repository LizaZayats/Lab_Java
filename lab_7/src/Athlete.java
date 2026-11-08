public class Athlete {
    private String name;
    private String sport;
    private int medals;
    private static int totalAthletes;
    private static int totalMedals;

    public Athlete(String name, String sport, int medals) {
        this.name = name;
        this.sport = sport;
        this.medals = medals;
        totalAthletes++;
        totalMedals += medals;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getMedals() {
        return medals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setMedals(int medals) {
        totalMedals = totalMedals - this.medals + medals;
        this.medals = medals;
    }

    public static int getTotalAthletes() {
        return totalAthletes;
    }

    public static int getTotalMedals() {
        return totalMedals;
    }

    public static double getAverageMedals() {
        if (totalAthletes == 0) {
            return 0;
        }
        return (double) totalMedals / totalAthletes;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, медалей: %d)", name, sport, medals);
    }
}
