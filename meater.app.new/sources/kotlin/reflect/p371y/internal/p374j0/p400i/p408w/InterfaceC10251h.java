package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.h */
/* loaded from: classes3.dex */
public interface InterfaceC10251h extends InterfaceC10254k {

    /* renamed from: a */
    public static final a f39667a = a.f39668a;

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.h$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f39668a = new a();

        /* renamed from: b */
        private static final Function1<C10163f, Boolean> f39669b = C11563a.f39670f;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.w.h$a$a, reason: collision with other inner class name */
        static final class C11563a extends Lambda implements Function1<C10163f, Boolean> {

            /* renamed from: f */
            public static final C11563a f39670f = new C11563a();

            C11563a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C10163f c10163f) {
                C9801m.m32346f(c10163f, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final Function1<C10163f, Boolean> m36159a() {
            return f39669b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.h$b */
    public static final class b extends AbstractC10252i {

        /* renamed from: b */
        public static final b f39671b = new b();

        private b() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: b */
        public Set<C10163f> mo33312b() {
            return C10822w0.m38917d();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: d */
        public Set<C10163f> mo33314d() {
            return C10822w0.m38917d();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
        /* renamed from: e */
        public Set<C10163f> mo33315e() {
            return C10822w0.m38917d();
        }
    }

    /* renamed from: a */
    Collection<? extends InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b);

    /* renamed from: b */
    Set<C10163f> mo33312b();

    /* renamed from: c */
    Collection<? extends InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b);

    /* renamed from: d */
    Set<C10163f> mo33314d();

    /* renamed from: e */
    Set<C10163f> mo33315e();
}
