package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzdbx {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<zzdbw> f25464a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static zzdbw m19192a(String str) throws GeneralSecurityException {
        Iterator<zzdbw> it = f25464a.iterator();
        while (it.hasNext()) {
            zzdbw next = it.next();
            if (next.m19190a(str)) {
                return next;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
