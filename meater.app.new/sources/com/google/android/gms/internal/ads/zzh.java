package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzh implements zzac {

    /* renamed from: a */
    private int f26170a;

    /* renamed from: b */
    private int f26171b;

    /* renamed from: c */
    private final int f26172c;

    /* renamed from: d */
    private final float f26173d;

    public zzh() {
        this(2500, 1, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzac
    /* renamed from: a */
    public final void mo16393a(zzaf zzafVar) throws zzaf {
        int i2 = this.f26171b + 1;
        this.f26171b = i2;
        int i3 = this.f26170a;
        this.f26170a = i3 + ((int) (i3 * this.f26173d));
        if (!(i2 <= this.f26172c)) {
            throw zzafVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzac
    /* renamed from: b */
    public final int mo16394b() {
        return this.f26170a;
    }

    @Override // com.google.android.gms.internal.ads.zzac
    /* renamed from: c */
    public final int mo16395c() {
        return this.f26171b;
    }

    private zzh(int i2, int i3, float f2) {
        this.f26170a = 2500;
        this.f26172c = 1;
        this.f26173d = 1.0f;
    }
}
