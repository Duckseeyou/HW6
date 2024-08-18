public class Skeleton extends Boss{
    int arrowsAmount;

    public int getArrowsAmount() {
        return arrowsAmount;
    }

    public void setArrowsAmount(int arrowsAmount) {
        this.arrowsAmount = arrowsAmount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Кол-во стрел: " + arrowsAmount);
    }
}
