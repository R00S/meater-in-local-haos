package com.google.zxing.p223h.p224b;

/* compiled from: ASCIIEncoder.java */
/* renamed from: com.google.zxing.h.b.a */
/* loaded from: classes2.dex */
final class C8640a implements InterfaceC8646g {
    C8640a() {
    }

    /* renamed from: b */
    private static char m27305b(char c2, char c3) {
        if (C8649j.m27359f(c2) && C8649j.m27359f(c3)) {
            return (char) (((c2 - '0') * 10) + (c3 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c2 + c3);
    }

    @Override // com.google.zxing.p223h.p224b.InterfaceC8646g
    /* renamed from: a */
    public void mo27306a(C8647h c8647h) {
        if (C8649j.m27354a(c8647h.m27336d(), c8647h.f32840f) >= 2) {
            c8647h.m27349r(m27305b(c8647h.m27336d().charAt(c8647h.f32840f), c8647h.m27336d().charAt(c8647h.f32840f + 1)));
            c8647h.f32840f += 2;
            return;
        }
        char cM27335c = c8647h.m27335c();
        int iM27367n = C8649j.m27367n(c8647h.m27336d(), c8647h.f32840f, m27307c());
        if (iM27367n == m27307c()) {
            if (!C8649j.m27360g(cM27335c)) {
                c8647h.m27349r((char) (cM27335c + 1));
                c8647h.f32840f++;
                return;
            } else {
                c8647h.m27349r((char) 235);
                c8647h.m27349r((char) ((cM27335c - 128) + 1));
                c8647h.f32840f++;
                return;
            }
        }
        if (iM27367n == 1) {
            c8647h.m27349r((char) 230);
            c8647h.m27346o(1);
            return;
        }
        if (iM27367n == 2) {
            c8647h.m27349r((char) 239);
            c8647h.m27346o(2);
            return;
        }
        if (iM27367n == 3) {
            c8647h.m27349r((char) 238);
            c8647h.m27346o(3);
        } else if (iM27367n == 4) {
            c8647h.m27349r((char) 240);
            c8647h.m27346o(4);
        } else {
            if (iM27367n != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iM27367n)));
            }
            c8647h.m27349r((char) 231);
            c8647h.m27346o(5);
        }
    }

    /* renamed from: c */
    public int m27307c() {
        return 0;
    }
}
