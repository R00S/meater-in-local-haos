package com.airbnb.lottie.p112s;

import p024c.p052i.p059j.C0955e;

/* compiled from: MutablePair.java */
/* renamed from: com.airbnb.lottie.s.h */
/* loaded from: classes.dex */
public class C5236h<T> {

    /* renamed from: a */
    T f12676a;

    /* renamed from: b */
    T f12677b;

    /* renamed from: a */
    private static boolean m9615a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m9616b(T t, T t2) {
        this.f12676a = t;
        this.f12677b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0955e)) {
            return false;
        }
        C0955e c0955e = (C0955e) obj;
        return m9615a(c0955e.f6405a, this.f12676a) && m9615a(c0955e.f6406b, this.f12677b);
    }

    public int hashCode() {
        T t = this.f12676a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f12677b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f12676a) + " " + String.valueOf(this.f12677b) + "}";
    }
}
