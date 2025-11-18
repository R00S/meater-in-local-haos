package androidx.datastore.preferences.protobuf;

/* compiled from: TextFormatEscaper.java */
/* renamed from: androidx.datastore.preferences.protobuf.k1 */
/* loaded from: classes.dex */
final class C0388k1 {

    /* compiled from: TextFormatEscaper.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$a */
    static class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC0377h f2819a;

        a(AbstractC0377h abstractC0377h) {
            this.f2819a = abstractC0377h;
        }

        @Override // androidx.datastore.preferences.protobuf.C0388k1.b
        /* renamed from: a */
        public byte mo2941a(int i2) {
            return this.f2819a.mo2724f(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0388k1.b
        public int size() {
            return this.f2819a.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k1$b */
    private interface b {
        /* renamed from: a */
        byte mo2941a(int i2);

        int size();
    }

    /* renamed from: a */
    static String m2938a(AbstractC0377h abstractC0377h) {
        return m2939b(new a(abstractC0377h));
    }

    /* renamed from: b */
    static String m2939b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i2 = 0; i2 < bVar.size(); i2++) {
            byte bMo2941a = bVar.mo2941a(i2);
            if (bMo2941a == 34) {
                sb.append("\\\"");
            } else if (bMo2941a == 39) {
                sb.append("\\'");
            } else if (bMo2941a != 92) {
                switch (bMo2941a) {
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
                        if (bMo2941a < 32 || bMo2941a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo2941a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo2941a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo2941a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo2941a);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    static String m2940c(String str) {
        return m2938a(AbstractC0377h.m2718o(str));
    }
}
