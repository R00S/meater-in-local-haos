package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: Hb.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1107t extends s0<C1107t> {

    /* renamed from: a, reason: collision with root package name */
    private final Sa.h f5788a;

    public C1107t(Sa.h annotations) {
        C3862t.g(annotations, "annotations");
        this.f5788a = annotations;
    }

    @Override // Hb.s0
    public Ia.d<? extends C1107t> b() {
        return kotlin.jvm.internal.P.b(C1107t.class);
    }

    @Override // Hb.s0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1107t a(C1107t c1107t) {
        return c1107t == null ? this : new C1107t(Sa.j.a(this.f5788a, c1107t.f5788a));
    }

    public final Sa.h e() {
        return this.f5788a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1107t) {
            return C3862t.b(((C1107t) obj).f5788a, this.f5788a);
        }
        return false;
    }

    @Override // Hb.s0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1107t c(C1107t c1107t) {
        if (C3862t.b(c1107t, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f5788a.hashCode();
    }
}
