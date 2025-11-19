package vb;

import Hb.AbstractC1082f0;
import Hb.U;
import Ra.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: ConstantValueFactory.kt */
/* renamed from: vb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4945i {

    /* renamed from: a, reason: collision with root package name */
    public static final C4945i f51601a = new C4945i();

    private C4945i() {
    }

    private final C4938b c(List<?> list, H h10, Oa.m mVar) {
        List listW0 = kotlin.collections.r.W0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            AbstractC4943g abstractC4943gF = f(this, it.next(), null, 2, null);
            if (abstractC4943gF != null) {
                arrayList.add(abstractC4943gF);
            }
        }
        if (h10 == null) {
            return new C4938b(arrayList, new C4944h(mVar));
        }
        AbstractC1082f0 abstractC1082f0O = h10.q().O(mVar);
        C3862t.f(abstractC1082f0O, "getPrimitiveArrayKotlinType(...)");
        return new C4931A(arrayList, abstractC1082f0O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U d(Oa.m mVar, H it) {
        C3862t.g(it, "it");
        AbstractC1082f0 abstractC1082f0O = it.q().O(mVar);
        C3862t.f(abstractC1082f0O, "getPrimitiveArrayKotlinType(...)");
        return abstractC1082f0O;
    }

    public static /* synthetic */ AbstractC4943g f(C4945i c4945i, Object obj, H h10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h10 = null;
        }
        return c4945i.e(obj, h10);
    }

    public final C4938b b(List<? extends AbstractC4943g<?>> value, U type) {
        C3862t.g(value, "value");
        C3862t.g(type, "type");
        return new C4931A(value, type);
    }

    public final AbstractC4943g<?> e(Object obj, H h10) {
        if (obj instanceof Byte) {
            return new C4940d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new x(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C4941e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4939c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new y((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(C3831l.C0((byte[]) obj), h10, Oa.m.f13340J);
        }
        if (obj instanceof short[]) {
            return c(C3831l.J0((short[]) obj), h10, Oa.m.f13341K);
        }
        if (obj instanceof int[]) {
            return c(C3831l.G0((int[]) obj), h10, Oa.m.f13342L);
        }
        if (obj instanceof long[]) {
            return c(C3831l.H0((long[]) obj), h10, Oa.m.f13344N);
        }
        if (obj instanceof char[]) {
            return c(C3831l.D0((char[]) obj), h10, Oa.m.f13339I);
        }
        if (obj instanceof float[]) {
            return c(C3831l.F0((float[]) obj), h10, Oa.m.f13343M);
        }
        if (obj instanceof double[]) {
            return c(C3831l.E0((double[]) obj), h10, Oa.m.f13345O);
        }
        if (obj instanceof boolean[]) {
            return c(C3831l.K0((boolean[]) obj), h10, Oa.m.f13338H);
        }
        if (obj == null) {
            return new v();
        }
        return null;
    }
}
