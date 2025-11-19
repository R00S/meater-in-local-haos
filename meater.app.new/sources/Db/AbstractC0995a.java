package Db;

import Db.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3922b;
import lb.C3924d;
import lb.C3927g;
import lb.C3929i;
import lb.C3934n;
import lb.C3937q;
import lb.C3939s;
import nb.InterfaceC4077c;

/* compiled from: AbstractAnnotationLoader.kt */
/* renamed from: Db.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0995a<A> implements InterfaceC1002h<A> {

    /* renamed from: a, reason: collision with root package name */
    private final Cb.a f3661a;

    /* compiled from: AbstractAnnotationLoader.kt */
    /* renamed from: Db.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0058a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3662a;

        static {
            int[] iArr = new int[EnumC0998d.values().length];
            try {
                iArr[EnumC0998d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0998d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0998d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3662a = iArr;
        }
    }

    public AbstractC0995a(Cb.a protocol) {
        C3862t.g(protocol, "protocol");
        this.f3661a = protocol;
    }

    @Override // Db.InterfaceC1002h
    public List<A> a(N container, C3927g proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        List listM = (List) proto.v(this.f3661a.d());
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> c(N container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, EnumC0998d kind) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(kind, "kind");
        List listM = null;
        if (proto instanceof C3929i) {
            h.f<C3929i, List<C3922b>> fVarG = this.f3661a.g();
            if (fVarG != null) {
                listM = (List) ((C3929i) proto).v(fVarG);
            }
        } else {
            if (!(proto instanceof C3934n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0058a.f3662a[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            h.f<C3934n, List<C3922b>> fVarL = this.f3661a.l();
            if (fVarL != null) {
                listM = (List) ((C3934n) proto).v(fVarL);
            }
        }
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> d(N container, kotlin.reflect.jvm.internal.impl.protobuf.o callableProto, EnumC0998d kind, int i10, lb.u proto) {
        C3862t.g(container, "container");
        C3862t.g(callableProto, "callableProto");
        C3862t.g(kind, "kind");
        C3862t.g(proto, "proto");
        List listM = (List) proto.v(this.f3661a.h());
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> e(N.a container) {
        C3862t.g(container, "container");
        List listM = (List) container.f().v(this.f3661a.a());
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> f(N container, C3934n proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        h.f<C3934n, List<C3922b>> fVarJ = this.f3661a.j();
        List listM = fVarJ != null ? (List) proto.v(fVarJ) : null;
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> g(C3937q proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        List listM = (List) proto.v(this.f3661a.o());
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> i(N container, C3934n proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        h.f<C3934n, List<C3922b>> fVarK = this.f3661a.k();
        List listM = fVarK != null ? (List) proto.v(fVarK) : null;
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> j(C3939s proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        List listM = (List) proto.v(this.f3661a.p());
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> l(N container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, EnumC0998d kind) {
        List listM;
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(kind, "kind");
        if (proto instanceof C3924d) {
            listM = (List) ((C3924d) proto).v(this.f3661a.c());
        } else if (proto instanceof C3929i) {
            listM = (List) ((C3929i) proto).v(this.f3661a.f());
        } else {
            if (!(proto instanceof C3934n)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0058a.f3662a[kind.ordinal()];
            if (i10 == 1) {
                listM = (List) ((C3934n) proto).v(this.f3661a.i());
            } else if (i10 == 2) {
                listM = (List) ((C3934n) proto).v(this.f3661a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listM = (List) ((C3934n) proto).v(this.f3661a.n());
            }
        }
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C3922b) it.next(), container.b()));
        }
        return arrayList;
    }

    protected final Cb.a m() {
        return this.f3661a;
    }
}
