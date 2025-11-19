package Ib;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.K;
import Hb.M0;
import Hb.O0;
import Hb.P0;
import Hb.Q0;
import Hb.T;
import Hb.U;
import Hb.X;
import Hb.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import ub.C4701c;

/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes3.dex */
public abstract class f extends Hb.r {

    /* compiled from: KotlinTypePreparator.kt */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6981a = new a();

        private a() {
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* synthetic */ class b extends C3859p implements Ba.l<Lb.i, P0> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final P0 invoke(Lb.i p02) {
            C3862t.g(p02, "p0");
            return ((f) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    private final AbstractC1082f0 c(AbstractC1082f0 abstractC1082f0) {
        U uA;
        y0 y0VarO0 = abstractC1082f0.O0();
        T tO = null;
        p0R0 = null;
        P0 p0R0 = null;
        if (y0VarO0 instanceof C4701c) {
            C4701c c4701c = (C4701c) y0VarO0;
            E0 e0B = c4701c.b();
            if (e0B.b() != Q0.f5694G) {
                e0B = null;
            }
            if (e0B != null && (uA = e0B.a()) != null) {
                p0R0 = uA.R0();
            }
            P0 p02 = p0R0;
            if (c4701c.d() == null) {
                E0 e0B2 = c4701c.b();
                Collection<U> collectionS = c4701c.s();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionS, 10));
                Iterator<T> it = collectionS.iterator();
                while (it.hasNext()) {
                    arrayList.add(((U) it.next()).R0());
                }
                c4701c.f(new n(e0B2, arrayList, null, 4, null));
            }
            Lb.b bVar = Lb.b.f11304B;
            n nVarD = c4701c.d();
            C3862t.d(nVarD);
            return new i(bVar, nVarD, p02, abstractC1082f0.N0(), abstractC1082f0.P0(), false, 32, null);
        }
        boolean z10 = false;
        if (y0VarO0 instanceof vb.s) {
            Collection<U> collectionS2 = ((vb.s) y0VarO0).s();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(collectionS2, 10));
            Iterator<T> it2 = collectionS2.iterator();
            while (it2.hasNext()) {
                U uP = M0.p((U) it2.next(), abstractC1082f0.P0());
                C3862t.f(uP, "makeNullableAsSpecified(...)");
                arrayList2.add(uP);
            }
            return X.m(abstractC1082f0.N0(), new T(arrayList2), kotlin.collections.r.m(), false, abstractC1082f0.s());
        }
        if (!(y0VarO0 instanceof T) || !abstractC1082f0.P0()) {
            return abstractC1082f0;
        }
        T t10 = (T) y0VarO0;
        Collection<U> collectionS3 = t10.s();
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(collectionS3, 10));
        Iterator<T> it3 = collectionS3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Mb.d.B((U) it3.next()));
            z10 = true;
        }
        if (z10) {
            U uI = t10.i();
            tO = new T(arrayList3).o(uI != null ? Mb.d.B(uI) : null);
        }
        if (tO != null) {
            t10 = tO;
        }
        return t10.g();
    }

    @Override // Hb.r
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public P0 a(Lb.i type) {
        P0 p0E;
        C3862t.g(type, "type");
        if (!(type instanceof U)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        P0 p0R0 = ((U) type).R0();
        if (p0R0 instanceof AbstractC1082f0) {
            p0E = c((AbstractC1082f0) p0R0);
        } else {
            if (!(p0R0 instanceof K)) {
                throw new NoWhenBranchMatchedException();
            }
            K k10 = (K) p0R0;
            AbstractC1082f0 abstractC1082f0C = c(k10.W0());
            AbstractC1082f0 abstractC1082f0C2 = c(k10.X0());
            p0E = (abstractC1082f0C == k10.W0() && abstractC1082f0C2 == k10.X0()) ? p0R0 : X.e(abstractC1082f0C, abstractC1082f0C2);
        }
        return O0.c(p0E, p0R0, new b(this));
    }
}
