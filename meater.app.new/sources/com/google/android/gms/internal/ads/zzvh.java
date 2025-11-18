package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzvh {
    @VisibleForTesting
    /* renamed from: a */
    private static long m20656a(long j2, int i2) {
        if (i2 == 0) {
            return 1L;
        }
        return i2 == 1 ? j2 : i2 % 2 == 0 ? m20656a((j2 * j2) % 1073807359, i2 / 2) % 1073807359 : (j2 * (m20656a((j2 * j2) % 1073807359, i2 / 2) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    /* renamed from: b */
    private static String m20657b(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            zzbad.m17351g("Unable to construct shingle");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private static void m20658c(int i2, long j2, String str, int i3, PriorityQueue<zzvi> priorityQueue) {
        zzvi zzviVar = new zzvi(j2, str, i3);
        if ((priorityQueue.size() != i2 || (priorityQueue.peek().f27211c <= zzviVar.f27211c && priorityQueue.peek().f27209a <= zzviVar.f27209a)) && !priorityQueue.contains(zzviVar)) {
            priorityQueue.add(zzviVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: d */
    public static void m20659d(String[] strArr, int i2, int i3, PriorityQueue<zzvi> priorityQueue) throws UnsupportedEncodingException {
        if (strArr.length < i3) {
            m20658c(i2, m20660e(strArr, 0, strArr.length), m20657b(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long jM20660e = m20660e(strArr, 0, i3);
        m20658c(i2, jM20660e, m20657b(strArr, 0, i3), i3, priorityQueue);
        long jM20656a = m20656a(16785407L, i3 - 1);
        for (int i4 = 1; i4 < (strArr.length - i3) + 1; i4++) {
            jM20660e = ((((((jM20660e + 1073807359) - ((((zzve.m20653a(strArr[i4 - 1]) + 2147483647L) % 1073807359) * jM20656a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzve.m20653a(strArr[(i4 + i3) - 1]) + 2147483647L) % 1073807359)) % 1073807359;
            m20658c(i2, jM20660e, m20657b(strArr, i4, i3), strArr.length, priorityQueue);
        }
    }

    /* renamed from: e */
    private static long m20660e(String[] strArr, int i2, int i3) {
        long jM20653a = (zzve.m20653a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            jM20653a = (((jM20653a * 16785407) % 1073807359) + ((zzve.m20653a(strArr[i4]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jM20653a;
    }
}
