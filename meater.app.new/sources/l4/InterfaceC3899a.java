package l4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ll4/a;", "", "b", "a", "Ll4/a$a;", "Ll4/a$b;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3899a {

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Ll4/a$a;", "Ll4/a;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l4.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class NetworkError implements InterfaceC3899a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public NetworkError(int i10, String str) {
            this.code = i10;
            this.message = str;
        }

        /* renamed from: a, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkError)) {
                return false;
            }
            NetworkError networkError = (NetworkError) other;
            return this.code == networkError.code && C3862t.b(this.message, networkError.message);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NetworkError(code=" + this.code + ", message=" + this.message + ")";
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll4/a$b;", "Ll4/a;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l4.a$b */
    public static final class b implements InterfaceC3899a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44358a = new b();

        private b() {
        }
    }
}
