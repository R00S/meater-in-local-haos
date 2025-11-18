package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import kotlin.jvm.internal.C9801m;

/* compiled from: utfEncoding.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.j */
/* loaded from: classes3.dex */
public final class C10122j {
    /* renamed from: a */
    public static final byte[] m34269a(String[] strArr) {
        C9801m.m32346f(strArr, "strings");
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
