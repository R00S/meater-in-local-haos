package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzl;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzt;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
@DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends zzl {

    /* renamed from: f */
    @VisibleForTesting
    zzfx f28531f = null;

    /* renamed from: g */
    private Map<Integer, zzha> f28532g = new C0867a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C7648a implements zzgx {

        /* renamed from: a */
        private zzs f28533a;

        C7648a(zzs zzsVar) {
            this.f28533a = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzgx
        /* renamed from: a */
        public final void mo22695a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f28533a.mo22562q4(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f28531f.mo22836h().m23140K().m23148b("Event interceptor threw exception", e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C7649b implements zzha {

        /* renamed from: a */
        private zzs f28535a;

        C7649b(zzs zzsVar) {
            this.f28535a = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzha
        /* renamed from: a */
        public final void mo22696a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f28535a.mo22562q4(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f28531f.mo22836h().m23140K().m23148b("Event listener threw exception", e2);
            }
        }
    }

    /* renamed from: P */
    private final void m22693P(zzn zznVar, String str) {
        this.f28531f.m23217I().m23533P(zznVar, str);
    }

    /* renamed from: a */
    private final void m22694a() {
        if (this.f28531f == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void beginAdUnitExposure(String str, long j2) throws RemoteException {
        m22694a();
        this.f28531f.m23229U().m23078z(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23305y0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void endAdUnitExposure(String str, long j2) throws RemoteException {
        m22694a();
        this.f28531f.m23229U().m23076D(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void generateEventId(zzn zznVar) throws RemoteException {
        m22694a();
        this.f28531f.m23217I().m23531N(zznVar, this.f28531f.m23217I().m23552w0());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getAppInstanceId(zzn zznVar) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.mo22835g().m23201z(new RunnableC7791p5(this, zznVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCachedAppInstanceId(zzn zznVar) throws RemoteException {
        m22694a();
        m22693P(zznVar, this.f28531f.m23216H().m23295g0());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getConditionalUserProperties(String str, String str2, zzn zznVar) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.mo22835g().m23201z(new RunnableC7747k6(this, zznVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenClass(zzn zznVar) throws RemoteException {
        m22694a();
        m22693P(zznVar, this.f28531f.m23216H().m23298j0());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenName(zzn zznVar) throws RemoteException {
        m22694a();
        m22693P(zznVar, this.f28531f.m23216H().m23297i0());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getGmpAppId(zzn zznVar) throws RemoteException {
        m22694a();
        m22693P(zznVar, this.f28531f.m23216H().m23299k0());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getMaxUserProperties(String str, zzn zznVar) throws RemoteException {
        m22694a();
        this.f28531f.m23216H();
        Preconditions.m14368g(str);
        this.f28531f.m23217I().m23530M(zznVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getTestFlag(zzn zznVar, int i2) throws RemoteException {
        m22694a();
        if (i2 == 0) {
            this.f28531f.m23217I().m23533P(zznVar, this.f28531f.m23216H().m23291c0());
            return;
        }
        if (i2 == 1) {
            this.f28531f.m23217I().m23531N(zznVar, this.f28531f.m23216H().m23292d0().longValue());
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.f28531f.m23217I().m23530M(zznVar, this.f28531f.m23216H().m23293e0().intValue());
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.f28531f.m23217I().m23535R(zznVar, this.f28531f.m23216H().m23290b0().booleanValue());
                return;
            }
        }
        zzkk zzkkVarM23217I = this.f28531f.m23217I();
        double dDoubleValue = this.f28531f.m23216H().m23294f0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            zzkkVarM23217I.f28874a.mo22836h().m23140K().m23148b("Error returning double value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getUserProperties(String str, String str2, boolean z, zzn zznVar) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.mo22835g().m23201z(new RunnableC7712g7(this, zznVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initForTests(Map map) throws RemoteException {
        m22694a();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzv zzvVar, long j2) throws RemoteException {
        Context context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
        zzfx zzfxVar = this.f28531f;
        if (zzfxVar == null) {
            this.f28531f = zzfx.m23203a(context, zzvVar);
        } else {
            zzfxVar.mo22836h().m23140K().m23147a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void isDataCollectionEnabled(zzn zznVar) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.mo22835g().m23201z(new RunnableC7793p7(this, zznVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23283U(str, str2, bundle, z, z2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzn zznVar, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        Preconditions.m14368g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f28531f.mo22835g().m23201z(new RunnableC7826t4(this, zznVar, new zzan(str2, new zzam(bundle), "app", j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.mo22836h().m23135B(i2, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.m14709k0(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.m14709k0(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.m14709k0(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityCreated((Activity) ObjectWrapper.m14709k0(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityDestroyed((Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityPaused((Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityResumed((Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzn zznVar, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        Bundle bundle = new Bundle();
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivitySaveInstanceState((Activity) ObjectWrapper.m14709k0(iObjectWrapper), bundle);
        }
        try {
            zznVar.mo22444J(bundle);
        } catch (RemoteException e2) {
            this.f28531f.mo22836h().m23140K().m23148b("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityStarted((Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        m22694a();
        C7755l5 c7755l5 = this.f28531f.m23216H().f29321c;
        if (c7755l5 != null) {
            this.f28531f.m23216H().m23289a0();
            c7755l5.onActivityStopped((Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void performAction(Bundle bundle, zzn zznVar, long j2) throws RemoteException {
        m22694a();
        zznVar.mo22444J(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void registerOnMeasurementEventListener(zzs zzsVar) throws RemoteException {
        m22694a();
        zzha c7649b = this.f28532g.get(Integer.valueOf(zzsVar.mo22561a()));
        if (c7649b == null) {
            c7649b = new C7649b(zzsVar);
            this.f28532g.put(Integer.valueOf(zzsVar.mo22561a()), c7649b);
        }
        this.f28531f.m23216H().m23277K(c7649b);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void resetAnalyticsData(long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23306z0(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setConditionalUserProperty(Bundle bundle, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        if (bundle == null) {
            this.f28531f.mo22836h().m23137H().m23147a("Conditional user property must not be null");
        } else {
            this.f28531f.m23216H().m23275I(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23225Q().m23336F((Activity) ObjectWrapper.m14709k0(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setDataCollectionEnabled(boolean z) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23304w0(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setEventInterceptor(zzs zzsVar) throws IllegalStateException, RemoteException {
        m22694a();
        zzhc zzhcVarM23216H = this.f28531f.m23216H();
        C7648a c7648a = new C7648a(zzsVar);
        zzhcVarM23216H.mo22790b();
        zzhcVarM23216H.m22857x();
        zzhcVarM23216H.mo22835g().m23201z(new RunnableC7656a5(zzhcVarM23216H, c7648a));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setInstanceIdProvider(zzt zztVar) throws RemoteException {
        m22694a();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMeasurementEnabled(boolean z, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23288Z(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMinimumSessionDuration(long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23273F(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setSessionTimeoutDuration(long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23300o0(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserId(String str, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23286X(null, "_id", str, true, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) throws IllegalStateException, RemoteException {
        m22694a();
        this.f28531f.m23216H().m23286X(str, str2, ObjectWrapper.m14709k0(iObjectWrapper), z, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void unregisterOnMeasurementEventListener(zzs zzsVar) throws RemoteException {
        m22694a();
        zzha zzhaVarRemove = this.f28532g.remove(Integer.valueOf(zzsVar.mo22561a()));
        if (zzhaVarRemove == null) {
            zzhaVarRemove = new C7649b(zzsVar);
        }
        this.f28531f.m23216H().m23302r0(zzhaVarRemove);
    }
}
