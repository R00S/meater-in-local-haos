package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yc */
/* loaded from: classes2.dex */
final class C7371yc extends zzbnf {

    /* renamed from: f */
    private final Context f21288f;

    /* renamed from: g */
    private final View f21289g;

    /* renamed from: h */
    private final zzbgz f21290h;

    /* renamed from: i */
    private final zzcxn f21291i;

    /* renamed from: j */
    private final zzbpb f21292j;

    /* renamed from: k */
    private final zzbzc f21293k;

    /* renamed from: l */
    private final zzbvd f21294l;

    /* renamed from: m */
    private final zzdte<zzcpm> f21295m;

    /* renamed from: n */
    private final Executor f21296n;

    C7371yc(Context context, zzcxn zzcxnVar, View view, zzbgz zzbgzVar, zzbpb zzbpbVar, zzbzc zzbzcVar, zzbvd zzbvdVar, zzdte<zzcpm> zzdteVar, Executor executor) {
        this.f21288f = context;
        this.f21289g = view;
        this.f21290h = zzbgzVar;
        this.f21291i = zzcxnVar;
        this.f21292j = zzbpbVar;
        this.f21293k = zzbzcVar;
        this.f21294l = zzbvdVar;
        this.f21295m = zzdteVar;
        this.f21296n = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: c */
    public final void mo16095c() {
        this.f21296n.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zc

            /* renamed from: f */
            private final C7371yc f21449f;

            {
                this.f21449f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f21449f.m16102m();
            }
        });
        super.mo16095c();
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: g */
    public final zzaar mo16096g() {
        try {
            return this.f21292j.getVideoController();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: h */
    public final void mo16097h(ViewGroup viewGroup, zzyd zzydVar) {
        zzbgz zzbgzVar;
        if (viewGroup == null || (zzbgzVar = this.f21290h) == null) {
            return;
        }
        zzbgzVar.mo14874A(zzbin.m17738i(zzydVar));
        viewGroup.setMinimumHeight(zzydVar.f27449h);
        viewGroup.setMinimumWidth(zzydVar.f27452k);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: i */
    public final View mo16098i() {
        return this.f21289g;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: j */
    public final zzcxn mo16099j() {
        return this.f23440b.f25257o.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: k */
    public final int mo16100k() {
        return this.f23439a.f25289b.f25284b.f25274c;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: l */
    public final void mo16101l() {
        this.f21294l.m18391Y();
    }

    /* renamed from: m */
    final /* synthetic */ void m16102m() {
        if (this.f21293k.m18565d() != null) {
            try {
                this.f21293k.m18565d().mo16522h1(this.f21295m.get(), ObjectWrapper.m14708E0(this.f21288f));
            } catch (RemoteException e2) {
                zzbad.m17347c("RemoteException when notifyAdLoad is called", e2);
            }
        }
    }
}
