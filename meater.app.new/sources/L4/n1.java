package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: TooltipBinding.java */
/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10271a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10272b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10273c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10274d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10275e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10276f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10277g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10278h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10279i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10280j;

    private n1(LinearLayout linearLayout, ImageView imageView, TextView textView, LinearLayout linearLayout2, ImageView imageView2, TextView textView2, LinearLayout linearLayout3, TextView textView3, LinearLayout linearLayout4, TextView textView4) {
        this.f10271a = linearLayout;
        this.f10272b = imageView;
        this.f10273c = textView;
        this.f10274d = linearLayout2;
        this.f10275e = imageView2;
        this.f10276f = textView2;
        this.f10277g = linearLayout3;
        this.f10278h = textView3;
        this.f10279i = linearLayout4;
        this.f10280j = textView4;
    }

    public static n1 a(View view) {
        int i10 = R.id.cloudStatusImage;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.cloudStatusImage);
        if (imageView != null) {
            i10 = R.id.cloudStatusText;
            TextView textView = (TextView) A3.a.a(view, R.id.cloudStatusText);
            if (textView != null) {
                i10 = R.id.cloudStatusView;
                LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.cloudStatusView);
                if (linearLayout != null) {
                    i10 = R.id.moreInfoImage;
                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.moreInfoImage);
                    if (imageView2 != null) {
                        i10 = R.id.moreInfoText;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.moreInfoText);
                        if (textView2 != null) {
                            i10 = R.id.moreInfoView;
                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.moreInfoView);
                            if (linearLayout2 != null) {
                                i10 = R.id.toolViewButton;
                                TextView textView3 = (TextView) A3.a.a(view, R.id.toolViewButton);
                                if (textView3 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    i10 = R.id.txtToolTipView;
                                    TextView textView4 = (TextView) A3.a.a(view, R.id.txtToolTipView);
                                    if (textView4 != null) {
                                        return new n1(linearLayout3, imageView, textView, linearLayout, imageView2, textView2, linearLayout2, textView3, linearLayout3, textView4);
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

    public static n1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout._tooltip, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
