package vb;

import Hb.AbstractC1082f0;
import Hb.G0;
import Hb.I0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Hb.y0;
import Ra.H;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: IntegerLiteralTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class q implements y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f51608f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f51609a;

    /* renamed from: b, reason: collision with root package name */
    private final H f51610b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<U> f51611c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1082f0 f51612d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4164i f51613e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: vb.q$a$a, reason: collision with other inner class name */
        private static final class EnumC0740a {

            /* renamed from: B, reason: collision with root package name */
            public static final EnumC0740a f51614B = new EnumC0740a("COMMON_SUPER_TYPE", 0);

            /* renamed from: C, reason: collision with root package name */
            public static final EnumC0740a f51615C = new EnumC0740a("INTERSECTION_TYPE", 1);

            /* renamed from: D, reason: collision with root package name */
            private static final /* synthetic */ EnumC0740a[] f51616D;

            /* renamed from: E, reason: collision with root package name */
            private static final /* synthetic */ InterfaceC4928a f51617E;

            static {
                EnumC0740a[] enumC0740aArrC = c();
                f51616D = enumC0740aArrC;
                f51617E = C4929b.a(enumC0740aArrC);
            }

            private EnumC0740a(String str, int i10) {
            }

            private static final /* synthetic */ EnumC0740a[] c() {
                return new EnumC0740a[]{f51614B, f51615C};
            }

            public static EnumC0740a valueOf(String str) {
                return (EnumC0740a) Enum.valueOf(EnumC0740a.class, str);
            }

            public static EnumC0740a[] values() {
                return (EnumC0740a[]) f51616D.clone();
            }
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51618a;

            static {
                int[] iArr = new int[EnumC0740a.values().length];
                try {
                    iArr[EnumC0740a.f51614B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0740a.f51615C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f51618a = iArr;
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private final AbstractC1082f0 a(Collection<? extends AbstractC1082f0> collection, EnumC0740a enumC0740a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) it.next();
                next = q.f51608f.c((AbstractC1082f0) next, abstractC1082f0, enumC0740a);
            }
            return (AbstractC1082f0) next;
        }

        private final AbstractC1082f0 c(AbstractC1082f0 abstractC1082f0, AbstractC1082f0 abstractC1082f02, EnumC0740a enumC0740a) {
            if (abstractC1082f0 == null || abstractC1082f02 == null) {
                return null;
            }
            y0 y0VarO0 = abstractC1082f0.O0();
            y0 y0VarO02 = abstractC1082f02.O0();
            boolean z10 = y0VarO0 instanceof q;
            if (z10 && (y0VarO02 instanceof q)) {
                return e((q) y0VarO0, (q) y0VarO02, enumC0740a);
            }
            if (z10) {
                return d((q) y0VarO0, abstractC1082f02);
            }
            if (y0VarO02 instanceof q) {
                return d((q) y0VarO02, abstractC1082f0);
            }
            return null;
        }

        private final AbstractC1082f0 d(q qVar, AbstractC1082f0 abstractC1082f0) {
            if (qVar.g().contains(abstractC1082f0)) {
                return abstractC1082f0;
            }
            return null;
        }

        private final AbstractC1082f0 e(q qVar, q qVar2, EnumC0740a enumC0740a) {
            Set setO0;
            int i10 = b.f51618a[enumC0740a.ordinal()];
            if (i10 == 1) {
                setO0 = kotlin.collections.r.o0(qVar.g(), qVar2.g());
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setO0 = kotlin.collections.r.c1(qVar.g(), qVar2.g());
            }
            return X.f(u0.f5791C.j(), new q(qVar.f51609a, qVar.f51610b, setO0, null), false);
        }

        public final AbstractC1082f0 b(Collection<? extends AbstractC1082f0> types) {
            C3862t.g(types, "types");
            return a(types, EnumC0740a.f51615C);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, H h10, Set set, C3854k c3854k) {
        this(j10, h10, set);
    }

    private final List<U> h() {
        return (List) this.f51613e.getValue();
    }

    private final boolean i() {
        Collection<U> collectionA = w.a(this.f51610b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f51611c.contains((U) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        AbstractC1082f0 abstractC1082f0U = qVar.q().x().u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        List listS = kotlin.collections.r.s(I0.f(abstractC1082f0U, kotlin.collections.r.e(new G0(Q0.f5694G, qVar.f51612d)), null, 2, null));
        if (!qVar.i()) {
            listS.add(qVar.q().L());
        }
        return listS;
    }

    private final String k() {
        return '[' + kotlin.collections.r.s0(this.f51611c, ",", null, null, 0, null, p.f51607B, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(U it) {
        C3862t.g(it, "it");
        return it.toString();
    }

    public final Set<U> g() {
        return this.f51611c;
    }

    @Override // Hb.y0
    public List<m0> getParameters() {
        return kotlin.collections.r.m();
    }

    @Override // Hb.y0
    public Oa.j q() {
        return this.f51610b.q();
    }

    @Override // Hb.y0
    public y0 r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Hb.y0
    public Collection<U> s() {
        return h();
    }

    @Override // Hb.y0
    public InterfaceC1695h t() {
        return null;
    }

    public String toString() {
        return "IntegerLiteralType" + k();
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(long j10, H h10, Set<? extends U> set) {
        this.f51612d = X.f(u0.f5791C.j(), this, false);
        this.f51613e = C4165j.a(new o(this));
        this.f51609a = j10;
        this.f51610b = h10;
        this.f51611c = set;
    }
}
