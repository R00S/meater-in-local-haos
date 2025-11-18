package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;

/* compiled from: UserCloudConnectionBinding.java */
/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10325a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10326b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10327c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10328d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10329e;

    /* renamed from: f, reason: collision with root package name */
    public final View f10330f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10331g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f10332h;

    private p1(LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2, View view, TextView textView3, LinearLayout linearLayout2) {
        this.f10325a = linearLayout;
        this.f10326b = imageView;
        this.f10327c = relativeLayout;
        this.f10328d = textView;
        this.f10329e = textView2;
        this.f10330f = view;
        this.f10331g = textView3;
        this.f10332h = linearLayout2;
    }

    public static p1 a(View view) {
        int i10 = R.id.imgCloud;
        ImageView imageView = (ImageView) A3.a.a(view, R.id.imgCloud);
        if (imageView != null) {
            i10 = R.id.layoutCloudConnection;
            RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.layoutCloudConnection);
            if (relativeLayout != null) {
                i10 = R.id.noteTextView;
                TextView textView = (TextView) A3.a.a(view, R.id.noteTextView);
                if (textView != null) {
                    i10 = R.id.textView;
                    TextView textView2 = (TextView) A3.a.a(view, R.id.textView);
                    if (textView2 != null) {
                        i10 = R.id.top_divider;
                        View viewA = A3.a.a(view, R.id.top_divider);
                        if (viewA != null) {
                            i10 = R.id.txtHeaderCloudConnection;
                            TextView textView3 = (TextView) A3.a.a(view, R.id.txtHeaderCloudConnection);
                            if (textView3 != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                return new p1(linearLayout, imageView, relativeLayout, textView, textView2, viewA, textView3, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout._user_cloud_connection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
