package B5;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.summary.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import x5.EnumC5056a;

/* compiled from: PreparationDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LB5/j;", "Landroidx/fragment/app/n;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "S2", "(Landroid/view/View;)V", "W0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends androidx.fragment.app.n {

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: X0, reason: collision with root package name */
    private static x5.h f1642X0;

    /* renamed from: Y0, reason: collision with root package name */
    private static Recipe f1643Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private static EnumC5056a f1644Z0;

    /* compiled from: PreparationDialog.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LB5/j$a;", "", "<init>", "()V", "Lo4/o;", "recipe", "Lx5/h;", "screenType", "Lx5/a;", "heightType", "LB5/j;", "a", "(Lo4/o;Lx5/h;Lx5/a;)LB5/j;", "Lx5/h;", "Lo4/o;", "Lx5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j a(Recipe recipe, x5.h screenType, EnumC5056a heightType) {
            C3862t.g(recipe, "recipe");
            C3862t.g(screenType, "screenType");
            C3862t.g(heightType, "heightType");
            j jVar = new j();
            Bundle bundle = new Bundle();
            j.f1642X0 = screenType;
            j.f1643Y0 = recipe;
            j.f1644Z0 = heightType;
            jVar.k2(bundle);
            return jVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(j jVar, View view) {
        jVar.A2();
    }

    public final void S2(View view) {
        C3862t.g(view, "view");
        c.Companion companion = com.apptionlabs.meater_app.recipe.ui.summary.c.INSTANCE;
        Recipe recipe = f1643Y0;
        x5.h hVar = null;
        if (recipe == null) {
            C3862t.u("recipe");
            recipe = null;
        }
        x5.h hVar2 = f1642X0;
        if (hVar2 == null) {
            C3862t.u("screenType");
        } else {
            hVar = hVar2;
        }
        com.apptionlabs.meater_app.recipe.ui.summary.c cVarA = companion.a(recipe, hVar);
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.container, cVarA);
        cR.j();
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.T2(this.f1640B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_summary_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        S2(viewInflate);
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
