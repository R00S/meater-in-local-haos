package V5;

import A7.C0858l;
import A7.C0864s;
import A7.C0865t;
import A7.C0866u;
import M4.h;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import java.util.Date;
import java.util.List;
import x4.g;
import z7.InterfaceC5205g;

/* compiled from: WatchCommunicationBridge.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final c f18144d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static int f18145e = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f18146a = false;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f18147b;

    /* renamed from: c, reason: collision with root package name */
    Handler f18148c;

    private int d(int i10) {
        return Temperature.convertToUserScale(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        Runnable runnable;
        Runnable runnable2;
        try {
            m();
            Handler handler = this.f18148c;
            if (handler == null || (runnable2 = this.f18147b) == null) {
                return;
            }
            handler.postDelayed(runnable2, 1000L);
        } catch (Throwable th) {
            if (this.f18148c != null && (runnable = this.f18147b) != null) {
                this.f18148c.postDelayed(runnable, 1000L);
            }
            throw th;
        }
    }

    private void h(C0864s c0864s, Probe probe, int i10) {
        if (probe.isOnline() || probe.appearsToHaveCookInProgress()) {
            int iD = d(probe.getTargetInternalTemperature());
            int iD2 = d(probe.getAmbientTemperature());
            c0864s.c().d("cooking" + i10, probe.appearsToHaveCookInProgress());
            c0864s.c().d("online" + i10, probe.isOnline());
            c0864s.c().f("time", new Date().getTime());
            c0864s.c().d("g2_probe" + i10, probe.getMEATERDeviceType().isG2Probe());
            if (probe.getMEATERDeviceType().isG2Probe()) {
                c0864s.c().g("Internal" + i10, Temperature.displayTemperatureFloatValues(probe.getInternalTemperature()));
            } else {
                c0864s.c().g("Internal" + i10, Temperature.displayTemperature(probe.getInternalTemperature()));
            }
            c0864s.c().e("T" + i10, iD);
            C0858l c0858lC = c0864s.c();
            String str = "A" + i10;
            if (!c(probe)) {
                iD2 = -32;
            }
            c0858lC.e(str, iD2);
            c0864s.c().g("Type" + i10, i(probe));
            c0864s.c().e("state" + i10, probe.getCookState().getValue());
            c0864s.c().e("elapsed" + i10, probe.cookTimeElapsed());
            c0864s.c().e("remaining" + i10, probe.getTimeRemaining());
            c0864s.c().e("probeNumber" + i10, probe.displayProbeNumber());
            if (probe.cookNameForDisplay() != null) {
                c0864s.c().g("cookName" + i10, probe.cookNameForDisplay());
            }
            f18145e++;
        }
    }

    private String i(Probe probe) {
        return probe.getmCut() == null ? "#F64646" : MeatCutsHelper.getInstance().getMeatColor(probe.getmCut().f31705id.intValue());
    }

    public static c j() {
        return f18144d;
    }

    public boolean c(Probe probe) {
        if (MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(probe.getMEATERDeviceType())) {
            return true;
        }
        return probe.getAmbientTemperature() >= probe.getInternalTemperature() + Temperature.fromCelsius(5) && probe.getAmbientTemperature() != -1024 && probe.getAmbientTemperature() >= 1;
    }

    public boolean e() {
        return this.f18146a;
    }

    public void k() {
        this.f18146a = true;
        l();
        Log.d("WEAR**", "startSendingData  ");
        this.f18148c = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: V5.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f18143B.f();
            }
        };
        this.f18147b = runnable;
        runnable.run();
    }

    public void l() {
        if (this.f18148c == null || this.f18147b == null) {
            return;
        }
        Log.d("WEAR**", "Stop Sending Data  ");
        this.f18148c.removeCallbacks(this.f18147b);
    }

    public void m() {
        List<Probe> listL = h.f11978a.L();
        C0864s c0864sB = C0864s.b("/image");
        f18145e = 0;
        for (int i10 = 0; i10 < listL.size(); i10++) {
            h(c0864sB, listL.get(i10), i10);
        }
        c0864sB.c().e("size", f18145e);
        C0865t c0865tA = c0864sB.a();
        c0865tA.U0();
        C0866u.a(g.h()).o(c0865tA).g(new InterfaceC5205g() { // from class: V5.b
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) {
                Log.d("WEAR**", "data sent(): ");
            }
        });
    }
}
