package com.flurry.sdk;

import java.util.Comparator;

/* renamed from: com.flurry.sdk.a1 */
/* loaded from: classes2.dex */
public final class C5994a1 implements Comparator<Runnable> {
    /* renamed from: a */
    private static int m12951a(Runnable runnable) {
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof C6003b1) {
            AbstractC6050g2 abstractC6050g2 = (AbstractC6050g2) ((C6003b1) runnable).m12966a();
            if (abstractC6050g2 != null) {
                return abstractC6050g2.f15912h;
            }
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof AbstractC6050g2) {
            return ((AbstractC6050g2) runnable).f15912h;
        }
        C6021d1.m13030c(6, "PriorityComparator", "Unknown runnable class: " + runnable.getClass().getName());
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
        int iM12951a = m12951a(runnable);
        int iM12951a2 = m12951a(runnable2);
        if (iM12951a < iM12951a2) {
            return -1;
        }
        return iM12951a > iM12951a2 ? 1 : 0;
    }
}
