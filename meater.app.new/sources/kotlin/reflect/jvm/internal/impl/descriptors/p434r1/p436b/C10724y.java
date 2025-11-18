package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.y */
/* loaded from: classes2.dex */
public final class C10724y extends AbstractC10719t implements InterfaceC10046w {

    /* renamed from: a */
    private final Object f41214a;

    public C10724y(Object obj) {
        C9801m.m32346f(obj, "recordComponent");
        this.f41214a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10719t
    /* renamed from: U */
    public Member mo38106U() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodM38041c = C10697a.f41156a.m38041c(this.f41214a);
        if (methodM38041c != null) {
            return methodM38041c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w
    public InterfaceC10047x getType() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsM38042d = C10697a.f41156a.m38042d(this.f41214a);
        if (clsM38042d != null) {
            return new C10713n(clsM38042d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w
    /* renamed from: h */
    public boolean mo33627h() {
        return false;
    }
}
