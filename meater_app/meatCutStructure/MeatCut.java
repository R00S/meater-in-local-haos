package com.apptionlabs.meater_app.meatCutStructure;

import android.content.Context;
import f8.b0;
import java.util.ArrayList;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeatCut extends MeatModel {
    public Integer cutOrder;
    public MeatCutType cutType;
    public Integer estimatedThickness;
    private String insertionInstruction;
    public Integer mostPopularTempRangeId;
    public String nameLong;
    public Integer usdaSafeC;
    public Integer usdaSafeF;
    private String translatedNameLong = null;
    public ArrayList<MeatCookingTemperature> temperatureRanges = new ArrayList<>();

    public Integer getAnimationRawRes(Context context, boolean z10) {
        String replaceAll;
        String str = this.insertionInstruction;
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (z10) {
            replaceAll = ("g2_" + this.insertionInstruction).replaceAll(".json", "");
        } else {
            replaceAll = this.insertionInstruction.replaceAll(".json", "");
        }
        int identifier = context.getResources().getIdentifier(replaceAll, "raw", context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return Integer.valueOf(identifier);
    }

    public String getNameLong() {
        if (this.translatedNameLong == null) {
            String b10 = b0.b(this.nameLong);
            if (b10 == null) {
                b10 = "";
            }
            this.translatedNameLong = b10;
        }
        return this.translatedNameLong;
    }
}
