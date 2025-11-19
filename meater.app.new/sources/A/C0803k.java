package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LA/k;", "Lz0/d;", "Lkotlin/Function1;", "LA/d0;", "Loa/F;", "block", "<init>", "(LBa/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lz0/k;", "scope", "g", "(Lz0/k;)V", "b", "LBa/l;", "c", "LA/d0;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0803k implements z0.d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<d0, C4153F> block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d0 oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public C0803k(Ba.l<? super d0, C4153F> lVar) {
        this.block = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C0803k) && ((C0803k) other).block == this.block;
    }

    @Override // z0.d
    public void g(z0.k scope) {
        d0 d0Var = (d0) scope.J(g0.a());
        if (C3862t.b(d0Var, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = d0Var;
        this.block.invoke(d0Var);
    }

    public int hashCode() {
        return this.block.hashCode();
    }
}
