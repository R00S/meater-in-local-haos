package com.google.crypto.tink.shaded.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes2.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f37789a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37790b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f37791c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37792d;

    d0(P p10, String str, Object[] objArr) {
        this.f37789a = p10;
        this.f37790b = str;
        this.f37791c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37792d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f37792d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public boolean a() {
        return (this.f37792d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public P b() {
        return this.f37789a;
    }

    Object[] c() {
        return this.f37791c;
    }

    String d() {
        return this.f37790b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public a0 getSyntax() {
        return (this.f37792d & 1) == 1 ? a0.PROTO2 : a0.PROTO3;
    }
}
