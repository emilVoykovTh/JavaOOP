package Encapsulation.exercises.classBoxDataValidation;

public class Box {
    double length;
    double width;
    double height;


    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.height = height;
        }
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.length * this.height
                + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * (this.length * this.height) + 2 * (this.height * this.width);
    }

    public double calculateVolume(){
        return this.width * this.height * this.length;
    }
}
