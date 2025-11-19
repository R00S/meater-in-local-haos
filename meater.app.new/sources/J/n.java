package J;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import h0.C3476g;
import h0.C3482m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import z.m;

/* compiled from: RippleHostView.android.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u0016\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u001aJ(\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u001aR\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"LJ/n;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "Loa/F;", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lz/m$b;", "interaction", "Lh0/m;", "size", "radius", "Li0/t0;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Lz/m$b;ZJIJFLBa/a;)V", "e", "f", "(JJF)V", "d", "LJ/v;", "B", "LJ/v;", "ripple", "C", "Ljava/lang/Boolean;", "", "D", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "E", "Ljava/lang/Runnable;", "resetRippleRunnable", "F", "LBa/a;", "G", "a", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: H, reason: collision with root package name */
    public static final int f7122H = 8;

    /* renamed from: I, reason: collision with root package name */
    private static final int[] f7123I = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f7124J = new int[0];

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private v ripple;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Boolean bounded;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Long lastRippleStateChangeTimeMillis;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Runnable resetRippleRunnable;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onInvalidateRipple;

    public n(Context context) {
        super(context);
    }

    private final void c(boolean bounded) {
        v vVar = new v(bounded);
        setBackground(vVar);
        this.ripple = vVar;
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f7123I : f7124J;
            v vVar = this.ripple;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: J.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.setRippleState$lambda$2(this.f7120B);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        v vVar = nVar.ripple;
        if (vVar != null) {
            vVar.setState(f7124J);
        }
        nVar.resetRippleRunnable = null;
    }

    public final void b(m.b interaction, boolean bounded, long size, int radius, long color, float alpha, Ba.a<C4153F> onInvalidateRipple) {
        if (this.ripple == null || !C3862t.b(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        v vVar = this.ripple;
        C3862t.d(vVar);
        this.onInvalidateRipple = onInvalidateRipple;
        vVar.c(radius);
        f(size, color, alpha);
        if (bounded) {
            vVar.setHotspot(C3476g.m(interaction.getPressPosition()), C3476g.n(interaction.getPressPosition()));
        } else {
            vVar.setHotspot(vVar.getBounds().centerX(), vVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            C3862t.d(runnable2);
            runnable2.run();
        } else {
            v vVar = this.ripple;
            if (vVar != null) {
                vVar.setState(f7124J);
            }
        }
        v vVar2 = this.ripple;
        if (vVar2 == null) {
            return;
        }
        vVar2.setVisible(false, false);
        unscheduleDrawable(vVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long size, long color, float alpha) {
        v vVar = this.ripple;
        if (vVar == null) {
            return;
        }
        vVar.b(color, alpha);
        Rect rect = new Rect(0, 0, Da.a.c(C3482m.i(size)), Da.a.c(C3482m.g(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        vVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Ba.a<C4153F> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
