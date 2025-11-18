package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: MeaterTextRowBinding.java */
/* loaded from: classes2.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f9526a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9527b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9528c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9529d;

    /* renamed from: e, reason: collision with root package name */
    public final View f9530e;

    private M0(RelativeLayout relativeLayout, View view, ImageView imageView, TextView textView, View view2) {
        this.f9526a = relativeLayout;
        this.f9527b = view;
        this.f9528c = imageView;
        this.f9529d = textView;
        this.f9530e = view2;
    }

    public static M0 a(View view) {
        int i10 = R.id.bottomDivider;
        View viewA = A3.a.a(view, R.id.bottomDivider);
        if (viewA != null) {
            i10 = R.id.image;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.image);
            if (imageView != null) {
                i10 = R.id.text;
                TextView textView = (TextView) A3.a.a(view, R.id.text);
                if (textView != null) {
                    i10 = R.id.topDivider;
                    View viewA2 = A3.a.a(view, R.id.topDivider);
                    if (viewA2 != null) {
                        return new M0((RelativeLayout) view, viewA, imageView, textView, viewA2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static M0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.meater_text_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
