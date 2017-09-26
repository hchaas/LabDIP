package dip.lab2.student.solution1;

public class BaggageServiceTipCalculator {

    private double minBill = 0.00;
    private double maxBill = 100.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
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

    public final double getMaxBill() {
        return maxBill;
    }

    public final void setMaxBill(double maxBill) {
        if (maxBill == 0 || maxBill < 0) {
            throw new IllegalArgumentException("Maximum bill amount cannot be less than or equal to zero.");
        } else {
            this.maxBill = maxBill;
        }
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        if (goodRate == 0 || goodRate < 0 || goodRate > 1) {
            throw new IllegalArgumentException("Rate must be between zero and 1.");
        } else {
            this.goodRate = goodRate;
        }
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        if (fairRate == 0 || fairRate < 0 || fairRate > 1) {
            throw new IllegalArgumentException("Rate must be between zero and one.");
        } else {
            this.fairRate = fairRate;
        }
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public final void setPoorRate(double poorRate) {
        if (poorRate < 0 || fairRate > 1) {
            throw new IllegalArgumentException("Rate cannot be less than zero or more than one.");
        } else {
            this.poorRate = poorRate;
        }
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0 || baseTipPerBag == 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0 || bagCount == 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }
}
