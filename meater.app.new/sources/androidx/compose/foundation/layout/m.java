package androidx.compose.foundation.layout;

import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/m;", "LA0/B;", "Lb0/i$c;", "LU0/h;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/k;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "F", "k2", "()F", "n2", "(F)V", "P", "l2", "o2", "Q", "Z", "j2", "()Z", "m2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float x;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float y;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z f22274C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ K f22275D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10, K k10) {
            super(1);
            this.f22274C = z10;
            this.f22275D = k10;
        }

        public final void a(Z.a aVar) {
            if (m.this.getRtlAware()) {
                Z.a.l(aVar, this.f22274C, this.f22275D.i1(m.this.getX()), this.f22275D.i1(m.this.getY()), 0.0f, 4, null);
            } else {
                Z.a.h(aVar, this.f22274C, this.f22275D.i1(m.this.getX()), this.f22275D.i1(m.this.getY()), 0.0f, 4, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ m(float f10, float f11, boolean z10, C3854k c3854k) {
        this(f10, f11, z10);
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        Z zT = h10.T(j10);
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT, k10), 4, null);
    }

    /* renamed from: j2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: k2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: l2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final void m2(boolean z10) {
        this.rtlAware = z10;
    }

    public final void n2(float f10) {
        this.x = f10;
    }

    public final void o2(float f10) {
        this.y = f10;
    }

    private m(float f10, float f11, boolean z10) {
        this.x = f10;
        this.y = f11;
        this.rtlAware = z10;
    }
}
