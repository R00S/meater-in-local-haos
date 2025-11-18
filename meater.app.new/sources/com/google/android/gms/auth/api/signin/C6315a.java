package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes2.dex */
final /* synthetic */ class C6315a implements Comparator {

    /* renamed from: f */
    static final Comparator f17071f = new C6315a();

    private C6315a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).m13912y().compareTo(((Scope) obj2).m13912y());
    }
}
