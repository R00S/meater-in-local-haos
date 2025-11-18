package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10238c;

/* compiled from: ModuleClassResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.j */
/* loaded from: classes2.dex */
public final class C9993j implements InterfaceC9992i {

    /* renamed from: a */
    public C10238c f38009a;

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9992i
    /* renamed from: a */
    public InterfaceC10585e mo33295a(InterfaceC10030g interfaceC10030g) {
        C9801m.m32346f(interfaceC10030g, "javaClass");
        return m33296b().m36105b(interfaceC10030g);
    }

    /* renamed from: b */
    public final C10238c m33296b() {
        C10238c c10238c = this.f38009a;
        if (c10238c != null) {
            return c10238c;
        }
        C9801m.m32363w("resolver");
        return null;
    }

    /* renamed from: c */
    public final void m33297c(C10238c c10238c) {
        C9801m.m32346f(c10238c, "<set-?>");
        this.f38009a = c10238c;
    }
}
