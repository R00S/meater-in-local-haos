package com.google.zxing.p223h.p224b;

/* compiled from: X12Encoder.java */
/* renamed from: com.google.zxing.h.b.n */
/* loaded from: classes2.dex */
final class C8653n extends C8642c {
    C8653n() {
    }

    @Override // com.google.zxing.p223h.p224b.C8642c, com.google.zxing.p223h.p224b.InterfaceC8646g
    /* renamed from: a */
    public void mo27306a(C8647h c8647h) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c8647h.m27340i()) {
                break;
            }
            char cM27335c = c8647h.m27335c();
            c8647h.f32840f++;
            mo27313c(cM27335c, sb);
            if (sb.length() % 3 == 0) {
                C8642c.m27312g(c8647h, sb);
                if (C8649j.m27367n(c8647h.m27336d(), c8647h.f32840f, mo27314e()) != mo27314e()) {
                    c8647h.m27346o(0);
                    break;
                }
            }
        }
        mo27315f(c8647h, sb);
    }

    @Override // com.google.zxing.p223h.p224b.C8642c
    /* renamed from: c */
    int mo27313c(char c2, StringBuilder sb) {
        if (c2 == '\r') {
            sb.append((char) 0);
        } else if (c2 == ' ') {
            sb.append((char) 3);
        } else if (c2 == '*') {
            sb.append((char) 1);
        } else if (c2 == '>') {
            sb.append((char) 2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
        } else if (c2 < 'A' || c2 > 'Z') {
            C8649j.m27358e(c2);
        } else {
            sb.append((char) ((c2 - 'A') + 14));
        }
        return 1;
    }

    @Override // com.google.zxing.p223h.p224b.C8642c
    /* renamed from: e */
    public int mo27314e() {
        return 3;
    }

    @Override // com.google.zxing.p223h.p224b.C8642c
    /* renamed from: f */
    void mo27315f(C8647h c8647h, StringBuilder sb) {
        c8647h.m27347p();
        int iM27372a = c8647h.m27339g().m27372a() - c8647h.m27333a();
        c8647h.f32840f -= sb.length();
        if (c8647h.m27338f() > 1 || iM27372a > 1 || c8647h.m27338f() != iM27372a) {
            c8647h.m27349r((char) 254);
        }
        if (c8647h.m27337e() < 0) {
            c8647h.m27346o(0);
        }
    }
}
