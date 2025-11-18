package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10189f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: inlineClassManglingRules.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.b */
/* loaded from: classes3.dex */
public final class C10237b {
    /* renamed from: a */
    private static final boolean m36098a(InterfaceC10585e interfaceC10585e) {
        return C9801m.m32341a(C10235a.m36074h(interfaceC10585e), C9917k.f37513n);
    }

    /* renamed from: b */
    public static final boolean m36099b(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return C10189f.m35840b(interfaceC10609m) && !m36098a((InterfaceC10585e) interfaceC10609m);
    }

    /* renamed from: c */
    public static final boolean m36100c(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        return interfaceC10594hMo32891w != null && m36099b(interfaceC10594hMo32891w);
    }

    /* renamed from: d */
    private static final boolean m36101d(AbstractC10344e0 abstractC10344e0) {
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        InterfaceC10587e1 interfaceC10587e1 = interfaceC10594hMo32891w instanceof InterfaceC10587e1 ? (InterfaceC10587e1) interfaceC10594hMo32891w : null;
        if (interfaceC10587e1 == null) {
            return false;
        }
        return m36102e(C10457a.m37143i(interfaceC10587e1));
    }

    /* renamed from: e */
    private static final boolean m36102e(AbstractC10344e0 abstractC10344e0) {
        return m36100c(abstractC10344e0) || m36101d(abstractC10344e0);
    }

    /* renamed from: f */
    public static final boolean m36103f(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "descriptor");
        InterfaceC10582d interfaceC10582d = interfaceC10576b instanceof InterfaceC10582d ? (InterfaceC10582d) interfaceC10576b : null;
        if (interfaceC10582d == null || C10728t.m38132g(interfaceC10582d.getVisibility())) {
            return false;
        }
        InterfaceC10585e interfaceC10585eMo37714C = interfaceC10582d.mo37714C();
        C9801m.m32345e(interfaceC10585eMo37714C, "constructorDescriptor.constructedClass");
        if (C10189f.m35840b(interfaceC10585eMo37714C) || C10187d.m35806G(interfaceC10582d.mo37714C())) {
            return false;
        }
        List<InterfaceC10599i1> listMo37028f = interfaceC10582d.mo37028f();
        C9801m.m32345e(listMo37028f, "constructorDescriptor.valueParameters");
        if ((listMo37028f instanceof Collection) && listMo37028f.isEmpty()) {
            return false;
        }
        Iterator<T> it = listMo37028f.iterator();
        while (it.hasNext()) {
            AbstractC10344e0 type = ((InterfaceC10599i1) it.next()).getType();
            C9801m.m32345e(type, "it.type");
            if (m36102e(type)) {
                return true;
            }
        }
        return false;
    }
}
