package P;

import W.IntRef;
import java.util.List;
import kotlin.AbstractC1564q;
import kotlin.C1507J0;
import kotlin.C1536d;
import kotlin.C1551j0;
import kotlin.C1553k0;
import kotlin.C1560o;
import kotlin.C1567r0;
import kotlin.InterfaceC1496E;
import kotlin.InterfaceC1511L0;
import kotlin.InterfaceC1542f;
import kotlin.InterfaceC1552k;
import kotlin.InterfaceC1562p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Q0;
import kotlin.R0;
import kotlin.S0;
import kotlin.SlotWriter;
import kotlin.Z0;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:#\u000f\u001b\u001e\u001d\u0014\u0017 !\"#$%&'()*+,-./0123456789:;\u001aB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019\u0082\u0001!<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"LP/d;", "", "", "ints", "objects", "<init>", "(II)V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/d$t;", "f", "toString", "()Ljava/lang/String;", "I", "b", "()I", "d", "c", "name", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "LP/d$a;", "LP/d$b;", "LP/d$c;", "LP/d$d;", "LP/d$e;", "LP/d$f;", "LP/d$g;", "LP/d$h;", "LP/d$i;", "LP/d$j;", "LP/d$k;", "LP/d$l;", "LP/d$m;", "LP/d$n;", "LP/d$o;", "LP/d$p;", "LP/d$r;", "LP/d$s;", "LP/d$u;", "LP/d$v;", "LP/d$w;", "LP/d$x;", "LP/d$y;", "LP/d$z;", "LP/d$A;", "LP/d$B;", "LP/d$C;", "LP/d$D;", "LP/d$E;", "LP/d$F;", "LP/d$G;", "LP/d$H;", "LP/d$I;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int ints;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int objects;

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$A;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class A extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final A f13656c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        private A() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            q02.d((Ba.a) eVar.a(t.a(0)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "effect" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$B;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class B extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final B f13657c = new B();

        /* JADX WARN: Illegal instructions before constructor call */
        private B() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.Z0();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$C;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C f13658c = new C();

        private C() {
            super(1, 0, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            int iB = eVar.b(q.a(0));
            int iG0 = slotWriter.g0();
            int parent = slotWriter.getParent();
            int iG1 = slotWriter.g1(parent);
            int iF1 = slotWriter.f1(parent);
            for (int iMax = Math.max(iG1, iF1 - iB); iMax < iF1; iMax++) {
                Object obj = slotWriter.slots[slotWriter.R(iMax)];
                if (obj instanceof S0) {
                    q02.b(((S0) obj).getWrapped(), iG0 - iMax, -1, -1);
                } else if (obj instanceof C1507J0) {
                    ((C1507J0) obj).x();
                }
            }
            slotWriter.n1(iB);
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "count" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LP/d$D;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/d$t;", "f", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class D extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final D f13659c = new D();

        private D() {
            super(1, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            int iF;
            int iG0;
            Object objA = eVar.a(t.a(0));
            C1536d c1536d = (C1536d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            if (objA instanceof S0) {
                q02.c(((S0) objA).getWrapped());
            }
            int iF2 = slotWriter.F(c1536d);
            Object objU0 = slotWriter.U0(iF2, iB, objA);
            if (!(objU0 instanceof S0)) {
                if (objU0 instanceof C1507J0) {
                    ((C1507J0) objU0).x();
                    return;
                }
                return;
            }
            int iG02 = slotWriter.g0() - slotWriter.d1(iF2, iB);
            S0 s02 = (S0) objU0;
            C1536d after = s02.getAfter();
            if (after == null || !after.b()) {
                iF = -1;
                iG0 = -1;
            } else {
                iF = slotWriter.F(after);
                iG0 = slotWriter.g0() - slotWriter.e1(iF);
            }
            q02.b(s02.getWrapped(), iG02, iF, iG0);
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "groupSlotIndex" : super.e(parameter);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : t.b(parameter, t.a(1)) ? "anchor" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$E;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class E extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final E f13660c = new E();

        /* JADX WARN: Illegal instructions before constructor call */
        private E() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.r1(eVar.a(t.a(0)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "data" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$F;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class F extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final F f13661c = new F();

        private F() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            ((Ba.p) eVar.a(t.a(1))).invoke(interfaceC1542f.b(), eVar.a(t.a(0)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : t.b(parameter, t.a(1)) ? "block" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LP/d$G;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/d$t;", "f", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class G extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final G f13662c = new G();

        /* JADX WARN: Illegal instructions before constructor call */
        private G() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            Object objA = eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            if (objA instanceof S0) {
                q02.c(((S0) objA).getWrapped());
            }
            Object objV0 = slotWriter.V0(iB, objA);
            if (objV0 instanceof S0) {
                q02.b(((S0) objV0).getWrapped(), slotWriter.g0() - slotWriter.d1(slotWriter.getCurrentGroup(), iB), -1, -1);
            } else if (objV0 instanceof C1507J0) {
                ((C1507J0) objV0).x();
            }
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "groupSlotIndex" : super.e(parameter);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$H;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class H extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final H f13663c = new H();

        private H() {
            super(1, 0, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            int iB = eVar.b(q.a(0));
            for (int i10 = 0; i10 < iB; i10++) {
                interfaceC1542f.g();
            }
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "count" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$I;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class I extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final I f13664c = new I();

        /* JADX WARN: Illegal instructions before constructor call */
        private I() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            Object objB = interfaceC1542f.b();
            C3862t.e(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC1552k) objB).p();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$a;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$a, reason: case insensitive filesystem */
    public static final class C1585a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1585a f13665c = new C1585a();

        private C1585a() {
            super(1, 0, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.D(eVar.b(q.a(0)));
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "distance" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$b;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$b, reason: case insensitive filesystem */
    public static final class C1586b extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1586b f13666c = new C1586b();

        private C1586b() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C1536d c1536d = (C1536d) eVar.a(t.a(0));
            Object objA = eVar.a(t.a(1));
            if (objA instanceof S0) {
                q02.c(((S0) objA).getWrapped());
            }
            slotWriter.G(c1536d, objA);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : t.b(parameter, t.a(1)) ? "value" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$c;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$c, reason: case insensitive filesystem */
    public static final class C1587c extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1587c f13667c = new C1587c();

        private C1587c() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            IntRef intRef = (IntRef) eVar.a(t.a(1));
            int element = intRef != null ? intRef.getElement() : 0;
            a aVar = (a) eVar.a(t.a(0));
            if (element > 0) {
                interfaceC1542f = new C1567r0(interfaceC1542f, element);
            }
            aVar.b(interfaceC1542f, slotWriter, q02);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "changes" : t.b(parameter, t.a(1)) ? "effectiveNodeIndex" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$d;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$d, reason: collision with other inner class name */
    public static final class C0204d extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C0204d f13668c = new C0204d();

        private C0204d() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            int element = ((IntRef) eVar.a(t.a(0))).getElement();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = element + i10;
                interfaceC1542f.c(i11, obj);
                interfaceC1542f.h(i11, obj);
            }
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "effectiveNodeIndex" : t.b(parameter, t.a(1)) ? "nodes" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$e;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$e, reason: case insensitive filesystem */
    public static final class C1588e extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1588e f13669c = new C1588e();

        private C1588e() {
            super(0, 4, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C1553k0 c1553k0 = (C1553k0) eVar.a(t.a(2));
            C1553k0 c1553k02 = (C1553k0) eVar.a(t.a(3));
            AbstractC1564q abstractC1564q = (AbstractC1564q) eVar.a(t.a(1));
            C1551j0 c1551j0N = (C1551j0) eVar.a(t.a(0));
            if (c1551j0N == null && (c1551j0N = abstractC1564q.n(c1553k0)) == null) {
                C1560o.t("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<C1536d> listA0 = slotWriter.A0(1, c1551j0N.getSlotTable(), 2);
            C1507J0.Companion companion = C1507J0.INSTANCE;
            InterfaceC1496E composition = c1553k02.getComposition();
            C3862t.e(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.a(slotWriter, listA0, (InterfaceC1511L0) composition);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "resolvedState" : t.b(parameter, t.a(1)) ? "resolvedCompositionContext" : t.b(parameter, t.a(2)) ? "from" : t.b(parameter, t.a(3)) ? "to" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$f;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$f, reason: case insensitive filesystem */
    public static final class C1589f extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1589f f13670c = new C1589f();

        /* JADX WARN: Illegal instructions before constructor call */
        private C1589f() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C1560o.u(slotWriter, q02);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$g;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$g, reason: case insensitive filesystem */
    public static final class C1590g extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1590g f13671c = new C1590g();

        private C1590g() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            IntRef intRef = (IntRef) eVar.a(t.a(0));
            C1536d c1536d = (C1536d) eVar.a(t.a(1));
            C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef.b(f.e(slotWriter, c1536d, interfaceC1542f));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "effectiveNodeIndexOut" : t.b(parameter, t.a(1)) ? "anchor" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$h;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$h, reason: case insensitive filesystem */
    public static final class C1591h extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1591h f13672c = new C1591h();

        /* JADX WARN: Illegal instructions before constructor call */
        private C1591h() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(t.a(0))) {
                interfaceC1542f.d(obj);
            }
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "nodes" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$i;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P.d$i, reason: case insensitive filesystem */
    public static final class C1592i extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C1592i f13673c = new C1592i();

        private C1592i() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            ((Ba.l) eVar.a(t.a(0))).invoke((InterfaceC1562p) eVar.a(t.a(1)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : t.b(parameter, t.a(1)) ? "composition" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$j;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final j f13674c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.T();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$k;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final k f13675c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            f.f(slotWriter, interfaceC1542f, 0);
            slotWriter.T();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$l;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final l f13676c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.W((C1536d) eVar.a(t.a(0)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$m;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final m f13677c = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.V(0);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LP/d$n;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/d$t;", "f", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final n f13678c = new n();

        private n() {
            super(1, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            Object objInvoke = ((Ba.a) eVar.a(t.a(0))).invoke();
            C1536d c1536d = (C1536d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.v1(c1536d, objInvoke);
            interfaceC1542f.h(iB, objInvoke);
            interfaceC1542f.d(objInvoke);
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "insertIndex" : super.e(parameter);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "factory" : t.b(parameter, t.a(1)) ? "groupAnchor" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$o;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class o extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final o f13679c = new o();

        private o() {
            super(0, 2, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            Z0 z02 = (Z0) eVar.a(t.a(1));
            C1536d c1536d = (C1536d) eVar.a(t.a(0));
            slotWriter.I();
            slotWriter.x0(z02, c1536d.d(z02), false);
            slotWriter.U();
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : t.b(parameter, t.a(1)) ? "from" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$p;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final p f13680c = new p();

        private p() {
            super(0, 3, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            Z0 z02 = (Z0) eVar.a(t.a(1));
            C1536d c1536d = (C1536d) eVar.a(t.a(0));
            c cVar = (c) eVar.a(t.a(2));
            SlotWriter slotWriterL = z02.L();
            try {
                cVar.d(interfaceC1542f, slotWriterL, q02);
                C4153F c4153f = C4153F.f46609a;
                slotWriterL.L(true);
                slotWriter.I();
                slotWriter.x0(z02, c1536d.d(z02), false);
                slotWriter.U();
            } catch (Throwable th) {
                slotWriterL.L(false);
                throw th;
            }
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "anchor" : t.b(parameter, t.a(1)) ? "from" : t.b(parameter, t.a(2)) ? "fixups" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$r;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class r extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final r f13681c = new r();

        private r() {
            super(1, 0, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.y0(eVar.b(q.a(0)));
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "offset" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$s;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class s extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final s f13682c = new s();

        private s() {
            super(3, 0, 2, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            interfaceC1542f.f(eVar.b(q.a(0)), eVar.b(q.a(1)), eVar.b(q.a(2)));
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "from" : q.b(parameter, q.a(1)) ? "to" : q.b(parameter, q.a(2)) ? "count" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LP/d$u;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/d$t;", "f", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final u f13683c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C1536d c1536d = (C1536d) eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            interfaceC1542f.g();
            C3862t.e(interfaceC1542f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            interfaceC1542f.c(iB, slotWriter.E0(c1536d));
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "insertIndex" : super.e(parameter);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "groupAnchor" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$v;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class v extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final v f13684c = new v();

        private v() {
            super(0, 3, 1, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            f.g((InterfaceC1496E) eVar.a(t.a(0)), (AbstractC1564q) eVar.a(t.a(1)), (C1553k0) eVar.a(t.a(2)), slotWriter);
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "composition" : t.b(parameter, t.a(1)) ? "parentCompositionContext" : t.b(parameter, t.a(2)) ? "reference" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$w;", "LP/d;", "<init>", "()V", "LP/d$t;", "parameter", "", "f", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class w extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final w f13685c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            q02.c((R0) eVar.a(t.a(0)));
        }

        @Override // P.d
        public String f(int parameter) {
            return t.b(parameter, t.a(0)) ? "value" : super.f(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$x;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class x extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final x f13686c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            C1560o.M(slotWriter, q02);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LP/d$y;", "LP/d;", "<init>", "()V", "LP/d$q;", "parameter", "", "e", "(I)Ljava/lang/String;", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class y extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final y f13687c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            interfaceC1542f.a(eVar.b(q.a(0)), eVar.b(q.a(1)));
        }

        @Override // P.d
        public String e(int parameter) {
            return q.b(parameter, q.a(0)) ? "removeIndex" : q.b(parameter, q.a(1)) ? "count" : super.e(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP/d$z;", "LP/d;", "<init>", "()V", "LP/e;", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "Loa/F;", "a", "(LP/e;LO/f;LO/c1;LO/Q0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class z extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final z f13688c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // P.d
        public void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02) {
            slotWriter.R0();
        }
    }

    public /* synthetic */ d(int i10, int i11, C3854k c3854k) {
        this(i10, i11);
    }

    public abstract void a(e eVar, InterfaceC1542f<?> interfaceC1542f, SlotWriter slotWriter, Q0 q02);

    /* renamed from: b, reason: from getter */
    public final int getInts() {
        return this.ints;
    }

    public final String c() {
        String strR = P.b(getClass()).r();
        return strR == null ? "" : strR;
    }

    /* renamed from: d, reason: from getter */
    public final int getObjects() {
        return this.objects;
    }

    public String e(int parameter) {
        return "IntParameter(" + parameter + ')';
    }

    public String f(int parameter) {
        return "ObjectParameter(" + parameter + ')';
    }

    public String toString() {
        return c();
    }

    private d(int i10, int i11) {
        this.ints = i10;
        this.objects = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, C3854k c3854k) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }

    /* compiled from: Operation.kt */
    @Aa.b
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"LP/d$q;", "", "", "offset", "a", "(I)I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class q {
        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }

        public static int a(int i10) {
            return i10;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0007"}, d2 = {"LP/d$t;", "T", "", "", "offset", "a", "(I)I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    public static final class t<T> {
        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }

        public static <T> int a(int i10) {
            return i10;
        }
    }
}
