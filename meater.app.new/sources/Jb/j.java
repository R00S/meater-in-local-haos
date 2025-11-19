package Jb;

import Hb.U;
import Hb.y0;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class j implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final k f7700a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f7701b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7702c;

    public j(k kind, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        this.f7700a = kind;
        this.f7701b = formatParams;
        String strJ = b.f7664H.j();
        String strJ2 = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C3862t.f(str, "format(...)");
        String str2 = String.format(strJ, Arrays.copyOf(new Object[]{str}, 1));
        C3862t.f(str2, "format(...)");
        this.f7702c = str2;
    }

    public final k c() {
        return this.f7700a;
    }

    public final String d(int i10) {
        return this.f7701b[i10];
    }

    @Override // Hb.y0
    public List<m0> getParameters() {
        return r.m();
    }

    @Override // Hb.y0
    public Oa.j q() {
        return Oa.g.f13317h.a();
    }

    @Override // Hb.y0
    public y0 r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Hb.y0
    public Collection<U> s() {
        return r.m();
    }

    @Override // Hb.y0
    public InterfaceC1695h t() {
        return l.f7791a.h();
    }

    public String toString() {
        return this.f7702c;
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }
}
