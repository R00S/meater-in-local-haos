package l0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import h0.C3483n;
import i0.C3544G;
import i0.C3588m0;
import i0.InterfaceC3586l0;
import k0.C3781a;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: GraphicsViewLayer.android.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b(\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b'\u0010\u001d\"\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010A\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u00108R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"Ll0/T;", "Landroid/view/View;", "ownerView", "Li0/m0;", "canvasHolder", "Lk0/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Li0/m0;Lk0/a;)V", "Landroid/graphics/Outline;", "outline", "", "d", "(Landroid/graphics/Outline;)Z", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Ll0/c;", "parentLayer", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "drawBlock", "c", "(LU0/d;LU0/t;Ll0/c;LBa/l;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "B", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "C", "Li0/m0;", "getCanvasHolder", "()Li0/m0;", "D", "Lk0/a;", "E", "Z", "setInvalidated", "(Z)V", "isInvalidated", "F", "Landroid/graphics/Outline;", "layerOutline", "value", "G", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "H", "LU0/d;", "I", "LU0/t;", "J", "LBa/l;", "K", "Ll0/c;", "L", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T extends View {

    /* renamed from: M, reason: collision with root package name */
    private static final ViewOutlineProvider f44256M = new a();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final View ownerView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C3781a canvasDrawScope;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Outline layerOutline;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private U0.d density;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private U0.t layoutDirection;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super k0.f, C4153F> drawBlock;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C3870c parentLayer;

    /* compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l0/T$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Loa/F;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof T) || (outline2 = ((T) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public T(View view, C3588m0 c3588m0, C3781a c3781a) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = c3588m0;
        this.canvasDrawScope = c3781a;
        setOutlineProvider(f44256M);
        this.canUseCompositingLayer = true;
        this.density = k0.e.a();
        this.layoutDirection = U0.t.Ltr;
        this.drawBlock = InterfaceC3871d.INSTANCE.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void c(U0.d density, U0.t layoutDirection, C3870c parentLayer, Ba.l<? super k0.f, C4153F> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final boolean d(Outline outline) {
        this.layerOutline = outline;
        return K.f44249a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C3588m0 c3588m0 = this.canvasHolder;
        Canvas canvasV = c3588m0.getAndroidCanvas().getInternalCanvas();
        c3588m0.getAndroidCanvas().w(canvas);
        C3544G c3544gA = c3588m0.getAndroidCanvas();
        C3781a c3781a = this.canvasDrawScope;
        U0.d dVar = this.density;
        U0.t tVar = this.layoutDirection;
        long jA = C3483n.a(getWidth(), getHeight());
        C3870c c3870c = this.parentLayer;
        Ba.l<? super k0.f, C4153F> lVar = this.drawBlock;
        U0.d density = c3781a.getDrawContext().getDensity();
        U0.t layoutDirection = c3781a.getDrawContext().getLayoutDirection();
        InterfaceC3586l0 interfaceC3586l0G = c3781a.getDrawContext().G();
        long jC = c3781a.getDrawContext().C();
        C3870c c3870cF = c3781a.getDrawContext().getGraphicsLayer();
        k0.d dVarA1 = c3781a.getDrawContext();
        dVarA1.c(dVar);
        dVarA1.b(tVar);
        dVarA1.H(c3544gA);
        dVarA1.E(jA);
        dVarA1.I(c3870c);
        c3544gA.h();
        try {
            lVar.invoke(c3781a);
            c3544gA.t();
            k0.d dVarA12 = c3781a.getDrawContext();
            dVarA12.c(density);
            dVarA12.b(layoutDirection);
            dVarA12.H(interfaceC3586l0G);
            dVarA12.E(jC);
            dVarA12.I(c3870cF);
            c3588m0.getAndroidCanvas().w(canvasV);
            this.isInvalidated = false;
        } catch (Throwable th) {
            c3544gA.t();
            k0.d dVarA13 = c3781a.getDrawContext();
            dVarA13.c(density);
            dVarA13.b(layoutDirection);
            dVarA13.H(interfaceC3586l0G);
            dVarA13.E(jC);
            dVarA13.I(c3870cF);
            throw th;
        }
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final C3588m0 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.canUseCompositingLayer != z10) {
            this.canUseCompositingLayer = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.isInvalidated = z10;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
