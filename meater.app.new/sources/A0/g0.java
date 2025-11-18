package A0;

import kotlin.Metadata;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5099d;
import y0.C5115u;
import y0.InterfaceC5098c;
import y0.InterfaceC5101f;
import y0.InterfaceC5112q;

/* compiled from: LayoutModifierNode.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0006\u0011\u0017\u0010\u0016\u000f\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\u0014J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"LA0/g0;", "", "<init>", "()V", "LA0/g0$a;", "measureBlock", "Ly0/c;", "intrinsicMeasureScope", "Ly0/q;", "intrinsicMeasurable", "", "h", "g", "(LA0/g0$a;Ly0/c;Ly0/q;I)I", "w", "e", "c", "a", "LA0/g0$f;", "Ly0/r;", "(LA0/g0$f;Ly0/r;Ly0/q;I)I", "f", "d", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f622a = new g0();

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LA0/g0$a;", "", "Ly0/f;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "a", "(Ly0/f;Ly0/H;J)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        y0.J a(InterfaceC5101f interfaceC5101f, y0.H h10, long j10);
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"LA0/g0$b;", "Ly0/H;", "Ly0/q;", "measurable", "LA0/g0$d;", "minMax", "LA0/g0$e;", "widthHeight", "<init>", "(Ly0/q;LA0/g0$d;LA0/g0$e;)V", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "", "height", "Q", "(I)I", "S", "width", "f0", "q", "B", "Ly0/q;", "getMeasurable", "()Ly0/q;", "C", "LA0/g0$d;", "getMinMax", "()LA0/g0$d;", "D", "LA0/g0$e;", "getWidthHeight", "()LA0/g0$e;", "", "b", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements y0.H {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5112q measurable;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final d minMax;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final e widthHeight;

        public b(InterfaceC5112q interfaceC5112q, d dVar, e eVar) {
            this.measurable = interfaceC5112q;
            this.minMax = dVar;
            this.widthHeight = eVar;
        }

        @Override // y0.InterfaceC5112q
        public int Q(int height) {
            return this.measurable.Q(height);
        }

        @Override // y0.InterfaceC5112q
        public int S(int height) {
            return this.measurable.S(height);
        }

        @Override // y0.H
        public y0.Z T(long constraints) {
            if (this.widthHeight == e.Width) {
                return new c(this.minMax == d.Max ? this.measurable.S(U0.b.k(constraints)) : this.measurable.Q(U0.b.k(constraints)), U0.b.g(constraints) ? U0.b.k(constraints) : 32767);
            }
            return new c(U0.b.h(constraints) ? U0.b.l(constraints) : 32767, this.minMax == d.Max ? this.measurable.q(U0.b.l(constraints)) : this.measurable.f0(U0.b.l(constraints)));
        }

        @Override // y0.InterfaceC5112q
        public Object b() {
            return this.measurable.b();
        }

        @Override // y0.InterfaceC5112q
        public int f0(int width) {
            return this.measurable.f0(width);
        }

        @Override // y0.InterfaceC5112q
        public int q(int width) {
            return this.measurable.q(width);
        }
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LA0/g0$d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum d {
        Min,
        Max
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LA0/g0$e;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum e {
        Width,
        Height
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LA0/g0$f;", "", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f {
        y0.J b(y0.K k10, y0.H h10, long j10);
    }

    private g0() {
    }

    public final int a(a measureBlock, InterfaceC5098c intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5099d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Height), U0.c.b(0, w10, 0, 0, 13, null)).getF53017b();
    }

    public final int b(f measureBlock, y0.r intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int w10) {
        return measureBlock.b(new C5115u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Height), U0.c.b(0, w10, 0, 0, 13, null)).getF53017b();
    }

    public final int c(a measureBlock, InterfaceC5098c intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5099d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Width), U0.c.b(0, 0, 0, h10, 7, null)).getF53016a();
    }

    public final int d(f measureBlock, y0.r intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int h10) {
        return measureBlock.b(new C5115u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Width), U0.c.b(0, 0, 0, h10, 7, null)).getF53016a();
    }

    public final int e(a measureBlock, InterfaceC5098c intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5099d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Height), U0.c.b(0, w10, 0, 0, 13, null)).getF53017b();
    }

    public final int f(f measureBlock, y0.r intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int w10) {
        return measureBlock.b(new C5115u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Height), U0.c.b(0, w10, 0, 0, 13, null)).getF53017b();
    }

    public final int g(a measureBlock, InterfaceC5098c intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5099d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Width), U0.c.b(0, 0, 0, h10, 7, null)).getF53016a();
    }

    public final int h(f measureBlock, y0.r intrinsicMeasureScope, InterfaceC5112q intrinsicMeasurable, int h10) {
        return measureBlock.b(new C5115u(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Width), U0.c.b(0, 0, 0, h10, 7, null)).getF53016a();
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ8\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LA0/g0$c;", "Ly0/Z;", "", "width", "height", "<init>", "(II)V", "Ly0/a;", "alignmentLine", "J", "(Ly0/a;)I", "LU0/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "layerBlock", "C0", "(JFLBa/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends y0.Z {
        public c(int i10, int i11) {
            K0(U0.s.a(i10, i11));
        }

        @Override // y0.L
        public int J(AbstractC5096a alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y0.Z
        public void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
        }
    }
}
