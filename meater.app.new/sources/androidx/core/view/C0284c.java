package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import p024c.p052i.p059j.C0954d;

/* compiled from: DisplayCutoutCompat.java */
/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C0284c {

    /* renamed from: a */
    private final Object f2293a;

    private C0284c(Object obj) {
        this.f2293a = obj;
    }

    /* renamed from: e */
    static C0284c m1866e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0284c(obj);
    }

    /* renamed from: a */
    public int m1867a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2293a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int m1868b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2293a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m1869c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2293a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m1870d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2293a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0284c.class != obj.getClass()) {
            return false;
        }
        return C0954d.m6056a(this.f2293a, ((C0284c) obj).f2293a);
    }

    public int hashCode() {
        Object obj = this.f2293a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2293a + "}";
    }
}
