package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.android.gms.internal.ads.j7 */
/* loaded from: classes2.dex */
final class C6811j7<T> implements zzban<T> {

    /* renamed from: a */
    private final /* synthetic */ zzbbv f19462a;

    /* renamed from: b */
    private final /* synthetic */ zzbbt f19463b;

    C6811j7(zzbbw zzbbwVar, zzbbv zzbbvVar, zzbbt zzbbtVar) {
        this.f19462a = zzbbvVar;
        this.f19463b = zzbbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        this.f19463b.run();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final void mo14743b(T t) {
        this.f19462a.mo14740a(t);
    }
}
