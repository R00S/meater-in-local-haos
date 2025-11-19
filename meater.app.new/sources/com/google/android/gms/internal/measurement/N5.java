package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class N5 {
    static String a(Y3 y32) {
        Q5 q52 = new Q5(y32);
        StringBuilder sb2 = new StringBuilder(q52.a());
        for (int i10 = 0; i10 < q52.a(); i10++) {
            byte bG = q52.g(i10);
            if (bG == 34) {
                sb2.append("\\\"");
            } else if (bG == 39) {
                sb2.append("\\'");
            } else if (bG != 92) {
                switch (bG) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        sb2.append("\\n");
                        break;
                    case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sb2.append("\\v");
                        break;
                    case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb2.append("\\f");
                        break;
                    case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bG < 32 || bG > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bG >>> 6) & 3) + 48));
                            sb2.append((char) (((bG >>> 3) & 7) + 48));
                            sb2.append((char) ((bG & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bG);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
