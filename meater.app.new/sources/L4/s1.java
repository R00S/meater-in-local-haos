package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import com.apptionlabs.meater_app.R;

/* compiled from: ViewCircleImageBinding.java */
/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewFlipper f10559a;

    /* renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10560b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10561c;

    private s1(ViewFlipper viewFlipper, RelativeLayout relativeLayout, ImageView imageView) {
        this.f10559a = viewFlipper;
        this.f10560b = relativeLayout;
        this.f10561c = imageView;
    }

    public static s1 a(View view) {
        int i10 = R.id.circleContainer;
        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.circleContainer);
        if (relativeLayout != null) {
            i10 = R.id.circleImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.circleImage);
            if (imageView != null) {
                return new s1((ViewFlipper) view, relativeLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_circle_image, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
