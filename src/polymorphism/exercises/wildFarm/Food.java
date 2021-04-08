package polymorphism.exercises.wildFarm;

public abstract class Food {
    private  int quantity;

    public Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
