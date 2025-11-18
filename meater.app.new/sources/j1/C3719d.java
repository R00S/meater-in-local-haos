package j1;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3719d {

    /* renamed from: e, reason: collision with root package name */
    public static final C3719d f43449e = new C3719d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f43450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43452c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43453d;

    /* compiled from: Insets.java */
    /* renamed from: j1.d$a */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private C3719d(int i10, int i11, int i12, int i13) {
        this.f43450a = i10;
        this.f43451b = i11;
        this.f43452c = i12;
        this.f43453d = i13;
    }

    public static C3719d a(C3719d c3719d, C3719d c3719d2) {
        return b(Math.max(c3719d.f43450a, c3719d2.f43450a), Math.max(c3719d.f43451b, c3719d2.f43451b), Math.max(c3719d.f43452c, c3719d2.f43452c), Math.max(c3719d.f43453d, c3719d2.f43453d));
    }

    public static C3719d b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f43449e : new C3719d(i10, i11, i12, i13);
    }

    public static C3719d c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C3719d d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f43450a, this.f43451b, this.f43452c, this.f43453d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3719d.class != obj.getClass()) {
            return false;
        }
        C3719d c3719d = (C3719d) obj;
        return this.f43453d == c3719d.f43453d && this.f43450a == c3719d.f43450a && this.f43452c == c3719d.f43452c && this.f43451b == c3719d.f43451b;
    }

    public int hashCode() {
        return (((((this.f43450a * 31) + this.f43451b) * 31) + this.f43452c) * 31) + this.f43453d;
    }

    public String toString() {
        return "Insets{left=" + this.f43450a + ", top=" + this.f43451b + ", right=" + this.f43452c + ", bottom=" + this.f43453d + '}';
    }
}
