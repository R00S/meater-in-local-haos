package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: LazyLayoutKeyIndexMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c;", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "b", "(I)Ljava/lang/Object;", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f22424b;

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", "Landroidx/compose/foundation/lazy/layout/c;", "<init>", "()V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "", "a", "(I)Ljava/lang/Void;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.c$a, reason: from kotlin metadata */
    public static final class Companion implements c {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f22424b = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.lazy.layout.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void b(int index) {
            return null;
        }

        @Override // androidx.compose.foundation.lazy.layout.c
        public int c(Object key) {
            return -1;
        }
    }

    Object b(int index);

    int c(Object key);
}
