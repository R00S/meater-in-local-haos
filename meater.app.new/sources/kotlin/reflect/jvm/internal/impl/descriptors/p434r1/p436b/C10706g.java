package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10023c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.g */
/* loaded from: classes2.dex */
public final class C10706g extends AbstractC10705f implements InterfaceC10023c {

    /* renamed from: c */
    private final Annotation f41187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10706g(C10163f c10163f, Annotation annotation) {
        super(c10163f, null);
        C9801m.m32346f(annotation, "annotation");
        this.f41187c = annotation;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10023c
    /* renamed from: a */
    public InterfaceC10019a mo33579a() {
        return new C10704e(this.f41187c);
    }
}
