package X7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f18824a;

    public i(float f10) {
        this.f18824a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // X7.c
    public float a(RectF rectF) {
        return this.f18824a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f18824a == ((i) obj).f18824a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18824a)});
    }
}
