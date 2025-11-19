package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.apptionlabs.meater_app.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: ActivityDebugBinding.java */
/* renamed from: L4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1374f {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f10013a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10014b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10015c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10016d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10017e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10018f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10019g;

    /* renamed from: h, reason: collision with root package name */
    public final FloatingActionButton f10020h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10021i;

    private C1374f(CoordinatorLayout coordinatorLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3, FloatingActionButton floatingActionButton, RelativeLayout relativeLayout) {
        this.f10013a = coordinatorLayout;
        this.f10014b = imageView;
        this.f10015c = textView;
        this.f10016d = imageView2;
        this.f10017e = textView2;
        this.f10018f = imageView3;
        this.f10019g = textView3;
        this.f10020h = floatingActionButton;
        this.f10021i = relativeLayout;
    }

    public static C1374f a(View view) {
        int i10 = R.id.dbg_bottom_btn;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.dbg_bottom_btn);
        if (imageView != null) {
            i10 = R.id.dbg_clear_button;
            TextView textView = (TextView) A3.a.a(view, R.id.dbg_clear_button);
            if (textView != null) {
                i10 = R.id.dbg_close_btn;
                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.dbg_close_btn);
                if (imageView2 != null) {
                    i10 = R.id.dbg_stop_btn;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.dbg_stop_btn);
                    if (textView2 != null) {
                        i10 = R.id.dbg_top_btn;
                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.dbg_top_btn);
                        if (imageView3 != null) {
                            i10 = R.id.debugTextView;
                            TextView textView3 = (TextView) A3.a.a(view, R.id.debugTextView);
                            if (textView3 != null) {
                                i10 = R.id.email_fab;
                                FloatingActionButton floatingActionButton = (FloatingActionButton) A3.a.a(view, R.id.email_fab);
                                if (floatingActionButton != null) {
                                    i10 = R.id.linearLayout;
                                    RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.linearLayout);
                                    if (relativeLayout != null) {
                                        return new C1374f((CoordinatorLayout) view, imageView, textView, imageView2, textView2, imageView3, textView3, floatingActionButton, relativeLayout);
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

    public static C1374f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1374f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_debug, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CoordinatorLayout b() {
        return this.f10013a;
    }
}
