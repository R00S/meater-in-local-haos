package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Q extends T {

    /* renamed from: b, reason: collision with root package name */
    private int f34506b;

    /* renamed from: c, reason: collision with root package name */
    private int f34507c;

    /* renamed from: d, reason: collision with root package name */
    private int f34508d;

    /* synthetic */ Q(byte[] bArr, int i10, int i11, boolean z10, S s10) {
        super(null);
        this.f34508d = Integer.MAX_VALUE;
        this.f34506b = 0;
    }

    public final int a(int i10) {
        int i11 = this.f34508d;
        this.f34508d = 0;
        int i12 = this.f34506b + this.f34507c;
        this.f34506b = i12;
        if (i12 > 0) {
            this.f34507c = i12;
            this.f34506b = 0;
        } else {
            this.f34507c = 0;
        }
        return i11;
    }
}
