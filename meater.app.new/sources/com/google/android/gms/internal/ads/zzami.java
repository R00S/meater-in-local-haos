package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzami extends zzbjg {

    /* renamed from: f */
    private static final AtomicBoolean f22122f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AppMeasurementSdk f22123g;

    private zzami(AppMeasurementSdk appMeasurementSdk) {
        this.f22123g = appMeasurementSdk;
    }

    /* renamed from: h7 */
    public static void m16670h7(final Context context, final String str) {
        if (f22122f.compareAndSet(false, true)) {
            new Thread(new Runnable(context, str) { // from class: com.google.android.gms.internal.ads.q2

                /* renamed from: f */
                private final Context f20368f;

                /* renamed from: g */
                private final String f20369g;

                {
                    this.f20368f = context;
                    this.f20369g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzami.m16671i7(this.f20368f, this.f20369g);
                }
            }).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: i7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final /* synthetic */ void m16671i7(android.content.Context r3, java.lang.String r4) {
        /*
            com.google.android.gms.internal.ads.zzacu.m16423a(r3)
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f21635H0
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r0 = r1.m16421c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2a
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f21629G0
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r0 = r1.m16421c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L28
            goto L2a
        L28:
            r0 = 0
            goto L2b
        L2a:
            r0 = 1
        L2b:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "measurementEnabled"
            r1.putBoolean(r2, r0)
            java.lang.String r0 = "Ads"
            java.lang.String r2 = "am"
            com.google.android.gms.measurement.api.AppMeasurementSdk r4 = com.google.android.gms.measurement.api.AppMeasurementSdk.m22674k(r3, r0, r2, r4, r1)
            com.google.android.gms.internal.ads.zzami r0 = new com.google.android.gms.internal.ads.zzami
            r0.<init>(r4)
            java.lang.String r4 = "com.google.android.gms.ads.measurement.DynamiteMeasurementManager"
            com.google.android.gms.internal.ads.zzbaf r1 = com.google.android.gms.internal.ads.C7102r2.f20424a     // Catch: android.os.RemoteException -> L50 java.lang.NullPointerException -> L52 com.google.android.gms.internal.ads.zzbag -> L54
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbae.m17356a(r3, r4, r1)     // Catch: android.os.RemoteException -> L50 java.lang.NullPointerException -> L52 com.google.android.gms.internal.ads.zzbag -> L54
            com.google.android.gms.internal.ads.zzbjh r3 = (com.google.android.gms.internal.ads.zzbjh) r3     // Catch: android.os.RemoteException -> L50 java.lang.NullPointerException -> L52 com.google.android.gms.internal.ads.zzbag -> L54
            r3.mo17773A1(r0)     // Catch: android.os.RemoteException -> L50 java.lang.NullPointerException -> L52 com.google.android.gms.internal.ads.zzbag -> L54
            return
        L50:
            r3 = move-exception
            goto L55
        L52:
            r3 = move-exception
            goto L55
        L54:
            r3 = move-exception
        L55:
            java.lang.String r4 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbad.m17350f(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzami.m16671i7(android.content.Context, java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: E2 */
    public final long mo16672E2() throws RemoteException {
        return this.f22123g.m22678d();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: I3 */
    public final int mo16673I3(String str) throws RemoteException {
        return this.f22123g.m22685l(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: J2 */
    public final String mo16674J2() throws RemoteException {
        return this.f22123g.m22683i();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: L4 */
    public final List mo16675L4(String str, String str2) throws RemoteException {
        return this.f22123g.m22681g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: N5 */
    public final void mo16676N5(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f22123g.m22692s(str, str2, iObjectWrapper != null ? ObjectWrapper.m14709k0(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: O4 */
    public final String mo16677O4() throws RemoteException {
        return this.f22123g.m22682h();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: O5 */
    public final void mo16678O5(String str) throws RemoteException {
        this.f22123g.m22675a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: Q4 */
    public final void mo16679Q4(Bundle bundle) throws RemoteException {
        this.f22123g.m22690q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: V6 */
    public final void mo16680V6(String str) throws RemoteException {
        this.f22123g.m22677c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.f22123g.m22676b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: d4 */
    public final Map mo16681d4(String str, String str2, boolean z) throws RemoteException {
        return this.f22123g.m22686m(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: e1 */
    public final void mo16682e1(Bundle bundle) throws RemoteException {
        this.f22123g.m22688o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: g2 */
    public final String mo16683g2() throws RemoteException {
        return this.f22123g.m22680f();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: l4 */
    public final String mo16684l4() throws RemoteException {
        return this.f22123g.m22679e();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: m0 */
    public final void mo16685m0(String str, String str2, Bundle bundle) throws RemoteException {
        this.f22123g.m22687n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: o4 */
    public final String mo16686o4() throws RemoteException {
        return this.f22123g.m22684j();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: s2 */
    public final Bundle mo16687s2(Bundle bundle) throws RemoteException {
        return this.f22123g.m22689p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    /* renamed from: z4 */
    public final void mo16688z4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f22123g.m22691r(iObjectWrapper != null ? (Activity) ObjectWrapper.m14709k0(iObjectWrapper) : null, str, str2);
    }
}
