package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n;

/* compiled from: ReflectJavaField.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.r */
/* loaded from: classes2.dex */
public final class C10717r extends AbstractC10719t implements InterfaceC10037n {

    /* renamed from: a */
    private final Field f41207a;

    public C10717r(Field field) {
        C9801m.m32346f(field, "member");
        this.f41207a = field;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n
    /* renamed from: G */
    public boolean mo33613G() {
        return mo38106U().isEnumConstant();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n
    /* renamed from: O */
    public boolean mo33614O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10719t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Field mo38106U() {
        return this.f41207a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public AbstractC10725z getType() {
        AbstractC10725z.a aVar = AbstractC10725z.f41215a;
        Type genericType = mo38106U().getGenericType();
        C9801m.m32345e(genericType, "member.genericType");
        return aVar.m38122a(genericType);
    }
}
