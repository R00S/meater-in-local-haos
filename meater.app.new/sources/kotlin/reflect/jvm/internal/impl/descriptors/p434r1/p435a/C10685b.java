package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;

/* compiled from: ReflectAnnotationSource.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.b */
/* loaded from: classes2.dex */
public final class C10685b implements InterfaceC10741z0 {

    /* renamed from: b */
    private final Annotation f41140b;

    public C10685b(Annotation annotation) {
        C9801m.m32346f(annotation, "annotation");
        this.f41140b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
    /* renamed from: a */
    public InterfaceC10575a1 mo33980a() {
        InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
        C9801m.m32345e(interfaceC10575a1, "NO_SOURCE_FILE");
        return interfaceC10575a1;
    }

    /* renamed from: d */
    public final Annotation m38014d() {
        return this.f41140b;
    }
}
