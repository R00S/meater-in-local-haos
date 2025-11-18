package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* loaded from: classes2.dex */
final class RunnableC7756l6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28752f;

    /* renamed from: g */
    private final /* synthetic */ String f28753g;

    /* renamed from: h */
    private final /* synthetic */ String f28754h;

    /* renamed from: i */
    private final /* synthetic */ String f28755i;

    /* renamed from: j */
    private final /* synthetic */ boolean f28756j;

    /* renamed from: k */
    private final /* synthetic */ zzm f28757k;

    /* renamed from: l */
    private final /* synthetic */ zzik f28758l;

    RunnableC7756l6(zzik zzikVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzmVar) {
        this.f28758l = zzikVar;
        this.f28752f = atomicReference;
        this.f28753g = str;
        this.f28754h = str2;
        this.f28755i = str3;
        this.f28756j = z;
        this.f28757k = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzel zzelVar;
        synchronized (this.f28752f) {
            try {
                try {
                    zzelVar = this.f28758l.f29339d;
                } finally {
                    this.f28752f.notify();
                }
            } catch (RemoteException e2) {
                this.f28758l.mo22836h().m23137H().m23150d("Failed to get user properties", zzet.m23131x(this.f28753g), this.f28754h, e2);
                this.f28752f.set(Collections.emptyList());
            }
            if (zzelVar == null) {
                this.f28758l.mo22836h().m23137H().m23150d("Failed to get user properties", zzet.m23131x(this.f28753g), this.f28754h, this.f28755i);
                this.f28752f.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f28753g)) {
                this.f28752f.set(zzelVar.mo23088f3(this.f28754h, this.f28755i, this.f28756j, this.f28757k));
            } else {
                this.f28752f.set(zzelVar.mo23081K1(this.f28753g, this.f28754h, this.f28755i, this.f28756j));
            }
            this.f28758l.m23350d0();
            this.f28752f.notify();
        }
    }
}
