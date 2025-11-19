package z4;

import P4.a;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.TemperatureLog;
import java.util.Locale;

/* compiled from: BLETemperatureLogParser.java */
/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5173c {
    public static void a(byte[] bArr, Probe probe, c0 c0Var) {
        A4.a aVarC;
        short s10;
        if (bArr == null || bArr.length == 0) {
            U4.b.a("Received log is empty (0 bytes). Will need to read again in 10 secs", new Object[0]);
            c0Var.f53647i.f53587h = true;
            c0Var.l0(System.currentTimeMillis() + 10000);
            return;
        }
        probe.setHaveFetchedTemperatureLogFromBLE(true);
        if (bArr.length == 499) {
            aVarC = A4.a.b(bArr, probe.getMEATERDeviceType().temperatureResolutionForDevice());
            if (MEATERDeviceType.INSTANCE.MEATERDeviceIsSecondGeneration(probe.getMEATERDeviceType())) {
                U4.b.a("Applying ambient compensation to temperature log", new Object[0]);
                aVarC = A4.a.d(aVarC);
            }
        } else if (bArr.length == 484) {
            U4.b.a("Received log in MEATER+ (converted) format", new Object[0]);
            aVarC = A4.a.a(bArr, probe.getMEATERDeviceType().temperatureResolutionForDevice());
        } else if (bArr.length != 512) {
            U4.b.a("Got bad temperature log (len: %d) from %s", Integer.valueOf(bArr.length), probe.getDebugLogDescription());
            return;
        } else {
            U4.b.a("Received log in Probe (raw) format", new Object[0]);
            aVarC = A4.a.c(bArr, probe.getMEATERDeviceType().temperatureResolutionForDevice());
        }
        short s11 = aVarC.f728b;
        if (s11 > 120 || (s10 = aVarC.f727a) == 0 || s10 % 5 > 0) {
            U4.b.a("Got invalid temperature log (count: %d timeScale: %d) from %s", Short.valueOf(s11), Short.valueOf(aVarC.f727a), probe.getDebugLogDescription());
            return;
        }
        U4.b.a("Received log is: %d readings, %d interval, %s time", Short.valueOf(s11), Short.valueOf(aVarC.f727a), P5.I.f(aVarC.f728b * aVarC.f727a));
        double d10 = aVarC.f728b * aVarC.f727a;
        double totalTime = probe.getTemperatureLog().getTotalTime();
        double d11 = d10 - totalTime;
        if (b(probe) && (c0Var.O() == 0.0d || c0Var.O() >= d10)) {
            int i10 = aVarC.f727a + 5;
            U4.b.a("Temp log might not be up to date:", new Object[0]);
            if (c0Var.O() == 0.0d) {
                U4.b.a("This is a v1 probe and we haven't fetched the log before on this connection", new Object[0]);
            } else {
                U4.b.a("This is a v1 probe and we fetched the log before, but it's still not longer than last time:", new Object[0]);
                U4.b.a("Length of the log the last time we fetched it was: %s", P5.I.b(c0Var.O()));
                U4.b.a("Length of the log now is %s", P5.I.b(d10));
            }
            U4.b.a("Will need to re-request in %s", P5.I.b(i10));
            probe.setHaveFetchedTemperatureLogFromBLE(false);
            if (probe.getEventLog() != null) {
                probe.getEventLog().addReadTempLogEventWithCount(aVarC.f728b, aVarC.f727a, (int) d11, true);
            }
            c0Var.f53647i.f53587h = true;
            c0Var.k0(d10);
            c0Var.l0(System.currentTimeMillis() + (i10 * 1000));
            return;
        }
        if (totalTime > 0.0d) {
            double d12 = d10 / totalTime;
            if (d12 < 0.9d) {
                if (totalTime > 30.0d) {
                    int iRound = (int) Math.round((1.0d - d12) * 100.0d);
                    if (Config.getInstance().LOG_BLE_STATE) {
                        String str = String.format(Locale.ENGLISH, "[RESET PROBE?] Temp log from probe valid but time (%s) %d％ shorter than local (%s). Ignoring - must assume probe has been reset.", P5.I.b(d10), Integer.valueOf(iRound), P5.I.b(totalTime));
                        probe.getEventLog().addErrorEvent(str);
                        U4.b.a(str, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (totalTime - d10 > 10.0d) {
            U4.b.a("Warning: temperature log duration from ble probe (%s) is shorter than local (%s).", P5.I.b(d10), P5.I.b(totalTime));
        }
        TemperatureLog temperatureLogLogForProbe = TemperatureLog.logForProbe(probe, 5);
        temperatureLogLogForProbe.updateFromBLEData(aVarC, bArr.length == 499);
        probe.getTemperatureLog().updateWithTemperatureLog(temperatureLogLogForProbe);
        long jCurrentTimeMillis = probe.getCookStartTime() != null ? (System.currentTimeMillis() - probe.getCookStartTime().getTime()) / 1000 : 0L;
        double totalTime2 = probe.getTemperatureLog().getTotalTime();
        U4.b.a("Updated temp log for probe %s (%s):", probe.getDeviceIDString(), probe.getFirmwareRevision());
        double d13 = jCurrentTimeMillis;
        U4.b.a("Local elapsed time: %s", P5.I.b(d13));
        U4.b.a("Probe log elapsed time: %s", P5.I.b(totalTime2));
        U4.b.a("Diff: %s", P5.I.b(Math.abs(d13 - totalTime2)));
        if (totalTime2 - d13 > 30.0d) {
            probe.setCookStartTime(aVarC.f731e != 0 ? TemperatureLog.dateWithSecondsSinceNow(-r0) : temperatureLogLogForProbe.getEstimatedStartTime());
            U4.b.a("Updating cook time based on readings from probe temperature log", new Object[0]);
        }
        if (probe.getEventLog() != null) {
            probe.getEventLog().addReadTempLogEventWithCount(aVarC.f728b, aVarC.f727a, (int) d11, false);
        }
        probe.setPeakTemperature(Math.max(probe.getTemperatureLog().getPeakInternalTemperature(), probe.getPeakTemperature()));
        if (probe.getSavedCook() != null) {
            probe.getSavedCook().setPeakTemperature(probe.getPeakTemperature());
        }
        if (temperatureLogLogForProbe.recordings == null) {
            return;
        }
        probe.getCookEstimate().u(temperatureLogLogForProbe.estimatorRecordings(), temperatureLogLogForProbe.getCount(), temperatureLogLogForProbe.getInterval(), probe.getCookState(), probe.getTargetInternalTemperature(), probe.getPeakTemperatures(), probe.slightlyOvercookedThresholdTemperature(), probe.overcookThresholdTemperature(), probe.isUsingGuidedCook() ? a.b.SMART : a.b.CUSTOM, probe.getCookEstimate().f13932A, probe.getSecondsDelayBeforeResting(), probe.getTemperatureChangeBeforeReady(), probe.getSecondsDelayBeforeReady(), probe.getMEATERDeviceType().numberOfInternalTemperatureSensorsForDevice(), probe.getTemperatureOffsetBeforeRemoveFromHeat());
    }

    private static boolean b(Probe probe) {
        return probe.getFirmwareRevision() == null || probe.isV1Probe();
    }
}
