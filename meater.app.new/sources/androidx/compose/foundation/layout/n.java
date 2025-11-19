package androidx.compose.foundation.layout;

import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/n;", "LA0/B;", "Lb0/i$c;", "Lkotlin/Function1;", "LU0/d;", "LU0/n;", "offset", "", "rtlAware", "<init>", "(LBa/l;Z)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "LBa/l;", "j2", "()LBa/l;", "l2", "(LBa/l;)V", "P", "Z", "k2", "()Z", "m2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super U0.d, U0.n> offset;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ K f22279C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z f22280D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k10, Z z10) {
            super(1);
            this.f22279C = k10;
            this.f22280D = z10;
        }

        public final void a(Z.a aVar) {
            long packedValue = n.this.j2().invoke(this.f22279C).getPackedValue();
            if (n.this.getRtlAware()) {
                Z.a.p(aVar, this.f22280D, U0.n.h(packedValue), U0.n.i(packedValue), 0.0f, null, 12, null);
            } else {
                Z.a.v(aVar, this.f22280D, U0.n.h(packedValue), U0.n.i(packedValue), 0.0f, null, 12, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public n(Ba.l<? super U0.d, U0.n> lVar, boolean z10) {
        this.offset = lVar;
        this.rtlAware = z10;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        Z zT = h10.T(j10);
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(k10, zT), 4, null);
    }

    public final Ba.l<U0.d, U0.n> j2() {
        return this.offset;
    }

    /* renamed from: k2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void l2(Ba.l<? super U0.d, U0.n> lVar) {
        this.offset = lVar;
    }

    public final void m2(boolean z10) {
        this.rtlAware = z10;
    }
}
