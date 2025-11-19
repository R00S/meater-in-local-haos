package S8;

import T8.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RolloutAssignmentList.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f15570a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f15571b;

    public k(int i10) {
        this.f15571b = i10;
    }

    public List<F.e.d.AbstractC0251e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(listB.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f15570a));
    }

    public synchronized boolean c(List<j> list) {
        this.f15570a.clear();
        if (list.size() <= this.f15571b) {
            return this.f15570a.addAll(list);
        }
        N8.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f15571b);
        return this.f15570a.addAll(list.subList(0, this.f15571b));
    }
}
