package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: QsgNetworkListBinding.java */
/* loaded from: classes2.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f9683a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9684b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9685c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f9686d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9687e;

    private V0(MaterialCardView materialCardView, TextView textView, ImageView imageView, RelativeLayout relativeLayout, ImageView imageView2) {
        this.f9683a = materialCardView;
        this.f9684b = textView;
        this.f9685c = imageView;
        this.f9686d = relativeLayout;
        this.f9687e = imageView2;
    }

    public static V0 a(View view) {
        int i10 = R.id.connectionName;
        TextView textView = (TextView) A3.a.a(view, R.id.connectionName);
        if (textView != null) {
            i10 = R.id.padLockImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.padLockImage);
            if (imageView != null) {
                i10 = R.id.rootView;
                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.rootView);
                if (relativeLayout != null) {
                    i10 = R.id.wifiImage;
                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.wifiImage);
                    if (imageView2 != null) {
                        return new V0((MaterialCardView) view, textView, imageView, relativeLayout, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static V0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qsg_network_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public MaterialCardView b() {
        return this.f9683a;
    }
}
