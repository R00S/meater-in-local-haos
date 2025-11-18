package p024c.p052i.p053e;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* renamed from: c.i.e.b */
/* loaded from: classes.dex */
public final class C0924b {

    /* renamed from: a */
    public static final C0924b f6282a = new C0924b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f6283b;

    /* renamed from: c */
    public final int f6284c;

    /* renamed from: d */
    public final int f6285d;

    /* renamed from: e */
    public final int f6286e;

    private C0924b(int i2, int i3, int i4, int i5) {
        this.f6283b = i2;
        this.f6284c = i3;
        this.f6285d = i4;
        this.f6286e = i5;
    }

    /* renamed from: a */
    public static C0924b m5888a(C0924b c0924b, C0924b c0924b2) {
        return m5889b(Math.max(c0924b.f6283b, c0924b2.f6283b), Math.max(c0924b.f6284c, c0924b2.f6284c), Math.max(c0924b.f6285d, c0924b2.f6285d), Math.max(c0924b.f6286e, c0924b2.f6286e));
    }

    /* renamed from: b */
    public static C0924b m5889b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f6282a : new C0924b(i2, i3, i4, i5);
    }

    /* renamed from: c */
    public static C0924b m5890c(Rect rect) {
        return m5889b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0924b m5891d(Insets insets) {
        return m5889b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m5892e() {
        return Insets.of(this.f6283b, this.f6284c, this.f6285d, this.f6286e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0924b.class != obj.getClass()) {
            return false;
        }
        C0924b c0924b = (C0924b) obj;
        return this.f6286e == c0924b.f6286e && this.f6283b == c0924b.f6283b && this.f6285d == c0924b.f6285d && this.f6284c == c0924b.f6284c;
    }

    public int hashCode() {
        return (((((this.f6283b * 31) + this.f6284c) * 31) + this.f6285d) * 31) + this.f6286e;
    }

    public String toString() {
        return "Insets{left=" + this.f6283b + ", top=" + this.f6284c + ", right=" + this.f6285d + ", bottom=" + this.f6286e + '}';
    }
}
