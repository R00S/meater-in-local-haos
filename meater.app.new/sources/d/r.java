package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.C2116x;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;
import t3.C4548e;
import t3.C4550g;
import t3.InterfaceC4549f;

/* compiled from: ComponentDialog.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010/\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0013\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Ld/r;", "Landroid/app/Dialog;", "Landroidx/lifecycle/v;", "Ld/J;", "Lt3/f;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "Loa/F;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "d", "Landroidx/lifecycle/x;", "B", "Landroidx/lifecycle/x;", "_lifecycleRegistry", "Lt3/e;", "C", "Lt3/e;", "savedStateRegistryController", "Ld/G;", "D", "Ld/G;", "c", "()Ld/G;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "b", "()Landroidx/lifecycle/x;", "lifecycleRegistry", "Lt3/d;", "()Lt3/d;", "savedStateRegistry", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class r extends Dialog implements InterfaceC2114v, J, InterfaceC4549f {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private C2116x _lifecycleRegistry;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C4548e savedStateRegistryController;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C2995G onBackPressedDispatcher;

    public /* synthetic */ r(Context context, int i10, int i11, C3854k c3854k) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final C2116x b() {
        C2116x c2116x = this._lifecycleRegistry;
        if (c2116x != null) {
            return c2116x;
        }
        C2116x c2116x2 = new C2116x(this);
        this._lifecycleRegistry = c2116x2;
        return c2116x2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(r this$0) {
        C3862t.g(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // t3.InterfaceC4549f
    public C4547d B() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        C3862t.g(view, "view");
        d();
        super.addContentView(view, params);
    }

    @Override // d.J
    /* renamed from: c, reason: from getter */
    public final C2995G getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    public void d() {
        Window window = getWindow();
        C3862t.d(window);
        View decorView = window.getDecorView();
        C3862t.f(decorView, "window!!.decorView");
        android.view.View.b(decorView, this);
        Window window2 = getWindow();
        C3862t.d(window2);
        View decorView2 = window2.getDecorView();
        C3862t.f(decorView2, "window!!.decorView");
        N.a(decorView2, this);
        Window window3 = getWindow();
        C3862t.d(window3);
        View decorView3 = window3.getDecorView();
        C3862t.f(decorView3, "window!!.decorView");
        C4550g.b(decorView3, this);
    }

    @Override // android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        return b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            C2995G c2995g = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C3862t.f(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c2995g.o(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        b().i(AbstractC2106m.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C3862t.f(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC2106m.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC2106m.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        d();
        super.setContentView(layoutResID);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        C3862t.g(context, "context");
        this.savedStateRegistryController = C4548e.INSTANCE.a(this);
        this.onBackPressedDispatcher = new C2995G(new Runnable() { // from class: d.q
            @Override // java.lang.Runnable
            public final void run() {
                r.e(this.f39610B);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C3862t.g(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        C3862t.g(view, "view");
        d();
        super.setContentView(view, params);
    }
}
