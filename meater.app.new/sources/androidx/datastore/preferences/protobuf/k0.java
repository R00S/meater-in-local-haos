package androidx.datastore.preferences.protobuf;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes.dex */
final class k0 {

    /* compiled from: TextFormatEscaper.java */
    static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2062h f24994a;

        a(AbstractC2062h abstractC2062h) {
            this.f24994a = abstractC2062h;
        }

        @Override // androidx.datastore.preferences.protobuf.k0.b
        public byte a(int i10) {
            return this.f24994a.f(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.b
        public int size() {
            return this.f24994a.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    private interface b {
        byte a(int i10);

        int size();
    }

    static String a(AbstractC2062h abstractC2062h) {
        return b(new a(abstractC2062h));
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
        return a(AbstractC2062h.v(str));
    }
}
