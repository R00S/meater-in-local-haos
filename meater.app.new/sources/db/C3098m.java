package db;

import Ra.InterfaceC1700m;
import Ra.m0;
import eb.c0;
import hb.InterfaceC3532y;
import hb.InterfaceC3533z;
import java.util.Map;
import kotlin.jvm.internal.C3862t;

/* compiled from: resolvers.kt */
/* renamed from: db.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3098m implements InterfaceC3101p {

    /* renamed from: a, reason: collision with root package name */
    private final C3096k f39919a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1700m f39920b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39921c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<InterfaceC3532y, Integer> f39922d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.h<InterfaceC3532y, c0> f39923e;

    public C3098m(C3096k c10, InterfaceC1700m containingDeclaration, InterfaceC3533z typeParameterOwner, int i10) {
        C3862t.g(c10, "c");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(typeParameterOwner, "typeParameterOwner");
        this.f39919a = c10;
        this.f39920b = containingDeclaration;
        this.f39921c = i10;
        this.f39922d = Rb.a.d(typeParameterOwner.getTypeParameters());
        this.f39923e = c10.e().e(new C3097l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 c(C3098m c3098m, InterfaceC3532y typeParameter) {
        C3862t.g(typeParameter, "typeParameter");
        Integer num = c3098m.f39922d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new c0(C3088c.k(C3088c.d(c3098m.f39919a, c3098m), c3098m.f39920b.getAnnotations()), typeParameter, c3098m.f39921c + num.intValue(), c3098m.f39920b);
    }

    @Override // db.InterfaceC3101p
    public m0 a(InterfaceC3532y javaTypeParameter) {
        C3862t.g(javaTypeParameter, "javaTypeParameter");
        c0 c0VarInvoke = this.f39923e.invoke(javaTypeParameter);
        return c0VarInvoke != null ? c0VarInvoke : this.f39919a.f().a(javaTypeParameter);
    }
}
