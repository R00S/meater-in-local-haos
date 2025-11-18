package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* renamed from: e.e.b.c.a0.a */
/* loaded from: classes2.dex */
public final class C8894a implements InterfaceC8896c {

    /* renamed from: a */
    private final float f33678a;

    public C8894a(float f2) {
        this.f33678a = f2;
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8896c
    /* renamed from: a */
    public float mo28238a(RectF rectF) {
        return this.f33678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8894a) && this.f33678a == ((C8894a) obj).f33678a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33678a)});
    }
}
