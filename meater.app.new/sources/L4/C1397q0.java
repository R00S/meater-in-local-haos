package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: FragmentRecipeProbeSelectionBinding.java */
/* renamed from: L4.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1397q0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10427a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f10428b;

    /* renamed from: c, reason: collision with root package name */
    public final ComposeView f10429c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f10430d;

    /* renamed from: e, reason: collision with root package name */
    public final Guideline f10431e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f10432f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f10433g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f10434h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f10435i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f10436j;

    /* renamed from: k, reason: collision with root package name */
    public final Guideline f10437k;

    /* renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f10438l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10439m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10440n;

    private C1397q0(ConstraintLayout constraintLayout, MaterialButton materialButton, ComposeView composeView, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, Guideline guideline7, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f10427a = constraintLayout;
        this.f10428b = materialButton;
        this.f10429c = composeView;
        this.f10430d = frameLayout;
        this.f10431e = guideline;
        this.f10432f = guideline2;
        this.f10433g = guideline3;
        this.f10434h = guideline4;
        this.f10435i = guideline5;
        this.f10436j = guideline6;
        this.f10437k = guideline7;
        this.f10438l = constraintLayout2;
        this.f10439m = textView;
        this.f10440n = textView2;
    }

    public static C1397q0 a(View view) {
        int i10 = R.id.addDeviceButton;
        MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.addDeviceButton);
        if (materialButton != null) {
            i10 = R.id.cardList;
            ComposeView composeView = (ComposeView) A3.a.a(view, R.id.cardList);
            if (composeView != null) {
                i10 = R.id.container;
                FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.container);
                if (frameLayout != null) {
                    i10 = R.id.guideline1;
                    Guideline guideline = (Guideline) A3.a.a(view, R.id.guideline1);
                    if (guideline != null) {
                        i10 = R.id.guideline2;
                        Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guideline2);
                        if (guideline2 != null) {
                            i10 = R.id.guideline3;
                            Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guideline3);
                            if (guideline3 != null) {
                                i10 = R.id.guidelineBottom;
                                Guideline guideline4 = (Guideline) A3.a.a(view, R.id.guidelineBottom);
                                if (guideline4 != null) {
                                    i10 = R.id.guidelineEnd;
                                    Guideline guideline5 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
                                    if (guideline5 != null) {
                                        i10 = R.id.guidelineStart;
                                        Guideline guideline6 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                                        if (guideline6 != null) {
                                            i10 = R.id.guidelineTop;
                                            Guideline guideline7 = (Guideline) A3.a.a(view, R.id.guidelineTop);
                                            if (guideline7 != null) {
                                                i10 = R.id.noPairedDeviceHolder;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.noPairedDeviceHolder);
                                                if (constraintLayout != null) {
                                                    i10 = R.id.noPairedDeviceText;
                                                    TextView textView = (TextView) A3.a.a(view, R.id.noPairedDeviceText);
                                                    if (textView != null) {
                                                        i10 = R.id.showStepsText;
                                                        TextView textView2 = (TextView) A3.a.a(view, R.id.showStepsText);
                                                        if (textView2 != null) {
                                                            return new C1397q0((ConstraintLayout) view, materialButton, composeView, frameLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, constraintLayout, textView, textView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1397q0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recipe_probe_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10427a;
    }
}
