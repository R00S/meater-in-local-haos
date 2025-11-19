package Q1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0007\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bR,\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LQ1/a;", "", "<init>", "()V", "T", "LQ1/a$b;", "key", "a", "(LQ1/a$b;)Ljava/lang/Object;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "map", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<b<?>, Object> map = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQ1/a$a;", "LQ1/a;", "<init>", "()V", "T", "LQ1/a$b;", "key", "a", "(LQ1/a$b;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q1.a$a, reason: collision with other inner class name */
    public static final class C0211a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0211a f14206b = new C0211a();

        private C0211a() {
        }

        @Override // Q1.a
        public <T> T a(b<T> key) {
            C3862t.g(key, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"LQ1/a$b;", "T", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b<T> {
    }

    public abstract <T> T a(b<T> key);

    public final Map<b<?>, Object> b() {
        return this.map;
    }
}
