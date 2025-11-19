package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;

/* compiled from: ViewThumbnailBinding.java */
/* loaded from: classes2.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10722a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10723b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f10724c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10725d;

    private w1(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView) {
        this.f10722a = constraintLayout;
        this.f10723b = imageView;
        this.f10724c = frameLayout;
        this.f10725d = textView;
    }

    public static w1 a(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.playBtn;
            FrameLayout frameLayout = (FrameLayout) A3.a.a(view, R.id.playBtn);
            if (frameLayout != null) {
                i10 = R.id.textView;
                TextView textView = (TextView) A3.a.a(view, R.id.textView);
                if (textView != null) {
                    return new w1((ConstraintLayout) view, imageView, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static w1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_thumbnail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
