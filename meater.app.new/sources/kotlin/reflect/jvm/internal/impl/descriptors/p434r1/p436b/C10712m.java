package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10031h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.m */
/* loaded from: classes2.dex */
public final class C10712m extends AbstractC10705f implements InterfaceC10031h {

    /* renamed from: c */
    private final Class<?> f41202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10712m(C10163f c10163f, Class<?> cls) {
        super(c10163f, null);
        C9801m.m32346f(cls, "klass");
        this.f41202c = cls;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10031h
    /* renamed from: c */
    public InterfaceC10047x mo33604c() {
        return AbstractC10725z.f41215a.m38122a(this.f41202c);
    }
}
