package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: AlertViewRowBinding.java */
/* renamed from: L4.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1411y {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f10776a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10777b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10778c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10779d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10780e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10781f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10782g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10783h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f10784i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f10785j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10786k;

    /* renamed from: l, reason: collision with root package name */
    public final SwipeLayout f10787l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10788m;

    private C1411y(SwipeLayout swipeLayout, RelativeLayout relativeLayout, ImageView imageView, TextView textView, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, TextView textView3, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout3, SwipeLayout swipeLayout2, LinearLayout linearLayout4) {
        this.f10776a = swipeLayout;
        this.f10777b = relativeLayout;
        this.f10778c = imageView;
        this.f10779d = textView;
        this.f10780e = linearLayout;
        this.f10781f = textView2;
        this.f10782g = linearLayout2;
        this.f10783h = textView3;
        this.f10784i = imageView2;
        this.f10785j = imageView3;
        this.f10786k = linearLayout3;
        this.f10787l = swipeLayout2;
        this.f10788m = linearLayout4;
    }

    public static C1411y a(View view) {
        int i10 = R.id.alertContainer;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.alertContainer);
        if (relativeLayout != null) {
            i10 = R.id.alertImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.alertImage);
            if (imageView != null) {
                i10 = R.id.alertName;
                TextView textView = (TextView) A3.a.a(view, R.id.alertName);
                if (textView != null) {
                    i10 = R.id.bottom_wrapper;
                    LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
                    if (linearLayout != null) {
                        i10 = R.id.currentlyAlertValue;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.currentlyAlertValue);
                        if (textView2 != null) {
                            i10 = R.id.currentlyLayout;
                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.currentlyLayout);
                            if (linearLayout2 != null) {
                                i10 = R.id.currentlyText;
                                TextView textView3 = (TextView) A3.a.a(view, R.id.currentlyText);
                                if (textView3 != null) {
                                    i10 = R.id.delete_alert_icon;
                                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.delete_alert_icon);
                                    if (imageView2 != null) {
                                        i10 = R.id.deleteButton;
                                        ImageView imageView3 = (ImageView) A3.a.a(view, R.id.deleteButton);
                                        if (imageView3 != null) {
                                            i10 = R.id.rootView;
                                            LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.rootView);
                                            if (linearLayout3 != null) {
                                                SwipeLayout swipeLayout = (SwipeLayout) view;
                                                i10 = R.id.valueLayout;
                                                LinearLayout linearLayout4 = (LinearLayout) A3.a.a(view, R.id.valueLayout);
                                                if (linearLayout4 != null) {
                                                    return new C1411y(swipeLayout, relativeLayout, imageView, textView, linearLayout, textView2, linearLayout2, textView3, imageView2, imageView3, linearLayout3, swipeLayout, linearLayout4);
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

    public static C1411y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.alert_view_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f10776a;
    }
}
