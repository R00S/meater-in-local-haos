package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.M;
import oa.C4153F;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/e;", "Ly0/I;", "Lb0/c;", "alignment", "", "propagateMinConstraints", "<init>", "(Lb0/c;Z)V", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lb0/c;", "b", "Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.e, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class BoxMeasurePolicy implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean propagateMinConstraints;

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.e$b */
    static final class b extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22243B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ H f22244C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ K f22245D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f22246E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f22247F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f22248G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z z10, H h10, K k10, int i10, int i11, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f22243B = z10;
            this.f22244C = h10;
            this.f22245D = k10;
            this.f22246E = i10;
            this.f22247F = i11;
            this.f22248G = boxMeasurePolicy;
        }

        public final void a(Z.a aVar) {
            d.i(aVar, this.f22243B, this.f22244C, this.f22245D.getLayoutDirection(), this.f22246E, this.f22247F, this.f22248G.alignment);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.e$c */
    static final class c extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z[] f22249B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<H> f22250C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ K f22251D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ M f22252E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ M f22253F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f22254G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Z[] zArr, List<? extends H> list, K k10, M m10, M m11, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f22249B = zArr;
            this.f22250C = list;
            this.f22251D = k10;
            this.f22252E = m10;
            this.f22253F = m11;
            this.f22254G = boxMeasurePolicy;
        }

        public final void a(Z.a aVar) {
            Z[] zArr = this.f22249B;
            List<H> list = this.f22250C;
            K k10 = this.f22251D;
            M m10 = this.f22252E;
            M m11 = this.f22253F;
            BoxMeasurePolicy boxMeasurePolicy = this.f22254G;
            int length = zArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                Z z10 = zArr[i10];
                C3862t.e(z10, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                d.i(aVar, z10, list.get(i11), k10.getLayoutDirection(), m10.f43976B, m11.f43976B, boxMeasurePolicy.alignment);
                i10++;
                i11++;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public BoxMeasurePolicy(b0.c cVar, boolean z10) {
        this.alignment = cVar;
        this.propagateMinConstraints = z10;
    }

    @Override // y0.I
    public J e(K k10, List<? extends H> list, long j10) {
        int iN;
        int iM;
        Z zT;
        if (list.isEmpty()) {
            return K.E1(k10, U0.b.n(j10), U0.b.m(j10), null, a.f22242B, 4, null);
        }
        long jD = this.propagateMinConstraints ? j10 : U0.b.d(j10, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            H h10 = list.get(0);
            if (d.g(h10)) {
                iN = U0.b.n(j10);
                iM = U0.b.m(j10);
                zT = h10.T(U0.b.INSTANCE.c(U0.b.n(j10), U0.b.m(j10)));
            } else {
                zT = h10.T(jD);
                iN = Math.max(U0.b.n(j10), zT.getWidth());
                iM = Math.max(U0.b.m(j10), zT.getHeight());
            }
            int i10 = iN;
            int i11 = iM;
            return K.E1(k10, i10, i11, null, new b(zT, h10, k10, i10, i11, this), 4, null);
        }
        Z[] zArr = new Z[list.size()];
        M m10 = new M();
        m10.f43976B = U0.b.n(j10);
        M m11 = new M();
        m11.f43976B = U0.b.m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            H h11 = list.get(i12);
            if (d.g(h11)) {
                z10 = true;
            } else {
                Z zT2 = h11.T(jD);
                zArr[i12] = zT2;
                m10.f43976B = Math.max(m10.f43976B, zT2.getWidth());
                m11.f43976B = Math.max(m11.f43976B, zT2.getHeight());
            }
        }
        if (z10) {
            int i13 = m10.f43976B;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = m11.f43976B;
            long jA = U0.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                H h12 = list.get(i16);
                if (d.g(h12)) {
                    zArr[i16] = h12.T(jA);
                }
            }
        }
        return K.E1(k10, m10.f43976B, m11.f43976B, null, new c(zArr, list, k10, m10, m11, this), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return C3862t.b(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.e$a */
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22242B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }
}
