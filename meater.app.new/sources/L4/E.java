package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.DeviceConnectionView;

/* compiled from: ConnectionLostImageOverlayBinding.java */
/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f9317a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9318b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f9319c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9320d;

    /* renamed from: e, reason: collision with root package name */
    public final DeviceConnectionView f9321e;

    /* renamed from: f, reason: collision with root package name */
    public final HorizontalScrollView f9322f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f9323g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f9324h;

    private E(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ImageView imageView2, DeviceConnectionView deviceConnectionView, HorizontalScrollView horizontalScrollView, TextView textView, TextView textView2) {
        this.f9317a = linearLayout;
        this.f9318b = imageView;
        this.f9319c = linearLayout2;
        this.f9320d = imageView2;
        this.f9321e = deviceConnectionView;
        this.f9322f = horizontalScrollView;
        this.f9323g = textView;
        this.f9324h = textView2;
    }

    public static E a(View view) {
        int i10 = R.id.alert_image;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.alert_image);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = R.id.image;
            ImageView imageView2 = (ImageView) A3.a.a(view, R.id.image);
            if (imageView2 != null) {
                i10 = R.id.layoutConnections;
                DeviceConnectionView deviceConnectionView = (DeviceConnectionView) A3.a.a(view, R.id.layoutConnections);
                if (deviceConnectionView != null) {
                    i10 = R.id.layoutConnectionsWrapper;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) A3.a.a(view, R.id.layoutConnectionsWrapper);
                    if (horizontalScrollView != null) {
                        i10 = R.id.message;
                        TextView textView = (TextView) A3.a.a(view, R.id.message);
                        if (textView != null) {
                            i10 = R.id.title;
                            TextView textView2 = (TextView) A3.a.a(view, R.id.title);
                            if (textView2 != null) {
                                return new E(linearLayout, imageView, linearLayout, imageView2, deviceConnectionView, horizontalScrollView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static E c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.connection_lost_image_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f9317a;
    }
}
