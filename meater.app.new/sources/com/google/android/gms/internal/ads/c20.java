package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class c20 {

    /* renamed from: a */
    public final int f18381a;

    /* renamed from: b */
    public int f18382b;

    /* renamed from: c */
    public int f18383c;

    /* renamed from: d */
    public long f18384d;

    /* renamed from: e */
    private final boolean f18385e;

    /* renamed from: f */
    private final zzst f18386f;

    /* renamed from: g */
    private final zzst f18387g;

    /* renamed from: h */
    private int f18388h;

    /* renamed from: i */
    private int f18389i;

    public c20(zzst zzstVar, zzst zzstVar2, boolean z) {
        this.f18387g = zzstVar;
        this.f18386f = zzstVar2;
        this.f18385e = z;
        zzstVar2.m20510k(12);
        this.f18381a = zzstVar2.m20518s();
        zzstVar.m20510k(12);
        this.f18389i = zzstVar.m20518s();
        zzsk.m20482f(zzstVar.m20503d() == 1, "first_chunk must be 1");
        this.f18382b = -1;
    }

    /* renamed from: a */
    public final boolean m14956a() {
        int i2 = this.f18382b + 1;
        this.f18382b = i2;
        if (i2 == this.f18381a) {
            return false;
        }
        this.f18384d = this.f18385e ? this.f18386f.m20519t() : this.f18386f.m20516q();
        if (this.f18382b == this.f18388h) {
            this.f18383c = this.f18387g.m20518s();
            this.f18387g.m20511l(4);
            int i3 = this.f18389i - 1;
            this.f18389i = i3;
            this.f18388h = i3 > 0 ? this.f18387g.m20518s() - 1 : -1;
        }
        return true;
    }
}
