package Xa;

import hb.InterfaceC3515h;
import hb.InterfaceC3531x;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes3.dex */
public final class r extends AbstractC1824h implements InterfaceC3515h {

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f18980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qb.f fVar, Class<?> klass) {
        super(fVar, null);
        C3862t.g(klass, "klass");
        this.f18980c = klass;
    }

    @Override // hb.InterfaceC3515h
    public InterfaceC3531x c() {
        return E.f18933a.a(this.f18980c);
    }
}
