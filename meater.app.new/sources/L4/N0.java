package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: NewDeviceFoundDialogBinding.java */
/* loaded from: classes2.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9537a;

    /* renamed from: b, reason: collision with root package name */
    public final Guideline f9538b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f9539c;

    /* renamed from: d, reason: collision with root package name */
    public final D f9540d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9541e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f9542f;

    /* renamed from: g, reason: collision with root package name */
    public final PlayerView f9543g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f9544h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f9545i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9546j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f9547k;

    /* renamed from: l, reason: collision with root package name */
    public final Guideline f9548l;

    private N0(ConstraintLayout constraintLayout, Guideline guideline, MaterialButton materialButton, D d10, AppCompatTextView appCompatTextView, Guideline guideline2, PlayerView playerView, ConstraintLayout constraintLayout2, Guideline guideline3, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, Guideline guideline4) {
        this.f9537a = constraintLayout;
        this.f9538b = guideline;
        this.f9539c = materialButton;
        this.f9540d = d10;
        this.f9541e = appCompatTextView;
        this.f9542f = guideline2;
        this.f9543g = playerView;
        this.f9544h = constraintLayout2;
        this.f9545i = guideline3;
        this.f9546j = appCompatTextView2;
        this.f9547k = linearLayout;
        this.f9548l = guideline4;
    }

    public static N0 a(View view) {
        int i10 = R.id.bottomGuideLine;
        Guideline guideline = (Guideline) A3.a.a(view, R.id.bottomGuideLine);
        if (guideline != null) {
            i10 = R.id.button;
            MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.button);
            if (materialButton != null) {
                i10 = R.id.closeLayout;
                View viewA = A3.a.a(view, R.id.closeLayout);
                if (viewA != null) {
                    D dA = D.a(viewA);
                    i10 = R.id.deviceName;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.deviceName);
                    if (appCompatTextView != null) {
                        i10 = R.id.endGuideLine;
                        Guideline guideline2 = (Guideline) A3.a.a(view, R.id.endGuideLine);
                        if (guideline2 != null) {
                            i10 = R.id.playerView;
                            PlayerView playerView = (PlayerView) A3.a.a(view, R.id.playerView);
                            if (playerView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = R.id.startGuideLine;
                                Guideline guideline3 = (Guideline) A3.a.a(view, R.id.startGuideLine);
                                if (guideline3 != null) {
                                    i10 = R.id.subTitle;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.subTitle);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.titleHolder;
                                        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.titleHolder);
                                        if (linearLayout != null) {
                                            i10 = R.id.topGuideLine;
                                            Guideline guideline4 = (Guideline) A3.a.a(view, R.id.topGuideLine);
                                            if (guideline4 != null) {
                                                return new N0(constraintLayout, guideline, materialButton, dA, appCompatTextView, guideline2, playerView, constraintLayout, guideline3, appCompatTextView2, linearLayout, guideline4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static N0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.new_device_found_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9537a;
    }
}
