package com.google.zxing.p223h.p224b;

/* compiled from: EdifactEncoder.java */
/* renamed from: com.google.zxing.h.b.f */
/* loaded from: classes2.dex */
final class C8645f implements InterfaceC8646g {
    C8645f() {
    }

    /* renamed from: b */
    private static void m27328b(char c2, StringBuilder sb) {
        if (c2 >= ' ' && c2 <= '?') {
            sb.append(c2);
        } else if (c2 < '@' || c2 > '^') {
            C8649j.m27358e(c2);
        } else {
            sb.append((char) (c2 - '@'));
        }
    }

    /* renamed from: c */
    private static String m27329c(CharSequence charSequence, int i2) {
        int length = charSequence.length() - i2;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i2) << 18) + ((length >= 2 ? charSequence.charAt(i2 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i2 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i2 + 3) : (char) 0);
        char c2 = (char) ((iCharAt >> 16) & 255);
        char c3 = (char) ((iCharAt >> 8) & 255);
        char c4 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c2);
        if (length >= 2) {
            sb.append(c3);
        }
        if (length >= 3) {
            sb.append(c4);
        }
        return sb.toString();
    }

    /* renamed from: e */
    private static void m27330e(C8647h c8647h, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c8647h.m27347p();
                int iM27372a = c8647h.m27339g().m27372a() - c8647h.m27333a();
                int iM27338f = c8647h.m27338f();
                if (iM27338f > iM27372a) {
                    c8647h.m27348q(c8647h.m27333a() + 1);
                    iM27372a = c8647h.m27339g().m27372a() - c8647h.m27333a();
                }
                if (iM27338f <= iM27372a && iM27372a <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i2 = length - 1;
            String strM27329c = m27329c(charSequence, 0);
            if (!(!c8647h.m27340i()) || i2 > 2) {
                z = false;
            }
            if (i2 <= 2) {
                c8647h.m27348q(c8647h.m27333a() + i2);
                if (c8647h.m27339g().m27372a() - c8647h.m27333a() >= 3) {
                    c8647h.m27348q(c8647h.m27333a() + strM27329c.length());
                    z = false;
                }
            }
            if (z) {
                c8647h.m27342k();
                c8647h.f32840f -= i2;
            } else {
                c8647h.m27350s(strM27329c);
            }
        } finally {
            c8647h.m27346o(0);
        }
    }

    @Override // com.google.zxing.p223h.p224b.InterfaceC8646g
    /* renamed from: a */
    public void mo27306a(C8647h c8647h) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c8647h.m27340i()) {
                break;
            }
            m27328b(c8647h.m27335c(), sb);
            c8647h.f32840f++;
            if (sb.length() >= 4) {
                c8647h.m27350s(m27329c(sb, 0));
                sb.delete(0, 4);
                if (C8649j.m27367n(c8647h.m27336d(), c8647h.f32840f, m27331d()) != m27331d()) {
                    c8647h.m27346o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m27330e(c8647h, sb);
    }

    /* renamed from: d */
    public int m27331d() {
        return 4;
    }
}
