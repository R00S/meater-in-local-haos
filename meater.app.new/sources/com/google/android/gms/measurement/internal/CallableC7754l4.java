package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes2.dex */
final class CallableC7754l4 implements Callable<byte[]> {

    /* renamed from: f */
    private final /* synthetic */ zzan f28748f;

    /* renamed from: g */
    private final /* synthetic */ String f28749g;

    /* renamed from: h */
    private final /* synthetic */ zzgc f28750h;

    CallableC7754l4(zzgc zzgcVar, zzan zzanVar, String str) {
        this.f28750h = zzgcVar;
        this.f28748f = zzanVar;
        this.f28749g = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        this.f28750h.f29304f.m23453e0();
        return this.f28750h.f29304f.m23447Y().m22851w(this.f28748f, this.f28749g);
    }
}
