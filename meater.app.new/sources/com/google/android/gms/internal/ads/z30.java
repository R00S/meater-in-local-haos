package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class z30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f21359f;

    /* renamed from: g */
    private final /* synthetic */ int f21360g;

    /* renamed from: h */
    private final /* synthetic */ int f21361h;

    /* renamed from: i */
    private final /* synthetic */ float f21362i;

    /* renamed from: j */
    private final /* synthetic */ zzto f21363j;

    z30(zzto zztoVar, int i2, int i3, int i4, float f2) {
        this.f21363j = zztoVar;
        this.f21359f = i2;
        this.f21360g = i3;
        this.f21361h = i4;
        this.f21362i = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21363j.f27098b.mo17602m(this.f21359f, this.f21360g, this.f21361h, this.f21362i);
    }
}
