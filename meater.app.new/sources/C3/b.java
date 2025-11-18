package C3;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import s1.X;

/* compiled from: FragmentViewHolder.java */
/* loaded from: classes.dex */
public final class b extends RecyclerView.G {
    private b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static b a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(X.k());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}
