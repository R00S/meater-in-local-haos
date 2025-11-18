package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* compiled from: Base64.java */
/* renamed from: io.sentry.vendor.a */
/* loaded from: classes2.dex */
public class C9663a {

    /* compiled from: Base64.java */
    /* renamed from: io.sentry.vendor.a$a */
    static abstract class a {

        /* renamed from: a */
        public byte[] f36952a;

        /* renamed from: b */
        public int f36953b;

        a() {
        }
    }

    /* compiled from: Base64.java */
    /* renamed from: io.sentry.vendor.a$b */
    static class b extends a {

        /* renamed from: c */
        private static final byte[] f36954c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: d */
        private static final byte[] f36955d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: e */
        private final byte[] f36956e;

        /* renamed from: f */
        int f36957f;

        /* renamed from: g */
        private int f36958g;

        /* renamed from: h */
        public final boolean f36959h;

        /* renamed from: i */
        public final boolean f36960i;

        /* renamed from: j */
        public final boolean f36961j;

        /* renamed from: k */
        private final byte[] f36962k;

        public b(int i2, byte[] bArr) {
            this.f36952a = bArr;
            this.f36959h = (i2 & 1) == 0;
            boolean z = (i2 & 2) == 0;
            this.f36960i = z;
            this.f36961j = (i2 & 4) != 0;
            this.f36962k = (i2 & 8) == 0 ? f36954c : f36955d;
            this.f36956e = new byte[2];
            this.f36957f = 0;
            this.f36958g = z ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m31854a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.C9663a.b.m31854a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m31851a(byte[] bArr, int i2) {
        return m31852b(bArr, 0, bArr.length, i2);
    }

    /* renamed from: b */
    public static byte[] m31852b(byte[] bArr, int i2, int i3, int i4) {
        b bVar = new b(i4, null);
        int i5 = (i3 / 3) * 4;
        if (!bVar.f36959h) {
            int i6 = i3 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        } else if (i3 % 3 > 0) {
            i5 += 4;
        }
        if (bVar.f36960i && i3 > 0) {
            i5 += (((i3 - 1) / 57) + 1) * (bVar.f36961j ? 2 : 1);
        }
        bVar.f36952a = new byte[i5];
        bVar.m31854a(bArr, i2, i3, true);
        return bVar.f36952a;
    }

    /* renamed from: c */
    public static String m31853c(byte[] bArr, int i2) {
        try {
            return new String(m31851a(bArr, i2), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
