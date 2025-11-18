package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.a */
/* loaded from: classes2.dex */
final class C7473a extends zzx.AbstractRunnableC7633a {

    /* renamed from: j */
    private final /* synthetic */ String f27679j;

    /* renamed from: k */
    private final /* synthetic */ String f27680k;

    /* renamed from: l */
    private final /* synthetic */ Context f27681l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f27682m;

    /* renamed from: n */
    private final /* synthetic */ zzx f27683n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7473a(zzx zzxVar, String str, String str2, Context context, Bundle bundle) {
        super(zzxVar);
        this.f27683n = zzxVar;
        this.f27679j = str;
        this.f27680k = str2;
        this.f27681l = context;
        this.f27682m = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.AbstractRunnableC7633a
    /* renamed from: a */
    public final void mo20969a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int iMax;
        try {
            this.f27683n.f28407l = new ArrayList();
            zzx zzxVar = this.f27683n;
            if (zzx.m22566J(this.f27679j, this.f27680k)) {
                String str4 = this.f27680k;
                str2 = this.f27679j;
                str3 = str4;
                str = this.f27683n.f28403h;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            zzx.m22573W(this.f27681l);
            boolean z2 = zzx.f28398c.booleanValue() || str2 != null;
            zzx zzxVar2 = this.f27683n;
            zzxVar2.f28411p = zzxVar2.m22603b(this.f27681l, z2);
            if (this.f27683n.f28411p == null) {
                Log.w(this.f27683n.f28403h, "Failed to connect to measurement client.");
                return;
            }
            int iM22572U = zzx.m22572U(this.f27681l);
            int iM22571S = zzx.m22571S(this.f27681l);
            if (z2) {
                iMax = Math.max(iM22572U, iM22571S);
                z = iM22571S < iM22572U;
            } else {
                if (iM22572U > 0) {
                    iM22571S = iM22572U;
                }
                z = iM22572U > 0;
                iMax = iM22571S;
            }
            this.f27683n.f28411p.initialize(ObjectWrapper.m14708E0(this.f27681l), new zzv(18202L, iMax, z, str, str2, str3, this.f27682m), this.f28412f);
        } catch (RemoteException e2) {
            this.f27683n.m22583p(e2, true, false);
        }
    }
}
