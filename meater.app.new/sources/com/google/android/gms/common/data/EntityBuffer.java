package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: g */
    private boolean f17672g;

    /* renamed from: h */
    private ArrayList<Integer> f17673h;

    /* renamed from: i */
    private final void m14269i() {
        synchronized (this) {
            if (!this.f17672g) {
                int count = this.f17640f.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f17673h = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String strM14273h = m14273h();
                    String strM14264Y = this.f17640f.m14264Y(strM14273h, 0, this.f17640f.m14265e0(0));
                    for (int i2 = 1; i2 < count; i2++) {
                        int iM14265e0 = this.f17640f.m14265e0(i2);
                        String strM14264Y2 = this.f17640f.m14264Y(strM14273h, i2, iM14265e0);
                        if (strM14264Y2 == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(strM14273h).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(strM14273h);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(iM14265e0);
                            throw new NullPointerException(sb.toString());
                        }
                        if (!strM14264Y2.equals(strM14264Y)) {
                            this.f17673h.add(Integer.valueOf(i2));
                            strM14264Y = strM14264Y2;
                        }
                    }
                }
                this.f17672g = true;
            }
        }
    }

    /* renamed from: n */
    private final int m14270n(int i2) {
        if (i2 >= 0 && i2 < this.f17673h.size()) {
            return this.f17673h.get(i2).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i2);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    @KeepForSdk
    /* renamed from: f */
    protected String m14271f() {
        return null;
    }

    @KeepForSdk
    /* renamed from: g */
    protected abstract T m14272g(int i2, int i3);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.m14269i()
            int r0 = r6.m14270n(r7)
            r1 = 0
            if (r7 < 0) goto L67
            java.util.ArrayList<java.lang.Integer> r2 = r6.f17673h
            int r2 = r2.size()
            if (r7 != r2) goto L13
            goto L67
        L13:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f17673h
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L30
            com.google.android.gms.common.data.DataHolder r2 = r6.f17640f
            int r2 = r2.getCount()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f17673h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L4a
        L30:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f17673h
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f17673h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L4a:
            int r2 = r2 - r4
            if (r2 != r3) goto L66
            int r7 = r6.m14270n(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f17640f
            int r3 = r3.m14265e0(r7)
            java.lang.String r4 = r6.m14271f()
            if (r4 == 0) goto L66
            com.google.android.gms.common.data.DataHolder r5 = r6.f17640f
            java.lang.String r7 = r5.m14264Y(r4, r7, r3)
            if (r7 != 0) goto L66
            goto L67
        L66:
            r1 = r2
        L67:
            java.lang.Object r7 = r6.m14272g(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.EntityBuffer.get(int):java.lang.Object");
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        m14269i();
        return this.f17673h.size();
    }

    @KeepForSdk
    /* renamed from: h */
    protected abstract String m14273h();
}
