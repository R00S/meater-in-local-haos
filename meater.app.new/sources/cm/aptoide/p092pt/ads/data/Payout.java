package cm.aptoide.p092pt.ads.data;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Payout {
    double appcAmount;
    double fiatAmount;
    String fiatCurrency;
    String fiatSymbol;

    public Payout() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Payout payout = (Payout) obj;
        return Double.compare(payout.appcAmount, this.appcAmount) == 0 && Double.compare(payout.fiatAmount, this.fiatAmount) == 0 && this.fiatCurrency.equals(payout.fiatCurrency) && this.fiatSymbol.equals(payout.fiatSymbol);
    }

    public double getAppcAmount() {
        return this.appcAmount;
    }

    public double getFiatAmount() {
        return this.fiatAmount;
    }

    public String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public String getFiatSymbol() {
        return this.fiatSymbol;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Double.valueOf(this.appcAmount), Double.valueOf(this.fiatAmount), this.fiatCurrency, this.fiatSymbol});
    }

    public void setAppcAmount(double d2) {
        this.appcAmount = d2;
    }

    public void setFiatAmount(double d2) {
        this.fiatAmount = d2;
    }

    public void setFiatCurrency(String str) {
        this.fiatCurrency = str;
    }

    public void setFiatSymbol(String str) {
        this.fiatSymbol = str;
    }

    public Payout(double d2, double d3, String str, String str2) {
        this.appcAmount = d2;
        this.fiatAmount = d3;
        this.fiatCurrency = str;
        this.fiatSymbol = str2;
    }
}
