package D9;

import K8.q;
import android.content.Context;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes2.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String a(T t10);
    }

    public static K8.c<?> b(String str, String str2) {
        return K8.c.l(f.a(str, str2), f.class);
    }

    public static K8.c<?> c(final String str, final a<Context> aVar) {
        return K8.c.m(f.class).b(q.l(Context.class)).f(new K8.g() { // from class: D9.g
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return h.d(str, aVar, dVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, K8.d dVar) {
        return f.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}
