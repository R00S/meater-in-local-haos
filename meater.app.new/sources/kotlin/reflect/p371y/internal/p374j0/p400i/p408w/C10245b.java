package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10803n;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10486a;

/* compiled from: ChainedMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.b */
/* loaded from: classes3.dex */
public final class C10245b implements InterfaceC10251h {

    /* renamed from: b */
    public static final a f39624b = new a(null);

    /* renamed from: c */
    private final String f39625c;

    /* renamed from: d */
    private final InterfaceC10251h[] f39626d;

    /* compiled from: ChainedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10251h m36124a(String str, Iterable<? extends InterfaceC10251h> iterable) {
            C9801m.m32346f(str, "debugName");
            C9801m.m32346f(iterable, "scopes");
            C10771e c10771e = new C10771e();
            for (InterfaceC10251h interfaceC10251h : iterable) {
                if (interfaceC10251h != InterfaceC10251h.b.f39671b) {
                    if (interfaceC10251h instanceof C10245b) {
                        C10827z.m38930A(c10771e, ((C10245b) interfaceC10251h).f39626d);
                    } else {
                        c10771e.add(interfaceC10251h);
                    }
                }
            }
            return m36125b(str, c10771e);
        }

        /* renamed from: b */
        public final InterfaceC10251h m36125b(String str, List<? extends InterfaceC10251h> list) {
            C9801m.m32346f(str, "debugName");
            C9801m.m32346f(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return InterfaceC10251h.b.f39671b;
            }
            if (size == 1) {
                return list.get(0);
            }
            Object[] array = list.toArray(new InterfaceC10251h[0]);
            C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C10245b(str, (InterfaceC10251h[]) array, null);
        }
    }

    private C10245b(String str, InterfaceC10251h[] interfaceC10251hArr) {
        this.f39625c = str;
        this.f39626d = interfaceC10251hArr;
    }

    public /* synthetic */ C10245b(String str, InterfaceC10251h[] interfaceC10251hArr, C9789g c9789g) {
        this(str, interfaceC10251hArr);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        InterfaceC10251h[] interfaceC10251hArr = this.f39626d;
        int length = interfaceC10251hArr.length;
        if (length == 0) {
            return C10817u.m38888j();
        }
        if (length == 1) {
            return interfaceC10251hArr[0].mo33311a(c10163f, interfaceC9939b);
        }
        Collection<InterfaceC10739y0> collectionM37230a = null;
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArr) {
            collectionM37230a = C10486a.m37230a(collectionM37230a, interfaceC10251h.mo33311a(c10163f, interfaceC9939b));
        }
        return collectionM37230a == null ? C10822w0.m38917d() : collectionM37230a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        InterfaceC10251h[] interfaceC10251hArr = this.f39626d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArr) {
            C10827z.m38933z(linkedHashSet, interfaceC10251h.mo33312b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        InterfaceC10251h[] interfaceC10251hArr = this.f39626d;
        int length = interfaceC10251hArr.length;
        if (length == 0) {
            return C10817u.m38888j();
        }
        if (length == 1) {
            return interfaceC10251hArr[0].mo33313c(c10163f, interfaceC9939b);
        }
        Collection<InterfaceC10729t0> collectionM37230a = null;
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArr) {
            collectionM37230a = C10486a.m37230a(collectionM37230a, interfaceC10251h.mo33313c(c10163f, interfaceC9939b));
        }
        return collectionM37230a == null ? C10822w0.m38917d() : collectionM37230a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        InterfaceC10251h[] interfaceC10251hArr = this.f39626d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArr) {
            C10827z.m38933z(linkedHashSet, interfaceC10251h.mo33314d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return C10253j.m36161a(C10803n.m38761q(this.f39626d));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        InterfaceC10594h interfaceC10594h = null;
        for (InterfaceC10251h interfaceC10251h : this.f39626d) {
            InterfaceC10594h interfaceC10594hMo33316f = interfaceC10251h.mo33316f(c10163f, interfaceC9939b);
            if (interfaceC10594hMo33316f != null) {
                if (!(interfaceC10594hMo33316f instanceof InterfaceC10597i) || !((InterfaceC10597i) interfaceC10594hMo33316f).mo32863M()) {
                    return interfaceC10594hMo33316f;
                }
                if (interfaceC10594h == null) {
                    interfaceC10594h = interfaceC10594hMo33316f;
                }
            }
        }
        return interfaceC10594h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        InterfaceC10251h[] interfaceC10251hArr = this.f39626d;
        int length = interfaceC10251hArr.length;
        if (length == 0) {
            return C10817u.m38888j();
        }
        if (length == 1) {
            return interfaceC10251hArr[0].mo33317g(c10247d, function1);
        }
        Collection<InterfaceC10609m> collectionM37230a = null;
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArr) {
            collectionM37230a = C10486a.m37230a(collectionM37230a, interfaceC10251h.mo33317g(c10247d, function1));
        }
        return collectionM37230a == null ? C10822w0.m38917d() : collectionM37230a;
    }

    public String toString() {
        return this.f39625c;
    }
}
