package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import h0.C3470a;
import h0.C3471b;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3480k;
import h0.C3481l;
import h0.C3482m;
import h0.C3483n;
import i0.C3556T;
import i0.C3561Y;
import i0.InterfaceC3586l0;
import i0.N0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OutlineResolver.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001c\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010?R\u001c\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/A0;", "", "<init>", "()V", "Loa/F;", "i", "Lh0/i;", "rect", "k", "(Lh0/i;)V", "Lh0/k;", "roundRect", "l", "(Lh0/k;)V", "Li0/R0;", "composePath", "j", "(Li0/R0;)V", "Lh0/g;", "offset", "Lh0/m;", "size", "", "radius", "", "g", "(Lh0/k;JJF)Z", "Li0/N0;", "outline", "alpha", "clipToOutline", "elevation", "h", "(Li0/N0;FZFJ)Z", "position", "f", "(J)Z", "Li0/l0;", "canvas", "a", "(Li0/l0;)V", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "b", "Landroid/graphics/Outline;", "cachedOutline", "c", "Li0/N0;", "d", "Li0/R0;", "cachedRrectPath", "e", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Lh0/k;", "tmpRoundRect", "F", "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "m", "outlineNeeded", "n", "tmpTouchPointPath", "o", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()Li0/R0;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Outline cachedOutline;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i0.N0 outline;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i0.R0 cachedRrectPath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i0.R0 outlinePath;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cacheIsDirty;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private i0.R0 tmpPath;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private C3480k tmpRoundRect;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundedCornerRadius;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long rectTopLeft;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rectSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean outlineNeeded;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private i0.R0 tmpTouchPointPath;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private i0.R0 tmpOpPath;

    public A0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = C3476g.INSTANCE.c();
        this.rectSize = C3482m.INSTANCE.b();
    }

    private final boolean g(C3480k c3480k, long j10, long j11, float f10) {
        return c3480k != null && C3481l.e(c3480k) && c3480k.getLeft() == C3476g.m(j10) && c3480k.getTop() == C3476g.n(j10) && c3480k.getRight() == C3476g.m(j10) + C3482m.i(j11) && c3480k.getBottom() == C3476g.n(j10) + C3482m.g(j11) && C3470a.d(c3480k.getTopLeftCornerRadius()) == f10;
    }

    private final void i() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = C3476g.INSTANCE.c();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            i0.N0 n02 = this.outline;
            if (n02 == null || !this.outlineNeeded || C3482m.i(this.rectSize) <= 0.0f || C3482m.g(this.rectSize) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (n02 instanceof N0.b) {
                k(((N0.b) n02).b());
            } else if (n02 instanceof N0.c) {
                l(((N0.c) n02).getRoundRect());
            } else if (n02 instanceof N0.a) {
                j(((N0.a) n02).getPath());
            }
        }
    }

    private final void j(i0.R0 composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.f()) {
            Outline outline = this.cachedOutline;
            if (!(composePath instanceof C3556T)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C3556T) composePath).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void k(C3478i rect) {
        this.rectTopLeft = C3477h.a(rect.getLeft(), rect.getTop());
        this.rectSize = C3483n.a(rect.k(), rect.e());
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void l(C3480k roundRect) {
        float fD = C3470a.d(roundRect.getTopLeftCornerRadius());
        this.rectTopLeft = C3477h.a(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = C3483n.a(roundRect.j(), roundRect.d());
        if (C3481l.e(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fD);
            this.roundedCornerRadius = fD;
            return;
        }
        i0.R0 r0A = this.cachedRrectPath;
        if (r0A == null) {
            r0A = C3561Y.a();
            this.cachedRrectPath = r0A;
        }
        r0A.b();
        i0.R0.c(r0A, roundRect, null, 2, null);
        j(r0A);
    }

    public final void a(InterfaceC3586l0 canvas) {
        i0.R0 r0D = d();
        if (r0D != null) {
            InterfaceC3586l0.e(canvas, r0D, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            InterfaceC3586l0.g(canvas, C3476g.m(this.rectTopLeft), C3476g.n(this.rectTopLeft), C3476g.m(this.rectTopLeft) + C3482m.i(this.rectSize), C3476g.n(this.rectTopLeft) + C3482m.g(this.rectSize), 0, 16, null);
            return;
        }
        i0.R0 r0A = this.tmpPath;
        C3480k c3480k = this.tmpRoundRect;
        if (r0A == null || !g(c3480k, this.rectTopLeft, this.rectSize, f10)) {
            C3480k c3480kC = C3481l.c(C3476g.m(this.rectTopLeft), C3476g.n(this.rectTopLeft), C3476g.m(this.rectTopLeft) + C3482m.i(this.rectSize), C3476g.n(this.rectTopLeft) + C3482m.g(this.rectSize), C3471b.b(this.roundedCornerRadius, 0.0f, 2, null));
            if (r0A == null) {
                r0A = C3561Y.a();
            } else {
                r0A.b();
            }
            i0.R0.c(r0A, c3480kC, null, 2, null);
            this.tmpRoundRect = c3480kC;
            this.tmpPath = r0A;
        }
        InterfaceC3586l0.e(canvas, r0A, 0, 2, null);
    }

    public final Outline b() {
        i();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final i0.R0 d() {
        i();
        return this.outlinePath;
    }

    public final boolean e() {
        return !this.usePathForClip;
    }

    public final boolean f(long position) {
        i0.N0 n02;
        if (this.outlineNeeded && (n02 = this.outline) != null) {
            return X0.b(n02, C3476g.m(position), C3476g.n(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean h(i0.N0 outline, float alpha, boolean clipToOutline, float elevation, long size) {
        this.cachedOutline.setAlpha(alpha);
        boolean zB = C3862t.b(this.outline, outline);
        boolean z10 = !zB;
        if (!zB) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = size;
        boolean z11 = outline != null && (clipToOutline || elevation > 0.0f);
        if (this.outlineNeeded != z11) {
            this.outlineNeeded = z11;
            this.cacheIsDirty = true;
        }
        return z10;
    }
}
