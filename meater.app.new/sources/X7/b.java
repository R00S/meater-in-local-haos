package X7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f18771a;

    /* renamed from: b, reason: collision with root package name */
    private final float f18772b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f18771a;
            f10 += ((b) cVar).f18772b;
        }
        this.f18771a = cVar;
        this.f18772b = f10;
    }

    @Override // X7.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f18771a.a(rectF) + this.f18772b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18771a.equals(bVar.f18771a) && this.f18772b == bVar.f18772b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18771a, Float.valueOf(this.f18772b)});
    }
}
