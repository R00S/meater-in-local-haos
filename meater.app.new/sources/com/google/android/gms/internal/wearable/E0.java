package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class E0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0[] f34482a;

    E0(L0... l0Arr) {
        this.f34482a = l0Arr;
    }

    @Override // com.google.android.gms.internal.wearable.L0
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f34482a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.L0
    public final K0 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            L0 l02 = this.f34482a[i10];
            if (l02.a(cls)) {
                return l02.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
