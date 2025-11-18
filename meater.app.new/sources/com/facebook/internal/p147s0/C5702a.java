package com.facebook.internal.p147s0;

import kotlin.jvm.internal.C9801m;

/* compiled from: GateKeeper.kt */
/* renamed from: com.facebook.internal.s0.a */
/* loaded from: classes2.dex */
public final class C5702a {

    /* renamed from: a */
    private final String f14537a;

    /* renamed from: b */
    private final boolean f14538b;

    public C5702a(String str, boolean z) {
        C9801m.m32346f(str, "name");
        this.f14537a = str;
        this.f14538b = z;
    }

    /* renamed from: a */
    public final String m11701a() {
        return this.f14537a;
    }

    /* renamed from: b */
    public final boolean m11702b() {
        return this.f14538b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5702a)) {
            return false;
        }
        C5702a c5702a = (C5702a) obj;
        return C9801m.m32341a(this.f14537a, c5702a.f14537a) && this.f14538b == c5702a.f14538b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f14537a.hashCode() * 31;
        boolean z = this.f14538b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f14537a + ", value=" + this.f14538b + ')';
    }
}
