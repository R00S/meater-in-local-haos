package B5;

import M5.E;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import g1.C3377a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import x5.EnumC5056a;

/* compiled from: USDADialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LB5/C;", "Landroidx/fragment/app/n;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "Q2", "(Landroid/view/View;)V", "W0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class C extends androidx.fragment.app.n {

    /* renamed from: X0, reason: collision with root package name */
    private static MeatModel f1620X0;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Y0, reason: collision with root package name */
    private static EnumC5056a f1621Y0 = EnumC5056a.f52803E;

    /* compiled from: USDADialog.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LB5/C$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "cut", "LB5/C;", "a", "(Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;)LB5/C;", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "Lx5/a;", "heightType", "Lx5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.C$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C a(MeatModel cut) {
            C3862t.g(cut, "cut");
            C c10 = new C();
            Bundle bundle = new Bundle();
            C.f1620X0 = cut;
            c10.k2(bundle);
            return c10;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(C c10, View view) {
        c10.A2();
    }

    public final void Q2(View view) {
        C3862t.g(view, "view");
        MeatModel meatModel = f1620X0;
        if (meatModel == null) {
            C3862t.u("cut");
            meatModel = null;
        }
        E eA2 = E.A2(meatModel);
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.container, eA2);
        cR.j();
        if (c2() instanceof RecipeStepsActivity) {
            ((ConstraintLayout) view.findViewById(R.id.rootView)).setBackgroundColor(C3377a.c(e2(), R.color.view_active_color));
        }
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C.R2(this.f1618B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_summary_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        Q2(viewInflate);
        return viewInflate;
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
