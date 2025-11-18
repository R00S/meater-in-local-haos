package n2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f45619h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f45620a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.g f45621b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f45622c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f45623d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45624e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45625f;

    /* renamed from: g, reason: collision with root package name */
    public final long f45626g;

    public i(long j10, a2.g gVar, long j11) {
        this(j10, gVar, gVar.f19983a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f45619h.getAndIncrement();
    }

    public i(long j10, a2.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f45620a = j10;
        this.f45621b = gVar;
        this.f45622c = uri;
        this.f45623d = map;
        this.f45624e = j11;
        this.f45625f = j12;
        this.f45626g = j13;
    }
}
