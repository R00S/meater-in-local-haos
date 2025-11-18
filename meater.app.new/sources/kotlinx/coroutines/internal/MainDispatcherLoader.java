package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okhttp3.HttpUrl;
import p000.C0000a;

/* compiled from: MainDispatchers.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FAST_SERVICE_LOADER_ENABLED", HttpUrl.FRAGMENT_ENCODE_SET, "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.v, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class MainDispatcherLoader {

    /* renamed from: a */
    public static final MainDispatcherLoader f41830a;

    /* renamed from: b */
    private static final boolean f41831b;

    /* renamed from: c */
    public static final MainCoroutineDispatcher f41832c;

    static {
        MainDispatcherLoader mainDispatcherLoader = new MainDispatcherLoader();
        f41830a = mainDispatcherLoader;
        f41831b = C10980f0.m39470e("kotlinx.coroutines.fast.service.loader", true);
        f41832c = mainDispatcherLoader.m39582a();
    }

    private MainDispatcherLoader() {
    }

    /* renamed from: a */
    private final MainCoroutineDispatcher m39582a() {
        Object next;
        MainCoroutineDispatcher mainCoroutineDispatcherM39587e;
        try {
            List<MainDispatcherFactory> listM39525c = f41831b ? FastServiceLoader.f41799a.m39525c() : C10522n.m37377A(C10520l.m37368a(C0000a.m1b()));
            Iterator<T> it = listM39525c.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (mainCoroutineDispatcherM39587e = C11004w.m39587e(mainDispatcherFactory, listM39525c)) == null) ? C11004w.m39584b(null, null, 3, null) : mainCoroutineDispatcherM39587e;
        } catch (Throwable th) {
            return C11004w.m39584b(th, null, 2, null);
        }
    }
}
