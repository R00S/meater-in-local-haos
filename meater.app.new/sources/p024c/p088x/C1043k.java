package p024c.p088x;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* renamed from: c.x.k */
/* loaded from: classes.dex */
class C1043k implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f6866a;

    C1043k() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i2 = rect.left + ((int) ((rect2.left - r0) * f2));
        int i3 = rect.top + ((int) ((rect2.top - r1) * f2));
        int i4 = rect.right + ((int) ((rect2.right - r2) * f2));
        int i5 = rect.bottom + ((int) ((rect2.bottom - r6) * f2));
        Rect rect3 = this.f6866a;
        if (rect3 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        rect3.set(i2, i3, i4, i5);
        return this.f6866a;
    }
}
