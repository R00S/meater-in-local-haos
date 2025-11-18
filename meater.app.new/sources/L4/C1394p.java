package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: ActivitySearchBinding.java */
/* renamed from: L4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1394p {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10305a;

    /* renamed from: b, reason: collision with root package name */
    public final AppBarLayout f10306b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f10307c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10308d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10309e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10310f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f10311g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10312h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10313i;

    private C1394p(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, EditText editText, RelativeLayout relativeLayout, ImageView imageView, RecyclerView recyclerView, MaterialToolbar materialToolbar, ImageView imageView2, TextView textView) {
        this.f10305a = constraintLayout;
        this.f10306b = appBarLayout;
        this.f10307c = editText;
        this.f10308d = relativeLayout;
        this.f10309e = imageView;
        this.f10310f = recyclerView;
        this.f10311g = materialToolbar;
        this.f10312h = imageView2;
        this.f10313i = textView;
    }

    public static C1394p a(View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) A3.a.a(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i10 = R.id.edSearch;
            EditText editText = (EditText) A3.a.a(view, R.id.edSearch);
            if (editText != null) {
                i10 = R.id.edSearchContainers;
                RelativeLayout relativeLayout = (RelativeLayout) A3.a.a(view, R.id.edSearchContainers);
                if (relativeLayout != null) {
                    i10 = R.id.imgSearchIcon;
                    ImageView imageView = (ImageView) A3.a.a(view, R.id.imgSearchIcon);
                    if (imageView != null) {
                        i10 = R.id.listSearchResults;
                        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.listSearchResults);
                        if (recyclerView != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) A3.a.a(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.txtCross;
                                ImageView imageView2 = (ImageView) A3.a.a(view, R.id.txtCross);
                                if (imageView2 != null) {
                                    i10 = R.id.txtNoResultTitle;
                                    TextView textView = (TextView) A3.a.a(view, R.id.txtNoResultTitle);
                                    if (textView != null) {
                                        return new C1394p((ConstraintLayout) view, appBarLayout, editText, relativeLayout, imageView, recyclerView, materialToolbar, imageView2, textView);
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

    public static C1394p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1394p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10305a;
    }
}
