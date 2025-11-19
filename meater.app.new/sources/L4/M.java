package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: DevicesListRowBinding.java */
/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f9512a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9513b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f9514c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9515d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f9516e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f9517f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f9518g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f9519h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f9520i;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f9521j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f9522k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f9523l;

    /* renamed from: m, reason: collision with root package name */
    public final RelativeLayout f9524m;

    /* renamed from: n, reason: collision with root package name */
    public final SwipeLayout f9525n;

    private M(SwipeLayout swipeLayout, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, ImageView imageView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout, SwipeLayout swipeLayout2) {
        this.f9512a = swipeLayout;
        this.f9513b = imageView;
        this.f9514c = linearLayout;
        this.f9515d = imageView2;
        this.f9516e = appCompatImageView;
        this.f9517f = appCompatTextView;
        this.f9518g = appCompatImageView2;
        this.f9519h = imageView3;
        this.f9520i = appCompatTextView2;
        this.f9521j = appCompatTextView3;
        this.f9522k = linearLayout2;
        this.f9523l = linearLayout3;
        this.f9524m = relativeLayout;
        this.f9525n = swipeLayout2;
    }

    public static M a(View view) {
        int i10 = R.id.batteryImage;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.batteryImage);
        if (imageView != null) {
            i10 = R.id.bottom_wrapper;
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
            if (linearLayout != null) {
                i10 = R.id.check_mark_icon;
                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.check_mark_icon);
                if (imageView2 != null) {
                    i10 = R.id.childImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.childImage);
                    if (appCompatImageView != null) {
                        i10 = R.id.connected_text;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.connected_text);
                        if (appCompatTextView != null) {
                            i10 = R.id.connection_image;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) A3.a.a(view, R.id.connection_image);
                            if (appCompatImageView2 != null) {
                                i10 = R.id.delete_btn;
                                ImageView imageView3 = (ImageView) A3.a.a(view, R.id.delete_btn);
                                if (imageView3 != null) {
                                    i10 = R.id.deviceName;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.deviceName);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.device_number;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.device_number);
                                        if (appCompatTextView3 != null) {
                                            i10 = R.id.pairedLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.pairedLayout);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.root_view;
                                                LinearLayout linearLayout3 = (LinearLayout) A3.a.a(view, R.id.root_view);
                                                if (linearLayout3 != null) {
                                                    i10 = R.id.row_container;
                                                    RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.row_container);
                                                    if (relativeLayout != null) {
                                                        SwipeLayout swipeLayout = (SwipeLayout) view;
                                                        return new M(swipeLayout, imageView, linearLayout, imageView2, appCompatImageView, appCompatTextView, appCompatImageView2, imageView3, appCompatTextView2, appCompatTextView3, linearLayout2, linearLayout3, relativeLayout, swipeLayout);
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

    public static M c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.devices_list_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f9512a;
    }
}
