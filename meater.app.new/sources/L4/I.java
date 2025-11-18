package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: CookListHeaderBinding.java */
/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f9412a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f9413b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f9414c;

    /* renamed from: d, reason: collision with root package name */
    public final SwipeLayout f9415d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9416e;

    private I(SwipeLayout swipeLayout, LinearLayout linearLayout, ImageView imageView, SwipeLayout swipeLayout2, TextView textView) {
        this.f9412a = swipeLayout;
        this.f9413b = linearLayout;
        this.f9414c = imageView;
        this.f9415d = swipeLayout2;
        this.f9416e = textView;
    }

    public static I a(View view) {
        int i10 = R.id.headerCookLayout;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.headerCookLayout);
        if (linearLayout != null) {
            i10 = R.id.headerTitleImage;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.headerTitleImage);
            if (imageView != null) {
                SwipeLayout swipeLayout = (SwipeLayout) view;
                i10 = R.id.totalCookLabel;
                TextView textView = (TextView) A3.a.a(view, R.id.totalCookLabel);
                if (textView != null) {
                    return new I(swipeLayout, linearLayout, imageView, swipeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static I c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.cook_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f9412a;
    }
}
