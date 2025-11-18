package Eb;

import Ub.n;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3922b;
import lb.C3923c;
import lb.C3924d;
import lb.C3927g;
import lb.C3929i;
import lb.C3932l;
import lb.C3934n;
import lb.C3937q;
import lb.C3939s;
import lb.u;
import mb.C4017b;

/* compiled from: BuiltInSerializerProtocol.kt */
/* loaded from: classes3.dex */
public final class a extends Cb.a {

    /* renamed from: r, reason: collision with root package name */
    public static final a f4154r = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    private a() {
        f fVarD = f.d();
        C4017b.a(fVarD);
        C3862t.f(fVarD, "apply(...)");
        h.f<C3932l, Integer> packageFqName = C4017b.f45425a;
        C3862t.f(packageFqName, "packageFqName");
        h.f<C3924d, List<C3922b>> constructorAnnotation = C4017b.f45427c;
        C3862t.f(constructorAnnotation, "constructorAnnotation");
        h.f<C3923c, List<C3922b>> classAnnotation = C4017b.f45426b;
        C3862t.f(classAnnotation, "classAnnotation");
        h.f<C3929i, List<C3922b>> functionAnnotation = C4017b.f45428d;
        C3862t.f(functionAnnotation, "functionAnnotation");
        h.f<C3934n, List<C3922b>> propertyAnnotation = C4017b.f45429e;
        C3862t.f(propertyAnnotation, "propertyAnnotation");
        h.f<C3934n, List<C3922b>> propertyGetterAnnotation = C4017b.f45430f;
        C3862t.f(propertyGetterAnnotation, "propertyGetterAnnotation");
        h.f<C3934n, List<C3922b>> propertySetterAnnotation = C4017b.f45431g;
        C3862t.f(propertySetterAnnotation, "propertySetterAnnotation");
        h.f<C3927g, List<C3922b>> enumEntryAnnotation = C4017b.f45433i;
        C3862t.f(enumEntryAnnotation, "enumEntryAnnotation");
        h.f<C3934n, C3922b.C0595b.c> compileTimeValue = C4017b.f45432h;
        C3862t.f(compileTimeValue, "compileTimeValue");
        h.f<u, List<C3922b>> parameterAnnotation = C4017b.f45434j;
        C3862t.f(parameterAnnotation, "parameterAnnotation");
        h.f<C3937q, List<C3922b>> typeAnnotation = C4017b.f45435k;
        C3862t.f(typeAnnotation, "typeAnnotation");
        h.f<C3939s, List<C3922b>> typeParameterAnnotation = C4017b.f45436l;
        C3862t.f(typeParameterAnnotation, "typeParameterAnnotation");
        super(fVarD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String s(qb.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String strJ = cVar.g().j();
        C3862t.f(strJ, "asString(...)");
        return strJ;
    }

    public final String q(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String strB = fqName.b();
        C3862t.f(strB, "asString(...)");
        sb2.append(n.B(strB, '.', '/', false, 4, null));
        sb2.append('/');
        sb2.append(q(fqName));
        return sb2.toString();
    }
}
