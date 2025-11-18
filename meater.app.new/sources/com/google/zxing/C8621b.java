package com.google.zxing;

/* compiled from: Dimension.java */
/* renamed from: com.google.zxing.b */
/* loaded from: classes2.dex */
public final class C8621b {

    /* renamed from: a */
    private final int f32735a;

    /* renamed from: b */
    private final int f32736b;

    /* renamed from: a */
    public int m27223a() {
        return this.f32736b;
    }

    /* renamed from: b */
    public int m27224b() {
        return this.f32735a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8621b) {
            C8621b c8621b = (C8621b) obj;
            if (this.f32735a == c8621b.f32735a && this.f32736b == c8621b.f32736b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f32735a * 32713) + this.f32736b;
    }

    public String toString() {
        return this.f32735a + "x" + this.f32736b;
    }
}
