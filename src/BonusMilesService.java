public class BonusMilesService {
    int rublesPerMile = 20;

    public int calculate(int price) {
        int miles = price / rublesPerMile;
        return miles;

    }

}
