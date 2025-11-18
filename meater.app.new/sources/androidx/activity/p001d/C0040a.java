package androidx.activity.p001d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper.java */
/* renamed from: androidx.activity.d.a */
/* loaded from: classes.dex */
public final class C0040a {

    /* renamed from: a */
    private final Set<InterfaceC0041b> f113a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f114b;

    /* renamed from: a */
    public void m136a(InterfaceC0041b interfaceC0041b) {
        if (this.f114b != null) {
            interfaceC0041b.mo141a(this.f114b);
        }
        this.f113a.add(interfaceC0041b);
    }

    /* renamed from: b */
    public void m137b() {
        this.f114b = null;
    }

    /* renamed from: c */
    public void m138c(Context context) {
        this.f114b = context;
        Iterator<InterfaceC0041b> it = this.f113a.iterator();
        while (it.hasNext()) {
            it.next().mo141a(context);
        }
    }

    /* renamed from: d */
    public Context m139d() {
        return this.f114b;
    }

    /* renamed from: e */
    public void m140e(InterfaceC0041b interfaceC0041b) {
        this.f113a.remove(interfaceC0041b);
    }
}
