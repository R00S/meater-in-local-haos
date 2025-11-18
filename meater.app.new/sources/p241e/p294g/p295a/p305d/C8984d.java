package p241e.p294g.p295a.p305d;

import android.widget.TextView;
import p241e.p294g.p295a.p304c.AbstractC8977c;

/* compiled from: TextViewTextChangeEvent.java */
/* renamed from: e.g.a.d.d */
/* loaded from: classes2.dex */
public final class C8984d extends AbstractC8977c<TextView> {

    /* renamed from: b */
    private final CharSequence f34550b;

    /* renamed from: c */
    private final int f34551c;

    /* renamed from: d */
    private final int f34552d;

    /* renamed from: e */
    private final int f34553e;

    private C8984d(TextView textView, CharSequence charSequence, int i2, int i3, int i4) {
        super(textView);
        this.f34550b = charSequence;
        this.f34551c = i2;
        this.f34552d = i3;
        this.f34553e = i4;
    }

    /* renamed from: b */
    public static C8984d m28586b(TextView textView, CharSequence charSequence, int i2, int i3, int i4) {
        return new C8984d(textView, charSequence, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8984d)) {
            return false;
        }
        C8984d c8984d = (C8984d) obj;
        return c8984d.m28577a() == m28577a() && this.f34550b.equals(c8984d.f34550b) && this.f34551c == c8984d.f34551c && this.f34552d == c8984d.f34552d && this.f34553e == c8984d.f34553e;
    }

    public int hashCode() {
        return ((((((((629 + m28577a().hashCode()) * 37) + this.f34550b.hashCode()) * 37) + this.f34551c) * 37) + this.f34552d) * 37) + this.f34553e;
    }

    public String toString() {
        return "TextViewTextChangeEvent{text=" + ((Object) this.f34550b) + ", start=" + this.f34551c + ", before=" + this.f34552d + ", count=" + this.f34553e + ", view=" + m28577a() + '}';
    }
}
