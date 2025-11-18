package kotlin;

import W.f;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LO/x;", "", "T", "LO/u;", "key", "a", "(LO/u;)Ljava/lang/Object;", "c", "LO/z0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1578x {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f13052a;

    /* compiled from: CompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LO/x$a;", "", "<init>", "()V", "LO/x;", "b", "LO/x;", "a", "()LO/x;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.x$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13052a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC1578x Empty = f.a();

        private Companion() {
        }

        public final InterfaceC1578x a() {
            return Empty;
        }
    }

    <T> T a(AbstractC1572u<T> key);
}
