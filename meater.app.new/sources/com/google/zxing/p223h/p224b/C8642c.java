package com.google.zxing.p223h.p224b;

/* compiled from: C40Encoder.java */
/* renamed from: com.google.zxing.h.b.c */
/* loaded from: classes2.dex */
class C8642c implements InterfaceC8646g {
    C8642c() {
    }

    /* renamed from: b */
    private int m27310b(C8647h c8647h, StringBuilder sb, StringBuilder sb2, int i2) {
        int length = sb.length();
        sb.delete(length - i2, length);
        c8647h.f32840f--;
        int iMo27313c = mo27313c(c8647h.m27335c(), sb2);
        c8647h.m27342k();
        return iMo27313c;
    }

    /* renamed from: d */
    private static String m27311d(CharSequence charSequence, int i2) {
        int iCharAt = (charSequence.charAt(i2) * 1600) + (charSequence.charAt(i2 + 1) * '(') + charSequence.charAt(i2 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    /* renamed from: g */
    static void m27312g(C8647h c8647h, StringBuilder sb) {
        c8647h.m27350s(m27311d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.p223h.p224b.InterfaceC8646g
    /* renamed from: a */
    public void mo27306a(C8647h c8647h) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c8647h.m27340i()) {
                break;
            }
            char cM27335c = c8647h.m27335c();
            c8647h.f32840f++;
            int iMo27313c = mo27313c(cM27335c, sb);
            int iM27333a = c8647h.m27333a() + ((sb.length() / 3) << 1);
            c8647h.m27348q(iM27333a);
            int iM27372a = c8647h.m27339g().m27372a() - iM27333a;
            if (!c8647h.m27340i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iM27372a < 2 || iM27372a > 2)) {
                    iMo27313c = m27310b(c8647h, sb, sb2, iMo27313c);
                }
                while (sb.length() % 3 == 1 && ((iMo27313c <= 3 && iM27372a != 1) || iMo27313c > 3)) {
                    iMo27313c = m27310b(c8647h, sb, sb2, iMo27313c);
                }
            } else if (sb.length() % 3 == 0 && C8649j.m27367n(c8647h.m27336d(), c8647h.f32840f, mo27314e()) != mo27314e()) {
                c8647h.m27346o(0);
                break;
            }
        }
        mo27315f(c8647h, sb);
    }

    /* renamed from: c */
    int mo27313c(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) ((c2 - 'A') + 14));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c2 - ':') + 15));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c2 - '[') + 22));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return mo27313c((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    /* renamed from: e */
    public int mo27314e() {
        return 1;
    }

    /* renamed from: f */
    void mo27315f(C8647h c8647h, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iM27333a = c8647h.m27333a() + length;
        c8647h.m27348q(iM27333a);
        int iM27372a = c8647h.m27339g().m27372a() - iM27333a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m27312g(c8647h, sb);
            }
            if (c8647h.m27340i()) {
                c8647h.m27349r((char) 254);
            }
        } else if (iM27372a == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m27312g(c8647h, sb);
            }
            if (c8647h.m27340i()) {
                c8647h.m27349r((char) 254);
            }
            c8647h.f32840f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                m27312g(c8647h, sb);
            }
            if (iM27372a > 0 || c8647h.m27340i()) {
                c8647h.m27349r((char) 254);
            }
        }
        c8647h.m27346o(0);
    }
}
