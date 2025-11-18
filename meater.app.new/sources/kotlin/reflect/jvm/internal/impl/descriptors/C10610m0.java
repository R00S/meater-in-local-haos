package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.sequences.C10522n;

/* compiled from: PackageFragmentProviderImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0 */
/* loaded from: classes2.dex */
public final class C10610m0 implements InterfaceC10629o0 {

    /* renamed from: a */
    private final Collection<InterfaceC10604k0> f40782a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$a */
    static final class a extends Lambda implements Function1<InterfaceC10604k0, C10160c> {

        /* renamed from: f */
        public static final a f40783f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10160c invoke(InterfaceC10604k0 interfaceC10604k0) {
            C9801m.m32346f(interfaceC10604k0, "it");
            return interfaceC10604k0.mo37712d();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$b */
    static final class b extends Lambda implements Function1<C10160c, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10160c f40784f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10160c c10160c) {
            super(1);
            this.f40784f = c10160c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C10160c c10160c) {
            C9801m.m32346f(c10160c, "it");
            return Boolean.valueOf(!c10160c.m35422d() && C9801m.m32341a(c10160c.m35423e(), this.f40784f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10610m0(Collection<? extends InterfaceC10604k0> collection) {
        C9801m.m32346f(collection, "packageFragments");
        this.f40782a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0
    /* renamed from: a */
    public List<InterfaceC10604k0> mo33276a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        Collection<InterfaceC10604k0> collection = this.f40782a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9801m.m32341a(((InterfaceC10604k0) obj).mo37712d(), c10160c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: b */
    public void mo33277b(C10160c c10160c, Collection<InterfaceC10604k0> collection) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(collection, "packageFragments");
        for (Object obj : this.f40782a) {
            if (C9801m.m32341a(((InterfaceC10604k0) obj).mo37712d(), c10160c)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10629o0
    /* renamed from: c */
    public boolean mo33278c(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        Collection<InterfaceC10604k0> collection = this.f40782a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (C9801m.m32341a(((InterfaceC10604k0) it.next()).mo37712d(), c10160c)) {
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
        return C10522n.m37377A(C10522n.m37382l(C10522n.m37391u(C10782c0.m38575J(this.f40782a), a.f40783f), new b(c10160c)));
    }
}
