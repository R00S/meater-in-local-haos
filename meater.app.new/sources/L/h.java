package L;

import A.d0;
import A.f0;
import U0.t;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.r1;

/* compiled from: MutableWindowInsets.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"LL/h;", "LA/d0;", "initialInsets", "<init>", "(LA/d0;)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "", "c", "(LU0/d;LU0/t;)I", "b", "(LU0/d;)I", "a", "d", "<set-?>", "LO/p0;", "e", "()LA/d0;", "f", "insets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 insets;

    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // A.d0
    public int a(U0.d density, t layoutDirection) {
        return e().a(density, layoutDirection);
    }

    @Override // A.d0
    public int b(U0.d density) {
        return e().b(density);
    }

    @Override // A.d0
    public int c(U0.d density, t layoutDirection) {
        return e().c(density, layoutDirection);
    }

    @Override // A.d0
    public int d(U0.d density) {
        return e().d(density);
    }

    public final d0 e() {
        return (d0) this.insets.getValue();
    }

    public final void f(d0 d0Var) {
        this.insets.setValue(d0Var);
    }

    public h(d0 d0Var) {
        this.insets = r1.c(d0Var, null, 2, null);
    }

    public /* synthetic */ h(d0 d0Var, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? f0.a(0, 0, 0, 0) : d0Var);
    }
}
