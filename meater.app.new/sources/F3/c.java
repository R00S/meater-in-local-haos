package F3;

import kotlin.Metadata;

/* compiled from: FoldingFeature.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0003\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"LF3/c;", "LF3/a;", "", "a", "()Z", "isSeparating", "LF3/c$a;", "c", "()LF3/c$a;", "orientation", "LF3/c$b;", "getState", "()LF3/c$b;", "state", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c extends F3.a {

    /* compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LF3/c$a;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f4481c = new a("VERTICAL");

        /* renamed from: d, reason: collision with root package name */
        public static final a f4482d = new a("HORIZONTAL");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String description;

        private a(String str) {
            this.description = str;
        }

        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LF3/c$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f4485c = new b("FLAT");

        /* renamed from: d, reason: collision with root package name */
        public static final b f4486d = new b("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String description;

        private b(String str) {
            this.description = str;
        }

        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    boolean a();

    a c();

    b getState();
}
