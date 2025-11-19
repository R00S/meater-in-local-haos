package Xa;

import hb.InterfaceC3508a;
import hb.InterfaceC3510c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes3.dex */
public final class i extends AbstractC1824h implements InterfaceC3510c {

    /* renamed from: c, reason: collision with root package name */
    private final Annotation f18965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qb.f fVar, Annotation annotation) {
        super(fVar, null);
        C3862t.g(annotation, "annotation");
        this.f18965c = annotation;
    }

    @Override // hb.InterfaceC3510c
    public InterfaceC3508a a() {
        return new C1823g(this.f18965c);
    }
}
