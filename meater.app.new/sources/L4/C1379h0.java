package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

/* compiled from: FragmentNewsBinding.java */
/* renamed from: L4.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1379h0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10113a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10114b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f10115c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f10116d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f10117e;

    /* renamed from: f, reason: collision with root package name */
    public final Guideline f10118f;

    /* renamed from: g, reason: collision with root package name */
    public final Guideline f10119g;

    /* renamed from: h, reason: collision with root package name */
    public final Guideline f10120h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f10121i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialButton f10122j;

    /* renamed from: k, reason: collision with root package name */
    public final MaterialButton f10123k;

    /* renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f10124l;

    /* renamed from: m, reason: collision with root package name */
    public final MaterialButton f10125m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayoutCompat f10126n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatImageView f10127o;

    /* renamed from: p, reason: collision with root package name */
    public final MaterialToolbar f10128p;

    /* renamed from: q, reason: collision with root package name */
    public final AppCompatImageView f10129q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10130r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayoutCompat f10131s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f10132t;

    private C1379h0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialButton materialButton, FrameLayout frameLayout, AppCompatImageView appCompatImageView, Guideline guideline, Guideline guideline2, Guideline guideline3, AppCompatImageView appCompatImageView2, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatImageView appCompatImageView3, MaterialButton materialButton4, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView4, MaterialToolbar materialToolbar, AppCompatImageView appCompatImageView5, TextView textView, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView6) {
        this.f10113a = constraintLayout;
        this.f10114b = appBarLayout;
        this.f10115c = materialButton;
        this.f10116d = frameLayout;
        this.f10117e = appCompatImageView;
        this.f10118f = guideline;
        this.f10119g = guideline2;
        this.f10120h = guideline3;
        this.f10121i = appCompatImageView2;
        this.f10122j = materialButton2;
        this.f10123k = materialButton3;
        this.f10124l = appCompatImageView3;
        this.f10125m = materialButton4;
        this.f10126n = linearLayoutCompat;
        this.f10127o = appCompatImageView4;
        this.f10128p = materialToolbar;
        this.f10129q = appCompatImageView5;
        this.f10130r = textView;
        this.f10131s = linearLayoutCompat2;
        this.f10132t = appCompatImageView6;
    }

    public static C1379h0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.blogButton;
            MaterialButton materialButton = (MaterialButton) A3.a.a(view, R.id.blogButton);
            if (materialButton != null) {
                i10 = R.id.dynamicCardFrame;
                FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.dynamicCardFrame);
                if (frameLayout != null) {
                    i10 = R.id.facebookButton;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.facebookButton);
                    if (appCompatImageView != null) {
                        i10 = R.id.guidelineBottom;
                        Guideline guideline = (Guideline) A3.a.a(view, R.id.guidelineBottom);
                        if (guideline != null) {
                            i10 = R.id.guidelineEnd;
                            Guideline guideline2 = (Guideline) A3.a.a(view, R.id.guidelineEnd);
                            if (guideline2 != null) {
                                i10 = R.id.guidelineStart;
                                Guideline guideline3 = (Guideline) A3.a.a(view, R.id.guidelineStart);
                                if (guideline3 != null) {
                                    i10 = R.id.instagramButton;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.instagramButton);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.manageEmailPreference;
                                        MaterialButton materialButton2 = (MaterialButton) A3.a.a(view, R.id.manageEmailPreference);
                                        if (materialButton2 != null) {
                                            i10 = R.id.newsLetterSignupButton;
                                            MaterialButton materialButton3 = (MaterialButton) A3.a.a(view, R.id.newsLetterSignupButton);
                                            if (materialButton3 != null) {
                                                i10 = R.id.pinterestButton;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.pinterestButton);
                                                if (appCompatImageView3 != null) {
                                                    i10 = R.id.releaseNoteButton;
                                                    MaterialButton materialButton4 = (MaterialButton) A3.a.a(view, R.id.releaseNoteButton);
                                                    if (materialButton4 != null) {
                                                        i10 = R.id.socialShareHolder;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) A3.a.a(view, R.id.socialShareHolder);
                                                        if (linearLayoutCompat != null) {
                                                            i10 = R.id.tiktokButton;
                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) A3.a.a(view, R.id.tiktokButton);
                                                            if (appCompatImageView4 != null) {
                                                                i10 = R.id.toolbar;
                                                                MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                                                if (materialToolbar != null) {
                                                                    i10 = R.id.twitterButton;
                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) A3.a.a(view, R.id.twitterButton);
                                                                    if (appCompatImageView5 != null) {
                                                                        i10 = R.id.txtMessage;
                                                                        TextView textView = (TextView) A3.a.a(view, R.id.txtMessage);
                                                                        if (textView != null) {
                                                                            i10 = R.id.videoListHolder;
                                                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) A3.a.a(view, R.id.videoListHolder);
                                                                            if (linearLayoutCompat2 != null) {
                                                                                i10 = R.id.youtubeButton;
                                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) A3.a.a(view, R.id.youtubeButton);
                                                                                if (appCompatImageView6 != null) {
                                                                                    return new C1379h0((ConstraintLayout) view, appBarLayout, materialButton, frameLayout, appCompatImageView, guideline, guideline2, guideline3, appCompatImageView2, materialButton2, materialButton3, appCompatImageView3, materialButton4, linearLayoutCompat, appCompatImageView4, materialToolbar, appCompatImageView5, textView, linearLayoutCompat2, appCompatImageView6);
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

    public static C1379h0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_news, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10113a;
    }
}
