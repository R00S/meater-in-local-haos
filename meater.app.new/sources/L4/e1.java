package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: SelectedTypeNoteBinding.java */
/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f10002a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10003b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10004c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f10005d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10006e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10007f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10008g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10009h;

    /* renamed from: i, reason: collision with root package name */
    public final SwipeLayout f10010i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10011j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f10012k;

    private e1(SwipeLayout swipeLayout, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, ImageView imageView, RelativeLayout relativeLayout, SwipeLayout swipeLayout2, TextView textView4, ImageView imageView2) {
        this.f10002a = swipeLayout;
        this.f10003b = textView;
        this.f10004c = linearLayout;
        this.f10005d = appCompatImageView;
        this.f10006e = textView2;
        this.f10007f = textView3;
        this.f10008g = imageView;
        this.f10009h = relativeLayout;
        this.f10010i = swipeLayout2;
        this.f10011j = textView4;
        this.f10012k = imageView2;
    }

    public static e1 a(View view) {
        int i10 = R.id.ambientText;
        TextView textView = (TextView) A3.a.a(view, R.id.ambientText);
        if (textView != null) {
            i10 = R.id.bottom_wrapper;
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
            if (linearLayout != null) {
                i10 = R.id.deleteButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.deleteButton);
                if (appCompatImageView != null) {
                    i10 = R.id.detailText;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.detailText);
                    if (textView2 != null) {
                        i10 = R.id.internalText;
                        TextView textView3 = (TextView) A3.a.a(view, R.id.internalText);
                        if (textView3 != null) {
                            i10 = R.id.noteTypeImage;
                            ImageView imageView = (ImageView) A3.a.a(view, R.id.noteTypeImage);
                            if (imageView != null) {
                                i10 = R.id.rootView;
                                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.rootView);
                                if (relativeLayout != null) {
                                    SwipeLayout swipeLayout = (SwipeLayout) view;
                                    i10 = R.id.timeText;
                                    TextView textView4 = (TextView) A3.a.a(view, R.id.timeText);
                                    if (textView4 != null) {
                                        i10 = R.id.unFavourite;
                                        ImageView imageView2 = (ImageView) A3.a.a(view, R.id.unFavourite);
                                        if (imageView2 != null) {
                                            return new e1(swipeLayout, textView, linearLayout, appCompatImageView, textView2, textView3, imageView, relativeLayout, swipeLayout, textView4, imageView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.selected_type_note, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f10002a;
    }
}
