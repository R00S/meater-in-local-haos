package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CoroutineName.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Key", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.n0, reason: from Kotlin metadata and from toString */
/* loaded from: classes3.dex */
public final /* data */ class CoroutineName extends AbstractCoroutineContextElement {

    /* renamed from: f */
    public static final a f41855f = new a(null);

    /* renamed from: g */
    private final String f41856g;

    /* compiled from: CoroutineName.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineName;", "()V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.n0$a */
    public static final class a implements CoroutineContext.c<CoroutineName> {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* renamed from: K, reason: from getter */
    public final String getF41856g() {
        return this.f41856g;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoroutineName) && C9801m.m32341a(this.f41856g, ((CoroutineName) other).f41856g);
    }

    public int hashCode() {
        return this.f41856g.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f41856g + ')';
    }
}
