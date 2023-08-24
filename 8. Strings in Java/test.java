public class test {

    public static long toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = 0;
        long rounded = 0;
        if (kilometersPerHour > 0) {
            milesPerHour = kilometersPerHour / 1.609;
            rounded = (long) Math.round(milesPerHour);
            return rounded;
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            double milesPerHour = kilometersPerHour / 1.609;
            long rounded = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + rounded + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        double km = 5;
        System.out.println(toMilesPerHour(km));
    }
}
