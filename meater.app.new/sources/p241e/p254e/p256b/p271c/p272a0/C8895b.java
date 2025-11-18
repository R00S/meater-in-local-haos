package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* renamed from: e.e.b.c.a0.b */
/* loaded from: classes2.dex */
public final class C8895b implements InterfaceC8896c {

    /* renamed from: a */
    private final InterfaceC8896c f33679a;

    /* renamed from: b */
    private final float f33680b;

    public C8895b(float f2, InterfaceC8896c interfaceC8896c) {
        while (interfaceC8896c instanceof C8895b) {
            interfaceC8896c = ((C8895b) interfaceC8896c).f33679a;
            f2 += ((C8895b) interfaceC8896c).f33680b;
        }
        this.f33679a = interfaceC8896c;
        this.f33680b = f2;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8896c
    /* renamed from: a */
    public float mo28238a(RectF rectF) {
        return Math.max(0.0f, this.f33679a.mo28238a(rectF) + this.f33680b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8895b)) {
            return false;
        }
        C8895b c8895b = (C8895b) obj;
        return this.f33679a.equals(c8895b.f33679a) && this.f33680b == c8895b.f33680b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33679a, Float.valueOf(this.f33680b)});
    }
}
