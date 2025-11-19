package La;

import Fb.InterfaceC1037s;
import Fb.InterfaceC1038t;
import La.a1;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"LLa/W0;", "LIa/r;", "LLa/Y;", "LLa/X0;", "container", "LRa/m0;", "descriptor", "<init>", "(LLa/X0;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "LRa/e;", "LLa/X;", "e", "(LRa/e;)LLa/X;", "LFb/t;", "Ljava/lang/Class;", "b", "(LFb/t;)Ljava/lang/Class;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "LRa/m0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "LIa/q;", "C", "LLa/a1$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "D", "LLa/X0;", "getName", "name", "LIa/t;", "p", "()LIa/t;", "variance", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class W0 implements Ia.r, Y {

    /* renamed from: E, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f11146E = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(W0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Ra.m0 descriptor;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final a1.a upperBounds;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final X0 container;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11150a;

        static {
            int[] iArr = new int[Hb.Q0.values().length];
            try {
                iArr[Hb.Q0.f5693F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hb.Q0.f5694G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hb.Q0.f5695H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11150a = iArr;
        }
    }

    public W0(X0 x02, Ra.m0 descriptor) {
        X<?> xE;
        Object objV0;
        C3862t.g(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds = a1.b(new V0(this));
        if (x02 == null) {
            InterfaceC1700m interfaceC1700mC = c().c();
            C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
            if (interfaceC1700mC instanceof InterfaceC1692e) {
                objV0 = e((InterfaceC1692e) interfaceC1700mC);
            } else {
                if (!(interfaceC1700mC instanceof InterfaceC1689b)) {
                    throw new Y0("Unknown type parameter container: " + interfaceC1700mC);
                }
                InterfaceC1700m interfaceC1700mC2 = ((InterfaceC1689b) interfaceC1700mC).c();
                C3862t.f(interfaceC1700mC2, "getContainingDeclaration(...)");
                if (interfaceC1700mC2 instanceof InterfaceC1692e) {
                    xE = e((InterfaceC1692e) interfaceC1700mC2);
                } else {
                    InterfaceC1038t interfaceC1038t = interfaceC1700mC instanceof InterfaceC1038t ? (InterfaceC1038t) interfaceC1700mC : null;
                    if (interfaceC1038t == null) {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + interfaceC1700mC);
                    }
                    Ia.d dVarE = Aa.a.e(b(interfaceC1038t));
                    C3862t.e(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    xE = (X) dVarE;
                }
                objV0 = interfaceC1700mC.v0(new C1433j(xE), C4153F.f46609a);
            }
            x02 = (X0) objV0;
        }
        this.container = x02;
    }

    private final Class<?> b(InterfaceC1038t interfaceC1038t) {
        Class<?> clsE;
        InterfaceC1037s interfaceC1037sB0 = interfaceC1038t.b0();
        jb.r rVar = interfaceC1037sB0 instanceof jb.r ? (jb.r) interfaceC1037sB0 : null;
        Object objG = rVar != null ? rVar.g() : null;
        Wa.f fVar = objG instanceof Wa.f ? (Wa.f) objG : null;
        if (fVar != null && (clsE = fVar.e()) != null) {
            return clsE;
        }
        throw new Y0("Container of deserialized member is not resolved: " + interfaceC1038t);
    }

    private final X<?> e(InterfaceC1692e interfaceC1692e) {
        Class<?> clsQ = j1.q(interfaceC1692e);
        X<?> x10 = (X) (clsQ != null ? Aa.a.e(clsQ) : null);
        if (x10 != null) {
            return x10;
        }
        throw new Y0("Type parameter container is not resolved: " + interfaceC1692e.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(W0 w02) {
        List<Hb.U> upperBounds = w02.c().getUpperBounds();
        C3862t.f(upperBounds, "getUpperBounds(...)");
        List<Hb.U> list = upperBounds;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new U0((Hb.U) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // La.Y
    /* renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public Ra.m0 c() {
        return this.descriptor;
    }

    public boolean equals(Object other) {
        if (other instanceof W0) {
            W0 w02 = (W0) other;
            if (C3862t.b(this.container, w02.container) && C3862t.b(getName(), w02.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // Ia.r
    public String getName() {
        String strJ = c().getName().j();
        C3862t.f(strJ, "asString(...)");
        return strJ;
    }

    @Override // Ia.r
    public List<Ia.q> getUpperBounds() {
        T tB = this.upperBounds.b(this, f11146E[0]);
        C3862t.f(tB, "getValue(...)");
        return (List) tB;
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    @Override // Ia.r
    public Ia.t p() {
        int i10 = a.f11150a[c().p().ordinal()];
        if (i10 == 1) {
            return Ia.t.f6946B;
        }
        if (i10 == 2) {
            return Ia.t.f6947C;
        }
        if (i10 == 3) {
            return Ia.t.f6948D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return kotlin.jvm.internal.X.INSTANCE.a(this);
    }
}
