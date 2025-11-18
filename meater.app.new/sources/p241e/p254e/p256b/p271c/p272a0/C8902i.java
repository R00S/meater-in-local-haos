package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* renamed from: e.e.b.c.a0.i */
/* loaded from: classes2.dex */
public final class C8902i implements InterfaceC8896c {

    /* renamed from: a */
    private final float f33731a;

    public C8902i(float f2) {
        this.f33731a = f2;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8896c
    /* renamed from: a */
    public float mo28238a(RectF rectF) {
        return this.f33731a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8902i) && this.f33731a == ((C8902i) obj).f33731a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33731a)});
    }
}
