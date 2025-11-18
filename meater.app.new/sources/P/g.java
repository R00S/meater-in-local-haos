package P;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.C1489A0;
import kotlin.InterfaceC1542f;
import kotlin.Metadata;
import kotlin.Q0;
import kotlin.SlotWriter;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: Operations.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 I2\u00020\u0001:\u0003037B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u001e\u0010\u0017\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J)\u0010*\u001a\u00020\t2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b-\u0010.R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00104R\u0011\u0010H\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"LP/g;", "LP/h;", "<init>", "()V", "", "currentSize", "requiredSize", "o", "(II)I", "Loa/F;", "p", "(I)V", "q", "paramCount", "n", "(I)I", "LP/d;", "v", "()LP/d;", "LP/d$q;", "parameter", "z", "LP/d$t;", "A", "", "t", "()Z", "u", "m", "operation", "y", "(LP/d;)V", "x", "other", "w", "(LP/g;)V", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "r", "(LO/f;LO/c1;LO/Q0;)V", "", "toString", "()Ljava/lang/String;", "", "a", "[LP/d;", "opCodes", "b", "I", "opCodesSize", "", "c", "[I", "intArgs", "d", "intArgsSize", "", "e", "[Ljava/lang/Object;", "objectArgs", "f", "objectArgsSize", "g", "pushedIntMask", "h", "pushedObjectMask", "s", "()I", "size", "i", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final int f13692j = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int opCodesSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int intArgsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int objectArgsSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int pushedObjectMask;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d[] opCodes = new d[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] intArgs = new int[16];

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] objectArgs = new Object[16];

    /* compiled from: Operations.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LP/g$b;", "LP/e;", "<init>", "(LP/g;)V", "", "d", "()Z", "LP/d$q;", "parameter", "", "b", "(I)I", "T", "LP/d$t;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "intIdx", "c", "objIdx", "LP/d;", "()LP/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public b() {
        }

        @Override // P.e
        public <T> T a(int parameter) {
            return (T) g.this.objectArgs[this.objIdx + parameter];
        }

        @Override // P.e
        public int b(int parameter) {
            return g.this.intArgs[this.intIdx + parameter];
        }

        public final d c() {
            d dVar = g.this.opCodes[this.opIdx];
            C3862t.d(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.opIdx >= g.this.opCodesSize) {
                return false;
            }
            d dVarC = c();
            this.intIdx += dVarC.getInts();
            this.objIdx += dVarC.getObjects();
            int i10 = this.opIdx + 1;
            this.opIdx = i10;
            return i10 < g.this.opCodesSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int parameter) {
        return (this.objectArgsSize - v().getObjects()) + parameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int paramCount) {
        if (paramCount == 0) {
            return 0;
        }
        return (-1) >>> (32 - paramCount);
    }

    private final int o(int currentSize, int requiredSize) {
        return Ha.g.d(currentSize + Ha.g.g(currentSize, 1024), requiredSize);
    }

    private final void p(int requiredSize) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (requiredSize > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, requiredSize));
            C3862t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.intArgs = iArrCopyOf;
        }
    }

    private final void q(int requiredSize) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (requiredSize > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, requiredSize));
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.objectArgs = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d v() {
        d dVar = this.opCodes[this.opCodesSize - 1];
        C3862t.d(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int parameter) {
        return (this.intArgsSize - v().getInts()) + parameter;
    }

    public final void m() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        C3831l.u(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void r(InterfaceC1542f<?> applier, SlotWriter slots, Q0 rememberManager) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, applier, slots, rememberManager);
            } while (bVar.d());
        }
        m();
    }

    /* renamed from: s, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean t() {
        return getOpCodesSize() == 0;
    }

    @InterfaceC4156a
    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return getOpCodesSize() != 0;
    }

    public final void w(g other) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.opCodes;
        int i10 = this.opCodesSize - 1;
        this.opCodesSize = i10;
        d dVar = dVarArr[i10];
        C3862t.d(dVar);
        this.opCodes[this.opCodesSize] = null;
        other.y(dVar);
        int i11 = this.objectArgsSize;
        int i12 = other.objectArgsSize;
        int iD = dVar.getObjects();
        for (int i13 = 0; i13 < iD; i13++) {
            i12--;
            i11--;
            Object[] objArr = other.objectArgs;
            Object[] objArr2 = this.objectArgs;
            objArr[i12] = objArr2[i11];
            objArr2[i11] = null;
        }
        int i14 = this.intArgsSize;
        int i15 = other.intArgsSize;
        int iB = dVar.getInts();
        for (int i16 = 0; i16 < iB; i16++) {
            i15--;
            i14--;
            int[] iArr = other.intArgs;
            int[] iArr2 = this.intArgs;
            iArr[i15] = iArr2[i14];
            iArr2[i14] = 0;
        }
        this.objectArgsSize -= dVar.getObjects();
        this.intArgsSize -= dVar.getInts();
    }

    public final void x(d operation) {
        if (!(operation.getInts() == 0 && operation.getObjects() == 0)) {
            C1489A0.a("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.");
        }
        y(operation);
    }

    public final void y(d operation) {
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i10 = this.opCodesSize;
        if (i10 == this.opCodes.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + Ha.g.g(i10, 1024));
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.opCodes = (d[]) objArrCopyOf;
        }
        p(this.intArgsSize + operation.getInts());
        q(this.objectArgsSize + operation.getObjects());
        d[] dVarArr = this.opCodes;
        int i11 = this.opCodesSize;
        this.opCodesSize = i11 + 1;
        dVarArr[i11] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    /* compiled from: Operations.kt */
    @Aa.b
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LP/g$c;", "", "LP/g;", "stack", "a", "(LP/g;)LP/g;", "LP/d$q;", "parameter", "", "value", "Loa/F;", "c", "(LP/g;II)V", "T", "LP/d$t;", "d", "(LP/g;ILjava/lang/Object;)V", "LP/d;", "b", "(LP/g;)LP/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            int i12 = 1 << i10;
            if (!((gVar.pushedIntMask & i12) == 0)) {
                C1489A0.b("Already pushed argument " + b(gVar).e(i10));
            }
            gVar.pushedIntMask |= i12;
            gVar.intArgs[gVar.z(i10)] = i11;
        }

        public static final <T> void d(g gVar, int i10, T t10) {
            int i11 = 1 << i10;
            if (!((gVar.pushedObjectMask & i11) == 0)) {
                C1489A0.b("Already pushed argument " + b(gVar).f(i10));
            }
            gVar.pushedObjectMask |= i11;
            gVar.objectArgs[gVar.A(i10)] = t10;
        }

        public static g a(g gVar) {
            return gVar;
        }
    }
}
