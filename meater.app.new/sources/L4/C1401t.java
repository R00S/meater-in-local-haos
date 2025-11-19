package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: ActivityVideoTutorialSummaryBinding.java */
/* renamed from: L4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1401t {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10562a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f10563b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f10564c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f10565d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f10566e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f10567f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10568g;

    /* renamed from: h, reason: collision with root package name */
    public final NestedScrollView f10569h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f10570i;

    /* renamed from: j, reason: collision with root package name */
    public final RecyclerView f10571j;

    private C1401t(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat2, MaterialButton materialButton2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView3, RecyclerView recyclerView) {
        this.f10562a = constraintLayout;
        this.f10563b = linearLayoutCompat;
        this.f10564c = materialButton;
        this.f10565d = linearLayoutCompat2;
        this.f10566e = materialButton2;
        this.f10567f = appCompatTextView;
        this.f10568g = appCompatTextView2;
        this.f10569h = nestedScrollView;
        this.f10570i = appCompatTextView3;
        this.f10571j = recyclerView;
    }

    public static C1401t a(View view) {
        int i10 = R.id.bottomHolder;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.bottomHolder);
        if (linearLayoutCompat != null) {
            i10 = R.id.button;
            MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.button);
            if (materialButton != null) {
                i10 = R.id.buttonHolder;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.buttonHolder);
                if (linearLayoutCompat2 != null) {
                    i10 = R.id.buttonSkip;
                    MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.buttonSkip);
                    if (materialButton2 != null) {
                        i10 = R.id.screenSubTitle;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.screenSubTitle);
                        if (appCompatTextView != null) {
                            i10 = R.id.screenTitle;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.screenTitle);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.scrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) A3.a.a(view, R.id.scrollView);
                                if (nestedScrollView != null) {
                                    i10 = R.id.textWatchLater;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.textWatchLater);
                                    if (appCompatTextView3 != null) {
                                        i10 = R.id.tutorialList;
                                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.tutorialList);
                                        if (recyclerView != null) {
                                            return new C1401t((ConstraintLayout) view, linearLayoutCompat, materialButton, linearLayoutCompat2, materialButton2, appCompatTextView, appCompatTextView2, nestedScrollView, appCompatTextView3, recyclerView);
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

    public static C1401t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1401t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_video_tutorial_summary, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10562a;
    }
}
