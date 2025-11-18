package B;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LB/d;", "LB/F;", "Lkotlin/Function2;", "LU0/d;", "LU0/b;", "LB/E;", "calculation", "<init>", "(LBa/p;)V", "density", "constraints", "a", "(LU0/d;J)LB/E;", "LBa/p;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "LB/E;", "cachedSizes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0875d implements F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<U0.d, U0.b, E> calculation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long cachedConstraints = U0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedDensity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private E cachedSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public C0875d(Ba.p<? super U0.d, ? super U0.b, E> pVar) {
        this.calculation = pVar;
    }

    @Override // B.F
    public E a(U0.d density, long constraints) {
        if (this.cachedSizes != null && U0.b.f(this.cachedConstraints, constraints) && this.cachedDensity == density.getDensity()) {
            E e10 = this.cachedSizes;
            C3862t.d(e10);
            return e10;
        }
        this.cachedConstraints = constraints;
        this.cachedDensity = density.getDensity();
        E eInvoke = this.calculation.invoke(density, U0.b.a(constraints));
        this.cachedSizes = eInvoke;
        return eInvoke;
    }
}
