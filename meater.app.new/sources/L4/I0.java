package L4;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.ProbeNumberTextView;

/* compiled from: ListNoSetupViewBinding.java */
/* loaded from: classes2.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9417a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f9418b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f9419c;

    /* renamed from: d, reason: collision with root package name */
    public final ProbeNumberTextView f9420d;

    private I0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, ProbeNumberTextView probeNumberTextView) {
        this.f9417a = constraintLayout;
        this.f9418b = constraintLayout2;
        this.f9419c = appCompatTextView;
        this.f9420d = probeNumberTextView;
    }

    public static I0 a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.defaultViewMeaterNumber;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.defaultViewMeaterNumber);
        if (appCompatTextView != null) {
            i10 = R.id.probeNumberText;
            ProbeNumberTextView probeNumberTextView = (ProbeNumberTextView) A3.a.a(view, R.id.probeNumberText);
            if (probeNumberTextView != null) {
                return new I0(constraintLayout, constraintLayout, appCompatTextView, probeNumberTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
