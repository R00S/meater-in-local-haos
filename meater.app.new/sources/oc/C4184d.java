package oc;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CacheControl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u0000 (2\u00020\u0001:\u0002\u0016\u001aBs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Loc/d;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Z", "g", "()Z", "b", "h", "c", "I", "()I", "d", "e", "f", "i", "j", "k", "l", "m", "Ljava/lang/String;", "n", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4184d {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final C4184d f46869o = new a().d().a();

    /* renamed from: p, reason: collision with root package name */
    public static final C4184d f46870p = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean noStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxAgeSeconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int sMaxAgeSeconds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrivate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublic;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean mustRevalidate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxStaleSeconds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minFreshSeconds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean onlyIfCached;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean noTransform;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean immutable;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String headerValue;

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014¨\u0006!"}, d2 = {"Loc/d$a;", "", "<init>", "()V", "", "", "b", "(J)I", "d", "()Loc/d$a;", "maxStale", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "c", "(ILjava/util/concurrent/TimeUnit;)Loc/d$a;", "e", "Loc/d;", "a", "()Loc/d;", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "f", "onlyIfCached", "g", "noTransform", "h", "immutable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean noCache;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean noStore;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxAgeSeconds = -1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int maxStaleSeconds = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int minFreshSeconds = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean onlyIfCached;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean noTransform;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean immutable;

        private final int b(long j10) {
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final C4184d a() {
            return new C4184d(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final a c(int maxStale, TimeUnit timeUnit) {
            C3862t.g(timeUnit, "timeUnit");
            if (maxStale >= 0) {
                this.maxStaleSeconds = b(timeUnit.toSeconds(maxStale));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
        }

        public final a d() {
            this.noCache = true;
            return this;
        }

        public final a e() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Loc/d$b;", "", "<init>", "()V", "", "characters", "", "startIndex", "a", "(Ljava/lang/String;Ljava/lang/String;I)I", "Loc/u;", "headers", "Loc/d;", "b", "(Loc/u;)Loc/d;", "FORCE_CACHE", "Loc/d;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (Ub.n.K(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final oc.C4184d b(oc.u r31) {
            /*
                Method dump skipped, instructions count: 403
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oc.C4184d.Companion.b(oc.u):oc.d");
        }

        private Companion() {
        }
    }

    public /* synthetic */ C4184d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, C3854k c3854k) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: e, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    private C4184d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }
}
