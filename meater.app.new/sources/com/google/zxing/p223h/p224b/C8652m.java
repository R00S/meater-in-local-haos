package com.google.zxing.p223h.p224b;

/* compiled from: TextEncoder.java */
/* renamed from: com.google.zxing.h.b.m */
/* loaded from: classes2.dex */
final class C8652m extends C8642c {
    C8652m() {
    }

    @Override // com.google.zxing.p223h.p224b.C8642c
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
        if (c2 >= 'a' && c2 <= 'z') {
            sb.append((char) ((c2 - 'a') + 14));
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
        if (c2 == '`') {
            sb.append((char) 2);
            sb.append((char) (c2 - '`'));
            return 2;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) 2);
            sb.append((char) ((c2 - 'A') + 1));
            return 2;
        }
        if (c2 < '{' || c2 > 127) {
            sb.append("\u0001\u001e");
            return mo27313c((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) ((c2 - '{') + 27));
        return 2;
    }

    @Override // com.google.zxing.p223h.p224b.C8642c
    /* renamed from: e */
    public int mo27314e() {
        return 2;
    }
}
