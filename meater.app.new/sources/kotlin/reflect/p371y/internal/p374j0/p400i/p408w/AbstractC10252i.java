package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10770d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: MemberScopeImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10252i implements InterfaceC10251h {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<? extends InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        Collection<InterfaceC10609m> collectionMo33317g = mo33317g(C10247d.f39649t, C10770d.m38525a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo33317g) {
            if (obj instanceof InterfaceC10739y0) {
                C10163f name = ((InterfaceC10739y0) obj).getName();
                C9801m.m32345e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<? extends InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        Collection<InterfaceC10609m> collectionMo33317g = mo33317g(C10247d.f39650u, C10770d.m38525a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionMo33317g) {
            if (obj instanceof InterfaceC10739y0) {
                C10163f name = ((InterfaceC10739y0) obj).getName();
                C9801m.m32345e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return C10817u.m38888j();
    }
}
