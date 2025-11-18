package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes2.dex */
final class C6425h<R, T> implements PendingResultUtil.ResultConverter<R, T> {

    /* renamed from: a */
    private final /* synthetic */ Response f17816a;

    C6425h(Response response) {
        this.f17816a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    /* renamed from: a */
    public final /* synthetic */ Object mo13664a(Result result) {
        this.f17816a.m13907g(result);
        return this.f17816a;
    }
}
