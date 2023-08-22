// Given a route containing 4 directions ( E, W, N, S),
// Find the shortest path to reach destination

public class Shortest_path {

    public static double shortest_path(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            // West
            if (str.charAt(i) == 'W') {
                x--;
            }
            // East
            else if (str.charAt(i) == 'E') {
                x++;
            }
            // North
            else if (str.charAt(i) == 'N') {
                y++;
            }
            // South
            else {
                y--;
            }
        }

        return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        System.out.println(shortest_path(direction));
    }
}
