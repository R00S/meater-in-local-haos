package Fa;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import wa.C5012b;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b'\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"LFa/c;", "", "<init>", "()V", "", "b", "()I", "until", "c", "(I)I", "B", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: C, reason: collision with root package name */
    private static final c f4579C = C5012b.f52009a.b();

    /* compiled from: Random.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LFa/c$a;", "LFa/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "b", "()I", "until", "c", "(I)I", "defaultRandom", "LFa/c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fa.c$a, reason: from kotlin metadata */
    public static final class Companion extends c implements Serializable {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        @Override // Fa.c
        public int b() {
            return c.f4579C.b();
        }

        @Override // Fa.c
        public int c(int until) {
            return c.f4579C.c(until);
        }

        private Companion() {
        }
    }

    public abstract int b();

    public abstract int c(int until);
}
