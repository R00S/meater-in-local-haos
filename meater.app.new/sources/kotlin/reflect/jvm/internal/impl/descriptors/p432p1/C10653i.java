package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10613n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: CompositePackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.i */
/* loaded from: classes2.dex */
public final class C10653i implements InterfaceC10629o0 {

    /* renamed from: a */
    private final List<InterfaceC10607l0> f40985a;

    /* renamed from: b */
    private final String f40986b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10653i(List<? extends InterfaceC10607l0> list, String str) {
        C9801m.m32346f(list, "providers");
        C9801m.m32346f(str, "debugName");
        this.f40985a = list;
        this.f40986b = str;
        list.size();
        C10782c0.m38574I0(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: a */
    public List<InterfaceC10604k0> mo33276a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC10607l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            C10613n0.m37723a(it.next(), c10160c, arrayList);
        }
        return C10782c0.m38569E0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: b */
    public void mo33277b(C10160c c10160c, Collection<InterfaceC10604k0> collection) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(collection, "packageFragments");
        Iterator<InterfaceC10607l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            C10613n0.m37723a(it.next(), c10160c, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: c */
    public boolean mo33278c(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        List<InterfaceC10607l0> list = this.f40985a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C10613n0.m37724b((InterfaceC10607l0) it.next(), c10160c)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: p */
    public Collection<C10160c> mo33280p(C10160c c10160c, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(function1, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10607l0> it = this.f40985a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mo33280p(c10160c, function1));
        }
        return hashSet;
    }

    public String toString() {
        return this.f40986b;
    }
}
