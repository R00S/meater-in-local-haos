package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zaah implements zabd {

    /* renamed from: a */
    private final zabe f17483a;

    /* renamed from: b */
    private boolean f17484b = false;

    public zaah(zabe zabeVar) {
        this.f17483a = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: H */
    public final void mo14119H(int i2) {
        this.f17483a.m14181m(null);
        this.f17483a.f17547t.mo14104c(i2, this.f17484b);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: P */
    public final void mo14120P(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: a */
    public final void mo14121a() {
        if (this.f17484b) {
            this.f17484b = false;
            this.f17483a.m14177h(new C6366f(this, this));
        }
    }

    /* renamed from: c */
    final void m14122c() {
        if (this.f17484b) {
            this.f17484b = false;
            this.f17483a.f17546s.f17530y.m14203a();
            disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: d */
    public final void mo14123d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        if (this.f17484b) {
            return false;
        }
        if (!this.f17483a.f17546s.m14169F()) {
            this.f17483a.m14181m(null);
            return true;
        }
        this.f17484b = true;
        Iterator<zacm> it = this.f17483a.f17546s.f17529x.iterator();
        while (it.hasNext()) {
            it.next().m14202d();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: k0 */
    public final void mo14124k0(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14125l0(T t) {
        try {
            this.f17483a.f17546s.f17530y.m14204b(t);
            zaaw zaawVar = this.f17483a.f17546s;
            Api.Client client = zaawVar.f17521p.get(t.m13931u());
            Preconditions.m14373l(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.f17483a.f17539l.containsKey(t.m13931u())) {
                boolean z = client instanceof SimpleClientAdapter;
                A aM14400j = client;
                if (z) {
                    aM14400j = ((SimpleClientAdapter) client).m14400j();
                }
                t.m13933w(aM14400j);
            } else {
                t.m13934y(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f17483a.m14177h(new C6364e(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14126m0(T t) {
        return (T) mo14125l0(t);
    }
}
