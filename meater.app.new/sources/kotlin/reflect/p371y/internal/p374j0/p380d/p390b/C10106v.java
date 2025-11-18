package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9954f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9957g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10096l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.v */
/* loaded from: classes3.dex */
public final class C10106v {
    /* renamed from: a */
    private static final void m34037a(StringBuilder sb, AbstractC10344e0 abstractC10344e0) {
        sb.append(m34043g(abstractC10344e0));
    }

    /* renamed from: b */
    public static final String m34038b(InterfaceC10738y interfaceC10738y, boolean z, boolean z2) {
        String strM35455k;
        C9801m.m32346f(interfaceC10738y, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC10738y instanceof InterfaceC10606l) {
                strM35455k = "<init>";
            } else {
                strM35455k = interfaceC10738y.getName().m35455k();
                C9801m.m32345e(strM35455k, "name.asString()");
            }
            sb.append(strM35455k);
        }
        sb.append("(");
        InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10738y.mo37032m0();
        if (interfaceC10735w0Mo37032m0 != null) {
            AbstractC10344e0 type = interfaceC10735w0Mo37032m0.getType();
            C9801m.m32345e(type, "it.type");
            m34037a(sb, type);
        }
        Iterator<InterfaceC10599i1> it = interfaceC10738y.mo37028f().iterator();
        while (it.hasNext()) {
            AbstractC10344e0 type2 = it.next().getType();
            C9801m.m32345e(type2, "parameter.type");
            m34037a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (C10088d.m33953c(interfaceC10738y)) {
                sb.append("V");
            } else {
                AbstractC10344e0 returnType = interfaceC10738y.getReturnType();
                C9801m.m32343c(returnType);
                m34037a(sb, returnType);
            }
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: c */
    public static /* synthetic */ String m34039c(InterfaceC10738y interfaceC10738y, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return m34038b(interfaceC10738y, z, z2);
    }

    /* renamed from: d */
    public static final String m34040d(InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(interfaceC10573a, "<this>");
        C10108x c10108x = C10108x.f38488a;
        if (C10187d.m35804E(interfaceC10573a)) {
            return null;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10573a.mo32876b();
        InterfaceC10585e interfaceC10585e = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
        if (interfaceC10585e == null || interfaceC10585e.getName().m35458y()) {
            return null;
        }
        InterfaceC10573a interfaceC10573aMo37019a = interfaceC10573a.mo37019a();
        InterfaceC10739y0 interfaceC10739y0 = interfaceC10573aMo37019a instanceof InterfaceC10739y0 ? (InterfaceC10739y0) interfaceC10573aMo37019a : null;
        if (interfaceC10739y0 == null) {
            return null;
        }
        return C10105u.m34036a(c10108x, interfaceC10585e, m34039c(interfaceC10739y0, false, false, 3, null));
    }

    /* renamed from: e */
    public static final boolean m34041e(InterfaceC10573a interfaceC10573a) {
        InterfaceC10738y interfaceC10738yM33087k;
        C9801m.m32346f(interfaceC10573a, "f");
        if (!(interfaceC10573a instanceof InterfaceC10738y)) {
            return false;
        }
        InterfaceC10738y interfaceC10738y = (InterfaceC10738y) interfaceC10573a;
        if (!C9801m.m32341a(interfaceC10738y.getName().m35455k(), "remove") || interfaceC10738y.mo37028f().size() != 1 || C9957g0.m33107h((InterfaceC10576b) interfaceC10573a)) {
            return false;
        }
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37019a().mo37028f();
        C9801m.m32345e(listMo37028f, "f.original.valueParameters");
        AbstractC10344e0 type = ((InterfaceC10599i1) C10813s.m38866s0(listMo37028f)).getType();
        C9801m.m32345e(type, "f.original.valueParameters.single().type");
        AbstractC10096l abstractC10096lM34043g = m34043g(type);
        AbstractC10096l.d dVar = abstractC10096lM34043g instanceof AbstractC10096l.d ? (AbstractC10096l.d) abstractC10096lM34043g : null;
        if ((dVar != null ? dVar.m34005i() : null) != EnumC10240e.INT || (interfaceC10738yM33087k = C9954f.m33087k(interfaceC10738y)) == null) {
            return false;
        }
        List<InterfaceC10599i1> listMo37028f2 = interfaceC10738yM33087k.mo37019a().mo37028f();
        C9801m.m32345e(listMo37028f2, "overridden.original.valueParameters");
        AbstractC10344e0 type2 = ((InterfaceC10599i1) C10813s.m38866s0(listMo37028f2)).getType();
        C9801m.m32345e(type2, "overridden.original.valueParameters.single().type");
        AbstractC10096l abstractC10096lM34043g2 = m34043g(type2);
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10738yM33087k.mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "overridden.containingDeclaration");
        return C9801m.m32341a(C10235a.m36075i(interfaceC10609mMo32876b), C9917k.a.f37565c0.m35428j()) && (abstractC10096lM34043g2 instanceof AbstractC10096l.c) && C9801m.m32341a(((AbstractC10096l.c) abstractC10096lM34043g2).m34004i(), "java/lang/Object");
    }

    /* renamed from: f */
    public static final String m34042f(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "<this>");
        C9929c c9929c = C9929c.f37667a;
        C10161d c10161dM35428j = C10235a.m36074h(interfaceC10585e).m35428j();
        C9801m.m32345e(c10161dM35428j, "fqNameSafe.toUnsafe()");
        C10159b c10159bM32929n = c9929c.m32929n(c10161dM35428j);
        if (c10159bM32929n == null) {
            return C10088d.m33952b(interfaceC10585e, null, 2, null);
        }
        String strM36111f = C10239d.m36107b(c10159bM32929n).m36111f();
        C9801m.m32345e(strM36111f, "byClassId(it).internalName");
        return strM36111f;
    }

    /* renamed from: g */
    public static final AbstractC10096l m34043g(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return (AbstractC10096l) C10088d.m33955e(abstractC10344e0, C10098n.f38475a, C10082a0.f38354e, C10110z.f38490a, null, null, 32, null);
    }
}
