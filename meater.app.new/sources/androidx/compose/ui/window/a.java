package androidx.compose.ui.window;

import U0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/a;", "Landroidx/compose/ui/window/r;", "Lb0/c;", "alignment", "LU0/n;", "offset", "<init>", "(Lb0/c;JLkotlin/jvm/internal/k;)V", "LU0/p;", "anchorBounds", "LU0/r;", "windowSize", "LU0/t;", "layoutDirection", "popupContentSize", "a", "(LU0/p;JLU0/t;J)J", "Lb0/c;", "getAlignment", "()Lb0/c;", "b", "J", "getOffset-nOcc-ac", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    public /* synthetic */ a(b0.c cVar, long j10, C3854k c3854k) {
        this(cVar, j10);
    }

    @Override // androidx.compose.ui.window.r
    public long a(U0.p anchorBounds, long windowSize, U0.t layoutDirection, long popupContentSize) {
        b0.c cVar = this.alignment;
        r.Companion companion = U0.r.INSTANCE;
        long jA = cVar.a(companion.a(), anchorBounds.i(), layoutDirection);
        return U0.n.l(U0.n.l(U0.n.l(anchorBounds.k(), jA), U0.n.n(this.alignment.a(companion.a(), popupContentSize, layoutDirection))), U0.o.a(U0.n.h(this.offset) * (layoutDirection == U0.t.Ltr ? 1 : -1), U0.n.i(this.offset)));
    }

    private a(b0.c cVar, long j10) {
        this.alignment = cVar;
        this.offset = j10;
    }
}
