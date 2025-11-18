package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ReedSolomonEncoder.java */
/* renamed from: com.google.zxing.common.reedsolomon.c */
/* loaded from: classes2.dex */
public final class C8625c {

    /* renamed from: a */
    private final C8623a f32767a;

    /* renamed from: b */
    private final List<C8624b> f32768b;

    public C8625c(C8623a c8623a) {
        this.f32767a = c8623a;
        ArrayList arrayList = new ArrayList();
        this.f32768b = arrayList;
        arrayList.add(new C8624b(c8623a, new int[]{1}));
    }

    /* renamed from: a */
    private C8624b m27241a(int i2) {
        if (i2 >= this.f32768b.size()) {
            List<C8624b> list = this.f32768b;
            C8624b c8624bM27239g = list.get(list.size() - 1);
            for (int size = this.f32768b.size(); size <= i2; size++) {
                C8623a c8623a = this.f32767a;
                c8624bM27239g = c8624bM27239g.m27239g(new C8624b(c8623a, new int[]{1, c8623a.m27227c((size - 1) + c8623a.m27228d())}));
                this.f32768b.add(c8624bM27239g);
            }
        }
        return this.f32768b.get(i2);
    }

    /* renamed from: b */
    public void m27242b(int[] iArr, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i2;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        C8624b c8624bM27241a = m27241a(i2);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM27236d = new C8624b(this.f32767a, iArr2).m27240h(i2, 1).m27234b(c8624bM27241a)[1].m27236d();
        int length2 = i2 - iArrM27236d.length;
        for (int i3 = 0; i3 < length2; i3++) {
            iArr[length + i3] = 0;
        }
        System.arraycopy(iArrM27236d, 0, iArr, length + length2, iArrM27236d.length);
    }
}
