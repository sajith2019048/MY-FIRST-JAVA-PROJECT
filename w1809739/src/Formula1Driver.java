
public class Formula1Driver extends Driver {
    private int position;
    private int first_position;
    private int second_position;
    private int third_position;
    private int num_races ;
    private int num_points;

    public Formula1Driver(String name, String location, String team, int position, int first_position, int second_position, int third_position, int num_races, int num_points) {
        super(name, location, team);
        this.position = position;
        this.first_position = first_position;
        this.second_position = second_position;
        this.third_position = third_position;
        this.num_races = num_races;
        this.num_points = num_points;
    }

    public int getPosition() {
        return position;
    }

    public int getFirst_position() {
        return first_position;
    }

    public int getSecond_position() {
        return second_position;
    }

    public int getThird_position() {
        return third_position;
    }

    public int getNum_races() {
        return num_races;
    }

    public int getNum_points() {
        return num_points;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setFirst_position(int first_position) {
        this.first_position = first_position;
    }

    public void setSecond_position(int second_position) {
        this.second_position = second_position;
    }

    public void setThird_position(int third_position) {
        this.third_position = third_position;
    }

    public void setNum_races(int num_races) {
        this.num_races = num_races;
    }

    public void setNum_points(int num_points) {
        this.num_points = num_points;
    }
}
