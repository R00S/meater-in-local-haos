package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ViewModel.java */
/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public abstract class AbstractC0528x {

    /* renamed from: a */
    private final Map<String, Object> f3514a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3515b = false;

    /* renamed from: b */
    private static void m3911b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    final void m3912a() {
        this.f3515b = true;
        Map<String, Object> map = this.f3514a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f3514a.values().iterator();
                while (it.hasNext()) {
                    m3911b(it.next());
                }
            }
        }
        mo3674d();
    }

    /* renamed from: c */
    <T> T m3913c(String str) {
        T t;
        Map<String, Object> map = this.f3514a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f3514a.get(str);
        }
        return t;
    }

    /* renamed from: d */
    protected void mo3674d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    <T> T m3914e(String str, T t) throws IOException {
        Object obj;
        synchronized (this.f3514a) {
            obj = this.f3514a.get(str);
            if (obj == 0) {
                this.f3514a.put(str, t);
            }
        }
        if (obj != 0) {
            t = obj;
        }
        if (this.f3515b) {
            m3911b(t);
        }
        return t;
    }
}
