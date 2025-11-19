package La;

import Ia.l;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1712z;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LLa/e1;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "LRa/c0;", "receiver", "Loa/F;", "c", "(Ljava/lang/StringBuilder;LRa/c0;)V", "LRa/a;", "callable", "d", "(Ljava/lang/StringBuilder;LRa/a;)V", "descriptor", "", "e", "(LRa/a;)Ljava/lang/String;", "LRa/Z;", "k", "(LRa/Z;)Ljava/lang/String;", "LRa/z;", "f", "(LRa/z;)Ljava/lang/String;", "invoke", "h", "LLa/y0;", "parameter", "j", "(LLa/y0;)Ljava/lang/String;", "LHb/U;", "type", "l", "(LHb/U;)Ljava/lang/String;", "Lsb/n;", "b", "Lsb/n;", "renderer", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f11201a = new e1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final sb.n renderer = sb.n.f49596h;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11203a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.f6937C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.f6936B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.f6938D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11203a = iArr;
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, Ra.c0 c0Var) {
        if (c0Var != null) {
            Hb.U uA = c0Var.a();
            C3862t.f(uA, "getType(...)");
            sb2.append(l(uA));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, InterfaceC1688a interfaceC1688a) {
        Ra.c0 c0VarI = j1.i(interfaceC1688a);
        Ra.c0 c0VarJ0 = interfaceC1688a.j0();
        c(sb2, c0VarI);
        boolean z10 = (c0VarI == null || c0VarJ0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, c0VarJ0);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(InterfaceC1688a descriptor) {
        if (descriptor instanceof Ra.Z) {
            return k((Ra.Z) descriptor);
        }
        if (descriptor instanceof InterfaceC1712z) {
            return f((InterfaceC1712z) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(Ra.t0 t0Var) {
        e1 e1Var = f11201a;
        Hb.U uA = t0Var.a();
        C3862t.f(uA, "getType(...)");
        return e1Var.l(uA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(Ra.t0 t0Var) {
        e1 e1Var = f11201a;
        Hb.U uA = t0Var.a();
        C3862t.f(uA, "getType(...)");
        return e1Var.l(uA);
    }

    public final String f(InterfaceC1712z descriptor) throws IOException {
        C3862t.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f11201a;
        e1Var.d(sb2, descriptor);
        sb.n nVar = renderer;
        qb.f name = descriptor.getName();
        C3862t.f(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        List<Ra.t0> listK = descriptor.k();
        C3862t.f(listK, "getValueParameters(...)");
        kotlin.collections.B.p0(listK, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : c1.f11184B);
        sb2.append(": ");
        Hb.U returnType = descriptor.getReturnType();
        C3862t.d(returnType);
        sb2.append(e1Var.l(returnType));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final String h(InterfaceC1712z invoke) throws IOException {
        C3862t.g(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f11201a;
        e1Var.d(sb2, invoke);
        List<Ra.t0> listK = invoke.k();
        C3862t.f(listK, "getValueParameters(...)");
        kotlin.collections.B.p0(listK, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : d1.f11198B);
        sb2.append(" -> ");
        Hb.U returnType = invoke.getReturnType();
        C3862t.d(returnType);
        sb2.append(e1Var.l(returnType));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final String j(C1463y0 parameter) {
        C3862t.g(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f11203a[parameter.getKind().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f11201a.e(parameter.p().Z()));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final String k(Ra.Z descriptor) {
        C3862t.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.h0() ? "var " : "val ");
        e1 e1Var = f11201a;
        e1Var.d(sb2, descriptor);
        sb.n nVar = renderer;
        qb.f name = descriptor.getName();
        C3862t.f(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        sb2.append(": ");
        Hb.U uA = descriptor.a();
        C3862t.f(uA, "getType(...)");
        sb2.append(e1Var.l(uA));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final String l(Hb.U type) {
        C3862t.g(type, "type");
        return renderer.U(type);
    }
}
