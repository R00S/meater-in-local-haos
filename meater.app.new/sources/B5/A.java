package B5;

import M5.E;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import g1.C3377a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import x5.EnumC5056a;

/* compiled from: USDABottomDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LB5/A;", "LB5/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "Z2", "(Landroid/view/View;)V", "Z0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class A extends AbstractC0884b {

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a1, reason: collision with root package name */
    private static MeatModel f1616a1;

    /* renamed from: b1, reason: collision with root package name */
    private static EnumC5056a f1617b1;

    /* compiled from: USDABottomDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"LB5/A$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "cut", "Lx5/a;", "heightType", "LB5/A;", "a", "(Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;Lx5/a;)LB5/A;", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "Lx5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final A a(MeatModel cut, EnumC5056a heightType) {
            C3862t.g(cut, "cut");
            C3862t.g(heightType, "heightType");
            A a10 = new A();
            Bundle bundle = new Bundle();
            A.f1616a1 = cut;
            A.f1617b1 = heightType;
            a10.k2(bundle);
            return a10;
        }

        private Companion() {
        }
    }

    public A() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(A a10, View view) {
        a10.A2();
    }

    public void Z2(View view) {
        C3862t.g(view, "view");
        MeatModel meatModel = f1616a1;
        if (meatModel == null) {
            C3862t.u("cut");
            meatModel = null;
        }
        E eA2 = E.A2(meatModel);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bottomContainer);
        ImageView imageView = (ImageView) view.findViewById(R.id.closeButton);
        frameLayout.setPadding(0, 140, 0, 100);
        frameLayout.setBackgroundColor(C3377a.c(e2(), R.color.view_active_color));
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.bottomContainer, eA2);
        cR.j();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: B5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                A.a3(this.f1707B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_summary_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        Z2(viewInflate);
        return viewInflate;
    }

    @Override // B5.AbstractC0884b, androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        Window window;
        super.x1();
        Dialog dialogD2 = D2();
        if (dialogD2 == null || (window = dialogD2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
