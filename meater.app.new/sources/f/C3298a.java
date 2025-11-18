package f;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ContextAwareHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf/a;", "", "<init>", "()V", "Lf/b;", "listener", "Loa/F;", "a", "(Lf/b;)V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", "b", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3298a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<InterfaceC3299b> listeners = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Context context;

    public final void a(InterfaceC3299b listener) {
        C3862t.g(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.a(context);
        }
        this.listeners.add(listener);
    }

    public final void b() {
        this.context = null;
    }

    public final void c(Context context) {
        C3862t.g(context, "context");
        this.context = context;
        Iterator<InterfaceC3299b> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }
}
