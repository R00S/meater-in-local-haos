package X7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f18770a;

    public a(float f10) {
        this.f18770a = f10;
    }

    @Override // X7.c
    public float a(RectF rectF) {
        return this.f18770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f18770a == ((a) obj).f18770a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18770a)});
    }
}
