package kotlin;

import Ba.a;
import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LO/G0;", "T", "LO/u;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(LBa/a;)V", "LO/H0;", "value", "LO/D1;", "f", "(LO/H0;)LO/D1;", "c", "(Ljava/lang/Object;)LO/H0;", "d", "e", "previous", "b", "(LO/H0;LO/D1;)LO/D1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.G0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1501G0<T> extends AbstractC1572u<T> {
    public AbstractC1501G0(a<? extends T> aVar) {
        super(aVar, null);
    }

    private final D1<T> f(C1503H0<T> value) {
        if (!value.getIsDynamic()) {
            return value.c() != null ? new ComputedValueHolder(value.c()) : value.f() != null ? new DynamicValueHolder(value.f()) : new StaticValueHolder(value.d());
        }
        InterfaceC1563p0<T> interfaceC1563p0F = value.f();
        if (interfaceC1563p0F == null) {
            T tG = value.g();
            l1<T> l1VarE = value.e();
            if (l1VarE == null) {
                l1VarE = m1.o();
            }
            interfaceC1563p0F = m1.g(tG, l1VarE);
        }
        return new DynamicValueHolder(interfaceC1563p0F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 O.N) = (r5v5 O.N), (r5v6 O.N) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.AbstractC1572u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.D1<T> b(kotlin.C1503H0<T> r4, kotlin.D1<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof kotlin.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.getIsDynamic()
            if (r0 == 0) goto L47
            r1 = r5
            O.N r1 = (kotlin.DynamicValueHolder) r1
            O.p0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof kotlin.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.d()
            O.z1 r5 = (kotlin.StaticValueHolder) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof kotlin.ComputedValueHolder
            if (r0 == 0) goto L47
            Ba.l r0 = r4.c()
            O.D r5 = (kotlin.ComputedValueHolder) r5
            Ba.l r2 = r5.b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4d
            O.D1 r1 = r3.f(r4)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC1501G0.b(O.H0, O.D1):O.D1");
    }

    public abstract C1503H0<T> c(T value);

    public final C1503H0<T> d(T value) {
        return c(value);
    }

    public final C1503H0<T> e(T value) {
        return c(value).h();
    }
}
