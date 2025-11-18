package La;

import La.K0;
import Ma.i;
import Ra.InterfaceC1700m;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LLa/K0$a;", "", "isGetter", "LMa/h;", "b", "(LLa/K0$a;Z)LMa/h;", "LRa/Z;", "g", "(LRa/Z;)Z", "", "f", "(LLa/K0$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class P0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ma.h<?> b(La.K0.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: La.P0.b(La.K0$a, boolean):Ma.h");
    }

    private static final Ma.i<Field> c(K0.a<?, ?> aVar, boolean z10, Field field) {
        Ma.i<Field> aVar2;
        if (g(aVar.c().Z()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar2 = aVar.X() ? new i.g.a(field, e(aVar), f(aVar)) : new i.g.c(field, e(aVar));
            } else {
                if (!aVar.X()) {
                    return new i.f.c(field);
                }
                aVar2 = new i.f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.X() ? new i.f.b(field) : new i.f.d(field);
            }
            aVar2 = aVar.X() ? new i.g.b(field, e(aVar)) : new i.g.d(field, e(aVar));
        } else {
            if (z10) {
                return new i.f.e(field);
            }
            aVar2 = new i.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(K0.a<?, ?> aVar) {
        return aVar.c().Z().getAnnotations().P(j1.j());
    }

    private static final boolean e(K0.a<?, ?> aVar) {
        return !Hb.M0.l(aVar.c().Z().a());
    }

    public static final Object f(K0.a<?, ?> aVar) {
        C3862t.g(aVar, "<this>");
        return aVar.c().e0();
    }

    private static final boolean g(Ra.Z z10) {
        InterfaceC1700m interfaceC1700mC = z10.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        if (!C4597i.x(interfaceC1700mC)) {
            return false;
        }
        InterfaceC1700m interfaceC1700mC2 = interfaceC1700mC.c();
        return !(C4597i.C(interfaceC1700mC2) || C4597i.t(interfaceC1700mC2)) || ((z10 instanceof Fb.N) && pb.i.f(((Fb.N) z10).D()));
    }
}
