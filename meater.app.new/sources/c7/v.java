package c7;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class v extends u {

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f31103C;

    v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f31103C = bArr;
    }

    @Override // c7.u
    final byte[] u1() {
        return this.f31103C;
    }
}
