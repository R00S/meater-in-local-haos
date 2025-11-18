package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzccg extends zzagh {

    /* renamed from: f */
    private final String f24054f;

    /* renamed from: g */
    private final zzbyn f24055g;

    /* renamed from: h */
    private final zzbyt f24056h;

    public zzccg(String str, zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f24054f = str;
        this.f24055g = zzbynVar;
        this.f24056h = zzbytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: D6 */
    public final void mo16535D6() {
        this.f24055g.m18485h();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: E */
    public final boolean mo16536E(Bundle bundle) throws RemoteException {
        return this.f24055g.m18480A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: G0 */
    public final void mo16537G0(zzaag zzaagVar) throws RemoteException {
        this.f24055g.m18489l(zzaagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: L */
    public final void mo16538L(Bundle bundle) throws RemoteException {
        this.f24055g.m18502z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: W */
    public final void mo16539W() throws RemoteException {
        this.f24055g.m18484g();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: d0 */
    public final void mo16540d0(zzagd zzagdVar) throws RemoteException {
        this.f24055g.m18491n(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void destroy() throws RemoteException {
        this.f24055g.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: e0 */
    public final void mo16541e0(zzaak zzaakVar) throws RemoteException {
        this.f24055g.m18490m(zzaakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: f */
    public final zzaea mo16542f() throws RemoteException {
        return this.f24056h.m18528V();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: g */
    public final String mo16543g() throws RemoteException {
        return this.f24056h.m18539g();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final Bundle getExtras() throws RemoteException {
        return this.f24056h.m18538f();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f24054f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getStore() throws RemoteException {
        return this.f24056h.m18544l();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaar getVideoController() throws RemoteException {
        return this.f24056h.m18545m();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: h */
    public final String mo16544h() throws RemoteException {
        return this.f24056h.m18536d();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: i */
    public final String mo16545i() throws RemoteException {
        return this.f24056h.m18535c();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j */
    public final IObjectWrapper mo16546j() throws RemoteException {
        return this.f24056h.m18529W();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j0 */
    public final void mo16547j0() {
        this.f24055g.m18481B();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: k */
    public final List mo16548k() throws RemoteException {
        return this.f24056h.m18540h();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n */
    public final zzaei mo16549n() throws RemoteException {
        return this.f24056h.m18527U();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n2 */
    public final zzaee mo16550n2() throws RemoteException {
        return this.f24055g.m18482C();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: o */
    public final String mo16551o() throws RemoteException {
        return this.f24056h.m18542j();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: r */
    public final IObjectWrapper mo16552r() throws RemoteException {
        return ObjectWrapper.m14708E0(this.f24055g);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: t */
    public final double mo16553t() throws RemoteException {
        return this.f24056h.m18543k();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u2 */
    public final boolean mo16554u2() throws RemoteException {
        return (this.f24056h.m18541i().isEmpty() || this.f24056h.m18554y() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u4 */
    public final List mo16555u4() throws RemoteException {
        return mo16554u2() ? this.f24056h.m18541i() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: w */
    public final String mo16556w() throws RemoteException {
        return this.f24056h.m18534b();
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: z */
    public final void mo16557z(Bundle bundle) throws RemoteException {
        this.f24055g.m18500w(bundle);
    }
}
