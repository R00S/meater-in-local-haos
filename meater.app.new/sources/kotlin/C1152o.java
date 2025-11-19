package kotlin;

import i0.C3602t0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.x1;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LI/o;", "LI/d;", "Li0/t0;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/k;)V", "", "enabled", "LO/x1;", "b", "(ZLO/l;I)LO/x1;", "a", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "d", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1152o implements InterfaceC1141d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledBackgroundColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ C1152o(long j10, long j11, long j12, long j13, C3854k c3854k) {
        this(j10, j11, j12, j13);
    }

    @Override // kotlin.InterfaceC1141d
    public x1<C3602t0> a(boolean z10, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-2133647540);
        if (C1560o.J()) {
            C1560o.S(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:592)");
        }
        x1<C3602t0> x1VarM = m1.m(C3602t0.g(z10 ? this.contentColor : this.disabledContentColor), interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return x1VarM;
    }

    @Override // kotlin.InterfaceC1141d
    public x1<C3602t0> b(boolean z10, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-655254499);
        if (C1560o.J()) {
            C1560o.S(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:587)");
        }
        x1<C3602t0> x1VarM = m1.m(C3602t0.g(z10 ? this.backgroundColor : this.disabledBackgroundColor), interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return x1VarM;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C1152o.class != other.getClass()) {
            return false;
        }
        C1152o c1152o = (C1152o) other;
        return C3602t0.m(this.backgroundColor, c1152o.backgroundColor) && C3602t0.m(this.contentColor, c1152o.contentColor) && C3602t0.m(this.disabledBackgroundColor, c1152o.disabledBackgroundColor) && C3602t0.m(this.disabledContentColor, c1152o.disabledContentColor);
    }

    public int hashCode() {
        return (((((C3602t0.s(this.backgroundColor) * 31) + C3602t0.s(this.contentColor)) * 31) + C3602t0.s(this.disabledBackgroundColor)) * 31) + C3602t0.s(this.disabledContentColor);
    }

    private C1152o(long j10, long j11, long j12, long j13) {
        this.backgroundColor = j10;
        this.contentColor = j11;
        this.disabledBackgroundColor = j12;
        this.disabledContentColor = j13;
    }
}
