package androidx.datastore.core;

import java.util.List;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: DataMigrationInitializer.kt */
/* renamed from: androidx.datastore.core.d */
/* loaded from: classes.dex */
public final class C0339d<T> {

    /* renamed from: a */
    public static final a f2526a = new a(null);

    /* compiled from: DataMigrationInitializer.kt */
    /* renamed from: androidx.datastore.core.d$a */
    public static final class a {

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(m39049c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m39050f = "DataMigrationInitializer.kt", m39051l = {33}, m39052m = "invokeSuspend")
        /* renamed from: androidx.datastore.core.d$a$a, reason: collision with other inner class name */
        static final class C11434a extends SuspendLambda implements Function2<InterfaceC0343h<T>, Continuation<? super C10775u>, Object> {

            /* renamed from: f */
            int f2527f;

            /* renamed from: g */
            /* synthetic */ Object f2528g;

            /* renamed from: h */
            final /* synthetic */ List<InterfaceC0338c<T>> f2529h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11434a(List<? extends InterfaceC0338c<T>> list, Continuation<? super C11434a> continuation) {
                super(2, continuation);
                this.f2529h = list;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
                C11434a c11434a = new C11434a(this.f2529h, continuation);
                c11434a.f2528g = obj;
                return c11434a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0343h<T> interfaceC0343h, Continuation<? super C10775u> continuation) {
                return ((C11434a) create(interfaceC0343h, continuation)).invokeSuspend(C10775u.f41439a);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM39045c = C10855d.m39045c();
                int i2 = this.f2527f;
                if (i2 == 0) {
                    C10568o.m37655b(obj);
                    InterfaceC0343h interfaceC0343h = (InterfaceC0343h) this.f2528g;
                    a aVar = C0339d.f2526a;
                    List<InterfaceC0338c<T>> list = this.f2529h;
                    this.f2527f = 1;
                    if (aVar.m2353c(list, interfaceC0343h, this) == objM39045c) {
                        return objM39045c;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C10568o.m37655b(obj);
                }
                return C10775u.f41439a;
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(m39049c = "androidx.datastore.core.DataMigrationInitializer$Companion", m39050f = "DataMigrationInitializer.kt", m39051l = {42, 57}, m39052m = "runMigrations")
        /* renamed from: androidx.datastore.core.d$a$b */
        static final class b<T> extends ContinuationImpl {

            /* renamed from: f */
            Object f2530f;

            /* renamed from: g */
            Object f2531g;

            /* renamed from: h */
            /* synthetic */ Object f2532h;

            /* renamed from: j */
            int f2534j;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f2532h = obj;
                this.f2534j |= Integer.MIN_VALUE;
                return a.this.m2353c(null, null, this);
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(m39049c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m39050f = "DataMigrationInitializer.kt", m39051l = {44, 46}, m39052m = "invokeSuspend")
        /* renamed from: androidx.datastore.core.d$a$c */
        static final class c extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {

            /* renamed from: f */
            Object f2535f;

            /* renamed from: g */
            Object f2536g;

            /* renamed from: h */
            Object f2537h;

            /* renamed from: i */
            int f2538i;

            /* renamed from: j */
            /* synthetic */ Object f2539j;

            /* renamed from: k */
            final /* synthetic */ List<InterfaceC0338c<T>> f2540k;

            /* renamed from: l */
            final /* synthetic */ List<Function1<Continuation<? super C10775u>, Object>> f2541l;

            /* compiled from: DataMigrationInitializer.kt */
            @DebugMetadata(m39049c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m39050f = "DataMigrationInitializer.kt", m39051l = {45}, m39052m = "invokeSuspend")
            /* renamed from: androidx.datastore.core.d$a$c$a, reason: collision with other inner class name */
            static final class C11435a extends SuspendLambda implements Function1<Continuation<? super C10775u>, Object> {

                /* renamed from: f */
                int f2542f;

                /* renamed from: g */
                final /* synthetic */ InterfaceC0338c<T> f2543g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11435a(InterfaceC0338c<T> interfaceC0338c, Continuation<? super C11435a> continuation) {
                    super(1, continuation);
                    this.f2543g = interfaceC0338c;
                }

                @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
                public final Continuation<C10775u> create(Continuation<?> continuation) {
                    return new C11435a(this.f2543g, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation<? super C10775u> continuation) {
                    return ((C11435a) create(continuation)).invokeSuspend(C10775u.f41439a);
                }

                @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM39045c = C10855d.m39045c();
                    int i2 = this.f2542f;
                    if (i2 == 0) {
                        C10568o.m37655b(obj);
                        InterfaceC0338c<T> interfaceC0338c = this.f2543g;
                        this.f2542f = 1;
                        if (interfaceC0338c.m2349a(this) == objM39045c) {
                            return objM39045c;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C10568o.m37655b(obj);
                    }
                    return C10775u.f41439a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends InterfaceC0338c<T>> list, List<Function1<Continuation<? super C10775u>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f2540k = list;
                this.f2541l = list2;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f2540k, this.f2541l, continuation);
                cVar.f2539j = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t, Continuation<? super T> continuation) {
                return ((c) create(t, continuation)).invokeSuspend(C10775u.f41439a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                    int r1 = r10.f2538i
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f2535f
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f2539j
                    java.util.List r4 = (java.util.List) r4
                    kotlin.C10568o.m37655b(r11)
                    r7 = r10
                    goto L8c
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f2537h
                    java.lang.Object r4 = r10.f2536g
                    androidx.datastore.core.c r4 = (androidx.datastore.core.InterfaceC0338c) r4
                    java.lang.Object r5 = r10.f2535f
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f2539j
                    java.util.List r6 = (java.util.List) r6
                    kotlin.C10568o.m37655b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6a
                L3a:
                    kotlin.C10568o.m37655b(r11)
                    java.lang.Object r11 = r10.f2539j
                    java.util.List<androidx.datastore.core.c<T>> r1 = r10.f2540k
                    java.util.List<kotlin.a0.c.l<kotlin.y.d<? super kotlin.u>, java.lang.Object>> r4 = r10.f2541l
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L48:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L91
                    java.lang.Object r6 = r1.next()
                    androidx.datastore.core.c r6 = (androidx.datastore.core.InterfaceC0338c) r6
                    r5.f2539j = r4
                    r5.f2535f = r1
                    r5.f2536g = r6
                    r5.f2537h = r11
                    r5.f2538i = r3
                    java.lang.Object r7 = r6.m2350b(r11, r5)
                    if (r7 != r0) goto L65
                    return r0
                L65:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8e
                    androidx.datastore.core.d$a$c$a r11 = new androidx.datastore.core.d$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f2539j = r4
                    r7.f2535f = r5
                    r7.f2536g = r8
                    r7.f2537h = r8
                    r7.f2538i = r2
                    java.lang.Object r11 = r6.m2351c(r1, r7)
                    if (r11 != r0) goto L8f
                    return r0
                L8c:
                    r5 = r7
                    goto L48
                L8e:
                    r11 = r1
                L8f:
                    r1 = r5
                    goto L8c
                L91:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0339d.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object m2353c(java.util.List<? extends androidx.datastore.core.InterfaceC0338c<T>> r7, androidx.datastore.core.InterfaceC0343h<T> r8, kotlin.coroutines.Continuation<? super kotlin.C10775u> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.datastore.core.C0339d.a.b
                if (r0 == 0) goto L13
                r0 = r9
                androidx.datastore.core.d$a$b r0 = (androidx.datastore.core.C0339d.a.b) r0
                int r1 = r0.f2534j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2534j = r1
                goto L18
            L13:
                androidx.datastore.core.d$a$b r0 = new androidx.datastore.core.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f2532h
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r2 = r0.f2534j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f2531g
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2530f
                kotlin.a0.d.f0 r8 = (kotlin.jvm.internal.C9788f0) r8
                kotlin.C10568o.m37655b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f2530f
                java.util.List r7 = (java.util.List) r7
                kotlin.C10568o.m37655b(r9)
                goto L60
            L46:
                kotlin.C10568o.m37655b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.d$a$c r2 = new androidx.datastore.core.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2530f = r9
                r0.f2534j = r4
                java.lang.Object r7 = r8.mo2362a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.a0.d.f0 r8 = new kotlin.a0.d.f0
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                kotlin.a0.c.l r9 = (kotlin.jvm.functions.Function1) r9
                r0.f2530f = r8     // Catch: java.lang.Throwable -> L34
                r0.f2531g = r7     // Catch: java.lang.Throwable -> L34
                r0.f2534j = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                T r2 = r8.f37179f
                if (r2 != 0) goto L89
                r8.f37179f = r9
                goto L69
            L89:
                kotlin.jvm.internal.C9801m.m32343c(r2)
                T r2 = r8.f37179f
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.C9751a.m32273a(r2, r9)
                goto L69
            L94:
                T r7 = r8.f37179f
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                kotlin.u r7 = kotlin.C10775u.f41439a
                return r7
            L9d:
                goto L9f
            L9e:
                throw r7
            L9f:
                goto L9e
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0339d.a.m2353c(java.util.List, androidx.datastore.core.h, kotlin.y.d):java.lang.Object");
        }

        /* renamed from: b */
        public final <T> Function2<InterfaceC0343h<T>, Continuation<? super C10775u>, Object> m2354b(List<? extends InterfaceC0338c<T>> list) {
            C9801m.m32346f(list, "migrations");
            return new C11434a(list, null);
        }
    }
}
