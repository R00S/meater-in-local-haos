package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class u1 extends E1 {

    /* renamed from: a, reason: collision with root package name */
    private String f34679a;

    /* renamed from: b, reason: collision with root package name */
    private byte f34680b;

    /* renamed from: c, reason: collision with root package name */
    private int f34681c;

    /* renamed from: d, reason: collision with root package name */
    private int f34682d;

    u1() {
    }

    @Override // com.google.android.gms.internal.wearable.E1
    public final E1 a(boolean z10) {
        this.f34680b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.E1
    public final F1 b() {
        if (this.f34680b == 1 && this.f34679a != null && this.f34681c != 0 && this.f34682d != 0) {
            return new z1(this.f34679a, false, this.f34681c, null, null, this.f34682d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f34679a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f34680b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f34681c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f34682d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.wearable.E1
    final E1 c(int i10) {
        this.f34681c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.E1
    public final E1 d(int i10) {
        this.f34682d = 1;
        return this;
    }

    public final E1 e(String str) {
        this.f34679a = "";
        return this;
    }
}
