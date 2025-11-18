package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbol extends zzbnf {

    /* renamed from: f */
    private final zzaga f23360f;

    /* renamed from: g */
    private final Runnable f23361g;

    /* renamed from: h */
    private final Executor f23362h;

    public zzbol(zzaga zzagaVar, Runnable runnable, Executor executor) {
        this.f23360f = zzagaVar;
        this.f23361g = runnable;
        this.f23362h = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    /* renamed from: c */
    public final void mo16095c() {
        final AtomicReference atomicReference = new AtomicReference(this.f23361g);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.dd

            /* renamed from: f */
            private final AtomicReference f18683f;

            {
                this.f18683f = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.f18683f.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.f23362h.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.ed

            /* renamed from: f */
            private final zzbol f18813f;

            /* renamed from: g */
            private final Runnable f18814g;

            {
                this.f18813f = this;
                this.f18814g = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18813f.m17932m(this.f18814g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: g */
    public final zzaar mo16096g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: h */
    public final void mo16097h(ViewGroup viewGroup, zzyd zzydVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: i */
    public final View mo16098i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: j */
    public final zzcxn mo16099j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: k */
    public final int mo16100k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    /* renamed from: l */
    public final void mo16101l() {
    }

    /* renamed from: m */
    final /* synthetic */ void m17932m(Runnable runnable) {
        try {
            if (this.f23360f.mo16533W2(ObjectWrapper.m14708E0(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
