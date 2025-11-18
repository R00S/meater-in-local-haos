package Xa;

import hb.InterfaceC3508a;
import hb.InterfaceC3529v;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;
import yb.EnumC5149e;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes3.dex */
public final class C extends E implements InterfaceC3529v {

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f18929b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<InterfaceC3508a> f18930c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18931d;

    public C(Class<?> reflectType) {
        C3862t.g(reflectType, "reflectType");
        this.f18929b = reflectType;
        this.f18930c = kotlin.collections.r.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xa.E
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Class<?> Q() {
        return this.f18929b;
    }

    @Override // hb.InterfaceC3529v
    public Oa.m a() {
        if (C3862t.b(Q(), Void.TYPE)) {
            return null;
        }
        return EnumC5149e.n(Q().getName()).t();
    }

    @Override // hb.InterfaceC3511d
    public Collection<InterfaceC3508a> getAnnotations() {
        return this.f18930c;
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return this.f18931d;
    }
}
