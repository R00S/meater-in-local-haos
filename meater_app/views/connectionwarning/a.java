package com.apptionlabs.meater_app.views.connectionwarning;

import android.content.Context;
import c6.h;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import java.util.Locale;
import rk.C0450b;
import y5.g;

/* compiled from: DeviceConnectionWarning.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f10506f = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f10507a;

    /* renamed from: b, reason: collision with root package name */
    private String f10508b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f10509c;

    /* renamed from: d, reason: collision with root package name */
    private Probe f10510d;

    /* renamed from: e, reason: collision with root package name */
    private C0450b f10511e;

    private static boolean e(MEATERDevice mEATERDevice) {
        if (mEATERDevice.getConnectionState() != DeviceConnectionState.OFFLINE) {
            return false;
        }
        if (!mEATERDevice.getConnectionMethod().isBluetoothConnectionMethod() && mEATERDevice.getConnectionMethod() != DeviceConnectionMethod.NONE) {
            return false;
        }
        if ((mEATERDevice.getParentDevice() != null && mEATERDevice.getParentDevice().getShouldShowAsConnected()) || h.f8879a.i().size() < 6) {
            return false;
        }
        return true;
    }

    private static a f(Probe probe) {
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        if (e(probe)) {
            a aVar = f10506f;
            aVar.f10507a = i10.getString(2132018872);
            aVar.f10509c = null;
            aVar.f10508b = String.format(Locale.US, "%s\n%s", i10.getResources().getString(2132018075, 6), i10.getString(2132018981));
            return aVar;
        }
        a aVar2 = f10506f;
        aVar2.f10507a = i10.getString(2132017528);
        if (!probe.getConnectionMethod().isBluetoothConnectionMethod() && probe.getConnectionMethod() != DeviceConnectionMethod.PROBE_SIM) {
            if (probe.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK) {
                if (probe.getMeaterLinkAddress() == null) {
                    aVar2.f10509c = 2131231183;
                    aVar2.f10508b = i10.getString(2132018043);
                    return aVar2;
                }
                if (!probe.getShouldShowAsConnected()) {
                    aVar2.f10509c = 2131231188;
                    aVar2.f10508b = i10.getString(2132018200);
                    return aVar2;
                }
            } else if (probe.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) {
                if (!g.E().X()) {
                    aVar2.f10509c = 2131231181;
                    aVar2.f10508b = i10.getString(2132017628);
                    return aVar2;
                }
                aVar2.f10509c = 2131231182;
                aVar2.f10508b = i10.getString(2132018532);
                return aVar2;
            }
        } else if (!probe.getShouldShowAsConnected()) {
            aVar2.f10509c = 2131231187;
            aVar2.f10508b = i10.getString(2132018203);
            return aVar2;
        }
        return null;
    }

    private static a g(Probe probe) {
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        a aVar = f10506f;
        aVar.f10507a = i10.getString(2132017528);
        MEATERDevice parentDevice = probe.getParentDevice();
        if (parentDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK) {
            if (parentDevice.getMeaterLinkAddress() == null) {
                aVar.f10509c = 2131231175;
                aVar.f10508b = i10.getString(2132018042);
                return aVar;
            }
            if (!probe.getShouldShowAsConnected()) {
                aVar.f10509c = 2131231184;
                aVar.f10508b = i10.getString(2132018199);
                return aVar;
            }
            return null;
        }
        if (parentDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) {
            if (!g.E().X()) {
                aVar.f10509c = 2131231173;
                aVar.f10508b = i10.getString(2132017628);
                return aVar;
            }
            aVar.f10509c = 2131231174;
            aVar.f10508b = i10.getString(2132018080);
            return aVar;
        }
        return null;
    }

    private static a h(Probe probe) {
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        if (e(probe)) {
            a aVar = f10506f;
            aVar.f10507a = i10.getString(2132018872);
            aVar.f10509c = null;
            aVar.f10508b = String.format(Locale.US, "%s\n%s", i10.getResources().getString(2132018075, 6), i10.getString(2132018844));
            return aVar;
        }
        a aVar2 = f10506f;
        aVar2.f10507a = i10.getString(2132017528);
        MEATERDevice parentDevice = probe.getParentDevice();
        if (!parentDevice.getConnectionMethod().isBluetoothConnectionMethod() && parentDevice.getConnectionMethod() != DeviceConnectionMethod.PROBE_SIM) {
            if (parentDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK) {
                if (parentDevice.getMeaterLinkAddress() == null) {
                    aVar2.f10509c = 2131231178;
                    aVar2.f10508b = i10.getString(2132018043);
                    return aVar2;
                }
                if (!parentDevice.getShouldShowAsConnected()) {
                    aVar2.f10509c = 2131231180;
                    aVar2.f10508b = i10.getString(2132018197);
                    return aVar2;
                }
                if (probe.getConnectionState() != DeviceConnectionState.CONNECTED) {
                    aVar2.f10509c = 2131231186;
                    aVar2.f10508b = i10.getString(2132018195);
                    return aVar2;
                }
            } else if (parentDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) {
                if (!g.E().X()) {
                    aVar2.f10509c = 2131231176;
                    aVar2.f10508b = i10.getString(2132017628);
                    return aVar2;
                }
                aVar2.f10509c = 2131231177;
                aVar2.f10508b = i10.getString(2132018531);
                return aVar2;
            }
        } else {
            if (!parentDevice.getShouldShowAsConnected()) {
                aVar2.f10509c = 2131231179;
                aVar2.f10508b = String.format(Locale.US, "%s", i10.getString(2132018202, i10.getString(parentDevice.getMEATERDeviceType().getDeviceName())));
                return aVar2;
            }
            if (probe.getConnectionState() != DeviceConnectionState.CONNECTED) {
                aVar2.f10509c = 2131231185;
                aVar2.f10508b = String.format(Locale.US, "%s", i10.getString(2132018198, i10.getString(parentDevice.getMEATERDeviceType().getDeviceName())));
                return aVar2;
            }
        }
        return null;
    }

    public static void i(Probe probe, ConnectionLostOverlay connectionLostOverlay, ConnectionLostImageOverlay connectionLostImageOverlay, NotConnectedOverlay notConnectedOverlay, C0450b c0450b) {
        a f10;
        if (probe.getShouldShowAsConnected()) {
            connectionLostOverlay.setVisibility(8);
            connectionLostImageOverlay.setVisibility(8);
            notConnectedOverlay.setVisibility(8);
            connectionLostImageOverlay.onDetachedFromWindow();
            return;
        }
        if (probe.getParentDevice() != null) {
            if (probe.getParentDevice().isMEATERPlus()) {
                f10 = h(probe);
            } else if (probe.getParentDevice().isMEATERBlock()) {
                f10 = g(probe);
            } else {
                f10 = null;
            }
        } else {
            f10 = f(probe);
        }
        if (f10 != null) {
            f10.f10510d = probe;
            f10.f10511e = c0450b;
            connectionLostOverlay.setVisibility(8);
            notConnectedOverlay.setVisibility(8);
            connectionLostImageOverlay.b(f10);
            connectionLostImageOverlay.setVisibility(0);
            return;
        }
        if (probe.appearsToHaveCookInProgress()) {
            connectionLostImageOverlay.setVisibility(8);
            notConnectedOverlay.setVisibility(8);
            connectionLostOverlay.a(probe);
            connectionLostOverlay.setVisibility(0);
            return;
        }
        connectionLostImageOverlay.setVisibility(8);
        connectionLostOverlay.setVisibility(8);
        notConnectedOverlay.a(probe);
        notConnectedOverlay.setVisibility(0);
    }

    public C0450b a() {
        return this.f10511e;
    }

    public String b() {
        return this.f10508b;
    }

    public String c() {
        return this.f10507a;
    }

    public Probe d() {
        return this.f10510d;
    }
}
