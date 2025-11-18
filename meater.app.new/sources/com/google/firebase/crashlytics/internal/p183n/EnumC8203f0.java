package com.google.firebase.crashlytics.internal.p183n;

/* compiled from: DeliveryMechanism.java */
/* renamed from: com.google.firebase.crashlytics.h.n.f0 */
/* loaded from: classes2.dex */
public enum EnumC8203f0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: k */
    private final int f30905k;

    EnumC8203f0(int i2) {
        this.f30905k = i2;
    }

    /* renamed from: g */
    public static EnumC8203f0 m25242g(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: k */
    public int m25243k() {
        return this.f30905k;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f30905k);
    }
}
