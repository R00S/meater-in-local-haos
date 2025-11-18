package androidx.media3.exoplayer;

import X1.C1804a;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: R, reason: collision with root package name */
    private static final String f26309R = X1.L.B0(1001);

    /* renamed from: S, reason: collision with root package name */
    private static final String f26310S = X1.L.B0(1002);

    /* renamed from: T, reason: collision with root package name */
    private static final String f26311T = X1.L.B0(1003);

    /* renamed from: U, reason: collision with root package name */
    private static final String f26312U = X1.L.B0(1004);

    /* renamed from: V, reason: collision with root package name */
    private static final String f26313V = X1.L.B0(1005);

    /* renamed from: W, reason: collision with root package name */
    private static final String f26314W = X1.L.B0(1006);

    /* renamed from: K, reason: collision with root package name */
    public final int f26315K;

    /* renamed from: L, reason: collision with root package name */
    public final String f26316L;

    /* renamed from: M, reason: collision with root package name */
    public final int f26317M;

    /* renamed from: N, reason: collision with root package name */
    public final U1.s f26318N;

    /* renamed from: O, reason: collision with root package name */
    public final int f26319O;

    /* renamed from: P, reason: collision with root package name */
    public final r.b f26320P;

    /* renamed from: Q, reason: collision with root package name */
    final boolean f26321Q;

    private ExoPlaybackException(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static ExoPlaybackException b(Throwable th, String str, int i10, U1.s sVar, int i11, boolean z10, int i12) {
        return new ExoPlaybackException(1, th, null, i12, str, i10, sVar, sVar == null ? 4 : i11, z10);
    }

    public static ExoPlaybackException c(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    public static ExoPlaybackException d(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String e(int i10, String str, String str2, int i11, U1.s sVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + sVar + ", format_supported=" + X1.L.b0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException a(r.b bVar) {
        return new ExoPlaybackException((String) X1.L.i(getMessage()), getCause(), this.f26031B, this.f26315K, this.f26316L, this.f26317M, this.f26318N, this.f26319O, bVar, this.f26032C, this.f26321Q);
    }

    private ExoPlaybackException(int i10, Throwable th, String str, int i11, String str2, int i12, U1.s sVar, int i13, boolean z10) {
        this(e(i10, str, str2, i12, sVar, i13), th, i11, i10, str2, i12, sVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ExoPlaybackException(String str, Throwable th, int i10, int i11, String str2, int i12, U1.s sVar, int i13, r.b bVar, long j10, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j10);
        C1804a.a(!z10 || i11 == 1);
        C1804a.a(th != null || i11 == 3);
        this.f26315K = i11;
        this.f26316L = str2;
        this.f26317M = i12;
        this.f26318N = sVar;
        this.f26319O = i13;
        this.f26320P = bVar;
        this.f26321Q = z10;
    }
}
