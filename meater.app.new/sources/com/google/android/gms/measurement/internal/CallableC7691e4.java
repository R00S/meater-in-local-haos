package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* loaded from: classes2.dex */
final class CallableC7691e4 implements Callable<List<zzv>> {

    /* renamed from: f */
    private final /* synthetic */ zzm f28612f;

    /* renamed from: g */
    private final /* synthetic */ String f28613g;

    /* renamed from: h */
    private final /* synthetic */ String f28614h;

    /* renamed from: i */
    private final /* synthetic */ zzgc f28615i;

    CallableC7691e4(zzgc zzgcVar, zzm zzmVar, String str, String str2) {
        this.f28615i = zzgcVar;
        this.f28612f = zzmVar;
        this.f28613g = str;
        this.f28614h = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() throws Exception {
        this.f28615i.f29304f.m23453e0();
        return this.f28615i.f29304f.m23445W().m22747k0(this.f28612f.f29401f, this.f28613g, this.f28614h);
    }
}
