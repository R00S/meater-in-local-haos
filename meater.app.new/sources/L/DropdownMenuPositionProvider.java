package L;

import Ba.p;
import L.g;
import U0.o;
import U0.q;
import U0.t;
import androidx.compose.ui.window.r;
import java.util.List;
import kotlin.C1255G;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: MenuPosition.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001bR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010@\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010B\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010D\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"LL/d;", "Landroidx/compose/ui/window/r;", "LU0/j;", "contentOffset", "LU0/d;", "density", "", "verticalMargin", "Lkotlin/Function2;", "LU0/p;", "Loa/F;", "onPositionCalculated", "<init>", "(JLU0/d;ILBa/p;Lkotlin/jvm/internal/k;)V", "anchorBounds", "LU0/r;", "windowSize", "LU0/t;", "layoutDirection", "popupContentSize", "LU0/n;", "a", "(LU0/p;JLU0/t;J)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "b", "LU0/d;", "getDensity", "()LU0/d;", "c", "I", "getVerticalMargin", "d", "LBa/p;", "getOnPositionCalculated", "()LBa/p;", "LL/g$a;", "e", "LL/g$a;", "startToAnchorStart", "f", "endToAnchorEnd", "g", "leftToWindowLeft", "h", "rightToWindowRight", "LL/g$b;", "i", "LL/g$b;", "topToAnchorBottom", "j", "bottomToAnchorTop", "k", "centerToAnchorTop", "l", "topToWindowTop", "m", "bottomToWindowBottom", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L.d, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int verticalMargin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<U0.p, U0.p, C4153F> onPositionCalculated;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g.a startToAnchorStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g.a endToAnchorEnd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g.a leftToWindowLeft;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g.a rightToWindowRight;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g.b topToAnchorBottom;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g.b bottomToAnchorTop;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g.b centerToAnchorTop;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final g.b topToWindowTop;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g.b bottomToWindowBottom;

    public /* synthetic */ DropdownMenuPositionProvider(long j10, U0.d dVar, int i10, p pVar, C3854k c3854k) {
        this(j10, dVar, i10, pVar);
    }

    @Override // androidx.compose.ui.window.r
    public long a(U0.p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        int iA;
        int i10 = 0;
        List listP = kotlin.collections.r.p(this.startToAnchorStart, this.endToAnchorEnd, U0.n.h(anchorBounds.e()) < U0.r.g(windowSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listP.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iA = 0;
                break;
            }
            iA = ((g.a) listP.get(i11)).a(anchorBounds, windowSize, U0.r.g(popupContentSize), layoutDirection);
            if (i11 == kotlin.collections.r.o(listP) || (iA >= 0 && U0.r.g(popupContentSize) + iA <= U0.r.g(windowSize))) {
                break;
            }
            i11++;
        }
        List listP2 = kotlin.collections.r.p(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, U0.n.i(anchorBounds.e()) < U0.r.f(windowSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listP2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iA2 = ((g.b) listP2.get(i12)).a(anchorBounds, windowSize, U0.r.f(popupContentSize));
            if (i12 == kotlin.collections.r.o(listP2) || (iA2 >= this.verticalMargin && U0.r.f(popupContentSize) + iA2 <= U0.r.f(windowSize) - this.verticalMargin)) {
                i10 = iA2;
                break;
            }
        }
        long jA = o.a(iA, i10);
        this.onPositionCalculated.invoke(anchorBounds, q.a(jA, popupContentSize));
        return jA;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return U0.j.d(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && C3862t.b(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && C3862t.b(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((U0.j.g(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) U0.j.h(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j10, U0.d dVar, int i10, p<? super U0.p, ? super U0.p, C4153F> pVar) {
        this.contentOffset = j10;
        this.density = dVar;
        this.verticalMargin = i10;
        this.onPositionCalculated = pVar;
        int iI1 = dVar.i1(U0.j.e(j10));
        g gVar = g.f8908a;
        this.startToAnchorStart = gVar.g(iI1);
        this.endToAnchorEnd = gVar.d(iI1);
        this.leftToWindowLeft = gVar.e(0);
        this.rightToWindowRight = gVar.f(0);
        int iI12 = dVar.i1(U0.j.f(j10));
        this.topToAnchorBottom = gVar.h(iI12);
        this.bottomToAnchorTop = gVar.a(iI12);
        this.centerToAnchorTop = gVar.c(iI12);
        this.topToWindowTop = gVar.i(i10);
        this.bottomToWindowBottom = gVar.b(i10);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, U0.d dVar, int i10, p pVar, int i11, C3854k c3854k) {
        this(j10, dVar, (i11 & 4) != 0 ? dVar.i1(C1255G.j()) : i10, (i11 & 8) != 0 ? a.f8902B : pVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU0/p;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Loa/F;", "a", "(LU0/p;LU0/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L.d$a */
    public static final class a extends AbstractC3864v implements p<U0.p, U0.p, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8902B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(U0.p pVar, U0.p pVar2) {
            a(pVar, pVar2);
            return C4153F.f46609a;
        }

        public final void a(U0.p pVar, U0.p pVar2) {
        }
    }
}
