package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zw */
/* loaded from: classes2.dex */
final class C7428zw {
    /* renamed from: a */
    static String m16165a(zzdmr zzdmrVar) {
        C6504ax c6504ax = new C6504ax(zzdmrVar);
        StringBuilder sb = new StringBuilder(c6504ax.size());
        for (int i2 = 0; i2 < c6504ax.size(); i2++) {
            byte bMo14832a = c6504ax.mo14832a(i2);
            if (bMo14832a == 34) {
                sb.append("\\\"");
            } else if (bMo14832a == 39) {
                sb.append("\\'");
            } else if (bMo14832a != 92) {
                switch (bMo14832a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo14832a < 32 || bMo14832a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo14832a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo14832a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo14832a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo14832a);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
