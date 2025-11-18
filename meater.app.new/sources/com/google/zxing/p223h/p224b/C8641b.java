package com.google.zxing.p223h.p224b;

/* compiled from: Base256Encoder.java */
/* renamed from: com.google.zxing.h.b.b */
/* loaded from: classes2.dex */
final class C8641b implements InterfaceC8646g {
    C8641b() {
    }

    /* renamed from: c */
    private static char m27308c(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 255) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }

    @Override // com.google.zxing.p223h.p224b.InterfaceC8646g
    /* renamed from: a */
    public void mo27306a(C8647h c8647h) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c8647h.m27340i()) {
                break;
            }
            sb.append(c8647h.m27335c());
            c8647h.f32840f++;
            if (C8649j.m27367n(c8647h.m27336d(), c8647h.f32840f, m27309b()) != m27309b()) {
                c8647h.m27346o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iM27333a = c8647h.m27333a() + length + 1;
        c8647h.m27348q(iM27333a);
        boolean z = c8647h.m27339g().m27372a() - iM27333a > 0;
        if (c8647h.m27340i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            c8647h.m27349r(m27308c(sb.charAt(i2), c8647h.m27333a() + 1));
        }
    }

    /* renamed from: b */
    public int m27309b() {
        return 5;
    }
}
