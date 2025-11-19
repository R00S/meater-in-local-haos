package Ja;

import Hb.AbstractC1082f0;
import Hb.C1096m0;
import Hb.G0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Hb.y0;
import Ia.f;
import Ia.q;
import Ia.s;
import Ia.t;
import La.U0;
import La.Y;
import La.Y0;
import Lb.l;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: KClassifiers.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LIa/f;", "", "LIa/s;", "arguments", "", "nullable", "", "annotations", "LIa/q;", "b", "(LIa/f;Ljava/util/List;ZLjava/util/List;)LIa/q;", "LHb/u0;", "attributes", "LHb/y0;", "typeConstructor", "LHb/f0;", "a", "(LHb/u0;LHb/y0;Ljava/util/List;Z)LHb/f0;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: KClassifiers.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ja.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0159a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7658a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f6946B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f6947C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f6948D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7658a = iArr;
        }
    }

    private static final AbstractC1082f0 a(u0 u0Var, y0 y0Var, List<s> list, boolean z10) {
        l c1096m0;
        List<m0> parameters = y0Var.getParameters();
        C3862t.f(parameters, "getParameters(...)");
        List<s> list2 = list;
        ArrayList arrayList = new ArrayList(r.x(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.w();
            }
            s sVar = (s) obj;
            U0 u02 = (U0) sVar.c();
            U uY = u02 != null ? u02.getType() : null;
            t tVarD = sVar.d();
            int i12 = tVarD == null ? -1 : C0159a.f7658a[tVarD.ordinal()];
            if (i12 == -1) {
                m0 m0Var = parameters.get(i10);
                C3862t.f(m0Var, "get(...)");
                c1096m0 = new C1096m0(m0Var);
            } else if (i12 == 1) {
                Q0 q02 = Q0.f5693F;
                C3862t.d(uY);
                c1096m0 = new G0(q02, uY);
            } else if (i12 == 2) {
                Q0 q03 = Q0.f5694G;
                C3862t.d(uY);
                c1096m0 = new G0(q03, uY);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Q0 q04 = Q0.f5695H;
                C3862t.d(uY);
                c1096m0 = new G0(q04, uY);
            }
            arrayList.add(c1096m0);
            i10 = i11;
        }
        return X.k(u0Var, y0Var, arrayList, z10, null, 16, null);
    }

    public static final q b(f fVar, List<s> arguments, boolean z10, List<? extends Annotation> annotations) {
        InterfaceC1695h interfaceC1695hC;
        C3862t.g(fVar, "<this>");
        C3862t.g(arguments, "arguments");
        C3862t.g(annotations, "annotations");
        Ba.a aVar = null;
        byte b10 = 0;
        Y y10 = fVar instanceof Y ? (Y) fVar : null;
        if (y10 == null || (interfaceC1695hC = y10.getDescriptor()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + fVar + " (" + fVar.getClass() + ')');
        }
        y0 y0VarL = interfaceC1695hC.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        List<m0> parameters = y0VarL.getParameters();
        C3862t.f(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new U0(a(annotations.isEmpty() ? u0.f5791C.j() : u0.f5791C.j(), y0VarL, arguments, z10), aVar, 2, b10 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
