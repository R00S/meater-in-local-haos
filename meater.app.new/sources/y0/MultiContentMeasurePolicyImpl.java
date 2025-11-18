package y0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MultiContentMeasurePolicy.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Ly0/O;", "Ly0/I;", "Ly0/N;", "measurePolicy", "<init>", "(Ly0/N;)V", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "c", "(Ly0/r;Ljava/util/List;I)I", "width", "h", "d", "i", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly0/N;", "getMeasurePolicy", "()Ly0/N;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.O, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class MultiContentMeasurePolicyImpl implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final N measurePolicy;

    public MultiContentMeasurePolicyImpl(N n10) {
        this.measurePolicy = n10;
    }

    @Override // y0.I
    public int c(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return this.measurePolicy.c(rVar, A0.U.a(rVar), i10);
    }

    @Override // y0.I
    public int d(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return this.measurePolicy.d(rVar, A0.U.a(rVar), i10);
    }

    @Override // y0.I
    public J e(K k10, List<? extends H> list, long j10) {
        return this.measurePolicy.e(k10, A0.U.a(k10), j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiContentMeasurePolicyImpl) && C3862t.b(this.measurePolicy, ((MultiContentMeasurePolicyImpl) other).measurePolicy);
    }

    @Override // y0.I
    public int h(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return this.measurePolicy.h(rVar, A0.U.a(rVar), i10);
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    @Override // y0.I
    public int i(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        return this.measurePolicy.i(rVar, A0.U.a(rVar), i10);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }
}
