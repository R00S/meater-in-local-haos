package z4;

import P5.C1595c;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v2protobuf.V2ProbeSetup;
import com.apptionlabs.meater_app.v3protobuf.CookSetup;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.ProbeCookSetupState;
import java.util.Arrays;
import x4.b;

/* compiled from: BLECookSetupParser.java */
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5171a {

    /* compiled from: BLECookSetupParser.java */
    /* renamed from: z4.a$a, reason: collision with other inner class name */
    public enum EnumC0787a {
        DO_NOTHING,
        WRITE_COOK_SETUP_AND_RESET_TEMPERATURE_LOG,
        WRITE_COOK_SETUP_AND_READ_TEMPERATURE_LOG,
        READ_TEMPERATURE_LOG
    }

    public static CookSetup a(V2ProbeSetup v2ProbeSetup) {
        return V4.p.d(v2ProbeSetup);
    }

    private static CookSetup b(byte[] bArr) {
        try {
            return CookSetup.ADAPTER.decode(bArr);
        } catch (Exception unused) {
            U4.b.a("No cook setup data in probe - no history to read", new Object[0]);
            return null;
        }
    }

    private static V2ProbeSetup c(byte[] bArr) {
        try {
            return V2ProbeSetup.ADAPTER.decode(bArr);
        } catch (Exception unused) {
            U4.b.a("V2 ProbeSetup parsing failed", new Object[0]);
            return null;
        }
    }

    protected static EnumC0787a d(byte[] bArr, Probe probe) {
        Long l10;
        if (bArr == null) {
            x4.b.h(b.EnumC0768b.f52657N, b.a.f52606D, b.c.f52760L);
            return EnumC0787a.DO_NOTHING;
        }
        if (bArr.length == 0) {
            U4.b.a("Cook setup from probe empty:", new Object[0]);
            if (probe.getEventLog() != null) {
                probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_NONE);
            }
            if (probe.getCookState().getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
                U4.b.a("We have a setup already - need to write it to the probe and then reset the log", new Object[0]);
                return EnumC0787a.WRITE_COOK_SETUP_AND_RESET_TEMPERATURE_LOG;
            }
            U4.b.a("We have no cook setup locally - no need to do anything", new Object[0]);
            return EnumC0787a.DO_NOTHING;
        }
        long jC = bArr.length >= 8 ? C1595c.c(bArr) : -1L;
        byte[] bArrCopyOfRange = bArr.length >= 8 ? Arrays.copyOfRange(bArr, 8, bArr.length) : null;
        CookSetup cookSetupB = b(bArrCopyOfRange);
        if (cookSetupB == null || (l10 = cookSetupB.cookID) == null) {
            V2ProbeSetup v2ProbeSetupC = c(bArrCopyOfRange);
            if (v2ProbeSetupC != null) {
                V4.p.F(probe, a(v2ProbeSetupC), V4.s.PROBE);
                return EnumC0787a.WRITE_COOK_SETUP_AND_READ_TEMPERATURE_LOG;
            }
            if (probe.getEventLog() != null) {
                probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_INVALID);
            }
            if (jC == probe.getCookID()) {
                U4.b.a("PB Setup from probe was invalid but we got matching cook IDs:", new Object[0]);
                U4.b.a("Need to write cook setup and read temp log", new Object[0]);
                return EnumC0787a.WRITE_COOK_SETUP_AND_READ_TEMPERATURE_LOG;
            }
            if (probe.getCookState().getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
                U4.b.a("Setup on probe was invalid and had no cook id matching ours. We need to write our setup to the probe and then reset the log", new Object[0]);
                return EnumC0787a.WRITE_COOK_SETUP_AND_RESET_TEMPERATURE_LOG;
            }
            U4.b.a("Setup on probe was invalid and we had no cook in progress already - do nothing", new Object[0]);
            return EnumC0787a.DO_NOTHING;
        }
        boolean z10 = l10.longValue() == probe.getCookID() && cookSetupB.sequenceNumber.intValue() == probe.getSetupSeqNum();
        V4.h hVarF = V4.p.F(probe, cookSetupB, V4.s.PROBE);
        if (hVarF == V4.h.ACCEPTED) {
            if (z10) {
                U4.b.a("Setup on probe is the same as ours - need to read log", new Object[0]);
                if (probe.getEventLog() != null) {
                    probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_SAME);
                }
            } else {
                U4.b.a("Setup on probe is newer than ours - need to read log", new Object[0]);
                if (probe.getEventLog() != null) {
                    probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_NEWER);
                }
            }
            return EnumC0787a.READ_TEMPERATURE_LOG;
        }
        if (hVarF == V4.h.REJECTED_OUT_OF_DATE) {
            U4.b.a("Setup on probe is same cook as ours but older sequence number - need to write our setup and read the log", new Object[0]);
            if (probe.getEventLog() != null) {
                probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_OLDER);
            }
            return EnumC0787a.WRITE_COOK_SETUP_AND_READ_TEMPERATURE_LOG;
        }
        U4.b.a("Setup on probe is for an old cook. We should write our own setup to the probe and reset the temp log.", new Object[0]);
        if (probe.getEventLog() != null) {
            probe.getEventLog().addReadCookSetupEventWithState(ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_OLDER);
        }
        if (probe.getOngoingRecipeID() != -1) {
            U4.b.a("Probe has OnGoingRecipe ID " + probe.getOngoingRecipeID() + " set but Cook is not Configured", new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Finishing OnGoing Recipe from Table ");
            sb2.append(probe.getOngoingRecipeID());
            U4.b.a(sb2.toString(), new Object[0]);
            K4.a.f8678a.b(probe.getOngoingRecipeID());
            probe.setOngoingRecipeID(-1L);
        }
        return EnumC0787a.WRITE_COOK_SETUP_AND_RESET_TEMPERATURE_LOG;
    }
}
