package kotlin.reflect.p371y.internal.p374j0.p422m.p424v;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;

/* compiled from: scopeUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.m.v.a */
/* loaded from: classes3.dex */
public final class C10486a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Collection<T> m37230a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C9801m.m32346f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C10771e<InterfaceC10251h> m37231b(Iterable<? extends InterfaceC10251h> iterable) {
        C9801m.m32346f(iterable, "scopes");
        C10771e<InterfaceC10251h> c10771e = new C10771e<>();
        for (InterfaceC10251h interfaceC10251h : iterable) {
            InterfaceC10251h interfaceC10251h2 = interfaceC10251h;
            if ((interfaceC10251h2 == null || interfaceC10251h2 == InterfaceC10251h.b.f39671b) ? false : true) {
                c10771e.add(interfaceC10251h);
            }
        }
        return c10771e;
    }
}
