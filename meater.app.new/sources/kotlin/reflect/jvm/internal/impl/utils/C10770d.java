package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.C10775u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: functions.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.d */
/* loaded from: classes3.dex */
public final class C10770d {

    /* renamed from: a */
    private static final Function1<Object, Object> f41414a = f.f41425f;

    /* renamed from: b */
    private static final Function1<Object, Boolean> f41415b = b.f41421f;

    /* renamed from: c */
    private static final Function1<Object, Object> f41416c = a.f41420f;

    /* renamed from: d */
    private static final Function1<Object, C10775u> f41417d = c.f41422f;

    /* renamed from: e */
    private static final Function2<Object, Object, C10775u> f41418e = d.f41423f;

    /* renamed from: f */
    private static final Function3<Object, Object, Object, C10775u> f41419f = e.f41424f;

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$a */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f */
        public static final a f41420f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$b */
    static final class b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: f */
        public static final b f41421f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$c */
    static final class c extends Lambda implements Function1<Object, C10775u> {

        /* renamed from: f */
        public static final c f41422f = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final void m38529b(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Object obj) {
            m38529b(obj);
            return C10775u.f41439a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$d */
    static final class d extends Lambda implements Function2<Object, Object, C10775u> {

        /* renamed from: f */
        public static final d f41423f = new d();

        d() {
            super(2);
        }

        /* renamed from: b */
        public final void m38530b(Object obj, Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C10775u invoke(Object obj, Object obj2) {
            m38530b(obj, obj2);
            return C10775u.f41439a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$e */
    static final class e extends Lambda implements Function3<Object, Object, Object, C10775u> {

        /* renamed from: f */
        public static final e f41424f = new e();

        e() {
            super(3);
        }

        /* renamed from: b */
        public final void m38531b(Object obj, Object obj2, Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C10775u mo26879d(Object obj, Object obj2, Object obj3) {
            m38531b(obj, obj2, obj3);
            return C10775u.f41439a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$f */
    static final class f extends Lambda implements Function1<Object, Object> {

        /* renamed from: f */
        public static final f f41425f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> Function1<T, Boolean> m38525a() {
        return (Function1<T, Boolean>) f41415b;
    }

    /* renamed from: b */
    public static final Function3<Object, Object, Object, C10775u> m38526b() {
        return f41419f;
    }
}
