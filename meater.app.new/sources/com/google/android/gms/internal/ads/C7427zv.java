package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zv */
/* loaded from: classes2.dex */
final class C7427zv {
    /* renamed from: a */
    static String m16161a(zzdpk zzdpkVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m16162b(zzdpkVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m16162b(com.google.android.gms.internal.ads.zzdpk r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7427zv.m16162b(com.google.android.gms.internal.ads.zzdpk, java.lang.StringBuilder, int):void");
    }

    /* renamed from: c */
    static final void m16163c(StringBuilder sb, int i2, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m16163c(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m16163c(sb, i2, str, (Map.Entry) it2.next());
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
            sb.append(C7428zw.m16165a(zzdmr.m19602z((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzdmr) {
            sb.append(": \"");
            sb.append(C7428zw.m16165a((zzdmr) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzdob) {
            sb.append(" {");
            m16162b((zzdob) obj, sb, i2 + 2);
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
        m16163c(sb, i5, RoomNotification.KEY, entry.getKey());
        m16163c(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* renamed from: d */
    private static final String m16164d(String str) {
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
}
