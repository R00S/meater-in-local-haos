package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.C10039p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.sequences.C10522n;
import kotlin.sequences.Sequence;

/* compiled from: DeclaredMemberIndex.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.a */
/* loaded from: classes2.dex */
public class C9995a implements InterfaceC9996b {

    /* renamed from: a */
    private final InterfaceC10030g f38011a;

    /* renamed from: b */
    private final Function1<InterfaceC10040q, Boolean> f38012b;

    /* renamed from: c */
    private final Function1<InterfaceC10041r, Boolean> f38013c;

    /* renamed from: d */
    private final Map<C10163f, List<InterfaceC10041r>> f38014d;

    /* renamed from: e */
    private final Map<C10163f, InterfaceC10037n> f38015e;

    /* renamed from: f */
    private final Map<C10163f, InterfaceC10046w> f38016f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.a$a */
    static final class a extends Lambda implements Function1<InterfaceC10041r, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10041r interfaceC10041r) {
            C9801m.m32346f(interfaceC10041r, "m");
            return Boolean.valueOf(((Boolean) C9995a.this.f38012b.invoke(interfaceC10041r)).booleanValue() && !C10039p.m33617c(interfaceC10041r));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9995a(InterfaceC10030g interfaceC10030g, Function1<? super InterfaceC10040q, Boolean> function1) {
        C9801m.m32346f(interfaceC10030g, "jClass");
        C9801m.m32346f(function1, "memberFilter");
        this.f38011a = interfaceC10030g;
        this.f38012b = function1;
        a aVar = new a();
        this.f38013c = aVar;
        Sequence sequenceM37382l = C10522n.m37382l(C10782c0.m38575J(interfaceC10030g.mo33593M()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM37382l) {
            C10163f name = ((InterfaceC10041r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f38014d = linkedHashMap;
        Sequence sequenceM37382l2 = C10522n.m37382l(C10782c0.m38575J(this.f38011a.mo33589D()), this.f38012b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceM37382l2) {
            linkedHashMap2.put(((InterfaceC10037n) obj2).getName(), obj2);
        }
        this.f38015e = linkedHashMap2;
        Collection<InterfaceC10046w> collectionMo33598j = this.f38011a.mo33598j();
        Function1<InterfaceC10040q, Boolean> function12 = this.f38012b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionMo33598j) {
            if (((Boolean) function12.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((InterfaceC10046w) obj4).getName(), obj4);
        }
        this.f38016f = linkedHashMap3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: a */
    public Set<C10163f> mo33299a() {
        Sequence sequenceM37382l = C10522n.m37382l(C10782c0.m38575J(this.f38011a.mo33593M()), this.f38013c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM37382l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC10041r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: b */
    public InterfaceC10046w mo33300b(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return this.f38016f.get(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: c */
    public InterfaceC10037n mo33301c(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return this.f38015e.get(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: d */
    public Set<C10163f> mo33302d() {
        return this.f38016f.keySet();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: e */
    public Set<C10163f> mo33303e() {
        Sequence sequenceM37382l = C10522n.m37382l(C10782c0.m38575J(this.f38011a.mo33589D()), this.f38012b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceM37382l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC10037n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9996b
    /* renamed from: f */
    public Collection<InterfaceC10041r> mo33304f(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        List<InterfaceC10041r> list = this.f38014d.get(c10163f);
        return list != null ? list : C10817u.m38888j();
    }
}
