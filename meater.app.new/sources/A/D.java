package A;

import android.os.Build;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import s1.C4444l0;
import s1.C4469y0;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R$\u00109\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"LA/D;", "Ls1/l0$b;", "Ljava/lang/Runnable;", "Ls1/I;", "Landroid/view/View$OnAttachStateChangeListener;", "LA/e0;", "composeInsets", "<init>", "(LA/e0;)V", "Ls1/l0;", "animation", "Loa/F;", "d", "(Ls1/l0;)V", "Ls1/l0$a;", "bounds", "f", "(Ls1/l0;Ls1/l0$a;)Ls1/l0$a;", "Ls1/y0;", "insets", "", "runningAnimations", "e", "(Ls1/y0;Ljava/util/List;)Ls1/y0;", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;Ls1/y0;)Ls1/y0;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "D", "LA/e0;", "getComposeInsets", "()LA/e0;", "", "E", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "F", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "G", "Ls1/y0;", "getSavedInsets", "()Ls1/y0;", "setSavedInsets", "(Ls1/y0;)V", "savedInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class D extends C4444l0.b implements Runnable, s1.I, View.OnAttachStateChangeListener {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final e0 composeInsets;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean runningAnimation;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private C4469y0 savedInsets;

    public D(e0 e0Var) {
        super(!e0Var.getConsumes() ? 1 : 0);
        this.composeInsets = e0Var;
    }

    @Override // s1.I
    public C4469y0 a(View view, C4469y0 insets) {
        this.savedInsets = insets;
        this.composeInsets.j(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.i(insets);
            e0.h(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? C4469y0.f49201b : insets;
    }

    @Override // s1.C4444l0.b
    public void c(C4444l0 animation) {
        this.prepared = false;
        this.runningAnimation = false;
        C4469y0 c4469y0 = this.savedInsets;
        if (animation.a() != 0 && c4469y0 != null) {
            this.composeInsets.i(c4469y0);
            this.composeInsets.j(c4469y0);
            e0.h(this.composeInsets, c4469y0, 0, 2, null);
        }
        this.savedInsets = null;
        super.c(animation);
    }

    @Override // s1.C4444l0.b
    public void d(C4444l0 animation) {
        this.prepared = true;
        this.runningAnimation = true;
        super.d(animation);
    }

    @Override // s1.C4444l0.b
    public C4469y0 e(C4469y0 insets, List<C4444l0> runningAnimations) {
        e0.h(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? C4469y0.f49201b : insets;
    }

    @Override // s1.C4444l0.b
    public C4444l0.a f(C4444l0 animation, C4444l0.a bounds) {
        this.prepared = false;
        return super.f(animation, bounds);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            C4469y0 c4469y0 = this.savedInsets;
            if (c4469y0 != null) {
                this.composeInsets.i(c4469y0);
                e0.h(this.composeInsets, c4469y0, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
    }
}
