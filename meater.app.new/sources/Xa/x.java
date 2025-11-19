package Xa;

import hb.InterfaceC3522o;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes3.dex */
public final class x extends AbstractC1824h implements InterfaceC3522o {

    /* renamed from: c, reason: collision with root package name */
    private final Object f18986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qb.f fVar, Object value) {
        super(fVar, null);
        C3862t.g(value, "value");
        this.f18986c = value;
    }

    @Override // hb.InterfaceC3522o
    public Object getValue() {
        return this.f18986c;
    }
}
