package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: TemperatureRangeUsdaHelpBinding.java */
/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f10218a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10219b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10220c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f10221d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f10222e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10223f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f10224g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10225h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10226i;

    private l1(ScrollView scrollView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, RecyclerView recyclerView, AppCompatTextView appCompatTextView4, ImageView imageView2, RelativeLayout relativeLayout) {
        this.f10218a = scrollView;
        this.f10219b = imageView;
        this.f10220c = appCompatTextView;
        this.f10221d = appCompatTextView2;
        this.f10222e = appCompatTextView3;
        this.f10223f = recyclerView;
        this.f10224g = appCompatTextView4;
        this.f10225h = imageView2;
        this.f10226i = relativeLayout;
    }

    public static l1 a(View view) {
        int i10 = R.id.copyImage;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.copyImage);
        if (imageView != null) {
            i10 = R.id.detailView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.detailView);
            if (appCompatTextView != null) {
                i10 = R.id.heading;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.heading);
                if (appCompatTextView2 != null) {
                    i10 = R.id.heading2;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) A3.a.a(view, R.id.heading2);
                    if (appCompatTextView3 != null) {
                        i10 = R.id.preset_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.preset_recycler_view);
                        if (recyclerView != null) {
                            i10 = R.id.readMoreText;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) A3.a.a(view, R.id.readMoreText);
                            if (appCompatTextView4 != null) {
                                i10 = R.id.usdaImage;
                                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.usdaImage);
                                if (imageView2 != null) {
                                    i10 = R.id.webLinkView;
                                    RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.webLinkView);
                                    if (relativeLayout != null) {
                                        return new l1((ScrollView) view, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, recyclerView, appCompatTextView4, imageView2, relativeLayout);
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

    public static l1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.temperature_range_usda_help, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f10218a;
    }
}
