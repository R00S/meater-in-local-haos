package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzvb {

    /* renamed from: b */
    private final int f27205b;

    /* renamed from: d */
    private final zzva f27207d = new zzvf();

    /* renamed from: a */
    private final int f27204a = 6;

    /* renamed from: c */
    private final int f27206c = 0;

    public zzvb(int i2) {
        this.f27205b = i2;
    }

    @VisibleForTesting
    /* renamed from: b */
    private final String m20651b(String str) throws UnsupportedEncodingException {
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        t40 t40Var = new t40();
        PriorityQueue priorityQueue = new PriorityQueue(this.f27205b, new s40(this));
        for (String str2 : strArrSplit) {
            String[] strArrM20654b = zzve.m20654b(str2, false);
            if (strArrM20654b.length != 0) {
                zzvh.m20659d(strArrM20654b, this.f27205b, this.f27204a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                t40Var.m15902a(this.f27207d.mo20649a(((zzvi) it.next()).f27210b));
            } catch (IOException e2) {
                zzbad.m17347c("Error while writing hash to byteStream", e2);
            }
        }
        return t40Var.toString();
    }

    /* renamed from: a */
    public final String m20652a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return m20651b(sb.toString());
    }
}
