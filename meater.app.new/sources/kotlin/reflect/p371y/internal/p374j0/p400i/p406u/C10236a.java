package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.a */
/* loaded from: classes3.dex */
public final class C10236a implements InterfaceC10241f {

    /* renamed from: b */
    private final List<InterfaceC10241f> f39597b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10236a(List<? extends InterfaceC10241f> list) {
        C9801m.m32346f(list, "inner");
        this.f39597b = list;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10241f
    /* renamed from: a */
    public List<C10163f> mo36093a(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "thisDescriptor");
        List<InterfaceC10241f> list = this.f39597b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, ((InterfaceC10241f) it.next()).mo36093a(interfaceC10585e));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10241f
    /* renamed from: b */
    public void mo36094b(InterfaceC10585e interfaceC10585e, C10163f c10163f, Collection<InterfaceC10739y0> collection) {
        C9801m.m32346f(interfaceC10585e, "thisDescriptor");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(collection, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10241f) it.next()).mo36094b(interfaceC10585e, c10163f, collection);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10241f
    /* renamed from: c */
    public void mo36095c(InterfaceC10585e interfaceC10585e, List<InterfaceC10582d> list) {
        C9801m.m32346f(interfaceC10585e, "thisDescriptor");
        C9801m.m32346f(list, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10241f) it.next()).mo36095c(interfaceC10585e, list);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10241f
    /* renamed from: d */
    public List<C10163f> mo36096d(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "thisDescriptor");
        List<InterfaceC10241f> list = this.f39597b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, ((InterfaceC10241f) it.next()).mo36096d(interfaceC10585e));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p406u.InterfaceC10241f
    /* renamed from: e */
    public void mo36097e(InterfaceC10585e interfaceC10585e, C10163f c10163f, Collection<InterfaceC10739y0> collection) {
        C9801m.m32346f(interfaceC10585e, "thisDescriptor");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(collection, "result");
        Iterator<T> it = this.f39597b.iterator();
        while (it.hasNext()) {
            ((InterfaceC10241f) it.next()).mo36097e(interfaceC10585e, c10163f, collection);
        }
    }
}
