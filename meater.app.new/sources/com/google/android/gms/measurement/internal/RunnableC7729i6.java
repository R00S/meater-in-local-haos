package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes2.dex */
final class RunnableC7729i6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28705f;

    /* renamed from: g */
    private final /* synthetic */ String f28706g;

    /* renamed from: h */
    private final /* synthetic */ String f28707h;

    /* renamed from: i */
    private final /* synthetic */ String f28708i;

    /* renamed from: j */
    private final /* synthetic */ zzm f28709j;

    /* renamed from: k */
    private final /* synthetic */ zzik f28710k;

    RunnableC7729i6(zzik zzikVar, AtomicReference atomicReference, String str, String str2, String str3, zzm zzmVar) {
        this.f28710k = zzikVar;
        this.f28705f = atomicReference;
        this.f28706g = str;
        this.f28707h = str2;
        this.f28708i = str3;
        this.f28709j = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar;
        synchronized (this.f28705f) {
            try {
                try {
                    zzelVar = this.f28710k.f29339d;
                } catch (RemoteException e2) {
                    this.f28710k.mo22836h().m23137H().m23150d("Failed to get conditional properties", zzet.m23131x(this.f28706g), this.f28707h, e2);
                    this.f28705f.set(Collections.emptyList());
                }
                if (zzelVar == null) {
                    this.f28710k.mo22836h().m23137H().m23150d("Failed to get conditional properties", zzet.m23131x(this.f28706g), this.f28707h, this.f28708i);
                    this.f28705f.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f28706g)) {
                    this.f28705f.set(zzelVar.mo23079A2(this.f28707h, this.f28708i, this.f28709j));
                } else {
                    this.f28705f.set(zzelVar.mo23093r3(this.f28706g, this.f28707h, this.f28708i));
                }
                this.f28710k.m23350d0();
                this.f28705f.notify();
            } finally {
                this.f28705f.notify();
            }
        }
    }
}
