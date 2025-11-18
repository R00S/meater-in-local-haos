package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10195l;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10486a;

/* compiled from: TypeIntersectionScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.n */
/* loaded from: classes3.dex */
public final class C10257n extends AbstractC10244a {

    /* renamed from: b */
    public static final a f39681b = new a(null);

    /* renamed from: c */
    private final String f39682c;

    /* renamed from: d */
    private final InterfaceC10251h f39683d;

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10251h m36175a(String str, Collection<? extends AbstractC10344e0> collection) {
            C9801m.m32346f(str, "message");
            C9801m.m32346f(collection, "types");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC10344e0) it.next()).mo33553q());
            }
            C10771e<InterfaceC10251h> c10771eM37231b = C10486a.m37231b(arrayList);
            InterfaceC10251h interfaceC10251hM36125b = C10245b.f39624b.m36125b(str, c10771eM37231b);
            return c10771eM37231b.size() <= 1 ? interfaceC10251hM36125b : new C10257n(str, interfaceC10251hM36125b, null);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$b */
    static final class b extends Lambda implements Function1<InterfaceC10573a, InterfaceC10573a> {

        /* renamed from: f */
        public static final b f39684f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10573a invoke(InterfaceC10573a interfaceC10573a) {
            C9801m.m32346f(interfaceC10573a, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10573a;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$c */
    static final class c extends Lambda implements Function1<InterfaceC10739y0, InterfaceC10573a> {

        /* renamed from: f */
        public static final c f39685f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10573a invoke(InterfaceC10739y0 interfaceC10739y0) {
            C9801m.m32346f(interfaceC10739y0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10739y0;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$d */
    static final class d extends Lambda implements Function1<InterfaceC10729t0, InterfaceC10573a> {

        /* renamed from: f */
        public static final d f39686f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10573a invoke(InterfaceC10729t0 interfaceC10729t0) {
            C9801m.m32346f(interfaceC10729t0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10729t0;
        }
    }

    private C10257n(String str, InterfaceC10251h interfaceC10251h) {
        this.f39682c = str;
        this.f39683d = interfaceC10251h;
    }

    public /* synthetic */ C10257n(String str, InterfaceC10251h interfaceC10251h, C9789g c9789g) {
        this(str, interfaceC10251h);
    }

    /* renamed from: j */
    public static final InterfaceC10251h m36174j(String str, Collection<? extends AbstractC10344e0> collection) {
        return f39681b.m36175a(str, collection);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10244a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10195l.m35986a(super.mo33311a(c10163f, interfaceC9939b), c.f39685f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10244a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10195l.m35986a(super.mo33313c(c10163f, interfaceC9939b), d.f39686f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10244a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        Collection<InterfaceC10609m> collectionMo33317g = super.mo33317g(c10247d, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionMo33317g) {
            if (((InterfaceC10609m) obj) instanceof InterfaceC10573a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.m37646a();
        List list2 = (List) pair.m37647b();
        C9801m.m32344d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C10782c0.m38609o0(C10195l.m35986a(list, b.f39684f), list2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10244a
    /* renamed from: i */
    protected InterfaceC10251h mo36122i() {
        return this.f39683d;
    }
}
