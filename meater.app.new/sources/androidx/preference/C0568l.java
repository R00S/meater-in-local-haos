package androidx.preference;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* renamed from: androidx.preference.l */
/* loaded from: classes.dex */
public class C0568l extends RecyclerView.AbstractC0590c0 {

    /* renamed from: a */
    private final SparseArray<View> f3720a;

    /* renamed from: b */
    private boolean f3721b;

    /* renamed from: c */
    private boolean f3722c;

    C0568l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3720a = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i2 = C0572p.f3738a;
        sparseArray.put(i2, view.findViewById(i2));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    /* renamed from: a */
    public View m4161a(int i2) {
        View view = this.f3720a.get(i2);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i2);
        if (viewFindViewById != null) {
            this.f3720a.put(i2, viewFindViewById);
        }
        return viewFindViewById;
    }

    /* renamed from: b */
    public boolean m4162b() {
        return this.f3721b;
    }

    /* renamed from: c */
    public boolean m4163c() {
        return this.f3722c;
    }

    /* renamed from: d */
    public void m4164d(boolean z) {
        this.f3721b = z;
    }

    /* renamed from: e */
    public void m4165e(boolean z) {
        this.f3722c = z;
    }
}
