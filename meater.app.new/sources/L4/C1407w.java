package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: AddNoteFragmentBinding.java */
/* renamed from: L4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1407w {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10678a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10679b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10680c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10681d;

    /* renamed from: e, reason: collision with root package name */
    public final AppBarLayout f10682e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f10683f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10684g;

    /* renamed from: h, reason: collision with root package name */
    public final View f10685h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f10686i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10687j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10688k;

    /* renamed from: l, reason: collision with root package name */
    public final View f10689l;

    /* renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f10690m;

    /* renamed from: n, reason: collision with root package name */
    public final AppCompatEditText f10691n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10692o;

    /* renamed from: p, reason: collision with root package name */
    public final View f10693p;

    /* renamed from: q, reason: collision with root package name */
    public final Guideline f10694q;

    /* renamed from: r, reason: collision with root package name */
    public final ConstraintLayout f10695r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f10696s;

    /* renamed from: t, reason: collision with root package name */
    public final View f10697t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10698u;

    /* renamed from: v, reason: collision with root package name */
    public final View f10699v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatTextView f10700w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialToolbar f10701x;

    private C1407w(ConstraintLayout constraintLayout, TextView textView, View view, AppCompatTextView appCompatTextView, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, View view2, Guideline guideline, TextView textView2, TextView textView3, View view3, AppCompatTextView appCompatTextView3, AppCompatEditText appCompatEditText, TextView textView4, View view4, Guideline guideline2, ConstraintLayout constraintLayout3, LinearLayout linearLayout, View view5, TextView textView5, View view6, AppCompatTextView appCompatTextView4, MaterialToolbar materialToolbar) {
        this.f10678a = constraintLayout;
        this.f10679b = textView;
        this.f10680c = view;
        this.f10681d = appCompatTextView;
        this.f10682e = appBarLayout;
        this.f10683f = constraintLayout2;
        this.f10684g = appCompatTextView2;
        this.f10685h = view2;
        this.f10686i = guideline;
        this.f10687j = textView2;
        this.f10688k = textView3;
        this.f10689l = view3;
        this.f10690m = appCompatTextView3;
        this.f10691n = appCompatEditText;
        this.f10692o = textView4;
        this.f10693p = view4;
        this.f10694q = guideline2;
        this.f10695r = constraintLayout3;
        this.f10696s = linearLayout;
        this.f10697t = view5;
        this.f10698u = textView5;
        this.f10699v = view6;
        this.f10700w = appCompatTextView4;
        this.f10701x = materialToolbar;
    }

    public static C1407w a(View view) {
        int i10 = R.id.ambientBtn;
        TextView textView = (TextView) A3.a.a(view, R.id.ambientBtn);
        if (textView != null) {
            i10 = R.id.ambientSelectIndicator;
            View viewA = A3.a.a(view, R.id.ambientSelectIndicator);
            if (viewA != null) {
                i10 = R.id.ambientText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.ambientText);
                if (appCompatTextView != null) {
                    i10 = R.id.appBarLayout;
                    AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
                    if (appBarLayout != null) {
                        i10 = R.id.baseLayoutContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) A3.a.a(view, R.id.baseLayoutContainer);
                        if (constraintLayout != null) {
                            i10 = R.id.editNoteBtn;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.editNoteBtn);
                            if (appCompatTextView2 != null) {
                                i10 = R.id.firstDivider;
                                View viewA2 = A3.a.a(view, R.id.firstDivider);
                                if (viewA2 != null) {
                                    i10 = R.id.firstGuide;
                                    Guideline guideline = (Guideline) A3.a.a(view, R.id.firstGuide);
                                    if (guideline != null) {
                                        i10 = R.id.generalBtn;
                                        TextView textView2 = (TextView) A3.a.a(view, R.id.generalBtn);
                                        if (textView2 != null) {
                                            i10 = R.id.internalBtn;
                                            TextView textView3 = (TextView) A3.a.a(view, R.id.internalBtn);
                                            if (textView3 != null) {
                                                i10 = R.id.internalSelectIndicator;
                                                View viewA3 = A3.a.a(view, R.id.internalSelectIndicator);
                                                if (viewA3 != null) {
                                                    i10 = R.id.internalText;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.internalText);
                                                    if (appCompatTextView3 != null) {
                                                        i10 = R.id.noteEditView;
                                                        AppCompatEditText appCompatEditText = (AppCompatEditText) A3.a.a(view, R.id.noteEditView);
                                                        if (appCompatEditText != null) {
                                                            i10 = R.id.saveTextView;
                                                            TextView textView4 = (TextView) A3.a.a(view, R.id.saveTextView);
                                                            if (textView4 != null) {
                                                                i10 = R.id.secondDivider;
                                                                View viewA4 = A3.a.a(view, R.id.secondDivider);
                                                                if (viewA4 != null) {
                                                                    i10 = R.id.secondGuide;
                                                                    Guideline guideline2 = (Guideline) A3.a.a(view, R.id.secondGuide);
                                                                    if (guideline2 != null) {
                                                                        i10 = R.id.secondLayout;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) A3.a.a(view, R.id.secondLayout);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = R.id.tabs;
                                                                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.tabs);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.thirdDivider;
                                                                                View viewA5 = A3.a.a(view, R.id.thirdDivider);
                                                                                if (viewA5 != null) {
                                                                                    i10 = R.id.timeBtn;
                                                                                    TextView textView5 = (TextView) A3.a.a(view, R.id.timeBtn);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.timeSelectIndicator;
                                                                                        View viewA6 = A3.a.a(view, R.id.timeSelectIndicator);
                                                                                        if (viewA6 != null) {
                                                                                            i10 = R.id.timeText;
                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.timeText);
                                                                                            if (appCompatTextView4 != null) {
                                                                                                i10 = R.id.toolbar;
                                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                                                if (materialToolbar != null) {
                                                                                                    return new C1407w((ConstraintLayout) view, textView, viewA, appCompatTextView, appBarLayout, constraintLayout, appCompatTextView2, viewA2, guideline, textView2, textView3, viewA3, appCompatTextView3, appCompatEditText, textView4, viewA4, guideline2, constraintLayout2, linearLayout, viewA5, textView5, viewA6, appCompatTextView4, materialToolbar);
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

    public static C1407w c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.add_note_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10678a;
    }
}
