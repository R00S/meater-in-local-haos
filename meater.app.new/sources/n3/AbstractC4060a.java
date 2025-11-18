package n3;

import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.J;
import Xb.Z;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.f;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import o3.AbstractC4122n;
import o3.C4109a;
import o3.C4123o;
import o3.C4124p;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: MeasurementManagerFutures.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ln3/a;", "", "<init>", "()V", "Landroid/net/Uri;", "trigger", "Lcom/google/common/util/concurrent/f;", "Loa/F;", "c", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/f;", "", "b", "()Lcom/google/common/util/concurrent/f;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4060a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Ln3/a$a;", "Ln3/a;", "Lo3/n;", "mMeasurementManager", "<init>", "(Lo3/n;)V", "Lo3/a;", "deletionRequest", "Lcom/google/common/util/concurrent/f;", "Loa/F;", "e", "(Lo3/a;)Lcom/google/common/util/concurrent/f;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/f;", "trigger", "c", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/f;", "Lo3/o;", "request", "g", "(Lo3/o;)Lcom/google/common/util/concurrent/f;", "Lo3/p;", "h", "(Lo3/p;)Lcom/google/common/util/concurrent/f;", "", "b", "()Lcom/google/common/util/concurrent/f;", "Lo3/n;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n3.a$a, reason: collision with other inner class name */
    private static final class C0619a extends AbstractC4060a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC4122n mMeasurementManager;

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$a, reason: collision with other inner class name */
        static final class C0620a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45682B;

            C0620a(C4109a c4109a, InterfaceC4588d<? super C0620a> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new C0620a(null, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0620a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45682B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    this.f45682B = 1;
                    if (abstractC4122n.a(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "", "<anonymous>", "(LXb/I;)I"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$b */
        static final class b extends l implements p<I, InterfaceC4588d<? super Integer>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45684B;

            b(InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new b(interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super Integer> interfaceC4588d) {
                return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45684B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    this.f45684B = 1;
                    obj = abstractC4122n.b(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return obj;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$c */
        static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45686B;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Uri f45688D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InputEvent f45689E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, InterfaceC4588d<? super c> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f45688D = uri;
                this.f45689E = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new c(this.f45688D, this.f45689E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45686B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    Uri uri = this.f45688D;
                    InputEvent inputEvent = this.f45689E;
                    this.f45686B = 1;
                    if (abstractC4122n.c(uri, inputEvent, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$d */
        static final class d extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45690B;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Uri f45692D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, InterfaceC4588d<? super d> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f45692D = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new d(this.f45692D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45690B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    Uri uri = this.f45692D;
                    this.f45690B = 1;
                    if (abstractC4122n.d(uri, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$e */
        static final class e extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45693B;

            e(C4123o c4123o, InterfaceC4588d<? super e> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new e(null, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45693B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    this.f45693B = 1;
                    if (abstractC4122n.e(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n3.a$a$f */
        static final class f extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45695B;

            f(C4124p c4124p, InterfaceC4588d<? super f> interfaceC4588d) {
                super(2, interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return C0619a.this.new f(null, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f45695B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    AbstractC4122n abstractC4122n = C0619a.this.mMeasurementManager;
                    this.f45695B = 1;
                    if (abstractC4122n.f(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        public C0619a(AbstractC4122n mMeasurementManager) {
            C3862t.g(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // n3.AbstractC4060a
        public com.google.common.util.concurrent.f<Integer> b() {
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // n3.AbstractC4060a
        public com.google.common.util.concurrent.f<C4153F> c(Uri trigger) {
            C3862t.g(trigger, "trigger");
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new d(trigger, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.f<C4153F> e(C4109a deletionRequest) {
            C3862t.g(deletionRequest, "deletionRequest");
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new C0620a(deletionRequest, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.f<C4153F> f(Uri attributionSource, InputEvent inputEvent) {
            C3862t.g(attributionSource, "attributionSource");
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.f<C4153F> g(C4123o request) {
            C3862t.g(request, "request");
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new e(request, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.f<C4153F> h(C4124p request) {
            C3862t.g(request, "request");
            return m3.b.c(C1841i.b(J.a(Z.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln3/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ln3/a;", "a", "(Landroid/content/Context;)Ln3/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n3.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AbstractC4060a a(Context context) {
            C3862t.g(context, "context");
            AbstractC4122n abstractC4122nA = AbstractC4122n.INSTANCE.a(context);
            if (abstractC4122nA != null) {
                return new C0619a(abstractC4122nA);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AbstractC4060a a(Context context) {
        return INSTANCE.a(context);
    }

    public abstract f<Integer> b();

    public abstract f<C4153F> c(Uri trigger);
}
