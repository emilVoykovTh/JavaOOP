package workingWithAbstractions.jediGalaxy;

public class Galaxy {
    private int x;
    private int y;

    private Position player;
    private Position evil;

    private int[][] galaxyField;

    public Galaxy(int x, int y) {
        this.x = x;
        this.y = y;
        this.galaxyField = new int[x][y];
    }

    public void initializeGalaxy(){
        int[][] matrix = new int[x][y];
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        this.galaxyField = matrix;
    }

    public void setPlayer(Position player) {
        this.player = player;
    }

    public void setEvil(Position evil) {
        this.evil = evil;
    }

    public void destroyStarsByEvil() {
        int evilsX = evil.getX();
        int evilsY = evil.getY();
        while (evilsX >= 0 && evilsY >= 0) {
            if (evilsX >= 0 && evilsX < this.galaxyField.length && evilsY >= 0 && evilsY < this.galaxyField[0].length) {
                this.galaxyField[evilsX][evilsY] = 0;
            }
            evilsX--;
            evilsY--;
        }
    }

    public long collectStars() {
        long sum = 0;
        int playerX = player.getX();
        int playerY = player.getY();
        while (playerX >= 0 && playerY < this.galaxyField[1].length) {
            if (playerX >= 0 && playerX < this.galaxyField.length && playerY >= 0 && playerY < this.galaxyField[0].length) {
                sum += this.galaxyField[playerX][playerY];
            }

            playerY++;
            playerX--;
        }

        return sum;
    }
}
