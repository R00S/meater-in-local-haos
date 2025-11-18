package com.google.zxing.p220f.p221b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.internal.p454ws.WebSocketProtocol;

/* compiled from: HighLevelEncoder.java */
/* renamed from: com.google.zxing.f.b.d */
/* loaded from: classes2.dex */
public final class C8632d {

    /* renamed from: a */
    static final String[] f32778a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: b */
    static final int[][] f32779b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: c */
    private static final int[][] f32780c;

    /* renamed from: d */
    static final int[][] f32781d;

    /* renamed from: e */
    private final byte[] f32782e;

    /* compiled from: HighLevelEncoder.java */
    /* renamed from: com.google.zxing.f.b.d$a */
    class a implements Comparator<C8634f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C8634f c8634f, C8634f c8634f2) {
            return c8634f.m27272d() - c8634f2.m27272d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        f32780c = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            f32780c[0][i2] = (i2 - 65) + 2;
        }
        f32780c[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            f32780c[1][i3] = (i3 - 97) + 2;
        }
        f32780c[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            f32780c[2][i4] = (i4 - 48) + 2;
        }
        int[][] iArr2 = f32780c;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, WebSocketProtocol.PAYLOAD_SHORT, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            f32780c[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            if (iArr4[i6] > 0) {
                f32780c[4][iArr4[i6]] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        f32781d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f32781d;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public C8632d(byte[] bArr) {
        this.f32782e = bArr;
    }

    /* renamed from: b */
    private static Collection<C8634f> m27262b(Iterable<C8634f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C8634f c8634f : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8634f c8634f2 = (C8634f) it.next();
                if (c8634f2.m27274f(c8634f)) {
                    z = false;
                    break;
                }
                if (c8634f.m27274f(c8634f2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(c8634f);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m27263c(C8634f c8634f, int i2, Collection<C8634f> collection) {
        char c2 = (char) (this.f32782e[i2] & 255);
        boolean z = f32780c[c8634f.m27273e()][c2] > 0;
        C8634f c8634fM27270b = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = f32780c[i3][c2];
            if (i4 > 0) {
                if (c8634fM27270b == null) {
                    c8634fM27270b = c8634f.m27270b(i2);
                }
                if (!z || i3 == c8634f.m27273e() || i3 == 2) {
                    collection.add(c8634fM27270b.m27275g(i3, i4));
                }
                if (!z && f32781d[c8634f.m27273e()][i3] >= 0) {
                    collection.add(c8634fM27270b.m27276h(i3, i4));
                }
            }
        }
        if (c8634f.m27271c() > 0 || f32780c[c8634f.m27273e()][c2] == 0) {
            collection.add(c8634f.m27269a(i2));
        }
    }

    /* renamed from: d */
    private static void m27264d(C8634f c8634f, int i2, int i3, Collection<C8634f> collection) {
        C8634f c8634fM27270b = c8634f.m27270b(i2);
        collection.add(c8634fM27270b.m27275g(4, i3));
        if (c8634f.m27273e() != 4) {
            collection.add(c8634fM27270b.m27276h(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(c8634fM27270b.m27275g(2, 16 - i3).m27275g(2, 1));
        }
        if (c8634f.m27271c() > 0) {
            collection.add(c8634f.m27269a(i2).m27269a(i2 + 1));
        }
    }

    /* renamed from: e */
    private Collection<C8634f> m27265e(Iterable<C8634f> iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<C8634f> it = iterable.iterator();
        while (it.hasNext()) {
            m27263c(it.next(), i2, linkedList);
        }
        return m27262b(linkedList);
    }

    /* renamed from: f */
    private static Collection<C8634f> m27266f(Iterable<C8634f> iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        Iterator<C8634f> it = iterable.iterator();
        while (it.hasNext()) {
            m27264d(it.next(), i2, i3, linkedList);
        }
        return m27262b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.p222g.C8636a m27267a() {
        /*
            r8 = this;
            com.google.zxing.f.b.f r0 = com.google.zxing.p220f.p221b.C8634f.f32786a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L8:
            byte[] r3 = r8.f32782e
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = 0
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = 0
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = m27266f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.m27265e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            com.google.zxing.f.b.d$a r1 = new com.google.zxing.f.b.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.f.b.f r0 = (com.google.zxing.p220f.p221b.C8634f) r0
            byte[] r1 = r8.f32782e
            com.google.zxing.g.a r0 = r0.m27277i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p220f.p221b.C8632d.m27267a():com.google.zxing.g.a");
    }
}
