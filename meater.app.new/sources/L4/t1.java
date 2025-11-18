package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.MeaterArcMask;

/* compiled from: ViewDialTestBinding.java */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10594a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f10595b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f10596c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f10597d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f10598e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f10599f;

    /* renamed from: g, reason: collision with root package name */
    public final MeaterArcMask f10600g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f10601h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f10602i;

    private t1(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, MeaterArcMask meaterArcMask, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7) {
        this.f10594a = relativeLayout;
        this.f10595b = appCompatImageView;
        this.f10596c = appCompatImageView2;
        this.f10597d = appCompatImageView3;
        this.f10598e = appCompatImageView4;
        this.f10599f = appCompatImageView5;
        this.f10600g = meaterArcMask;
        this.f10601h = appCompatImageView6;
        this.f10602i = appCompatImageView7;
    }

    public static t1 a(View view) {
        int i10 = R.id.alert1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.alert1);
        if (appCompatImageView != null) {
            i10 = R.id.alert2;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.alert2);
            if (appCompatImageView2 != null) {
                i10 = R.id.alert3;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) A3.a.a(view, R.id.alert3);
                if (appCompatImageView3 != null) {
                    i10 = R.id.alert4;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) A3.a.a(view, R.id.alert4);
                    if (appCompatImageView4 != null) {
                        i10 = R.id.ambientArrow;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) A3.a.a(view, R.id.ambientArrow);
                        if (appCompatImageView5 != null) {
                            i10 = R.id.innerRing;
                            MeaterArcMask meaterArcMask = (MeaterArcMask) A3.a.a(view, R.id.innerRing);
                            if (meaterArcMask != null) {
                                i10 = R.id.internalArrow;
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) A3.a.a(view, R.id.internalArrow);
                                if (appCompatImageView6 != null) {
                                    i10 = R.id.targetArrow;
                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) A3.a.a(view, R.id.targetArrow);
                                    if (appCompatImageView7 != null) {
                                        return new t1((RelativeLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, meaterArcMask, appCompatImageView6, appCompatImageView7);
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

    public static t1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_dial_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
