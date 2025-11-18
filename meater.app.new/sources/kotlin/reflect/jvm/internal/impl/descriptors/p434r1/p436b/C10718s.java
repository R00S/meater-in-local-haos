package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10038o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.s */
/* loaded from: classes2.dex */
public final class C10718s extends AbstractC10705f implements InterfaceC10038o {

    /* renamed from: c */
    private final Object f41208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10718s(C10163f c10163f, Object obj) {
        super(c10163f, null);
        C9801m.m32346f(obj, "value");
        this.f41208c = obj;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10038o
    public Object getValue() {
        return this.f41208c;
    }
}
