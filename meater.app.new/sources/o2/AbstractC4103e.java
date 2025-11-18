package o2;

import U1.s;
import X1.C1804a;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;

/* compiled from: Chunk.java */
/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4103e implements Loader.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f46346a = n2.i.a();

    /* renamed from: b, reason: collision with root package name */
    public final a2.g f46347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46348c;

    /* renamed from: d, reason: collision with root package name */
    public final s f46349d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46350e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f46351f;

    /* renamed from: g, reason: collision with root package name */
    public final long f46352g;

    /* renamed from: h, reason: collision with root package name */
    public final long f46353h;

    /* renamed from: i, reason: collision with root package name */
    protected final a2.l f46354i;

    public AbstractC4103e(androidx.media3.datasource.a aVar, a2.g gVar, int i10, s sVar, int i11, Object obj, long j10, long j11) {
        this.f46354i = new a2.l(aVar);
        this.f46347b = (a2.g) C1804a.e(gVar);
        this.f46348c = i10;
        this.f46349d = sVar;
        this.f46350e = i11;
        this.f46351f = obj;
        this.f46352g = j10;
        this.f46353h = j11;
    }

    public final long c() {
        return this.f46354i.q();
    }

    public final Map<String, List<String>> d() {
        return this.f46354i.s();
    }

    public final Uri e() {
        return this.f46354i.r();
    }
}
