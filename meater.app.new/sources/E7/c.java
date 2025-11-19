package E7;

import E7.b;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.k;

/* compiled from: BadgeUtils.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4070a = false;

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        e(aVar, view, frameLayout);
        if (aVar.j() != null) {
            aVar.j().setForeground(aVar);
        } else {
            if (f4070a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static SparseArray<a> b(Context context, k kVar) {
        SparseArray<a> sparseArray = new SparseArray<>(kVar.size());
        for (int i10 = 0; i10 < kVar.size(); i10++) {
            int iKeyAt = kVar.keyAt(i10);
            b.a aVar = (b.a) kVar.valueAt(i10);
            sparseArray.put(iKeyAt, aVar != null ? a.e(context, aVar) : null);
        }
        return sparseArray;
    }

    public static k c(SparseArray<a> sparseArray) {
        k kVar = new k();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            a aVarValueAt = sparseArray.valueAt(i10);
            kVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.t() : null);
        }
        return kVar;
    }

    public static void d(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (f4070a || aVar.j() != null) {
            aVar.j().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void e(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.S(view, frameLayout);
    }

    public static void f(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
