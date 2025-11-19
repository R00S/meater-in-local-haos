package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: FragmentHelpBinding.java */
/* renamed from: L4.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1371d0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9963a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f9964b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f9965c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9966d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f9967e;

    /* renamed from: f, reason: collision with root package name */
    public final ListView f9968f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f9969g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f9970h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9971i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialToolbar f9972j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f9973k;

    /* renamed from: l, reason: collision with root package name */
    public final RelativeLayout f9974l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f9975m;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f9976n;

    /* renamed from: o, reason: collision with root package name */
    public final WebView f9977o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f9978p;

    private C1371d0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, Button button, View view, RelativeLayout relativeLayout, ListView listView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, MaterialToolbar materialToolbar, TextView textView2, RelativeLayout relativeLayout2, FrameLayout frameLayout, LinearLayout linearLayout3, WebView webView, ImageView imageView) {
        this.f9963a = constraintLayout;
        this.f9964b = appBarLayout;
        this.f9965c = button;
        this.f9966d = view;
        this.f9967e = relativeLayout;
        this.f9968f = listView;
        this.f9969g = linearLayout;
        this.f9970h = linearLayout2;
        this.f9971i = textView;
        this.f9972j = materialToolbar;
        this.f9973k = textView2;
        this.f9974l = relativeLayout2;
        this.f9975m = frameLayout;
        this.f9976n = linearLayout3;
        this.f9977o = webView;
        this.f9978p = imageView;
    }

    public static C1371d0 a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.continueButton;
            Button button = (Button) A3.a.a(view, R.id.continueButton);
            if (button != null) {
                i10 = R.id.divider;
                View viewA = A3.a.a(view, R.id.divider);
                if (viewA != null) {
                    i10 = R.id.help_fragment;
                    RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.help_fragment);
                    if (relativeLayout != null) {
                        i10 = R.id.help_list;
                        ListView listView = (ListView) A3.a.a(view, R.id.help_list);
                        if (listView != null) {
                            i10 = R.id.helpNotSupportAlert;
                            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.helpNotSupportAlert);
                            if (linearLayout != null) {
                                i10 = R.id.listViewContainer;
                                LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.listViewContainer);
                                if (linearLayout2 != null) {
                                    i10 = R.id.supportButton;
                                    TextView textView = (TextView) A3.a.a(view, R.id.supportButton);
                                    if (textView != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.version;
                                            TextView textView2 = (TextView) A3.a.a(view, R.id.version);
                                            if (textView2 != null) {
                                                i10 = R.id.versionContainer;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) A3.a.a(view, R.id.versionContainer);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.webFragmentContainer;
                                                    FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.webFragmentContainer);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.webLayout1;
                                                        LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.webLayout1);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.webView1;
                                                            WebView webView = (WebView) A3.a.a(view, R.id.webView1);
                                                            if (webView != null) {
                                                                i10 = R.id.worldChatImage;
                                                                ImageView imageView = (ImageView) A3.a.a(view, R.id.worldChatImage);
                                                                if (imageView != null) {
                                                                    return new C1371d0((ConstraintLayout) view, appBarLayout, button, viewA, relativeLayout, listView, linearLayout, linearLayout2, textView, materialToolbar, textView2, relativeLayout2, frameLayout, linearLayout3, webView, imageView);
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

    public static C1371d0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_help, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f9963a;
    }
}
