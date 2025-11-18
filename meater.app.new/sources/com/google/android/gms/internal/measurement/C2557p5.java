package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2557p5 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f34264a;

    static {
        char[] cArr = new char[80];
        f34264a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC2517k5 interfaceC2517k5, String str) throws SecurityException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(interfaceC2517k5, sb2, 0);
        return sb2.toString();
    }

    private static void b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f34264a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(com.google.android.gms.internal.measurement.InterfaceC2517k5 r20, java.lang.StringBuilder r21, int r22) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2557p5.c(com.google.android.gms.internal.measurement.k5, java.lang.StringBuilder, int):void");
    }

    static void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(N5.a(Y3.r((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof Y3) {
            sb2.append(": \"");
            sb2.append(N5.a((Y3) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof F4) {
            sb2.append(" {");
            c((F4) obj, sb2, i10 + 2);
            sb2.append("\n");
            b(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        d(sb2, i12, "key", entry.getKey());
        d(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        b(i10, sb2);
        sb2.append("}");
    }
}
