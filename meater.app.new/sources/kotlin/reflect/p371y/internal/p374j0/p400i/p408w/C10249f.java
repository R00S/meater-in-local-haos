package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: InnerClassesScopeWrapper.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.f */
/* loaded from: classes3.dex */
public final class C10249f extends AbstractC10252i {

    /* renamed from: b */
    private final InterfaceC10251h f39664b;

    public C10249f(InterfaceC10251h interfaceC10251h) {
        C9801m.m32346f(interfaceC10251h, "workerScope");
        this.f39664b = interfaceC10251h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return this.f39664b.mo33312b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return this.f39664b.mo33314d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return this.f39664b.mo33315e();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        InterfaceC10594h interfaceC10594hMo33316f = this.f39664b.mo33316f(c10163f, interfaceC9939b);
        if (interfaceC10594hMo33316f == null) {
            return null;
        }
        InterfaceC10585e interfaceC10585e = interfaceC10594hMo33316f instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo33316f : null;
        if (interfaceC10585e != null) {
            return interfaceC10585e;
        }
        if (interfaceC10594hMo33316f instanceof InterfaceC10584d1) {
            return (InterfaceC10584d1) interfaceC10594hMo33316f;
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10594h> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        C10247d c10247dM36140n = c10247d.m36140n(C10247d.f39630a.m36144c());
        if (c10247dM36140n == null) {
            return C10817u.m38888j();
        }
        Collection<InterfaceC10609m> collectionMo33317g = this.f39664b.mo33317g(c10247dM36140n, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo33317g) {
            if (obj instanceof InterfaceC10597i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f39664b;
    }
}
