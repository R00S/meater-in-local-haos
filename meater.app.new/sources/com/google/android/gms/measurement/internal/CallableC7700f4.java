package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* loaded from: classes2.dex */
final class CallableC7700f4 implements Callable<List<C7766m7>> {

    /* renamed from: f */
    private final /* synthetic */ String f28628f;

    /* renamed from: g */
    private final /* synthetic */ String f28629g;

    /* renamed from: h */
    private final /* synthetic */ String f28630h;

    /* renamed from: i */
    private final /* synthetic */ zzgc f28631i;

    CallableC7700f4(zzgc zzgcVar, String str, String str2, String str3) {
        this.f28631i = zzgcVar;
        this.f28628f = str;
        this.f28629g = str2;
        this.f28630h = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C7766m7> call() throws Exception {
        this.f28631i.f29304f.m23453e0();
        return this.f28631i.f29304f.m23445W().m22734K(this.f28628f, this.f28629g, this.f28630h);
    }
}
