package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: FragmentQsgWelcomeBinding.java */
/* renamed from: L4.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1387l0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10203a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f10204b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10205c;

    /* renamed from: d, reason: collision with root package name */
    public final TextSwitcher f10206d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f10207e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f10208f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10209g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f10210h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialButton f10211i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialButton f10212j;

    /* renamed from: k, reason: collision with root package name */
    public final TextSwitcher f10213k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10214l;

    /* renamed from: m, reason: collision with root package name */
    public final PlayerView f10215m;

    /* renamed from: n, reason: collision with root package name */
    public final View f10216n;

    /* renamed from: o, reason: collision with root package name */
    public final View f10217o;

    private C1387l0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TextSwitcher textSwitcher, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat, TextView textView, ProgressBar progressBar, MaterialButton materialButton2, MaterialButton materialButton3, TextSwitcher textSwitcher2, TextView textView2, PlayerView playerView, View view, View view2) {
        this.f10203a = constraintLayout;
        this.f10204b = constraintLayout2;
        this.f10205c = appCompatImageView;
        this.f10206d = textSwitcher;
        this.f10207e = materialButton;
        this.f10208f = linearLayoutCompat;
        this.f10209g = textView;
        this.f10210h = progressBar;
        this.f10211i = materialButton2;
        this.f10212j = materialButton3;
        this.f10213k = textSwitcher2;
        this.f10214l = textView2;
        this.f10215m = playerView;
        this.f10216n = view;
        this.f10217o = view2;
    }

    public static C1387l0 a(View view) {
        int i10 = R.id.QSGTextContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.QSGTextContainer);
        if (constraintLayout != null) {
            i10 = R.id.actionbar_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.actionbar_image);
            if (appCompatImageView != null) {
                i10 = R.id.body1;
                TextSwitcher textSwitcher = (TextSwitcher) A3.a.a(view, R.id.body1);
                if (textSwitcher != null) {
                    i10 = R.id.btnSkip;
                    MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.btnSkip);
                    if (materialButton != null) {
                        i10 = R.id.buttonHolder;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.buttonHolder);
                        if (linearLayoutCompat != null) {
                            i10 = R.id.learnText;
                            TextView textView = (TextView) A3.a.a(view, R.id.learnText);
                            if (textView != null) {
                                i10 = R.id.loading;
                                ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.loading);
                                if (progressBar != null) {
                                    i10 = R.id.loginBtn;
                                    MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.loginBtn);
                                    if (materialButton2 != null) {
                                        i10 = R.id.signupBtn;
                                        MaterialButton materialButton3 = (MaterialButton) A3.a.a(view, R.id.signupBtn);
                                        if (materialButton3 != null) {
                                            i10 = R.id.title1;
                                            TextSwitcher textSwitcher2 = (TextSwitcher) A3.a.a(view, R.id.title1);
                                            if (textSwitcher2 != null) {
                                                i10 = R.id.version;
                                                TextView textView2 = (TextView) A3.a.a(view, R.id.version);
                                                if (textView2 != null) {
                                                    i10 = R.id.video;
                                                    PlayerView playerView = (PlayerView) A3.a.a(view, R.id.video);
                                                    if (playerView != null) {
                                                        i10 = R.id.viewEnd;
                                                        View viewA = A3.a.a(view, R.id.viewEnd);
                                                        if (viewA != null) {
                                                            i10 = R.id.viewStart;
                                                            View viewA2 = A3.a.a(view, R.id.viewStart);
                                                            if (viewA2 != null) {
                                                                return new C1387l0((ConstraintLayout) view, constraintLayout, appCompatImageView, textSwitcher, materialButton, linearLayoutCompat, textView, progressBar, materialButton2, materialButton3, textSwitcher2, textView2, playerView, viewA, viewA2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1387l0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_qsg_welcome, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10203a;
    }
}
