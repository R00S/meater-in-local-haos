package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* loaded from: classes2.dex */
final class C7694e7 extends AbstractC7695f {

    /* renamed from: e */
    private final /* synthetic */ zzkc f28619e;

    /* renamed from: f */
    private final /* synthetic */ zzjy f28620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7694e7(zzjy zzjyVar, InterfaceC7817s4 interfaceC7817s4, zzkc zzkcVar) {
        super(interfaceC7817s4);
        this.f28620f = zzjyVar;
        this.f28619e = zzkcVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7695f
    /* renamed from: b */
    public final void mo22703b() {
        this.f28620f.m23405x();
        this.f28620f.mo22836h().m23145P().m23147a("Starting upload from DelayedRunnable");
        this.f28619e.m23452d0();
    }
}
