package B5;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: StepPreviewDialog.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LB5/u;", "Landroidx/fragment/app/n;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "Q2", "(Landroid/view/View;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/widget/FrameLayout;", "W0", "Landroid/widget/FrameLayout;", "frameLayout", "X0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.n {

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Y0, reason: collision with root package name */
    public static final int f1667Y0 = 8;

    /* renamed from: Z0, reason: collision with root package name */
    private static int f1668Z0;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    private FrameLayout frameLayout;

    /* compiled from: StepPreviewDialog.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"LB5/u$a;", "", "<init>", "()V", "", "stepNumber", "LB5/u;", "a", "(I)LB5/u;", "I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final u a(int stepNumber) {
            u uVar = new u();
            u.f1668Z0 = stepNumber;
            return uVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(u uVar, View view) {
        uVar.A2();
    }

    public final void Q2(View view) {
        C3862t.g(view, "view");
        A5.d dVarA = A5.d.INSTANCE.a(f1668Z0, true);
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.container, dVarA);
        cR.j();
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u.R2(this.f1665B, view2);
            }
        });
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.addView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        K2(true);
        FrameLayout frameLayout = new FrameLayout(e2());
        this.frameLayout = frameLayout;
        View viewInflate = inflater.inflate(R.layout.recipe_step_preview_dialog, (ViewGroup) frameLayout, false);
        C3862t.f(viewInflate, "inflate(...)");
        Q2(viewInflate);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        C3862t.u("frameLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            C3862t.u("frameLayout");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        Object systemService = c2().getSystemService("layout_inflater");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.recipe_step_preview_dialog, (ViewGroup) null, false);
        C3862t.d(viewInflate);
        Q2(viewInflate);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        Window window;
        super.x1();
        Dialog dialogD2 = D2();
        if (dialogD2 == null || (window = dialogD2.getWindow()) == null) {
            return;
        }
        window.setLayout(-2, -1);
    }
}
