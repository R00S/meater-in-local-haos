package D4;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OvercookThresholdCalculator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LD4/c;", "", "<init>", "()V", "", "cutId", "target", "a", "(II)I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public final int a(int cutId, int target) {
        MeatCookingTemperature meatCookingTemperatureHighestNonSmokePreset;
        int celsius = Temperature.toCelsius(target);
        MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
        MeatCut meatCut = meatCutsHelper.getMeatCut(cutId);
        if (meatCut != null && (meatCookingTemperatureHighestNonSmokePreset = meatCutsHelper.highestNonSmokePreset(meatCut.temperatureRanges)) != null) {
            Integer targetTempC = meatCookingTemperatureHighestNonSmokePreset.targetTempC;
            C3862t.f(targetTempC, "targetTempC");
            celsius = Math.max(celsius, targetTempC.intValue());
        }
        return Temperature.fromCelsius(celsius + 10);
    }
}
