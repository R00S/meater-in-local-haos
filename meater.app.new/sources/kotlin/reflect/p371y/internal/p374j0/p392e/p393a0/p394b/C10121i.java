package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10153e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10154f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import okhttp3.HttpUrl;

/* compiled from: JvmProtoBufUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.i */
/* loaded from: classes3.dex */
public final class C10121i {

    /* renamed from: a */
    public static final C10121i f38607a = new C10121i();

    /* renamed from: b */
    private static final C10747f f38608b;

    static {
        C10747f c10747fM38348d = C10747f.m38348d();
        C10112a.m34066a(c10747fM38348d);
        C9801m.m32345e(c10747fM38348d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f38608b = c10747fM38348d;
    }

    private C10121i() {
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC10116d.a m34256d(C10121i c10121i, C10135n c10135n, InterfaceC10151c interfaceC10151c, C10155g c10155g, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return c10121i.m34267c(c10135n, interfaceC10151c, c10155g, z);
    }

    /* renamed from: f */
    public static final boolean m34257f(C10135n c10135n) {
        C9801m.m32346f(c10135n, "proto");
        C10150b.b bVarM34246a = C10115c.f38586a.m34246a();
        Object objM38401u = c10135n.m38401u(C10112a.f38495e);
        C9801m.m32345e(objM38401u, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean boolMo35368d = bVarM34246a.mo35368d(((Number) objM38401u).intValue());
        C9801m.m32345e(boolMo35368d, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return boolMo35368d.booleanValue();
    }

    /* renamed from: g */
    private final String m34258g(C10138q c10138q, InterfaceC10151c interfaceC10151c) {
        if (c10138q.m35047m0()) {
            return C10114b.m34245b(interfaceC10151c.mo34253a(c10138q.m35033X()));
        }
        return null;
    }

    /* renamed from: h */
    public static final Pair<C10118f, C10124c> m34259h(byte[] bArr, String[] strArr) {
        C9801m.m32346f(bArr, "bytes");
        C9801m.m32346f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr), C10124c.m34432x1(byteArrayInputStream, f38608b));
    }

    /* renamed from: i */
    public static final Pair<C10118f, C10124c> m34260i(String[] strArr, String[] strArr2) {
        C9801m.m32346f(strArr, "data");
        C9801m.m32346f(strArr2, "strings");
        byte[] bArrM34242e = C10113a.m34242e(strArr);
        C9801m.m32345e(bArrM34242e, "decodeBytes(data)");
        return m34259h(bArrM34242e, strArr2);
    }

    /* renamed from: j */
    public static final Pair<C10118f, C10130i> m34261j(String[] strArr, String[] strArr2) {
        C9801m.m32346f(strArr, "data");
        C9801m.m32346f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C10113a.m34242e(strArr));
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr2), C10130i.m34696F0(byteArrayInputStream, f38608b));
    }

    /* renamed from: k */
    private final C10118f m34262k(InputStream inputStream, String[] strArr) throws IOException {
        C10112a.e eVarM34167D = C10112a.e.m34167D(inputStream, f38608b);
        C9801m.m32345e(eVarM34167D, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C10118f(eVarM34167D, strArr);
    }

    /* renamed from: l */
    public static final Pair<C10118f, C10133l> m34263l(byte[] bArr, String[] strArr) {
        C9801m.m32346f(bArr, "bytes");
        C9801m.m32346f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr), C10133l.m34786e0(byteArrayInputStream, f38608b));
    }

    /* renamed from: m */
    public static final Pair<C10118f, C10133l> m34264m(String[] strArr, String[] strArr2) {
        C9801m.m32346f(strArr, "data");
        C9801m.m32346f(strArr2, "strings");
        byte[] bArrM34242e = C10113a.m34242e(strArr);
        C9801m.m32345e(bArrM34242e, "decodeBytes(data)");
        return m34263l(bArrM34242e, strArr2);
    }

    /* renamed from: a */
    public final C10747f m34265a() {
        return f38608b;
    }

    /* renamed from: b */
    public final AbstractC10116d.b m34266b(C10125d c10125d, InterfaceC10151c interfaceC10151c, C10155g c10155g) {
        String strM38599e0;
        C9801m.m32346f(c10125d, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        AbstractC10749h.f<C10125d, C10112a.c> fVar = C10112a.f38491a;
        C9801m.m32345e(fVar, "constructorSignature");
        C10112a.c cVar = (C10112a.c) C10153e.m35380a(c10125d, fVar);
        String string = (cVar == null || !cVar.m34116z()) ? "<init>" : interfaceC10151c.getString(cVar.m34114x());
        if (cVar == null || !cVar.m34115y()) {
            List<C10142u> listM34540M = c10125d.m34540M();
            C9801m.m32345e(listM34540M, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34540M, 10));
            for (C10142u c10142u : listM34540M) {
                C10121i c10121i = f38607a;
                C9801m.m32345e(c10142u, "it");
                String strM34258g = c10121i.m34258g(C10154f.m35395n(c10142u, c10155g), interfaceC10151c);
                if (strM34258g == null) {
                    return null;
                }
                arrayList.add(strM34258g);
            }
            strM38599e0 = C10782c0.m38599e0(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")V", 0, null, null, 56, null);
        } else {
            strM38599e0 = interfaceC10151c.getString(cVar.m34113w());
        }
        return new AbstractC10116d.b(string, strM38599e0);
    }

    /* renamed from: c */
    public final AbstractC10116d.a m34267c(C10135n c10135n, InterfaceC10151c interfaceC10151c, C10155g c10155g, boolean z) {
        String strM34258g;
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        AbstractC10749h.f<C10135n, C10112a.d> fVar = C10112a.f38494d;
        C9801m.m32345e(fVar, "propertySignature");
        C10112a.d dVar = (C10112a.d) C10153e.m35380a(c10135n, fVar);
        if (dVar == null) {
            return null;
        }
        C10112a.b bVarM34139A = dVar.m34144F() ? dVar.m34139A() : null;
        if (bVarM34139A == null && z) {
            return null;
        }
        int iM34887d0 = (bVarM34139A == null || !bVarM34139A.m34085z()) ? c10135n.m34887d0() : bVarM34139A.m34083x();
        if (bVarM34139A == null || !bVarM34139A.m34084y()) {
            strM34258g = m34258g(C10154f.m35392k(c10135n, c10155g), interfaceC10151c);
            if (strM34258g == null) {
                return null;
            }
        } else {
            strM34258g = interfaceC10151c.getString(bVarM34139A.m34082w());
        }
        return new AbstractC10116d.a(interfaceC10151c.getString(iM34887d0), strM34258g);
    }

    /* renamed from: e */
    public final AbstractC10116d.b m34268e(C10130i c10130i, InterfaceC10151c interfaceC10151c, C10155g c10155g) {
        String string;
        C9801m.m32346f(c10130i, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        AbstractC10749h.f<C10130i, C10112a.c> fVar = C10112a.f38492b;
        C9801m.m32345e(fVar, "methodSignature");
        C10112a.c cVar = (C10112a.c) C10153e.m35380a(c10130i, fVar);
        int iM34723e0 = (cVar == null || !cVar.m34116z()) ? c10130i.m34723e0() : cVar.m34114x();
        if (cVar == null || !cVar.m34115y()) {
            List listM38892n = C10817u.m38892n(C10154f.m35389h(c10130i, c10155g));
            List<C10142u> listM34735q0 = c10130i.m34735q0();
            C9801m.m32345e(listM34735q0, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34735q0, 10));
            for (C10142u c10142u : listM34735q0) {
                C9801m.m32345e(c10142u, "it");
                arrayList.add(C10154f.m35395n(c10142u, c10155g));
            }
            List listM38609o0 = C10782c0.m38609o0(listM38892n, arrayList);
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(listM38609o0, 10));
            Iterator it = listM38609o0.iterator();
            while (it.hasNext()) {
                String strM34258g = f38607a.m34258g((C10138q) it.next(), interfaceC10151c);
                if (strM34258g == null) {
                    return null;
                }
                arrayList2.add(strM34258g);
            }
            String strM34258g2 = m34258g(C10154f.m35391j(c10130i, c10155g), interfaceC10151c);
            if (strM34258g2 == null) {
                return null;
            }
            string = C10782c0.m38599e0(arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")", 0, null, null, 56, null) + strM34258g2;
        } else {
            string = interfaceC10151c.getString(cVar.m34113w());
        }
        return new AbstractC10116d.b(interfaceC10151c.getString(iM34723e0), string);
    }
}
