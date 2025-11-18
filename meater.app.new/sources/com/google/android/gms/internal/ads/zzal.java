package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzal {

    /* renamed from: a */
    private static final Comparator<byte[]> f22091a = new C6843k2();

    /* renamed from: b */
    private final List<byte[]> f22092b = new ArrayList();

    /* renamed from: c */
    private final List<byte[]> f22093c = new ArrayList(64);

    /* renamed from: d */
    private int f22094d = 0;

    /* renamed from: e */
    private final int f22095e = RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;

    public zzal(int i2) {
    }

    /* renamed from: c */
    private final synchronized void m16644c() {
        while (this.f22094d > this.f22095e) {
            byte[] bArrRemove = this.f22092b.remove(0);
            this.f22093c.remove(bArrRemove);
            this.f22094d -= bArrRemove.length;
        }
    }

    /* renamed from: a */
    public final synchronized void m16645a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f22095e) {
                this.f22092b.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f22093c, bArr, f22091a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f22093c.add(iBinarySearch, bArr);
                this.f22094d += bArr.length;
                m16644c();
            }
        }
    }

    /* renamed from: b */
    public final synchronized byte[] m16646b(int i2) {
        for (int i3 = 0; i3 < this.f22093c.size(); i3++) {
            byte[] bArr = this.f22093c.get(i3);
            if (bArr.length >= i2) {
                this.f22094d -= bArr.length;
                this.f22093c.remove(i3);
                this.f22092b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }
}
