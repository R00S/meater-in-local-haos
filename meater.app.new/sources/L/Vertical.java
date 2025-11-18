package L;

import L.g;
import U0.p;
import U0.r;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MenuPosition.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LL/n;", "LL/g$b;", "Lb0/c$c;", "alignment", "", "margin", "<init>", "(Lb0/c$c;I)V", "LU0/p;", "anchorBounds", "LU0/r;", "windowSize", "menuHeight", "a", "(LU0/p;JI)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb0/c$c;", "b", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L.n, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Vertical implements g.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.InterfaceC0420c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int margin;

    public Vertical(c.InterfaceC0420c interfaceC0420c, int i10) {
        this.alignment = interfaceC0420c;
        this.margin = i10;
    }

    @Override // L.g.b
    public int a(p anchorBounds, long windowSize, int menuHeight) {
        return menuHeight >= r.f(windowSize) - (this.margin * 2) ? b0.c.INSTANCE.i().a(menuHeight, r.f(windowSize)) : Ha.g.k(this.alignment.a(menuHeight, r.f(windowSize)), this.margin, (r.f(windowSize) - this.margin) - menuHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vertical)) {
            return false;
        }
        Vertical vertical = (Vertical) other;
        return C3862t.b(this.alignment, vertical.alignment) && this.margin == vertical.margin;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
    }

    public String toString() {
        return "Vertical(alignment=" + this.alignment + ", margin=" + this.margin + ')';
    }
}
