package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: AlertViewBinding.java */
/* renamed from: L4.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1409x {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f10726a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10727b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10728c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10729d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10730e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10731f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10732g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10733h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10734i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10735j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10736k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10737l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f10738m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f10739n;

    /* renamed from: o, reason: collision with root package name */
    public final LinearLayout f10740o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10741p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f10742q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f10743r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10744s;

    private C1409x(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3, TextView textView2, LinearLayout linearLayout4, TextView textView3, LinearLayout linearLayout5, TextView textView4, LinearLayout linearLayout6, TextView textView5, ImageView imageView, LinearLayout linearLayout7, LinearLayout linearLayout8, TextView textView6, ImageView imageView2, LinearLayout linearLayout9, TextView textView7) {
        this.f10726a = frameLayout;
        this.f10727b = linearLayout;
        this.f10728c = linearLayout2;
        this.f10729d = textView;
        this.f10730e = linearLayout3;
        this.f10731f = textView2;
        this.f10732g = linearLayout4;
        this.f10733h = textView3;
        this.f10734i = linearLayout5;
        this.f10735j = textView4;
        this.f10736k = linearLayout6;
        this.f10737l = textView5;
        this.f10738m = imageView;
        this.f10739n = linearLayout7;
        this.f10740o = linearLayout8;
        this.f10741p = textView6;
        this.f10742q = imageView2;
        this.f10743r = linearLayout9;
        this.f10744s = textView7;
    }

    public static C1409x a(View view) {
        int i10 = R.id.alertView;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.alertView);
        if (linearLayout != null) {
            i10 = R.id.container1;
            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.container1);
            if (linearLayout2 != null) {
                i10 = R.id.container1Label;
                TextView textView = (TextView) A3.a.a(view, R.id.container1Label);
                if (textView != null) {
                    i10 = R.id.container2;
                    LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.container2);
                    if (linearLayout3 != null) {
                        i10 = R.id.container2Label;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.container2Label);
                        if (textView2 != null) {
                            i10 = R.id.container3;
                            LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.container3);
                            if (linearLayout4 != null) {
                                i10 = R.id.container3Label;
                                TextView textView3 = (TextView) A3.a.a(view, R.id.container3Label);
                                if (textView3 != null) {
                                    i10 = R.id.container4;
                                    LinearLayout linearLayout5 = (LinearLayout) A3.a.a(view, R.id.container4);
                                    if (linearLayout5 != null) {
                                        i10 = R.id.container4Label;
                                        TextView textView4 = (TextView) A3.a.a(view, R.id.container4Label);
                                        if (textView4 != null) {
                                            i10 = R.id.container5;
                                            LinearLayout linearLayout6 = (LinearLayout) A3.a.a(view, R.id.container5);
                                            if (linearLayout6 != null) {
                                                i10 = R.id.container5Label;
                                                TextView textView5 = (TextView) A3.a.a(view, R.id.container5Label);
                                                if (textView5 != null) {
                                                    i10 = R.id.infoImage;
                                                    ImageView imageView = (ImageView) A3.a.a(view, R.id.infoImage);
                                                    if (imageView != null) {
                                                        i10 = R.id.multiAlertContainer;
                                                        LinearLayout linearLayout7 = (LinearLayout) A3.a.a(view, R.id.multiAlertContainer);
                                                        if (linearLayout7 != null) {
                                                            i10 = R.id.multiLineContainer;
                                                            LinearLayout linearLayout8 = (LinearLayout) A3.a.a(view, R.id.multiLineContainer);
                                                            if (linearLayout8 != null) {
                                                                i10 = R.id.multiLineLabel;
                                                                TextView textView6 = (TextView) A3.a.a(view, R.id.multiLineLabel);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.oneLabelInfoImage;
                                                                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.oneLabelInfoImage);
                                                                    if (imageView2 != null) {
                                                                        i10 = R.id.oneLineContainer;
                                                                        LinearLayout linearLayout9 = (LinearLayout) A3.a.a(view, R.id.oneLineContainer);
                                                                        if (linearLayout9 != null) {
                                                                            i10 = R.id.oneLineLabel;
                                                                            TextView textView7 = (TextView) A3.a.a(view, R.id.oneLineLabel);
                                                                            if (textView7 != null) {
                                                                                return new C1409x((FrameLayout) view, linearLayout, linearLayout2, textView, linearLayout3, textView2, linearLayout4, textView3, linearLayout5, textView4, linearLayout6, textView5, imageView, linearLayout7, linearLayout8, textView6, imageView2, linearLayout9, textView7);
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

    public static C1409x b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.alert_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
