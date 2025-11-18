package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: B, reason: collision with root package name */
    public final a2.g f27107B;

    /* renamed from: C, reason: collision with root package name */
    public final Uri f27108C;

    /* renamed from: D, reason: collision with root package name */
    public final Map<String, List<String>> f27109D;

    /* renamed from: E, reason: collision with root package name */
    public final long f27110E;

    public MediaDrmCallbackException(a2.g gVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f27107B = gVar;
        this.f27108C = uri;
        this.f27109D = map;
        this.f27110E = j10;
    }
}
