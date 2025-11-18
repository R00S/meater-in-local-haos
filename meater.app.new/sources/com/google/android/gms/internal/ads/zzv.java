package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzv {

    /* renamed from: a */
    private final AtomicInteger f27191a;

    /* renamed from: b */
    private final Set<zzr<?>> f27192b;

    /* renamed from: c */
    private final PriorityBlockingQueue<zzr<?>> f27193c;

    /* renamed from: d */
    private final PriorityBlockingQueue<zzr<?>> f27194d;

    /* renamed from: e */
    private final zzb f27195e;

    /* renamed from: f */
    private final zzm f27196f;

    /* renamed from: g */
    private final zzab f27197g;

    /* renamed from: h */
    private final zzn[] f27198h;

    /* renamed from: i */
    private zzd f27199i;

    /* renamed from: j */
    private final List<zzx> f27200j;

    /* renamed from: k */
    private final List<zzw> f27201k;

    private zzv(zzb zzbVar, zzm zzmVar, int i2, zzab zzabVar) {
        this.f27191a = new AtomicInteger();
        this.f27192b = new HashSet();
        this.f27193c = new PriorityBlockingQueue<>();
        this.f27194d = new PriorityBlockingQueue<>();
        this.f27200j = new ArrayList();
        this.f27201k = new ArrayList();
        this.f27195e = zzbVar;
        this.f27196f = zzmVar;
        this.f27198h = new zzn[4];
        this.f27197g = zzabVar;
    }

    /* renamed from: a */
    public final void m20645a() {
        zzd zzdVar = this.f27199i;
        if (zzdVar != null) {
            zzdVar.m19121b();
        }
        for (zzn zznVar : this.f27198h) {
            if (zznVar != null) {
                zznVar.m20302b();
            }
        }
        zzd zzdVar2 = new zzd(this.f27193c, this.f27194d, this.f27195e, this.f27197g);
        this.f27199i = zzdVar2;
        zzdVar2.start();
        for (int i2 = 0; i2 < this.f27198h.length; i2++) {
            zzn zznVar2 = new zzn(this.f27194d, this.f27196f, this.f27195e, this.f27197g);
            this.f27198h[i2] = zznVar2;
            zznVar2.start();
        }
    }

    /* renamed from: b */
    final void m20646b(zzr<?> zzrVar, int i2) {
        synchronized (this.f27201k) {
            Iterator<zzw> it = this.f27201k.iterator();
            while (it.hasNext()) {
                it.next().m20682a(zzrVar, i2);
            }
        }
    }

    /* renamed from: c */
    public final <T> zzr<T> m20647c(zzr<T> zzrVar) {
        zzrVar.m20433x(this);
        synchronized (this.f27192b) {
            this.f27192b.add(zzrVar);
        }
        zzrVar.m20416G(this.f27191a.incrementAndGet());
        zzrVar.m20418I("add-to-queue");
        m20646b(zzrVar, 0);
        if (zzrVar.m20423P()) {
            this.f27193c.add(zzrVar);
            return zzrVar;
        }
        this.f27194d.add(zzrVar);
        return zzrVar;
    }

    /* renamed from: d */
    final <T> void m20648d(zzr<T> zzrVar) {
        synchronized (this.f27192b) {
            this.f27192b.remove(zzrVar);
        }
        synchronized (this.f27200j) {
            Iterator<zzx> it = this.f27200j.iterator();
            while (it.hasNext()) {
                it.next().m20812a(zzrVar);
            }
        }
        m20646b(zzrVar, 5);
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i2) {
        this(zzbVar, zzmVar, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    public zzv(zzb zzbVar, zzm zzmVar) {
        this(zzbVar, zzmVar, 4);
    }
}
