package B5;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.apptionlabs.meater_app.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: StepPreviewBottomDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LB5/s;", "LB5/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Loa/F;", "x1", "view", "Y2", "(Landroid/view/View;)V", "Z0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s extends AbstractC0884b {

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a1, reason: collision with root package name */
    private static int f1664a1;

    /* compiled from: StepPreviewBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"LB5/s$a;", "", "<init>", "()V", "", "stepNumber", "LB5/s;", "a", "(I)LB5/s;", "I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final s a(int stepNumber) {
            s sVar = new s();
            s.f1664a1 = stepNumber;
            return sVar;
        }

        private Companion() {
        }
    }

    public s() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(s sVar, View view) {
        sVar.A2();
    }

    public void Y2(View view) {
        C3862t.g(view, "view");
        A5.d dVarA = A5.d.INSTANCE.a(f1664a1, true);
        androidx.fragment.app.C cR = Y().r();
        C3862t.f(cR, "beginTransaction(...)");
        cR.b(R.id.bottomContainer, dVarA);
        cR.j();
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.Z2(this.f1662B, view2);
            }
        });
        view.invalidate();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_step_preview_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        Y2(viewInflate);
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
