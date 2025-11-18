package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1 */
/* loaded from: classes2.dex */
public final class C10590f1 {

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$a */
    static final class a extends Lambda implements Function1<InterfaceC10609m, Boolean> {

        /* renamed from: f */
        public static final a f40753f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10609m interfaceC10609m) {
            C9801m.m32346f(interfaceC10609m, "it");
            return Boolean.valueOf(interfaceC10609m instanceof InterfaceC10573a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$b */
    static final class b extends Lambda implements Function1<InterfaceC10609m, Boolean> {

        /* renamed from: f */
        public static final b f40754f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10609m interfaceC10609m) {
            C9801m.m32346f(interfaceC10609m, "it");
            return Boolean.valueOf(!(interfaceC10609m instanceof InterfaceC10606l));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$c */
    static final class c extends Lambda implements Function1<InterfaceC10609m, Sequence<? extends InterfaceC10587e1>> {

        /* renamed from: f */
        public static final c f40755f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sequence<InterfaceC10587e1> invoke(InterfaceC10609m interfaceC10609m) {
            C9801m.m32346f(interfaceC10609m, "it");
            List<InterfaceC10587e1> typeParameters = ((InterfaceC10573a) interfaceC10609m).getTypeParameters();
            C9801m.m32345e(typeParameters, "it as CallableDescriptor).typeParameters");
            return C10782c0.m38575J(typeParameters);
        }
    }

    /* renamed from: a */
    public static final C10683r0 m37682a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        return m37683b(abstractC10344e0, interfaceC10594hMo32891w instanceof InterfaceC10597i ? (InterfaceC10597i) interfaceC10594hMo32891w : null, 0);
    }

    /* renamed from: b */
    private static final C10683r0 m37683b(AbstractC10344e0 abstractC10344e0, InterfaceC10597i interfaceC10597i, int i2) {
        if (interfaceC10597i == null || C10427k.m37054m(interfaceC10597i)) {
            return null;
        }
        int size = interfaceC10597i.mo32884w().size() + i2;
        if (interfaceC10597i.mo32882m()) {
            List<InterfaceC10351g1> listSubList = abstractC10344e0.mo35991M0().subList(i2, size);
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10597i.mo32876b();
            return new C10683r0(interfaceC10597i, listSubList, m37683b(abstractC10344e0, interfaceC10609mMo32876b instanceof InterfaceC10597i ? (InterfaceC10597i) interfaceC10609mMo32876b : null, size));
        }
        if (size != abstractC10344e0.mo35991M0().size()) {
            C10187d.m35804E(interfaceC10597i);
        }
        return new C10683r0(interfaceC10597i, abstractC10344e0.mo35991M0().subList(i2, abstractC10344e0.mo35991M0().size()), null);
    }

    /* renamed from: c */
    private static final C10579c m37684c(InterfaceC10587e1 interfaceC10587e1, InterfaceC10609m interfaceC10609m, int i2) {
        return new C10579c(interfaceC10587e1, interfaceC10609m, i2);
    }

    /* renamed from: d */
    public static final List<InterfaceC10587e1> m37685d(InterfaceC10597i interfaceC10597i) {
        List<InterfaceC10587e1> listM38888j;
        InterfaceC10609m next;
        InterfaceC10345e1 interfaceC10345e1Mo32877h;
        C9801m.m32346f(interfaceC10597i, "<this>");
        List<InterfaceC10587e1> listMo32884w = interfaceC10597i.mo32884w();
        C9801m.m32345e(listMo32884w, "declaredTypeParameters");
        if (!interfaceC10597i.mo32882m() && !(interfaceC10597i.mo32876b() instanceof InterfaceC10573a)) {
            return listMo32884w;
        }
        List listM37377A = C10522n.m37377A(C10522n.m37386p(C10522n.m37382l(C10522n.m37395y(C10235a.m36079m(interfaceC10597i), a.f40753f), b.f40754f), c.f40755f));
        Iterator<InterfaceC10609m> it = C10235a.m36079m(interfaceC10597i).iterator();
        while (true) {
            listM38888j = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC10585e) {
                break;
            }
        }
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) next;
        if (interfaceC10585e != null && (interfaceC10345e1Mo32877h = interfaceC10585e.mo32877h()) != null) {
            listM38888j = interfaceC10345e1Mo32877h.getParameters();
        }
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        if (listM37377A.isEmpty() && listM38888j.isEmpty()) {
            List<InterfaceC10587e1> listMo32884w2 = interfaceC10597i.mo32884w();
            C9801m.m32345e(listMo32884w2, "declaredTypeParameters");
            return listMo32884w2;
        }
        List<InterfaceC10587e1> listM38609o0 = C10782c0.m38609o0(listM37377A, listM38888j);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38609o0, 10));
        for (InterfaceC10587e1 interfaceC10587e1 : listM38609o0) {
            C9801m.m32345e(interfaceC10587e1, "it");
            arrayList.add(m37684c(interfaceC10587e1, interfaceC10597i, listMo32884w.size()));
        }
        return C10782c0.m38609o0(listMo32884w, arrayList);
    }
}
