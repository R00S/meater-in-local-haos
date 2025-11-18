package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C2456d1;
import com.google.android.gms.internal.measurement.C2481g1;
import com.google.android.gms.internal.measurement.InterfaceC2429a1;
import com.google.android.gms.internal.measurement.InterfaceC2438b1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import g7.C3445p;
import java.util.Map;
import m7.InterfaceC3977a;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.S0 {

    /* renamed from: B, reason: collision with root package name */
    P2 f34744B = null;

    /* renamed from: C, reason: collision with root package name */
    private final Map<Integer, v7.K> f34745C = new C4391a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
    class a implements v7.I {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC2429a1 f34746a;

        a(InterfaceC2429a1 interfaceC2429a1) {
            this.f34746a = interfaceC2429a1;
        }

        @Override // v7.I
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f34746a.E0(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                P2 p22 = AppMeasurementDynamiteService.this.f34744B;
                if (p22 != null) {
                    p22.k().M().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
    class b implements v7.K {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC2429a1 f34748a;

        b(InterfaceC2429a1 interfaceC2429a1) {
            this.f34748a = interfaceC2429a1;
        }

        @Override // v7.K
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f34748a.E0(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                P2 p22 = AppMeasurementDynamiteService.this.f34744B;
                if (p22 != null) {
                    p22.k().M().b("Event listener threw exception", e10);
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.V0 v02) {
        try {
            v02.M0();
        } catch (RemoteException e10) {
            ((P2) C3445p.k(appMeasurementDynamiteService.f34744B)).k().M().b("Failed to call IDynamiteUploadBatchesCallback", e10);
        }
    }

    private final void g() {
        if (this.f34744B == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void k(com.google.android.gms.internal.measurement.U0 u02, String str) {
        g();
        this.f34744B.P().T(u02, str);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void beginAdUnitExposure(String str, long j10) {
        g();
        this.f34744B.A().B(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        this.f34744B.J().l0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearMeasurementEnabled(long j10) {
        g();
        this.f34744B.J().e0(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void endAdUnitExposure(String str, long j10) {
        g();
        this.f34744B.A().F(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void generateEventId(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        long jQ0 = this.f34744B.P().Q0();
        g();
        this.f34744B.P().R(u02, jQ0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.o().E(new M2(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        k(u02, this.f34744B.J().A0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.o().E(new RunnableC2803n4(this, u02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        k(u02, this.f34744B.J().B0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        k(u02, this.f34744B.J().C0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getGmpAppId(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        k(u02, this.f34744B.J().D0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.J();
        C2843t3.G(str);
        g();
        this.f34744B.P().Q(u02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getSessionId(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.J().P(u02);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getTestFlag(com.google.android.gms.internal.measurement.U0 u02, int i10) {
        g();
        if (i10 == 0) {
            this.f34744B.P().T(u02, this.f34744B.J().E0());
            return;
        }
        if (i10 == 1) {
            this.f34744B.P().R(u02, this.f34744B.J().z0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f34744B.P().Q(u02, this.f34744B.J().y0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f34744B.P().V(u02, this.f34744B.J().w0().booleanValue());
                return;
            }
        }
        Q5 q5P = this.f34744B.P();
        double dDoubleValue = this.f34744B.J().x0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            q5P.f35457a.k().M().b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.o().E(new RunnableC2871x3(this, u02, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initForTests(Map map) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initialize(InterfaceC3977a interfaceC3977a, C2456d1 c2456d1, long j10) {
        P2 p22 = this.f34744B;
        if (p22 == null) {
            this.f34744B = P2.c((Context) C3445p.k((Context) m7.b.k(interfaceC3977a)), c2456d1, Long.valueOf(j10));
        } else {
            p22.k().M().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u02) {
        g();
        this.f34744B.o().E(new RunnableC2748f5(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        g();
        this.f34744B.J().n0(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j10) {
        g();
        C3445p.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f34744B.o().E(new R3(this, u02, new J(str2, new F(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logHealthData(int i10, String str, InterfaceC3977a interfaceC3977a, InterfaceC3977a interfaceC3977a2, InterfaceC3977a interfaceC3977a3) {
        g();
        this.f34744B.k().A(i10, true, false, str, interfaceC3977a == null ? null : m7.b.k(interfaceC3977a), interfaceC3977a2 == null ? null : m7.b.k(interfaceC3977a2), interfaceC3977a3 != null ? m7.b.k(interfaceC3977a3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreated(InterfaceC3977a interfaceC3977a, Bundle bundle, long j10) {
        g();
        onActivityCreatedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreatedByScionActivityInfo(C2481g1 c2481g1, Bundle bundle, long j10) {
        g();
        v7.V vV0 = this.f34744B.J().v0();
        if (vV0 != null) {
            this.f34744B.J().J0();
            vV0.d(c2481g1, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyed(InterfaceC3977a interfaceC3977a, long j10) {
        g();
        onActivityDestroyedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        g();
        v7.V vV0 = this.f34744B.J().v0();
        if (vV0 != null) {
            this.f34744B.J().J0();
            vV0.a(c2481g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPaused(InterfaceC3977a interfaceC3977a, long j10) {
        g();
        onActivityPausedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPausedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        g();
        v7.V vV0 = this.f34744B.J().v0();
        if (vV0 != null) {
            this.f34744B.J().J0();
            vV0.c(c2481g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumed(InterfaceC3977a interfaceC3977a, long j10) {
        g();
        onActivityResumedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        g();
        v7.V vV0 = this.f34744B.J().v0();
        if (vV0 != null) {
            this.f34744B.J().J0();
            vV0.b(c2481g1);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceState(InterfaceC3977a interfaceC3977a, com.google.android.gms.internal.measurement.U0 u02, long j10) {
        g();
        onActivitySaveInstanceStateByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), u02, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceStateByScionActivityInfo(C2481g1 c2481g1, com.google.android.gms.internal.measurement.U0 u02, long j10) {
        g();
        v7.V vV0 = this.f34744B.J().v0();
        Bundle bundle = new Bundle();
        if (vV0 != null) {
            this.f34744B.J().J0();
            vV0.e(c2481g1, bundle);
        }
        try {
            u02.h(bundle);
        } catch (RemoteException e10) {
            this.f34744B.k().M().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStarted(InterfaceC3977a interfaceC3977a, long j10) {
        g();
        onActivityStartedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStartedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        g();
        if (this.f34744B.J().v0() != null) {
            this.f34744B.J().J0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStopped(InterfaceC3977a interfaceC3977a, long j10) {
        g();
        onActivityStoppedByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStoppedByScionActivityInfo(C2481g1 c2481g1, long j10) {
        g();
        if (this.f34744B.J().v0() != null) {
            this.f34744B.J().J0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j10) {
        g();
        u02.h(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void registerOnMeasurementEventListener(InterfaceC2429a1 interfaceC2429a1) {
        v7.K bVar;
        g();
        synchronized (this.f34745C) {
            try {
                bVar = this.f34745C.get(Integer.valueOf(interfaceC2429a1.a()));
                if (bVar == null) {
                    bVar = new b(interfaceC2429a1);
                    this.f34745C.put(Integer.valueOf(interfaceC2429a1.a()), bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f34744B.J().s0(bVar);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void resetAnalyticsData(long j10) {
        g();
        this.f34744B.J().K(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.V0 v02) {
        g();
        if (this.f34744B.B().K(null, K.f34932M0)) {
            this.f34744B.J().g0(new Runnable() { // from class: v7.C
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.f51496B, v02);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        g();
        if (bundle == null) {
            this.f34744B.k().H().a("Conditional user property must not be null");
        } else {
            this.f34744B.J().O(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsent(Bundle bundle, long j10) {
        g();
        this.f34744B.J().U0(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        g();
        this.f34744B.J().e1(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreen(InterfaceC3977a interfaceC3977a, String str, String str2, long j10) {
        g();
        setCurrentScreenByScionActivityInfo(C2481g1.f0((Activity) C3445p.k((Activity) m7.b.k(interfaceC3977a))), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreenByScionActivityInfo(C2481g1 c2481g1, String str, String str2, long j10) {
        g();
        this.f34744B.M().I(c2481g1, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDataCollectionEnabled(boolean z10) {
        g();
        this.f34744B.J().i1(z10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        this.f34744B.J().T0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setEventInterceptor(InterfaceC2429a1 interfaceC2429a1) {
        g();
        a aVar = new a(interfaceC2429a1);
        if (this.f34744B.o().L()) {
            this.f34744B.J().r0(aVar);
        } else {
            this.f34744B.o().E(new I4(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setInstanceIdProvider(InterfaceC2438b1 interfaceC2438b1) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMeasurementEnabled(boolean z10, long j10) {
        g();
        this.f34744B.J().e0(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMinimumSessionDuration(long j10) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSessionTimeoutDuration(long j10) {
        g();
        this.f34744B.J().j1(j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSgtmDebugInfo(Intent intent) {
        g();
        this.f34744B.J().L(intent);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserId(String str, long j10) {
        g();
        this.f34744B.J().h0(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserProperty(String str, String str2, InterfaceC3977a interfaceC3977a, boolean z10, long j10) throws SecurityException {
        g();
        this.f34744B.J().q0(str, str2, m7.b.k(interfaceC3977a), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void unregisterOnMeasurementEventListener(InterfaceC2429a1 interfaceC2429a1) {
        v7.K kRemove;
        g();
        synchronized (this.f34745C) {
            kRemove = this.f34745C.remove(Integer.valueOf(interfaceC2429a1.a()));
        }
        if (kRemove == null) {
            kRemove = new b(interfaceC2429a1);
        }
        this.f34744B.J().b1(kRemove);
    }
}
