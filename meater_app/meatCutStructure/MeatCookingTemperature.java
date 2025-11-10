package com.apptionlabs.meater_app.meatCutStructure;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeatCookingTemperature extends MeatModel {
    public String description;
    public String endHex;
    public Integer maxTempC;
    public Integer maxTempF;
    public Integer minTempC;
    public Integer minTempF;
    public String startHex;
    public Integer targetTempC;
    public Integer targetTempF;
    public Boolean usdaSafe;

    public boolean isMeaterRecommendRange() {
        String str = this.name;
        if (str != null && str.equalsIgnoreCase("meater_recommends")) {
            return true;
        }
        return false;
    }

    public boolean isNormalRange() {
        String str;
        String str2 = this.startHex;
        if (str2 != null && !str2.isEmpty() && (str = this.endHex) != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValidTemperatures() {
        if (this.minTempC != null && this.maxTempC != null && this.targetTempC != null && this.minTempF != null && this.maxTempF != null && this.targetTempF != null) {
            return true;
        }
        return false;
    }
}
