package qb;

import kotlin.jvm.internal.C3862t;

/* compiled from: NameUtils.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f48195a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Ub.k f48196b = new Ub.k("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    private static final String f48197c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarT = f.t(f48197c + '_' + i10);
        C3862t.f(fVarT, "identifier(...)");
        return fVarT;
    }

    public static final String b(String name) {
        C3862t.g(name, "name");
        return f48196b.c(name, "_");
    }
}
