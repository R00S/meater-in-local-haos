package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.q */
/* loaded from: classes2.dex */
public final class C10716q extends AbstractC10705f implements InterfaceC10036m {

    /* renamed from: c */
    private final Enum<?> f41206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10716q(C10163f c10163f, Enum<?> r3) {
        super(c10163f, null);
        C9801m.m32346f(r3, "value");
        this.f41206c = r3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m
    /* renamed from: b */
    public C10159b mo33611b() {
        Class<?> enclosingClass = this.f41206c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        C9801m.m32345e(enclosingClass, "enumClass");
        return C10703d.m38069a(enclosingClass);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m
    /* renamed from: d */
    public C10163f mo33612d() {
        return C10163f.m35454x(this.f41206c.name());
    }
}
