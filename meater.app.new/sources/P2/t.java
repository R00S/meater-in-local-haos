package P2;

import X1.C1804a;
import v2.O;

/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13886b;

    /* renamed from: c, reason: collision with root package name */
    public final O.a f13887c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13888d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13889e;

    public t(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C1804a.a((bArr2 == null) ^ (i10 == 0));
        this.f13885a = z10;
        this.f13886b = str;
        this.f13888d = i10;
        this.f13889e = bArr2;
        this.f13887c = new O.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                X1.n.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
