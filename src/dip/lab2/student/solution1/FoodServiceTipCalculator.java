package dip.lab2.student.solution1;

public class FoodServiceTipCalculator implements TipCalculator{

    private double minBill = 0.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        if (minBill < 0) {
            throw new IllegalArgumentException("Minimum bill amount cannot be less than zero.");
        } else {
            this.minBill = minBill;
        }
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        if (goodRate < 0 || goodRate > 1) {
            throw new IllegalArgumentException("Rate must be between zero and 1.");
        } else {
            this.goodRate = goodRate;
        }

    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        if (fairRate < 0 || fairRate > 1) {
            throw new IllegalArgumentException("Rate must be between zero and 1.");
        } else {
            this.fairRate = fairRate;
        }
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public final void setPoorRate(double poorRate) {
        if (poorRate < 0 || poorRate > 1) {
            throw new IllegalArgumentException("Rate must be between zero and 1.");
        } else {
            this.poorRate = poorRate;
        }
    }

    public final double getBill() {
        return bill;
    }

    public final void setBill(double billAmt) {
        if (billAmt < minBill) {
            throw new IllegalArgumentException("Bill cannot be less than $" + minBill);
        }
        bill = billAmt;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }
}
