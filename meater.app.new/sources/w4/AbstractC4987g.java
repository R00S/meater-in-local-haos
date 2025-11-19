package w4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.SavedCook;
import java.util.ArrayList;
import java.util.Iterator;
import ru.rambler.libs.swipe_layout.SwipeLayout;
import w4.P;

/* compiled from: CookListAdapter.java */
/* renamed from: w4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4987g extends P<a> {

    /* renamed from: F, reason: collision with root package name */
    ArrayList<SavedCook> f51882F = new ArrayList<>();

    /* renamed from: G, reason: collision with root package name */
    boolean f51883G = false;

    /* compiled from: CookListAdapter.java */
    /* renamed from: w4.g$a */
    static class a extends P.a {

        /* renamed from: B, reason: collision with root package name */
        L4.J f51884B;

        a(View view, L4.J j10) {
            super(view);
            this.f51884B = j10;
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return (SwipeLayout) this.itemView.findViewById(R.id.swipe);
        }
    }

    /* compiled from: CookListAdapter.java */
    /* renamed from: w4.g$b */
    static class b extends P.a {

        /* renamed from: B, reason: collision with root package name */
        L4.I f51885B;

        b(View view, L4.I i10) {
            super(view);
            this.f51885B = i10;
            i10.f9414c.setImageResource(R.drawable.clock1);
        }

        @Override // w4.P.a
        public SwipeLayout getSwipeLayout() {
            return (SwipeLayout) this.itemView.findViewById(R.id.swipe);
        }
    }

    public AbstractC4987g() {
        F(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public P.a y(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            LayoutInflater.from(viewGroup.getContext());
            L4.I iC = L4.I.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            return new b(iC.b(), iC);
        }
        LayoutInflater.from(viewGroup.getContext());
        L4.J jC = L4.J.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new a(jC.b(), jC);
    }

    public void K(SavedCook savedCook) {
        this.f51882F.remove(savedCook);
        n();
    }

    public boolean L(ArrayList<SavedCook> arrayList, ArrayList<SavedCook> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        Iterator<SavedCook> it = arrayList2.iterator();
        while (it.hasNext()) {
            SavedCook next = it.next();
            Iterator<SavedCook> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SavedCook next2 = it2.next();
                if (next2.getCookID() == next.getCookID() && next2.isFavourite() != next.isFavourite()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void M(ArrayList<SavedCook> arrayList) {
        if (L(this.f51882F, arrayList)) {
            return;
        }
        this.f51882F = arrayList;
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        if (this.f51882F.size() == 0) {
            return 0;
        }
        return this.f51882F.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
