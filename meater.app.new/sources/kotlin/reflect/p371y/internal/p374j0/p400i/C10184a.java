package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.comparisons.C10839b;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k;

/* compiled from: SealedClassInheritorsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.i.a */
/* loaded from: classes3.dex */
public final class C10184a extends AbstractC10198o {

    /* renamed from: a */
    public static final C10184a f39497a = new C10184a();

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.a$a */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C10839b.m39017a(C10235a.m36074h((InterfaceC10585e) t).m35420b(), C10235a.m36074h((InterfaceC10585e) t2).m35420b());
        }
    }

    private C10184a() {
    }

    /* renamed from: b */
    private static final void m35767b(InterfaceC10585e interfaceC10585e, LinkedHashSet<InterfaceC10585e> linkedHashSet, InterfaceC10251h interfaceC10251h, boolean z) {
        for (InterfaceC10609m interfaceC10609m : InterfaceC10254k.a.m36162a(interfaceC10251h, C10247d.f39647r, null, 2, null)) {
            if (interfaceC10609m instanceof InterfaceC10585e) {
                InterfaceC10585e interfaceC10585eMo36399r = (InterfaceC10585e) interfaceC10609m;
                if (interfaceC10585eMo36399r.mo32863M()) {
                    C10163f name = interfaceC10585eMo36399r.getName();
                    C9801m.m32345e(name, "descriptor.name");
                    InterfaceC10594h interfaceC10594hMo33316f = interfaceC10251h.mo33316f(name, EnumC9941d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC10585eMo36399r = interfaceC10594hMo33316f instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo33316f : interfaceC10594hMo33316f instanceof InterfaceC10584d1 ? ((InterfaceC10584d1) interfaceC10594hMo33316f).mo36399r() : null;
                }
                if (interfaceC10585eMo36399r != null) {
                    if (C10187d.m35838z(interfaceC10585eMo36399r, interfaceC10585e)) {
                        linkedHashSet.add(interfaceC10585eMo36399r);
                    }
                    if (z) {
                        InterfaceC10251h interfaceC10251hMo33348y0 = interfaceC10585eMo36399r.mo33348y0();
                        C9801m.m32345e(interfaceC10251hMo33348y0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m35767b(interfaceC10585e, linkedHashSet, interfaceC10251hMo33348y0, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<InterfaceC10585e> m35768a(InterfaceC10585e interfaceC10585e, boolean z) {
        InterfaceC10609m next;
        InterfaceC10609m interfaceC10609mMo32876b;
        C9801m.m32346f(interfaceC10585e, "sealedClass");
        if (interfaceC10585e.mo32879j() != EnumC10583d0.SEALED) {
            return C10817u.m38888j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator<InterfaceC10609m> it = C10235a.m36079m(interfaceC10585e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof InterfaceC10604k0) {
                    break;
                }
            }
            interfaceC10609mMo32876b = next;
        } else {
            interfaceC10609mMo32876b = interfaceC10585e.mo32876b();
        }
        if (interfaceC10609mMo32876b instanceof InterfaceC10604k0) {
            m35767b(interfaceC10585e, linkedHashSet, ((InterfaceC10604k0) interfaceC10609mMo32876b).mo32988q(), z);
        }
        InterfaceC10251h interfaceC10251hMo33348y0 = interfaceC10585e.mo33348y0();
        C9801m.m32345e(interfaceC10251hMo33348y0, "sealedClass.unsubstitutedInnerClassesScope");
        m35767b(interfaceC10585e, linkedHashSet, interfaceC10251hMo33348y0, true);
        return C10782c0.m38618x0(linkedHashSet, new a());
    }
}
