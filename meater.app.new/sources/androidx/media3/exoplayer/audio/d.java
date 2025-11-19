package androidx.media3.exoplayer.audio;

/* compiled from: AudioOffloadSupport.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f26762d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26764b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26765c;

    /* compiled from: AudioOffloadSupport.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26766a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26767b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26768c;

        public d d() {
            if (this.f26766a || !(this.f26767b || this.f26768c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f26766a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f26767b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f26768c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26763a == dVar.f26763a && this.f26764b == dVar.f26764b && this.f26765c == dVar.f26765c;
    }

    public int hashCode() {
        return ((this.f26763a ? 1 : 0) << 2) + ((this.f26764b ? 1 : 0) << 1) + (this.f26765c ? 1 : 0);
    }

    private d(b bVar) {
        this.f26763a = bVar.f26766a;
        this.f26764b = bVar.f26767b;
        this.f26765c = bVar.f26768c;
    }
}
