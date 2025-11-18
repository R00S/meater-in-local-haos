package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: ConstantValueFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.h */
/* loaded from: classes3.dex */
public final class C10212h {

    /* renamed from: a */
    public static final C10212h f39560a = new C10212h();

    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.h$a */
    static final class a extends Lambda implements Function1<InterfaceC10592g0, AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10344e0 f39561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10344e0 abstractC10344e0) {
            super(1);
            this.f39561f = abstractC10344e0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "it");
            return this.f39561f;
        }
    }

    /* compiled from: ConstantValueFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.h$b */
    static final class b extends Lambda implements Function1<InterfaceC10592g0, AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ EnumC9915i f39562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC9915i enumC9915i) {
            super(1);
            this.f39562f = enumC9915i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            AbstractC10368m0 abstractC10368m0M32779O = interfaceC10592g0.mo37021o().m32779O(this.f39562f);
            C9801m.m32345e(abstractC10368m0M32779O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return abstractC10368m0M32779O;
        }
    }

    private C10212h() {
    }

    /* renamed from: a */
    private final C10206b m36024a(List<?> list, EnumC9915i enumC9915i) {
        List listM38569E0 = C10782c0.m38569E0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM38569E0.iterator();
        while (it.hasNext()) {
            AbstractC10211g<?> abstractC10211gM36026c = m36026c(it.next());
            if (abstractC10211gM36026c != null) {
                arrayList.add(abstractC10211gM36026c);
            }
        }
        return new C10206b(arrayList, new b(enumC9915i));
    }

    /* renamed from: b */
    public final C10206b m36025b(List<? extends AbstractC10211g<?>> list, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(list, "value");
        C9801m.m32346f(abstractC10344e0, "type");
        return new C10206b(list, new a(abstractC10344e0));
    }

    /* renamed from: c */
    public final AbstractC10211g<?> m36026c(Object obj) {
        if (obj instanceof Byte) {
            return new C10208d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C10225u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C10217m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C10222r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C10209e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C10216l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C10213i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C10207c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C10226v((String) obj);
        }
        if (obj instanceof byte[]) {
            return m36024a(C10803n.m38740T((byte[]) obj), EnumC9915i.BYTE);
        }
        if (obj instanceof short[]) {
            return m36024a(C10803n.m38747a0((short[]) obj), EnumC9915i.SHORT);
        }
        if (obj instanceof int[]) {
            return m36024a(C10803n.m38744X((int[]) obj), EnumC9915i.INT);
        }
        if (obj instanceof long[]) {
            return m36024a(C10803n.m38745Y((long[]) obj), EnumC9915i.LONG);
        }
        if (obj instanceof char[]) {
            return m36024a(C10803n.m38741U((char[]) obj), EnumC9915i.CHAR);
        }
        if (obj instanceof float[]) {
            return m36024a(C10803n.m38743W((float[]) obj), EnumC9915i.FLOAT);
        }
        if (obj instanceof double[]) {
            return m36024a(C10803n.m38742V((double[]) obj), EnumC9915i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return m36024a(C10803n.m38748b0((boolean[]) obj), EnumC9915i.BOOLEAN);
        }
        if (obj == null) {
            return new C10223s();
        }
        return null;
    }
}
