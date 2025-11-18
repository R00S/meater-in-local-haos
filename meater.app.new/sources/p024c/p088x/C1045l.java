package p024c.p088x;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* renamed from: c.x.l */
/* loaded from: classes.dex */
public class C1045l {

    /* renamed from: a */
    private ViewGroup f6868a;

    /* renamed from: b */
    private Runnable f6869b;

    /* renamed from: b */
    public static C1045l m6604b(ViewGroup viewGroup) {
        return (C1045l) viewGroup.getTag(C1041j.f6846c);
    }

    /* renamed from: c */
    static void m6605c(ViewGroup viewGroup, C1045l c1045l) {
        viewGroup.setTag(C1041j.f6846c, c1045l);
    }

    /* renamed from: a */
    public void m6606a() {
        Runnable runnable;
        if (m6604b(this.f6868a) != this || (runnable = this.f6869b) == null) {
            return;
        }
        runnable.run();
    }
}
