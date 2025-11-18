package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: RingToneRowBinding.java */
/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f9955a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9956b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9957c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f9958d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9959e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9960f;

    private c1(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, ImageView imageView3, TextView textView) {
        this.f9955a = linearLayout;
        this.f9956b = imageView;
        this.f9957c = imageView2;
        this.f9958d = relativeLayout;
        this.f9959e = imageView3;
        this.f9960f = textView;
    }

    public static c1 a(View view) {
        int i10 = R.id.checkBox;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.checkBox);
        if (imageView != null) {
            i10 = R.id.defaultCheck;
            ImageView imageView2 = (ImageView) A3.a.a(view, R.id.defaultCheck);
            if (imageView2 != null) {
                i10 = R.id.rootView;
                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.rootView);
                if (relativeLayout != null) {
                    i10 = R.id.speaker_image;
                    ImageView imageView3 = (ImageView) A3.a.a(view, R.id.speaker_image);
                    if (imageView3 != null) {
                        i10 = R.id.toneName;
                        TextView textView = (TextView) A3.a.a(view, R.id.toneName);
                        if (textView != null) {
                            return new c1((LinearLayout) view, imageView, imageView2, relativeLayout, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.ring_tone_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f9955a;
    }
}
