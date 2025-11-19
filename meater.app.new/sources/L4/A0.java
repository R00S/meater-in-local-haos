package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: HeaderRowBinding.java */
/* loaded from: classes2.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9286a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9287b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f9288c;

    private A0(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.f9286a = relativeLayout;
        this.f9287b = imageView;
        this.f9288c = textView;
    }

    public static A0 a(View view) {
        int i10 = R.id.headerImage;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.headerImage);
        if (imageView != null) {
            i10 = R.id.headerText;
            TextView textView = (TextView) A3.a.a(view, R.id.headerText);
            if (textView != null) {
                return new A0((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static A0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.header_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
