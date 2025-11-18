package com.google.firebase.messaging;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public final class SendException extends Exception {

    /* renamed from: f */
    private final int f31954f;

    SendException(String str) {
        super(str);
        this.f31954f = m26462a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m26462a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            int r1 = r7.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1743242157: goto L3e;
                case -1290953729: goto L34;
                case -920906446: goto L2a;
                case -617027085: goto L20;
                case -95047692: goto L16;
                default: goto L15;
            }
        L15:
            goto L48
        L16:
            java.lang.String r1 = "missing_to"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L48
            r7 = 1
            goto L49
        L20:
            java.lang.String r1 = "messagetoobig"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L48
            r7 = 2
            goto L49
        L2a:
            java.lang.String r1 = "invalid_parameters"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L48
            r7 = 0
            goto L49
        L34:
            java.lang.String r1 = "toomanymessages"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L48
            r7 = 4
            goto L49
        L3e:
            java.lang.String r1 = "service_not_available"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L48
            r7 = 3
            goto L49
        L48:
            r7 = -1
        L49:
            if (r7 == 0) goto L57
            if (r7 == r5) goto L57
            if (r7 == r4) goto L56
            if (r7 == r3) goto L55
            if (r7 == r2) goto L54
            return r0
        L54:
            return r2
        L55:
            return r3
        L56:
            return r4
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SendException.m26462a(java.lang.String):int");
    }
}
