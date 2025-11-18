package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Y0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f34546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34547b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f34548c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34549d;

    Y0(N0 n02, String str, Object[] objArr) {
        this.f34546a = n02;
        this.f34547b = str;
        this.f34548c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f34549d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f34549d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.K0
    public final N0 a() {
        return this.f34546a;
    }

    @Override // com.google.android.gms.internal.wearable.K0
    public final boolean b() {
        return (this.f34549d & 2) == 2;
    }

    final String c() {
        return this.f34547b;
    }

    @Override // com.google.android.gms.internal.wearable.K0
    public final int d() {
        int i10 = this.f34549d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final Object[] e() {
        return this.f34548c;
    }
}
