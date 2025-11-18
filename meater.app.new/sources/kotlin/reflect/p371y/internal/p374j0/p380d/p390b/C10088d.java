package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.C10775u;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.utils.C10770d;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9913g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9918l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10189f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10341d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10455x;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10406q;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.text.C10546u;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.d */
/* loaded from: classes3.dex */
public final class C10088d {
    /* renamed from: a */
    public static final String m33951a(InterfaceC10585e interfaceC10585e, InterfaceC10109y<?> interfaceC10109y) {
        C9801m.m32346f(interfaceC10585e, "klass");
        C9801m.m32346f(interfaceC10109y, "typeMappingConfiguration");
        String strMo34058b = interfaceC10109y.mo34058b(interfaceC10585e);
        if (strMo34058b != null) {
            return strMo34058b;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10585e.mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "klass.containingDeclaration");
        String strM35457u = C10165h.m35460b(interfaceC10585e.getName()).m35457u();
        C9801m.m32345e(strM35457u, "safeIdentifier(klass.name).identifier");
        if (interfaceC10609mMo32876b instanceof InterfaceC10604k0) {
            C10160c c10160cMo37712d = ((InterfaceC10604k0) interfaceC10609mMo32876b).mo37712d();
            if (c10160cMo37712d.m35422d()) {
                return strM35457u;
            }
            StringBuilder sb = new StringBuilder();
            String strM35420b = c10160cMo37712d.m35420b();
            C9801m.m32345e(strM35420b, "fqName.asString()");
            sb.append(C10546u.m37524z(strM35420b, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(strM35457u);
            return sb.toString();
        }
        InterfaceC10585e interfaceC10585e2 = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
        if (interfaceC10585e2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC10609mMo32876b + " for " + interfaceC10585e);
        }
        String strMo34060d = interfaceC10109y.mo34060d(interfaceC10585e2);
        if (strMo34060d == null) {
            strMo34060d = m33951a(interfaceC10585e2, interfaceC10109y);
        }
        return strMo34060d + '$' + strM35457u;
    }

    /* renamed from: b */
    public static /* synthetic */ String m33952b(InterfaceC10585e interfaceC10585e, InterfaceC10109y interfaceC10109y, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC10109y = C10110z.f38490a;
        }
        return m33951a(interfaceC10585e, interfaceC10109y);
    }

    /* renamed from: c */
    public static final boolean m33953c(InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(interfaceC10573a, "descriptor");
        if (interfaceC10573a instanceof InterfaceC10606l) {
            return true;
        }
        AbstractC10344e0 returnType = interfaceC10573a.getReturnType();
        C9801m.m32343c(returnType);
        if (AbstractC9914h.m32727B0(returnType)) {
            AbstractC10344e0 returnType2 = interfaceC10573a.getReturnType();
            C9801m.m32343c(returnType2);
            if (!C10372n1.m36779l(returnType2) && !(interfaceC10573a instanceof InterfaceC10731u0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [T, java.lang.Object] */
    /* renamed from: d */
    public static final <T> T m33954d(AbstractC10344e0 abstractC10344e0, InterfaceC10097m<T> interfaceC10097m, C10082a0 c10082a0, InterfaceC10109y<? extends T> interfaceC10109y, C10094j<T> c10094j, Function3<? super AbstractC10344e0, ? super T, ? super C10082a0, C10775u> function3) {
        T t;
        AbstractC10344e0 abstractC10344e02;
        Object objM33954d;
        C9801m.m32346f(abstractC10344e0, "kotlinType");
        C9801m.m32346f(interfaceC10097m, "factory");
        C9801m.m32346f(c10082a0, "mode");
        C9801m.m32346f(interfaceC10109y, "typeMappingConfiguration");
        C9801m.m32346f(function3, "writeGenericType");
        AbstractC10344e0 abstractC10344e0Mo34061e = interfaceC10109y.mo34061e(abstractC10344e0);
        if (abstractC10344e0Mo34061e != null) {
            return (T) m33954d(abstractC10344e0Mo34061e, interfaceC10097m, c10082a0, interfaceC10109y, c10094j, function3);
        }
        if (C9913g.m32721q(abstractC10344e0)) {
            return (T) m33954d(C9918l.m32837a(abstractC10344e0), interfaceC10097m, c10082a0, interfaceC10109y, c10094j, function3);
        }
        C10406q c10406q = C10406q.f40209a;
        Object objM33889b = C10084b0.m33889b(c10406q, abstractC10344e0, interfaceC10097m, c10082a0);
        if (objM33889b != null) {
            ?? r11 = (Object) C10084b0.m33888a(interfaceC10097m, objM33889b, c10082a0.m33858d());
            function3.mo26879d(abstractC10344e0, r11, c10082a0);
            return r11;
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        if (interfaceC10345e1Mo35993O0 instanceof C10341d0) {
            C10341d0 c10341d0 = (C10341d0) interfaceC10345e1Mo35993O0;
            AbstractC10344e0 abstractC10344e0M36603i = c10341d0.m36603i();
            if (abstractC10344e0M36603i == null) {
                abstractC10344e0M36603i = interfaceC10109y.mo34059c(c10341d0.mo35998a());
            }
            return (T) m33954d(C10457a.m37157w(abstractC10344e0M36603i), interfaceC10097m, c10082a0, interfaceC10109y, c10094j, function3);
        }
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1Mo35993O0.mo32891w();
        if (interfaceC10594hMo32887c == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC10344e0);
        }
        if (C10427k.m37054m(interfaceC10594hMo32887c)) {
            T t2 = (T) interfaceC10097m.mo34008c("error/NonExistentClass");
            interfaceC10109y.mo34062f(abstractC10344e0, (InterfaceC10585e) interfaceC10594hMo32887c);
            if (c10094j == null) {
                return t2;
            }
            throw null;
        }
        boolean z = interfaceC10594hMo32887c instanceof InterfaceC10585e;
        if (z && AbstractC9914h.m32738c0(abstractC10344e0)) {
            if (abstractC10344e0.mo35991M0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC10351g1 interfaceC10351g1 = abstractC10344e0.mo35991M0().get(0);
            AbstractC10344e0 type = interfaceC10351g1.getType();
            C9801m.m32345e(type, "memberProjection.type");
            if (interfaceC10351g1.mo36708a() == EnumC10384r1.IN_VARIANCE) {
                objM33954d = interfaceC10097m.mo34008c("java/lang/Object");
                if (c10094j != null) {
                    throw null;
                }
            } else {
                if (c10094j != null) {
                    throw null;
                }
                EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1.mo36708a();
                C9801m.m32345e(enumC10384r1Mo36708a, "memberProjection.projectionKind");
                objM33954d = m33954d(type, interfaceC10097m, c10082a0.m33860f(enumC10384r1Mo36708a, true), interfaceC10109y, c10094j, function3);
                if (c10094j != null) {
                    throw null;
                }
            }
            return (T) interfaceC10097m.mo34007b('[' + interfaceC10097m.mo34006a(objM33954d));
        }
        if (!z) {
            if (!(interfaceC10594hMo32887c instanceof InterfaceC10587e1)) {
                if ((interfaceC10594hMo32887c instanceof InterfaceC10584d1) && c10082a0.m33856b()) {
                    return (T) m33954d(((InterfaceC10584d1) interfaceC10594hMo32887c).mo36395W(), interfaceC10097m, c10082a0, interfaceC10109y, c10094j, function3);
                }
                throw new UnsupportedOperationException("Unknown type " + abstractC10344e0);
            }
            AbstractC10344e0 abstractC10344e0M37143i = C10457a.m37143i((InterfaceC10587e1) interfaceC10594hMo32887c);
            if (abstractC10344e0.mo33691P0()) {
                abstractC10344e0M37143i = C10457a.m37154t(abstractC10344e0M37143i);
            }
            T t3 = (T) m33954d(abstractC10344e0M37143i, interfaceC10097m, c10082a0, interfaceC10109y, null, C10770d.m38526b());
            if (c10094j == null) {
                return t3;
            }
            C9801m.m32345e(interfaceC10594hMo32887c.getName(), "descriptor.getName()");
            throw null;
        }
        if (C10189f.m35840b(interfaceC10594hMo32887c) && !c10082a0.m33857c() && (abstractC10344e02 = (AbstractC10344e0) C10455x.m37129a(c10406q, abstractC10344e0)) != null) {
            return (T) m33954d(abstractC10344e02, interfaceC10097m, c10082a0.m33861g(), interfaceC10109y, c10094j, function3);
        }
        if (c10082a0.m33859e() && AbstractC9914h.m32748k0((InterfaceC10585e) interfaceC10594hMo32887c)) {
            t = (Object) interfaceC10097m.mo34010e();
        } else {
            InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10594hMo32887c;
            InterfaceC10585e interfaceC10585eMo37019a = interfaceC10585e.mo37019a();
            C9801m.m32345e(interfaceC10585eMo37019a, "descriptor.original");
            T tMo34057a = interfaceC10109y.mo34057a(interfaceC10585eMo37019a);
            if (tMo34057a == null) {
                if (interfaceC10585e.mo32878i() == EnumC10588f.ENUM_ENTRY) {
                    InterfaceC10609m interfaceC10609mMo32876b = interfaceC10585e.mo32876b();
                    C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC10585e = (InterfaceC10585e) interfaceC10609mMo32876b;
                }
                InterfaceC10585e interfaceC10585eMo37019a2 = interfaceC10585e.mo37019a();
                C9801m.m32345e(interfaceC10585eMo37019a2, "enumClassIfEnumEntry.original");
                t = (Object) interfaceC10097m.mo34008c(m33951a(interfaceC10585eMo37019a2, interfaceC10109y));
            } else {
                t = (Object) tMo34057a;
            }
        }
        function3.mo26879d(abstractC10344e0, t, c10082a0);
        return t;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m33955e(AbstractC10344e0 abstractC10344e0, InterfaceC10097m interfaceC10097m, C10082a0 c10082a0, InterfaceC10109y interfaceC10109y, C10094j c10094j, Function3 function3, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            function3 = C10770d.m38526b();
        }
        return m33954d(abstractC10344e0, interfaceC10097m, c10082a0, interfaceC10109y, c10094j, function3);
    }
}
