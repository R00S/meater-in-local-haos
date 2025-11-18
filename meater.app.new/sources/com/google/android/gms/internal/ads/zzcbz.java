package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcbz extends zzaex {

    /* renamed from: f */
    private final String f24027f;

    /* renamed from: g */
    private final zzbyn f24028g;

    /* renamed from: h */
    private final zzbyt f24029h;

    public zzcbz(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f24027f = str;
        this.f24028g = zzbynVar;
        this.f24029h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: E */
    public final boolean mo16478E(Bundle bundle) throws RemoteException {
        return this.f24028g.m18480A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: L */
    public final void mo16479L(Bundle bundle) throws RemoteException {
        this.f24028g.m18502z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void destroy() throws RemoteException {
        this.f24028g.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: f */
    public final zzaea mo16480f() throws RemoteException {
        return this.f24029h.m18528V();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: g */
    public final String mo16481g() throws RemoteException {
        return this.f24029h.m18539g();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Bundle getExtras() throws RemoteException {
        return this.f24029h.m18538f();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f24027f;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final String getStore() throws RemoteException {
        return this.f24029h.m18544l();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final zzaar getVideoController() throws RemoteException {
        return this.f24029h.m18545m();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: h */
    public final String mo16482h() throws RemoteException {
        return this.f24029h.m18536d();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: i */
    public final String mo16483i() throws RemoteException {
        return this.f24029h.m18535c();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: j */
    public final IObjectWrapper mo16484j() throws RemoteException {
        return this.f24029h.m18529W();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: k */
    public final List mo16485k() throws RemoteException {
        return this.f24029h.m18540h();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: n */
    public final zzaei mo16486n() throws RemoteException {
        return this.f24029h.m18527U();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: o */
    public final String mo16487o() throws RemoteException {
        return this.f24029h.m18542j();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: r */
    public final IObjectWrapper mo16488r() throws RemoteException {
        return ObjectWrapper.m14708E0(this.f24028g);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: t */
    public final double mo16489t() throws RemoteException {
        return this.f24029h.m18543k();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    /* renamed from: z */
    public final void mo16490z(Bundle bundle) throws RemoteException {
        this.f24028g.m18500w(bundle);
    }
}
