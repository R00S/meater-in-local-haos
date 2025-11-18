package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;

/* compiled from: FragmentNewsVideosBinding.java */
/* renamed from: L4.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1381i0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f10139a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f10140b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f10141c;

    private C1381i0(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.f10139a = constraintLayout;
        this.f10140b = recyclerView;
        this.f10141c = appCompatTextView;
    }

    public static C1381i0 a(View view) {
        int i10 = R.id.list;
        RecyclerView recyclerView = (RecyclerView) A3.a.a(view, R.id.list);
        if (recyclerView != null) {
            i10 = R.id.messageText;
            AppCompatTextView appCompatTextView = (AppCompatTextView) A3.a.a(view, R.id.messageText);
            if (appCompatTextView != null) {
                return new C1381i0((ConstraintLayout) view, recyclerView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C1381i0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_news_videos, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f10139a;
    }
}
