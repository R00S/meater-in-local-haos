package com.google.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes2.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f39231a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39232b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f39233c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39234d;

    d0(P p10, String str, Object[] objArr) {
        this.f39231a = p10;
        this.f39232b = str;
        this.f39233c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f39234d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f39234d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.N
    public boolean a() {
        return (this.f39234d & 2) == 2;
    }

    @Override // com.google.protobuf.N
    public P b() {
        return this.f39231a;
    }

    Object[] c() {
        return this.f39233c;
    }

    String d() {
        return this.f39232b;
    }

    @Override // com.google.protobuf.N
    public a0 getSyntax() {
        int i10 = this.f39234d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }
}
