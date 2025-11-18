package p241e.p294g.p295a.p304c;

import android.view.View;

/* compiled from: ViewScrollChangeEvent.java */
/* renamed from: e.g.a.c.f */
/* loaded from: classes2.dex */
public final class C8980f extends AbstractC8977c<View> {

    /* renamed from: b */
    private final int f34540b;

    /* renamed from: c */
    private final int f34541c;

    /* renamed from: d */
    private final int f34542d;

    /* renamed from: e */
    private final int f34543e;

    protected C8980f(View view, int i2, int i3, int i4, int i5) {
        super(view);
        this.f34540b = i2;
        this.f34541c = i3;
        this.f34542d = i4;
        this.f34543e = i5;
    }

    /* renamed from: b */
    public static C8980f m28580b(View view, int i2, int i3, int i4, int i5) {
        return new C8980f(view, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8980f)) {
            return false;
        }
        C8980f c8980f = (C8980f) obj;
        return c8980f.m28577a() == m28577a() && c8980f.f34540b == this.f34540b && c8980f.f34541c == this.f34541c && c8980f.f34542d == this.f34542d && c8980f.f34543e == this.f34543e;
    }

    public int hashCode() {
        return ((((((((629 + m28577a().hashCode()) * 37) + this.f34540b) * 37) + this.f34541c) * 37) + this.f34542d) * 37) + this.f34543e;
    }

    public String toString() {
        return "ViewScrollChangeEvent{scrollX=" + this.f34540b + ", scrollY=" + this.f34541c + ", oldScrollX=" + this.f34542d + ", oldScrollY=" + this.f34543e + '}';
    }
}
