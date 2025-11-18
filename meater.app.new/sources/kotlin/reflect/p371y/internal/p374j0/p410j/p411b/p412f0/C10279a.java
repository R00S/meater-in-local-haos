package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10128g;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p395y.C10147b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p410j.C10267a;
import kotlin.text.C10546u;

/* compiled from: BuiltInSerializerProtocol.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.a */
/* loaded from: classes3.dex */
public final class C10279a extends C10267a {

    /* renamed from: n */
    public static final C10279a f39754n = new C10279a();

    /* JADX WARN: Illegal instructions before constructor call */
    private C10279a() {
        C10747f c10747fM38348d = C10747f.m38348d();
        C10147b.m35356a(c10747fM38348d);
        C9801m.m32345e(c10747fM38348d, "newInstance().apply(Buil…f::registerAllExtensions)");
        AbstractC10749h.f<C10133l, Integer> fVar = C10147b.f39171a;
        C9801m.m32345e(fVar, "packageFqName");
        AbstractC10749h.f<C10125d, List<C10123b>> fVar2 = C10147b.f39173c;
        C9801m.m32345e(fVar2, "constructorAnnotation");
        AbstractC10749h.f<C10124c, List<C10123b>> fVar3 = C10147b.f39172b;
        C9801m.m32345e(fVar3, "classAnnotation");
        AbstractC10749h.f<C10130i, List<C10123b>> fVar4 = C10147b.f39174d;
        C9801m.m32345e(fVar4, "functionAnnotation");
        AbstractC10749h.f<C10135n, List<C10123b>> fVar5 = C10147b.f39175e;
        C9801m.m32345e(fVar5, "propertyAnnotation");
        AbstractC10749h.f<C10135n, List<C10123b>> fVar6 = C10147b.f39176f;
        C9801m.m32345e(fVar6, "propertyGetterAnnotation");
        AbstractC10749h.f<C10135n, List<C10123b>> fVar7 = C10147b.f39177g;
        C9801m.m32345e(fVar7, "propertySetterAnnotation");
        AbstractC10749h.f<C10128g, List<C10123b>> fVar8 = C10147b.f39179i;
        C9801m.m32345e(fVar8, "enumEntryAnnotation");
        AbstractC10749h.f<C10135n, C10123b.b.c> fVar9 = C10147b.f39178h;
        C9801m.m32345e(fVar9, "compileTimeValue");
        AbstractC10749h.f<C10142u, List<C10123b>> fVar10 = C10147b.f39180j;
        C9801m.m32345e(fVar10, "parameterAnnotation");
        AbstractC10749h.f<C10138q, List<C10123b>> fVar11 = C10147b.f39181k;
        C9801m.m32345e(fVar11, "typeAnnotation");
        AbstractC10749h.f<C10140s, List<C10123b>> fVar12 = C10147b.f39182l;
        C9801m.m32345e(fVar12, "typeParameterAnnotation");
        super(c10747fM38348d, fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    /* renamed from: o */
    private final String m36245o(C10160c c10160c) {
        if (c10160c.m35422d()) {
            return "default-package";
        }
        String strM35455k = c10160c.m35425g().m35455k();
        C9801m.m32345e(strM35455k, "fqName.shortName().asString()");
        return strM35455k;
    }

    /* renamed from: m */
    public final String m36246m(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return m36245o(c10160c) + ".kotlin_builtins";
    }

    /* renamed from: n */
    public final String m36247n(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        StringBuilder sb = new StringBuilder();
        String strM35420b = c10160c.m35420b();
        C9801m.m32345e(strM35420b, "fqName.asString()");
        sb.append(C10546u.m37524z(strM35420b, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(m36246m(c10160c));
        return sb.toString();
    }
}
