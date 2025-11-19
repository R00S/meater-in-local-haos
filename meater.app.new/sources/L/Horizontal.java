package L;

import L.g;
import U0.p;
import U0.r;
import U0.t;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MenuPosition.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LL/m;", "LL/g$a;", "Lb0/c$b;", "alignment", "", "margin", "<init>", "(Lb0/c$b;I)V", "LU0/p;", "anchorBounds", "LU0/r;", "windowSize", "menuWidth", "LU0/t;", "layoutDirection", "a", "(LU0/p;JILU0/t;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb0/c$b;", "b", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L.m, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Horizontal implements g.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.b alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int margin;

    public Horizontal(c.b bVar, int i10) {
        this.alignment = bVar;
        this.margin = i10;
    }

    @Override // L.g.a
    public int a(p anchorBounds, long windowSize, int menuWidth, t layoutDirection) {
        return menuWidth >= r.g(windowSize) - (this.margin * 2) ? b0.c.INSTANCE.g().a(menuWidth, r.g(windowSize), layoutDirection) : Ha.g.k(this.alignment.a(menuWidth, r.g(windowSize), layoutDirection), this.margin, (r.g(windowSize) - this.margin) - menuWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Horizontal)) {
            return false;
        }
        Horizontal horizontal = (Horizontal) other;
        return C3862t.b(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Integer.hashCode(this.margin);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.alignment + ", margin=" + this.margin + ')';
    }
}
