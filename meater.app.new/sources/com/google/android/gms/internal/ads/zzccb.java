package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccb extends zzafb {

    /* renamed from: f */
    private final String f24040f;

    /* renamed from: g */
    private final zzbyn f24041g;

    /* renamed from: h */
    private final zzbyt f24042h;

    public zzccb(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f24040f = str;
        this.f24041g = zzbynVar;
        this.f24042h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: D0 */
    public final zzaei mo16493D0() throws RemoteException {
        return this.f24042h.m18530X();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: E */
    public final boolean mo16494E(Bundle bundle) throws RemoteException {
        return this.f24041g.m18480A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: L */
    public final void mo16495L(Bundle bundle) throws RemoteException {
        this.f24041g.m18502z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void destroy() throws RemoteException {
        this.f24041g.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: f */
    public final zzaea mo16496f() throws RemoteException {
        return this.f24042h.m18528V();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: g */
    public final String mo16497g() throws RemoteException {
        return this.f24042h.m18539g();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final Bundle getExtras() throws RemoteException {
        return this.f24042h.m18538f();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f24040f;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaar getVideoController() throws RemoteException {
        return this.f24042h.m18545m();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: h */
    public final String mo16498h() throws RemoteException {
        return this.f24042h.m18536d();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: i */
    public final String mo16499i() throws RemoteException {
        return this.f24042h.m18535c();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: j */
    public final IObjectWrapper mo16500j() throws RemoteException {
        return this.f24042h.m18529W();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: k */
    public final List mo16501k() throws RemoteException {
        return this.f24042h.m18540h();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: r */
    public final IObjectWrapper mo16502r() throws RemoteException {
        return ObjectWrapper.m14708E0(this.f24041g);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: w */
    public final String mo16503w() throws RemoteException {
        return this.f24042h.m18534b();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: z */
    public final void mo16504z(Bundle bundle) throws RemoteException {
        this.f24041g.m18500w(bundle);
    }
}
