package E9;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f4145a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4146b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f4147a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f4148b = com.google.firebase.remoteconfig.internal.m.f38699j;

        public i c() {
            return new i(this);
        }

        public b d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f4147a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f4148b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private i(b bVar) {
        this.f4145a = bVar.f4147a;
        this.f4146b = bVar.f4148b;
    }
}
