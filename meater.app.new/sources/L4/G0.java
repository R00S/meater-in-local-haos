package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: ListAddNoteBinding.java */
/* loaded from: classes2.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeLayout f9384a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9385b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f9386c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f9387d;

    /* renamed from: e, reason: collision with root package name */
    public final View f9388e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9389f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f9390g;

    /* renamed from: h, reason: collision with root package name */
    public final SwipeLayout f9391h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f9392i;

    private G0(SwipeLayout swipeLayout, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, View view, TextView textView2, LinearLayout linearLayout2, SwipeLayout swipeLayout2, ImageView imageView) {
        this.f9384a = swipeLayout;
        this.f9385b = textView;
        this.f9386c = linearLayout;
        this.f9387d = appCompatImageView;
        this.f9388e = view;
        this.f9389f = textView2;
        this.f9390g = linearLayout2;
        this.f9391h = swipeLayout2;
        this.f9392i = imageView;
    }

    public static G0 a(View view) {
        int i10 = R.id.addNoteBtn;
        TextView textView = (TextView) A3.a.a(view, R.id.addNoteBtn);
        if (textView != null) {
            i10 = R.id.bottom_wrapper;
            LinearLayout linearLayout = (LinearLayout) A3.a.a(view, R.id.bottom_wrapper);
            if (linearLayout != null) {
                i10 = R.id.deleteButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) A3.a.a(view, R.id.deleteButton);
                if (appCompatImageView != null) {
                    i10 = R.id.divider_1;
                    View viewA = A3.a.a(view, R.id.divider_1);
                    if (viewA != null) {
                        i10 = R.id.noNoteText;
                        TextView textView2 = (TextView) A3.a.a(view, R.id.noNoteText);
                        if (textView2 != null) {
                            i10 = R.id.noteLayout;
                            LinearLayout linearLayout2 = (LinearLayout) A3.a.a(view, R.id.noteLayout);
                            if (linearLayout2 != null) {
                                SwipeLayout swipeLayout = (SwipeLayout) view;
                                i10 = R.id.unFavourite;
                                ImageView imageView = (ImageView) A3.a.a(view, R.id.unFavourite);
                                if (imageView != null) {
                                    return new G0(swipeLayout, textView, linearLayout, appCompatImageView, viewA, textView2, linearLayout2, swipeLayout, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static G0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_add_note, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public SwipeLayout b() {
        return this.f9384a;
    }
}
