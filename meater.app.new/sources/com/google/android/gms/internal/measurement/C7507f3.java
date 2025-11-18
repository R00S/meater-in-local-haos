package com.google.android.gms.internal.measurement;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f3 */
/* loaded from: classes2.dex */
final class C7507f3 {
    /* renamed from: a */
    static String m21051a(zzgo zzgoVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m21053c(zzgoVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    private static final String m21052b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m21053c(com.google.android.gms.internal.measurement.zzgo r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7507f3.m21053c(com.google.android.gms.internal.measurement.zzgo, java.lang.StringBuilder, int):void");
    }

    /* renamed from: d */
    static final void m21054d(StringBuilder sb, int i2, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m21054d(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m21054d(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C7496d4.m21043a(zzdu.m22150n((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzdu) {
            sb.append(": \"");
            sb.append(C7496d4.m21043a((zzdu) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzfd) {
            sb.append(" {");
            m21053c((zzfd) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        m21054d(sb, i5, RoomNotification.KEY, entry.getKey());
        m21054d(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }
}
