package Xa;

import hb.InterfaceC3520m;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes3.dex */
public final class v extends AbstractC1824h implements InterfaceC3520m {

    /* renamed from: c, reason: collision with root package name */
    private final Enum<?> f18984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qb.f fVar, Enum<?> value) {
        super(fVar, null);
        C3862t.g(value, "value");
        this.f18984c = value;
    }

    @Override // hb.InterfaceC3520m
    public qb.b b() {
        Class<?> enclosingClass = this.f18984c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        C3862t.d(enclosingClass);
        return C1822f.e(enclosingClass);
    }

    @Override // hb.InterfaceC3520m
    public qb.f d() {
        return qb.f.t(this.f18984c.name());
    }
}
