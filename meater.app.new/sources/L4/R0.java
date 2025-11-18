package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PairingRowBinding.java */
/* loaded from: classes2.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f9584a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f9585b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9586c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f9587d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f9588e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f9589f;

    private R0(MaterialCardView materialCardView, AppCompatTextView appCompatTextView, ImageView imageView, ImageView imageView2, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout) {
        this.f9584a = materialCardView;
        this.f9585b = appCompatTextView;
        this.f9586c = imageView;
        this.f9587d = imageView2;
        this.f9588e = appCompatTextView2;
        this.f9589f = relativeLayout;
    }

    public static R0 a(View view) {
        int i10 = R.id.connectedText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.connectedText);
        if (appCompatTextView != null) {
            i10 = R.id.connectionImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.connectionImage);
            if (imageView != null) {
                i10 = R.id.deviceImage;
                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.deviceImage);
                if (imageView2 != null) {
                    i10 = R.id.deviceName;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) A3.a.a(view, R.id.deviceName);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.rootView;
                        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.rootView);
                        if (relativeLayout != null) {
                            return new R0((MaterialCardView) view, appCompatTextView, imageView, imageView2, appCompatTextView2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static R0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.pairing_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public MaterialCardView b() {
        return this.f9584a;
    }
}
