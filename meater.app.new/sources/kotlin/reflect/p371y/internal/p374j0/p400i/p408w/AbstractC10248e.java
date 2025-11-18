package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: GivenFunctionsMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10248e extends AbstractC10252i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39658b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10248e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: c */
    private final InterfaceC10585e f39659c;

    /* renamed from: d */
    private final InterfaceC10325i f39660d;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.e$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10609m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10609m> invoke() {
            List<InterfaceC10738y> listMo32904i = AbstractC10248e.this.mo32904i();
            return C10782c0.m38609o0(listMo32904i, AbstractC10248e.this.m36154j(listMo32904i));
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.e$b */
    public static final class b extends AbstractC10191h {

        /* renamed from: a */
        final /* synthetic */ ArrayList<InterfaceC10609m> f39662a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10248e f39663b;

        b(ArrayList<InterfaceC10609m> arrayList, AbstractC10248e abstractC10248e) {
            this.f39662a = arrayList;
            this.f39663b = abstractC10248e;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10192i
        /* renamed from: a */
        public void mo33154a(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "fakeOverride");
            C10193j.m35856K(interfaceC10576b, null);
            this.f39662a.add(interfaceC10576b);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10191h
        /* renamed from: e */
        protected void mo33156e(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2) {
            C9801m.m32346f(interfaceC10576b, "fromSuper");
            C9801m.m32346f(interfaceC10576b2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f39663b.m36156l() + ": " + interfaceC10576b + " vs " + interfaceC10576b2).toString());
        }
    }

    public AbstractC10248e(InterfaceC10330n interfaceC10330n, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10585e, "containingClass");
        this.f39659c = interfaceC10585e;
        this.f39660d = interfaceC10330n.mo36516d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final List<InterfaceC10609m> m36154j(List<? extends InterfaceC10738y> list) {
        Collection<? extends InterfaceC10576b> collectionM38888j;
        ArrayList arrayList = new ArrayList(3);
        Collection<AbstractC10344e0> collectionMo35998a = this.f39659c.mo32877h().mo35998a();
        C9801m.m32345e(collectionMo35998a, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionMo35998a.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList2, InterfaceC10254k.a.m36162a(((AbstractC10344e0) it.next()).mo33553q(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC10576b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C10163f name = ((InterfaceC10576b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C10163f c10163f = (C10163f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC10576b) obj3) instanceof InterfaceC10738y);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C10193j c10193j = C10193j.f39520b;
                if (zBooleanValue) {
                    collectionM38888j = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (C9801m.m32341a(((InterfaceC10738y) obj4).getName(), c10163f)) {
                            collectionM38888j.add(obj4);
                        }
                    }
                } else {
                    collectionM38888j = C10817u.m38888j();
                }
                c10193j.m35886v(c10163f, list3, collectionM38888j, this.f39659c, new b(arrayList, this));
            }
        }
        return C10767a.m38510c(arrayList);
    }

    /* renamed from: k */
    private final List<InterfaceC10609m> m36155k() {
        return (List) C10329m.m36555a(this.f39660d, this, f39658b[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        List<InterfaceC10609m> listM36155k = m36155k();
        C10771e c10771e = new C10771e();
        for (Object obj : listM36155k) {
            if ((obj instanceof InterfaceC10739y0) && C9801m.m32341a(((InterfaceC10739y0) obj).getName(), c10163f)) {
                c10771e.add(obj);
            }
        }
        return c10771e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        List<InterfaceC10609m> listM36155k = m36155k();
        C10771e c10771e = new C10771e();
        for (Object obj : listM36155k) {
            if ((obj instanceof InterfaceC10729t0) && C9801m.m32341a(((InterfaceC10729t0) obj).getName(), c10163f)) {
                c10771e.add(obj);
            }
        }
        return c10771e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return !c10247d.m36137a(C10247d.f39643n.m36139m()) ? C10817u.m38888j() : m36155k();
    }

    /* renamed from: i */
    protected abstract List<InterfaceC10738y> mo32904i();

    /* renamed from: l */
    protected final InterfaceC10585e m36156l() {
        return this.f39659c;
    }
}
