package pb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3923c;
import lb.C3924d;
import lb.C3929i;
import lb.C3932l;
import lb.C3934n;
import lb.C3937q;
import lb.u;
import nb.C4076b;
import nb.InterfaceC4077c;
import oa.C4170o;
import ob.C4176a;
import pb.d;

/* compiled from: JvmProtoBufUtil.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f47746a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f47747b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f fVarD = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        C4176a.a(fVarD);
        C3862t.f(fVarD, "apply(...)");
        f47747b = fVarD;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, C3934n c3934n, InterfaceC4077c interfaceC4077c, nb.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return iVar.c(c3934n, interfaceC4077c, gVar, z10);
    }

    public static final boolean f(C3934n proto) {
        C3862t.g(proto, "proto");
        C4076b.C0626b c0626bA = c.f47724a.a();
        Object objV = proto.v(C4176a.f46660e);
        C3862t.f(objV, "getExtension(...)");
        Boolean boolD = c0626bA.d(((Number) objV).intValue());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final String g(C3937q c3937q, InterfaceC4077c interfaceC4077c) {
        if (c3937q.n0()) {
            return b.b(interfaceC4077c.a(c3937q.X()));
        }
        return null;
    }

    public static final C4170o<f, C3923c> h(byte[] bytes, String[] strings) {
        C3862t.g(bytes, "bytes");
        C3862t.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new C4170o<>(f47746a.k(byteArrayInputStream, strings), C3923c.y1(byteArrayInputStream, f47747b));
    }

    public static final C4170o<f, C3923c> i(String[] data, String[] strings) {
        C3862t.g(data, "data");
        C3862t.g(strings, "strings");
        byte[] bArrE = C4255a.e(data);
        C3862t.f(bArrE, "decodeBytes(...)");
        return h(bArrE, strings);
    }

    public static final C4170o<f, C3929i> j(String[] data, String[] strings) {
        C3862t.g(data, "data");
        C3862t.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C4255a.e(data));
        return new C4170o<>(f47746a.k(byteArrayInputStream, strings), C3929i.G0(byteArrayInputStream, f47747b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        C4176a.e eVarE = C4176a.e.E(inputStream, f47747b);
        C3862t.f(eVarE, "parseDelimitedFrom(...)");
        return new f(eVarE, strArr);
    }

    public static final C4170o<f, C3932l> l(byte[] bytes, String[] strings) {
        C3862t.g(bytes, "bytes");
        C3862t.g(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new C4170o<>(f47746a.k(byteArrayInputStream, strings), C3932l.e0(byteArrayInputStream, f47747b));
    }

    public static final C4170o<f, C3932l> m(String[] data, String[] strings) {
        C3862t.g(data, "data");
        C3862t.g(strings, "strings");
        byte[] bArrE = C4255a.e(data);
        C3862t.f(bArrE, "decodeBytes(...)");
        return l(bArrE, strings);
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f47747b;
    }

    public final d.b b(C3924d proto, InterfaceC4077c nameResolver, nb.g typeTable) {
        String strS0;
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        h.f<C3924d, C4176a.c> constructorSignature = C4176a.f46656a;
        C3862t.f(constructorSignature, "constructorSignature");
        C4176a.c cVar = (C4176a.c) nb.e.a(proto, constructorSignature);
        String string = (cVar == null || !cVar.A()) ? "<init>" : nameResolver.getString(cVar.y());
        if (cVar == null || !cVar.z()) {
            List<u> listN = proto.N();
            C3862t.f(listN, "getValueParameterList(...)");
            List<u> list = listN;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            for (u uVar : list) {
                i iVar = f47746a;
                C3862t.d(uVar);
                String strG = iVar.g(nb.f.q(uVar, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strS0 = r.s0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strS0 = nameResolver.getString(cVar.x());
        }
        return new d.b(string, strS0);
    }

    public final d.a c(C3934n proto, InterfaceC4077c nameResolver, nb.g typeTable, boolean z10) {
        String strG;
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        h.f<C3934n, C4176a.d> propertySignature = C4176a.f46659d;
        C3862t.f(propertySignature, "propertySignature");
        C4176a.d dVar = (C4176a.d) nb.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        C4176a.b bVarB = dVar.G() ? dVar.B() : null;
        if (bVarB == null && z10) {
            return null;
        }
        int iD0 = (bVarB == null || !bVarB.A()) ? proto.d0() : bVarB.y();
        if (bVarB == null || !bVarB.z()) {
            strG = g(nb.f.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(bVarB.x());
        }
        return new d.a(nameResolver.getString(iD0), strG);
    }

    public final d.b e(C3929i proto, InterfaceC4077c nameResolver, nb.g typeTable) {
        String string;
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        h.f<C3929i, C4176a.c> methodSignature = C4176a.f46657b;
        C3862t.f(methodSignature, "methodSignature");
        C4176a.c cVar = (C4176a.c) nb.e.a(proto, methodSignature);
        int iE0 = (cVar == null || !cVar.A()) ? proto.e0() : cVar.y();
        if (cVar == null || !cVar.z()) {
            List listQ = r.q(nb.f.k(proto, typeTable));
            List<u> listR0 = proto.r0();
            C3862t.f(listR0, "getValueParameterList(...)");
            List<u> list = listR0;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            for (u uVar : list) {
                C3862t.d(uVar);
                arrayList.add(nb.f.q(uVar, typeTable));
            }
            List listF0 = r.F0(listQ, arrayList);
            ArrayList arrayList2 = new ArrayList(r.x(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                String strG = f47746a.g((C3937q) it.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(nb.f.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = r.s0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(cVar.x());
        }
        return new d.b(nameResolver.getString(iE0), string);
    }
}
