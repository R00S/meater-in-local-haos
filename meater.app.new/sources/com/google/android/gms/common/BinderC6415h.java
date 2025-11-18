package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.h */
/* loaded from: classes2.dex */
final class BinderC6415h extends AbstractBinderC6414g {

    /* renamed from: g */
    private final byte[] f17676g;

    BinderC6415h(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f17676g = bArr;
    }

    @Override // com.google.android.gms.common.AbstractBinderC6414g
    /* renamed from: E0 */
    final byte[] mo14275E0() {
        return this.f17676g;
    }
}
