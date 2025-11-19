package Ub;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LUb/i;", "", "", "", "b", "()Ljava/util/List;", "groupValues", "LUb/i$b;", "a", "()LUb/i$b;", "destructured", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: MatchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static b a(i iVar) {
            return new b(iVar);
        }
    }

    /* compiled from: MatchResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LUb/i$b;", "", "LUb/i;", "match", "<init>", "(LUb/i;)V", "a", "LUb/i;", "()LUb/i;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final i match;

        public b(i match) {
            C3862t.g(match, "match");
            this.match = match;
        }

        /* renamed from: a, reason: from getter */
        public final i getMatch() {
            return this.match;
        }
    }

    b a();

    List<String> b();
}
