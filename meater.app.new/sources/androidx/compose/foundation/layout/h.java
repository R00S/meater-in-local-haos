package androidx.compose.foundation.layout;

import A.I;
import kotlin.Metadata;
import y0.H;
import y0.InterfaceC5112q;
import y0.K;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/h;", "Landroidx/compose/foundation/layout/j;", "LA/I;", "height", "", "enforceIncoming", "<init>", "(LA/I;Z)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "j2", "(Ly0/K;Ly0/H;J)J", "Ly0/r;", "Ly0/q;", "", "width", "L", "(Ly0/r;Ly0/q;I)I", "o", "O", "LA/I;", "getHeight", "()LA/I;", "m2", "(LA/I;)V", "P", "Z", "k2", "()Z", "l2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends j {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private I height;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public h(I i10, boolean z10) {
        this.height = i10;
        this.enforceIncoming = z10;
    }

    @Override // androidx.compose.foundation.layout.j, A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.height == I.Min ? interfaceC5112q.f0(i10) : interfaceC5112q.q(i10);
    }

    @Override // androidx.compose.foundation.layout.j
    public long j2(K k10, H h10, long j10) {
        int iF0 = this.height == I.Min ? h10.f0(U0.b.l(j10)) : h10.q(U0.b.l(j10));
        if (iF0 < 0) {
            iF0 = 0;
        }
        return U0.b.INSTANCE.d(iF0);
    }

    @Override // androidx.compose.foundation.layout.j
    /* renamed from: k2, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void l2(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void m2(I i10) {
        this.height = i10;
    }

    @Override // androidx.compose.foundation.layout.j, A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.height == I.Min ? interfaceC5112q.f0(i10) : interfaceC5112q.q(i10);
    }
}
