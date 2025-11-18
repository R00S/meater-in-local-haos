package androidx.media3.common;

import X1.L;
import android.os.Bundle;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private static final String f26025E = L.B0(0);

    /* renamed from: F, reason: collision with root package name */
    private static final String f26026F = L.B0(1);

    /* renamed from: G, reason: collision with root package name */
    private static final String f26027G = L.B0(2);

    /* renamed from: H, reason: collision with root package name */
    private static final String f26028H = L.B0(3);

    /* renamed from: I, reason: collision with root package name */
    private static final String f26029I = L.B0(4);

    /* renamed from: J, reason: collision with root package name */
    private static final String f26030J = L.B0(5);

    /* renamed from: B, reason: collision with root package name */
    public final int f26031B;

    /* renamed from: C, reason: collision with root package name */
    public final long f26032C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f26033D;

    protected PlaybackException(String str, Throwable th, int i10, Bundle bundle, long j10) {
        super(str, th);
        this.f26031B = i10;
        this.f26033D = bundle;
        this.f26032C = j10;
    }
}
