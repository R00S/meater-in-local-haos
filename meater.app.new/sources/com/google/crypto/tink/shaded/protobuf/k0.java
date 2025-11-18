package com.google.crypto.tink.shaded.protobuf;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes2.dex */
final class k0 {

    /* compiled from: TextFormatEscaper.java */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2898h f37872a;

        a(AbstractC2898h abstractC2898h) {
            this.f37872a = abstractC2898h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k0.b
        public byte a(int i10) {
            return this.f37872a.f(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k0.b
        public int size() {
            return this.f37872a.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(AbstractC2898h abstractC2898h) {
        return b(new a(abstractC2898h));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte bA = bVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
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
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(String str) {
        return a(AbstractC2898h.v(str));
    }
}
