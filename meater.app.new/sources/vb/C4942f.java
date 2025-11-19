package vb;

import kotlin.jvm.internal.C3862t;

/* compiled from: ClassLiteralValue.kt */
/* renamed from: vb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4942f {

    /* renamed from: a, reason: collision with root package name */
    private final qb.b f51597a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51598b;

    public C4942f(qb.b classId, int i10) {
        C3862t.g(classId, "classId");
        this.f51597a = classId;
        this.f51598b = i10;
    }

    public final qb.b a() {
        return this.f51597a;
    }

    public final int b() {
        return this.f51598b;
    }

    public final int c() {
        return this.f51598b;
    }

    public final qb.b d() {
        return this.f51597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4942f)) {
            return false;
        }
        C4942f c4942f = (C4942f) obj;
        return C3862t.b(this.f51597a, c4942f.f51597a) && this.f51598b == c4942f.f51598b;
    }

    public int hashCode() {
        return (this.f51597a.hashCode() * 31) + Integer.hashCode(this.f51598b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f51598b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f51597a);
        int i12 = this.f51598b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
