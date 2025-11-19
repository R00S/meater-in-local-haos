package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: GeneralTypeNoteBinding.java */
/* renamed from: L4.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1412y0 {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f10789a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10790b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10791c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10792d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10793e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10794f;

    /* renamed from: g, reason: collision with root package name */
    public final SwipeLayout f10795g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10796h;

    private C1412y0(SwipeLayout swipeLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, ImageView imageView2, RelativeLayout relativeLayout, SwipeLayout swipeLayout2, ImageView imageView3) {
        this.f10789a = swipeLayout;
        this.f10790b = linearLayout;
        this.f10791c = imageView;
        this.f10792d = textView;
        this.f10793e = imageView2;
        this.f10794f = relativeLayout;
        this.f10795g = swipeLayout2;
        this.f10796h = imageView3;
    }

    public static C1412y0 a(View view) {
        int i10 = R.id.bottom_wrapper;
        LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
        if (linearLayout != null) {
            i10 = R.id.deleteButton;
            ImageView imageView = (ImageView) A3.a.a(view, R.id.deleteButton);
            if (imageView != null) {
                i10 = R.id.item_title;
                TextView textView = (TextView) A3.a.a(view, R.id.item_title);
                if (textView != null) {
                    i10 = R.id.noteTypeImage;
                    ImageView imageView2 = (ImageView) A3.a.a(view, R.id.noteTypeImage);
                    if (imageView2 != null) {
                        i10 = R.id.rootView;
                        RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.rootView);
                        if (relativeLayout != null) {
                            SwipeLayout swipeLayout = (SwipeLayout) view;
                            i10 = R.id.unFavourite;
                            ImageView imageView3 = (ImageView) A3.a.a(view, R.id.unFavourite);
                            if (imageView3 != null) {
                                return new C1412y0(swipeLayout, linearLayout, imageView, textView, imageView2, relativeLayout, swipeLayout, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1412y0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.general_type_note, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f10789a;
    }
}
