package s1;

import android.content.Context;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f49066a;

    /* compiled from: PointerIconCompat.java */
    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private M(PointerIcon pointerIcon) {
        this.f49066a = pointerIcon;
    }

    public static M b(Context context, int i10) {
        return new M(a.a(context, i10));
    }

    public Object a() {
        return this.f49066a;
    }
}
