package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10128g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p410j.C10267a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.d */
/* loaded from: classes3.dex */
public final class C10274d implements InterfaceC10272c<InterfaceC10616c, AbstractC10211g<?>> {

    /* renamed from: a */
    private final C10267a f39733a;

    /* renamed from: b */
    private final C10276e f39734b;

    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39735a;

        static {
            int[] iArr = new int[EnumC10270b.values().length];
            iArr[EnumC10270b.PROPERTY.ordinal()] = 1;
            iArr[EnumC10270b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[EnumC10270b.PROPERTY_SETTER.ordinal()] = 3;
            f39735a = iArr;
        }
    }

    public C10274d(InterfaceC10592g0 interfaceC10592g0, C10601j0 c10601j0, C10267a c10267a) {
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(c10267a, "protocol");
        this.f39733a = c10267a;
        this.f39734b = new C10276e(interfaceC10592g0, c10601j0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: a */
    public List<InterfaceC10616c> mo33870a(C10140s c10140s, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10140s, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        List listM38888j = (List) c10140s.m38401u(this.f39733a.m36197l());
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), interfaceC10151c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: b */
    public List<InterfaceC10616c> mo33871b(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b, int i2, C10142u c10142u) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "callableProto");
        C9801m.m32346f(enumC10270b, "kind");
        C9801m.m32346f(c10142u, "proto");
        List listM38888j = (List) c10142u.m38401u(this.f39733a.m36192g());
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), abstractC10316z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: c */
    public List<InterfaceC10616c> mo33872c(AbstractC10316z.a aVar) {
        C9801m.m32346f(aVar, "container");
        List listM38888j = (List) aVar.m36502f().m38401u(this.f39733a.m36186a());
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), aVar.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: d */
    public List<InterfaceC10616c> mo33873d(C10138q c10138q, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10138q, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        List listM38888j = (List) c10138q.m38401u(this.f39733a.m36196k());
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), interfaceC10151c));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: f */
    public List<InterfaceC10616c> mo33874f(AbstractC10316z abstractC10316z, C10128g c10128g) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10128g, "proto");
        List listM38888j = (List) c10128g.m38401u(this.f39733a.m36189d());
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), abstractC10316z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: g */
    public List<InterfaceC10616c> mo33875g(AbstractC10316z abstractC10316z, C10135n c10135n) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: h */
    public List<InterfaceC10616c> mo33876h(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "proto");
        C9801m.m32346f(enumC10270b, "kind");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: i */
    public List<InterfaceC10616c> mo33877i(AbstractC10316z abstractC10316z, C10135n c10135n) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278f
    /* renamed from: j */
    public List<InterfaceC10616c> mo33878j(AbstractC10316z abstractC10316z, InterfaceC10756o interfaceC10756o, EnumC10270b enumC10270b) {
        List listM38888j;
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(interfaceC10756o, "proto");
        C9801m.m32346f(enumC10270b, "kind");
        if (interfaceC10756o instanceof C10125d) {
            listM38888j = (List) ((C10125d) interfaceC10756o).m38401u(this.f39733a.m36188c());
        } else if (interfaceC10756o instanceof C10130i) {
            listM38888j = (List) ((C10130i) interfaceC10756o).m38401u(this.f39733a.m36191f());
        } else {
            if (!(interfaceC10756o instanceof C10135n)) {
                throw new IllegalStateException(("Unknown message: " + interfaceC10756o).toString());
            }
            int i2 = a.f39735a[enumC10270b.ordinal()];
            if (i2 == 1) {
                listM38888j = (List) ((C10135n) interfaceC10756o).m38401u(this.f39733a.m36193h());
            } else if (i2 == 2) {
                listM38888j = (List) ((C10135n) interfaceC10756o).m38401u(this.f39733a.m36194i());
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                listM38888j = (List) ((C10135n) interfaceC10756o).m38401u(this.f39733a.m36195j());
            }
        }
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38888j, 10));
        Iterator it = listM38888j.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f39734b.m36242a((C10123b) it.next(), abstractC10316z.m36498b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10272c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC10211g<?> mo33843k(AbstractC10316z abstractC10316z, C10135n c10135n, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(abstractC10344e0, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10272c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC10211g<?> mo33842e(AbstractC10316z abstractC10316z, C10135n c10135n, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(abstractC10344e0, "expectedType");
        C10123b.b.c cVar = (C10123b.b.c) C10153e.m35380a(c10135n, this.f39733a.m36187b());
        if (cVar == null) {
            return null;
        }
        return this.f39734b.m36243f(abstractC10344e0, cVar, abstractC10316z.m36498b());
    }
}
