package e;

import f1.C3310c;
import g.AbstractC3371c;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le/a;", "I", "", "<init>", "()V", "input", "Lf1/c;", "options", "Loa/F;", "a", "(Ljava/lang/Object;Lf1/c;)V", "c", "Lg/c;", "Lg/c;", "getLauncher", "()Lg/c;", "b", "(Lg/c;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3104a<I> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC3371c<I> launcher;

    public final void a(I input, C3310c options) {
        C4153F c4153f;
        AbstractC3371c<I> abstractC3371c = this.launcher;
        if (abstractC3371c != null) {
            abstractC3371c.b(input, options);
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(AbstractC3371c<I> abstractC3371c) {
        this.launcher = abstractC3371c;
    }

    public final void c() {
        C4153F c4153f;
        AbstractC3371c<I> abstractC3371c = this.launcher;
        if (abstractC3371c != null) {
            abstractC3371c.c();
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
