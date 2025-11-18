package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C10803n;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9937a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10253j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10486a;

/* compiled from: JvmPackageScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.d */
/* loaded from: classes2.dex */
public final class C9998d implements InterfaceC10251h {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f38019b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9998d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: c */
    private final C9990g f38020c;

    /* renamed from: d */
    private final C10002h f38021d;

    /* renamed from: e */
    private final C10003i f38022e;

    /* renamed from: f */
    private final InterfaceC10325i f38023f;

    /* compiled from: JvmPackageScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.d$a */
    static final class a extends Lambda implements Function0<InterfaceC10251h[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10251h[] invoke() {
            Collection<InterfaceC10101q> collectionValues = C9998d.this.f38021d.m33427N0().values();
            C9998d c9998d = C9998d.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                InterfaceC10251h interfaceC10251hM33970b = c9998d.f38020c.m33282a().m33242b().m33970b(c9998d.f38021d, (InterfaceC10101q) it.next());
                if (interfaceC10251hM33970b != null) {
                    arrayList.add(interfaceC10251hM33970b);
                }
            }
            Object[] array = C10486a.m37231b(arrayList).toArray(new InterfaceC10251h[0]);
            C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (InterfaceC10251h[]) array;
        }
    }

    public C9998d(C9990g c9990g, InterfaceC10044u interfaceC10044u, C10002h c10002h) {
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10044u, "jPackage");
        C9801m.m32346f(c10002h, "packageFragment");
        this.f38020c = c9990g;
        this.f38021d = c10002h;
        this.f38022e = new C10003i(c9990g, interfaceC10044u, c10002h);
        this.f38023f = c9990g.m33286e().mo36516d(new a());
    }

    /* renamed from: k */
    private final InterfaceC10251h[] m33310k() {
        return (InterfaceC10251h[]) C10329m.m36555a(this.f38023f, this, f38019b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33319l(c10163f, interfaceC9939b);
        C10003i c10003i = this.f38022e;
        InterfaceC10251h[] interfaceC10251hArrM33310k = m33310k();
        Collection<? extends InterfaceC10739y0> collectionMo33311a = c10003i.mo33311a(c10163f, interfaceC9939b);
        int length = interfaceC10251hArrM33310k.length;
        int i2 = 0;
        Collection collection = collectionMo33311a;
        while (i2 < length) {
            Collection collectionM37230a = C10486a.m37230a(collection, interfaceC10251hArrM33310k[i2].mo33311a(c10163f, interfaceC9939b));
            i2++;
            collection = collectionM37230a;
        }
        return collection == null ? C10822w0.m38917d() : collection;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        InterfaceC10251h[] interfaceC10251hArrM33310k = m33310k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArrM33310k) {
            C10827z.m38933z(linkedHashSet, interfaceC10251h.mo33312b());
        }
        linkedHashSet.addAll(this.f38022e.mo33312b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33319l(c10163f, interfaceC9939b);
        C10003i c10003i = this.f38022e;
        InterfaceC10251h[] interfaceC10251hArrM33310k = m33310k();
        Collection<? extends InterfaceC10729t0> collectionMo33313c = c10003i.mo33313c(c10163f, interfaceC9939b);
        int length = interfaceC10251hArrM33310k.length;
        int i2 = 0;
        Collection collection = collectionMo33313c;
        while (i2 < length) {
            Collection collectionM37230a = C10486a.m37230a(collection, interfaceC10251hArrM33310k[i2].mo33313c(c10163f, interfaceC9939b));
            i2++;
            collection = collectionM37230a;
        }
        return collection == null ? C10822w0.m38917d() : collection;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        InterfaceC10251h[] interfaceC10251hArrM33310k = m33310k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArrM33310k) {
            C10827z.m38933z(linkedHashSet, interfaceC10251h.mo33314d());
        }
        linkedHashSet.addAll(this.f38022e.mo33314d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        Set<C10163f> setM36161a = C10253j.m36161a(C10803n.m38761q(m33310k()));
        if (setM36161a == null) {
            return null;
        }
        setM36161a.addAll(this.f38022e.mo33315e());
        return setM36161a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m33319l(c10163f, interfaceC9939b);
        InterfaceC10585e interfaceC10585eM33436P = this.f38022e.mo33316f(c10163f, interfaceC9939b);
        if (interfaceC10585eM33436P != null) {
            return interfaceC10585eM33436P;
        }
        InterfaceC10594h interfaceC10594h = null;
        for (InterfaceC10251h interfaceC10251h : m33310k()) {
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
        C10003i c10003i = this.f38022e;
        InterfaceC10251h[] interfaceC10251hArrM33310k = m33310k();
        Collection<InterfaceC10609m> collectionMo33317g = c10003i.mo33317g(c10247d, function1);
        for (InterfaceC10251h interfaceC10251h : interfaceC10251hArrM33310k) {
            collectionMo33317g = C10486a.m37230a(collectionMo33317g, interfaceC10251h.mo33317g(c10247d, function1));
        }
        return collectionMo33317g == null ? C10822w0.m38917d() : collectionMo33317g;
    }

    /* renamed from: j */
    public final C10003i m33318j() {
        return this.f38022e;
    }

    /* renamed from: l */
    public void m33319l(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        C9937a.m33014b(this.f38020c.m33282a().m33252l(), interfaceC9939b, this.f38021d, c10163f);
    }

    public String toString() {
        return "scope for " + this.f38021d;
    }
}
