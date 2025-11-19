package a1;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class m extends e {

    /* renamed from: L0, reason: collision with root package name */
    public ArrayList<e> f19968L0 = new ArrayList<>();

    public void b(e eVar) {
        this.f19968L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).u1(eVar);
        }
        eVar.d1(this);
    }

    public ArrayList<e> s1() {
        return this.f19968L0;
    }

    @Override // a1.e
    public void t0() {
        this.f19968L0.clear();
        super.t0();
    }

    public void t1() {
        ArrayList<e> arrayList = this.f19968L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f19968L0.get(i10);
            if (eVar instanceof m) {
                ((m) eVar).t1();
            }
        }
    }

    public void u1(e eVar) {
        this.f19968L0.remove(eVar);
        eVar.t0();
    }

    public void v1() {
        this.f19968L0.clear();
    }

    @Override // a1.e
    public void w0(X0.c cVar) {
        super.w0(cVar);
        int size = this.f19968L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19968L0.get(i10).w0(cVar);
        }
    }
}
