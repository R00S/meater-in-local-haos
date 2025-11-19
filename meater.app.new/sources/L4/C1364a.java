package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MEATEREditText;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ActivityAccountDetailBinding.java */
/* renamed from: L4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1364a {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9797a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9798b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f9799c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9800d;

    /* renamed from: e, reason: collision with root package name */
    public final View f9801e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9802f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f9803g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f9804h;

    /* renamed from: i, reason: collision with root package name */
    public final View f9805i;

    /* renamed from: j, reason: collision with root package name */
    public final View f9806j;

    /* renamed from: k, reason: collision with root package name */
    public final ProgressBar f9807k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f9808l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f9809m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f9810n;

    /* renamed from: o, reason: collision with root package name */
    public final m1 f9811o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f9812p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f9813q;

    /* renamed from: r, reason: collision with root package name */
    public final MEATEREditText f9814r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f9815s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f9816t;

    /* renamed from: u, reason: collision with root package name */
    public final MEATEREditText f9817u;

    /* renamed from: v, reason: collision with root package name */
    public final m1 f9818v;

    /* renamed from: w, reason: collision with root package name */
    public final ScrollView f9819w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f9820x;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialToolbar f9821y;

    private C1364a(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, TextView textView, View view, View view2, TextView textView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView, View view3, View view4, ProgressBar progressBar, TextView textView3, LinearLayout linearLayout2, TextView textView4, m1 m1Var, TextView textView5, LinearLayout linearLayout3, MEATEREditText mEATEREditText, TextView textView6, LinearLayout linearLayout4, MEATEREditText mEATEREditText2, m1 m1Var2, ScrollView scrollView, TextView textView7, MaterialToolbar materialToolbar) {
        this.f9797a = constraintLayout;
        this.f9798b = appBarLayout;
        this.f9799c = textView;
        this.f9800d = view;
        this.f9801e = view2;
        this.f9802f = textView2;
        this.f9803g = linearLayout;
        this.f9804h = appCompatTextView;
        this.f9805i = view3;
        this.f9806j = view4;
        this.f9807k = progressBar;
        this.f9808l = textView3;
        this.f9809m = linearLayout2;
        this.f9810n = textView4;
        this.f9811o = m1Var;
        this.f9812p = textView5;
        this.f9813q = linearLayout3;
        this.f9814r = mEATEREditText;
        this.f9815s = textView6;
        this.f9816t = linearLayout4;
        this.f9817u = mEATEREditText2;
        this.f9818v = m1Var2;
        this.f9819w = scrollView;
        this.f9820x = textView7;
        this.f9821y = materialToolbar;
    }

    public static C1364a a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.delete_act_text;
            TextView textView = (TextView) A3.a.a(view, R.id.delete_act_text);
            if (textView != null) {
                i10 = R.id.divider2;
                View viewA = A3.a.a(view, R.id.divider2);
                if (viewA != null) {
                    i10 = R.id.divider3;
                    View viewA2 = A3.a.a(view, R.id.divider3);
                    if (viewA2 != null) {
                        i10 = R.id.email_label;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.email_label);
                        if (textView2 != null) {
                            i10 = R.id.emailLayout;
                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.emailLayout);
                            if (linearLayout != null) {
                                i10 = R.id.email_text;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.email_text);
                                if (appCompatTextView != null) {
                                    i10 = R.id.empty1;
                                    View viewA3 = A3.a.a(view, R.id.empty1);
                                    if (viewA3 != null) {
                                        i10 = R.id.empty2;
                                        View viewA4 = A3.a.a(view, R.id.empty2);
                                        if (viewA4 != null) {
                                            i10 = R.id.mProgressBar;
                                            ProgressBar progressBar = (ProgressBar) A3.a.a(view, R.id.mProgressBar);
                                            if (progressBar != null) {
                                                i10 = R.id.name_label;
                                                TextView textView3 = (TextView) A3.a.a(view, R.id.name_label);
                                                if (textView3 != null) {
                                                    i10 = R.id.nameLayout;
                                                    LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.nameLayout);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.name_text;
                                                        TextView textView4 = (TextView) A3.a.a(view, R.id.name_text);
                                                        if (textView4 != null) {
                                                            i10 = R.id.passwordHeading;
                                                            View viewA5 = A3.a.a(view, R.id.passwordHeading);
                                                            if (viewA5 != null) {
                                                                m1 m1VarA = m1.a(viewA5);
                                                                i10 = R.id.password_label;
                                                                TextView textView5 = (TextView) A3.a.a(view, R.id.password_label);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.passwordLayout;
                                                                    LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.passwordLayout);
                                                                    if (linearLayout3 != null) {
                                                                        i10 = R.id.password_text;
                                                                        MEATEREditText mEATEREditText = (MEATEREditText) A3.a.a(view, R.id.password_text);
                                                                        if (mEATEREditText != null) {
                                                                            i10 = R.id.re_password_label;
                                                                            TextView textView6 = (TextView) A3.a.a(view, R.id.re_password_label);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.rePasswordLayout;
                                                                                LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.rePasswordLayout);
                                                                                if (linearLayout4 != null) {
                                                                                    i10 = R.id.re_password_text;
                                                                                    MEATEREditText mEATEREditText2 = (MEATEREditText) A3.a.a(view, R.id.re_password_text);
                                                                                    if (mEATEREditText2 != null) {
                                                                                        i10 = R.id.screenHeading;
                                                                                        View viewA6 = A3.a.a(view, R.id.screenHeading);
                                                                                        if (viewA6 != null) {
                                                                                            m1 m1VarA2 = m1.a(viewA6);
                                                                                            i10 = R.id.signInScroll;
                                                                                            ScrollView scrollView = (ScrollView) A3.a.a(view, R.id.signInScroll);
                                                                                            if (scrollView != null) {
                                                                                                i10 = R.id.sign_out_text;
                                                                                                TextView textView7 = (TextView) A3.a.a(view, R.id.sign_out_text);
                                                                                                if (textView7 != null) {
                                                                                                    i10 = R.id.toolbar;
                                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                                    if (materialToolbar != null) {
                                                                                                        return new C1364a((ConstraintLayout) view, appBarLayout, textView, viewA, viewA2, textView2, linearLayout, appCompatTextView, viewA3, viewA4, progressBar, textView3, linearLayout2, textView4, m1VarA, textView5, linearLayout3, mEATEREditText, textView6, linearLayout4, mEATEREditText2, m1VarA2, scrollView, textView7, materialToolbar);
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

    public static C1364a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1364a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9797a;
    }
}
