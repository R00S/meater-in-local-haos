package androidx.transition;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* renamed from: androidx.transition.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2189j {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f29506a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f29507b;

    public static C2189j b(ViewGroup viewGroup) {
        return (C2189j) viewGroup.getTag(C2187h.f29503c);
    }

    static void c(ViewGroup viewGroup, C2189j c2189j) {
        viewGroup.setTag(C2187h.f29503c, c2189j);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f29506a) != this || (runnable = this.f29507b) == null) {
            return;
        }
        runnable.run();
    }
}
