package io.sentry.util;

import io.sentry.C9517n1;
import io.sentry.InterfaceC9670w1;
import io.sentry.hints.EnumC9458h;
import io.sentry.hints.InterfaceC9453c;
import io.sentry.hints.InterfaceC9454d;
import io.sentry.hints.InterfaceC9456f;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: HintUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.m */
/* loaded from: classes2.dex */
public final class C9642m {

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$a */
    public interface a<T> {
        /* renamed from: a */
        void mo30156a(T t);
    }

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$b */
    public interface b {
        /* renamed from: a */
        void mo31660a(Object obj, Class<?> cls);
    }

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$c */
    public interface c<T> {
        /* renamed from: a */
        void mo31666a(T t);
    }

    /* renamed from: a */
    public static C9517n1 m31778a(Object obj) {
        C9517n1 c9517n1 = new C9517n1();
        m31793p(c9517n1, obj);
        return c9517n1;
    }

    /* renamed from: b */
    public static EnumC9458h m31779b(C9517n1 c9517n1) {
        return (EnumC9458h) c9517n1.m31074d("sentry:eventDropReason", EnumC9458h.class);
    }

    /* renamed from: c */
    public static Object m31780c(C9517n1 c9517n1) {
        return c9517n1.m31073c("sentry:typeCheckHint");
    }

    /* renamed from: d */
    public static boolean m31781d(C9517n1 c9517n1, Class<?> cls) {
        return cls.isInstance(m31780c(c9517n1));
    }

    /* renamed from: e */
    public static boolean m31782e(C9517n1 c9517n1) {
        return Boolean.TRUE.equals(c9517n1.m31074d("sentry:isFromHybridSdk", Boolean.class));
    }

    /* renamed from: f */
    static /* synthetic */ void m31783f(Object obj) {
    }

    /* renamed from: h */
    static /* synthetic */ void m31785h(Object obj, Class cls) {
    }

    /* renamed from: j */
    public static <T> void m31787j(C9517n1 c9517n1, Class<T> cls, final c<Object> cVar) {
        m31789l(c9517n1, cls, new a() { // from class: io.sentry.util.d
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                C9642m.m31783f(obj);
            }
        }, new b() { // from class: io.sentry.util.c
            @Override // io.sentry.util.C9642m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                cVar.mo31666a(obj);
            }
        });
    }

    /* renamed from: k */
    public static <T> void m31788k(C9517n1 c9517n1, Class<T> cls, a<T> aVar) {
        m31789l(c9517n1, cls, aVar, new b() { // from class: io.sentry.util.a
            @Override // io.sentry.util.C9642m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                C9642m.m31785h(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static <T> void m31789l(C9517n1 c9517n1, Class<T> cls, a<T> aVar, b bVar) {
        Object objM31780c = m31780c(c9517n1);
        if (!m31781d(c9517n1, cls) || objM31780c == null) {
            bVar.mo31660a(objM31780c, cls);
        } else {
            aVar.mo30156a(objM31780c);
        }
    }

    /* renamed from: m */
    public static <T> void m31790m(C9517n1 c9517n1, Class<T> cls, final InterfaceC9670w1 interfaceC9670w1, a<T> aVar) {
        m31789l(c9517n1, cls, aVar, new b() { // from class: io.sentry.util.b
            @Override // io.sentry.util.C9642m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                C9645p.m31799a(cls2, obj, interfaceC9670w1);
            }
        });
    }

    /* renamed from: n */
    public static void m31791n(C9517n1 c9517n1, EnumC9458h enumC9458h) {
        c9517n1.m31079j("sentry:eventDropReason", enumC9458h);
    }

    /* renamed from: o */
    public static void m31792o(C9517n1 c9517n1, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            c9517n1.m31079j("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    /* renamed from: p */
    public static void m31793p(C9517n1 c9517n1, Object obj) {
        c9517n1.m31079j("sentry:typeCheckHint", obj);
    }

    /* renamed from: q */
    public static boolean m31794q(C9517n1 c9517n1) {
        return !(m31781d(c9517n1, InterfaceC9456f.class) || m31781d(c9517n1, InterfaceC9454d.class)) || m31781d(c9517n1, InterfaceC9453c.class);
    }
}
