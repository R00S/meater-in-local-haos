package androidx.work.impl.p013m;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NetworkState.java */
/* renamed from: androidx.work.impl.m.b */
/* loaded from: classes.dex */
public class C0742b {

    /* renamed from: a */
    private boolean f4727a;

    /* renamed from: b */
    private boolean f4728b;

    /* renamed from: c */
    private boolean f4729c;

    /* renamed from: d */
    private boolean f4730d;

    public C0742b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4727a = z;
        this.f4728b = z2;
        this.f4729c = z3;
        this.f4730d = z4;
    }

    /* renamed from: a */
    public boolean m5027a() {
        return this.f4727a;
    }

    /* renamed from: b */
    public boolean m5028b() {
        return this.f4729c;
    }

    /* renamed from: c */
    public boolean m5029c() {
        return this.f4730d;
    }

    /* renamed from: d */
    public boolean m5030d() {
        return this.f4728b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0742b)) {
            return false;
        }
        C0742b c0742b = (C0742b) obj;
        return this.f4727a == c0742b.f4727a && this.f4728b == c0742b.f4728b && this.f4729c == c0742b.f4729c && this.f4730d == c0742b.f4730d;
    }

    public int hashCode() {
        int i2 = this.f4727a ? 1 : 0;
        if (this.f4728b) {
            i2 += 16;
        }
        if (this.f4729c) {
            i2 += 256;
        }
        return this.f4730d ? i2 + RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f4727a), Boolean.valueOf(this.f4728b), Boolean.valueOf(this.f4729c), Boolean.valueOf(this.f4730d));
    }
}
