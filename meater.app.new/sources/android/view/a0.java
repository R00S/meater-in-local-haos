package android.view;

import Q1.a;
import R1.g;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModelProvider.android.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0005\u0015\u0018\u001c\u001e!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0097\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006\""}, d2 = {"Landroidx/lifecycle/a0;", "", "LQ1/g;", "impl", "<init>", "(LQ1/g;)V", "Landroidx/lifecycle/b0;", "store", "Landroidx/lifecycle/a0$c;", "factory", "LQ1/a;", "defaultCreationExtras", "(Landroidx/lifecycle/b0;Landroidx/lifecycle/a0$c;LQ1/a;)V", "Landroidx/lifecycle/c0;", "owner", "(Landroidx/lifecycle/c0;)V", "(Landroidx/lifecycle/c0;Landroidx/lifecycle/a0$c;)V", "Landroidx/lifecycle/Y;", "T", "LIa/d;", "modelClass", "a", "(LIa/d;)Landroidx/lifecycle/Y;", "Ljava/lang/Class;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "", "key", "c", "(Ljava/lang/String;LIa/d;)Landroidx/lifecycle/Y;", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LQ1/g;", "e", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final a.b<String> f25927c = g.a.f14775a;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q1.g impl;

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/a0$b;", "", "<init>", "()V", "Landroidx/lifecycle/b0;", "store", "Landroidx/lifecycle/a0$c;", "factory", "LQ1/a;", "extras", "Landroidx/lifecycle/a0;", "a", "(Landroidx/lifecycle/b0;Landroidx/lifecycle/a0$c;LQ1/a;)Landroidx/lifecycle/a0;", "LQ1/a$b;", "", "VIEW_MODEL_KEY", "LQ1/a$b;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final a0 a(b0 store, c factory, Q1.a extras) {
            C3862t.g(store, "store");
            C3862t.g(factory, "factory");
            C3862t.g(extras, "extras");
            return new a0(store, factory, extras);
        }

        private Companion() {
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/a0$c;", "", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "LIa/d;", "b", "(LIa/d;LQ1/a;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f25934a;

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/a0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.a0$c$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f25934a = new Companion();

            private Companion() {
            }
        }

        default <T extends Y> T a(Class<T> modelClass) {
            C3862t.g(modelClass, "modelClass");
            return (T) g.f14774a.f();
        }

        default <T extends Y> T b(Ia.d<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            return (T) c(Aa.a.b(modelClass), extras);
        }

        default <T extends Y> T c(Class<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            return (T) a(modelClass);
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/a0$d;", "Landroidx/lifecycle/a0$c;", "<init>", "()V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "LIa/d;", "b", "(LIa/d;LQ1/a;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d implements c {

        /* renamed from: c, reason: collision with root package name */
        private static d f25936c;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: d, reason: collision with root package name */
        public static final a.b<String> f25937d = g.a.f14775a;

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/a0$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/a0$d;", "a", "()Landroidx/lifecycle/a0$d;", "getInstance$annotations", "instance", "LQ1/a$b;", "", "VIEW_MODEL_KEY", "LQ1/a$b;", "_instance", "Landroidx/lifecycle/a0$d;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.a0$d$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final d a() {
                if (d.f25936c == null) {
                    d.f25936c = new d();
                }
                d dVar = d.f25936c;
                C3862t.d(dVar);
                return dVar;
            }

            private Companion() {
            }
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T a(Class<T> modelClass) {
            C3862t.g(modelClass, "modelClass");
            return (T) R1.d.f14769a.a(modelClass);
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T b(Ia.d<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            return (T) c(Aa.a.b(modelClass), extras);
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T c(Class<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            return (T) a(modelClass);
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/a0$e;", "", "<init>", "()V", "Landroidx/lifecycle/Y;", "viewModel", "Loa/F;", "d", "(Landroidx/lifecycle/Y;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class e {
        public void d(Y viewModel) {
            C3862t.g(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(b0 store, c factory) {
        this(store, factory, null, 4, null);
        C3862t.g(store, "store");
        C3862t.g(factory, "factory");
    }

    public final <T extends Y> T a(Ia.d<T> modelClass) {
        C3862t.g(modelClass, "modelClass");
        return (T) Q1.g.b(this.impl, modelClass, null, 2, null);
    }

    public <T extends Y> T b(Class<T> modelClass) {
        C3862t.g(modelClass, "modelClass");
        return (T) a(Aa.a.e(modelClass));
    }

    public final <T extends Y> T c(String key, Ia.d<T> modelClass) {
        C3862t.g(key, "key");
        C3862t.g(modelClass, "modelClass");
        return (T) this.impl.a(modelClass, key);
    }

    public <T extends Y> T d(String key, Class<T> modelClass) {
        C3862t.g(key, "key");
        C3862t.g(modelClass, "modelClass");
        return (T) this.impl.a(Aa.a.e(modelClass), key);
    }

    /* compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/a0$a;", "Landroidx/lifecycle/a0$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "app", "h", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/Y;", "LQ1/a;", "extras", "c", "(Ljava/lang/Class;LQ1/a;)Landroidx/lifecycle/Y;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "e", "Landroid/app/Application;", "f", "b", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends d {

        /* renamed from: g, reason: collision with root package name */
        private static a f25930g;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: h, reason: collision with root package name */
        public static final a.b<Application> f25931h = new C0361a();

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/a0$a$a", "LQ1/a$b;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.a0$a$a, reason: collision with other inner class name */
        public static final class C0361a implements a.b<Application> {
            C0361a() {
            }
        }

        /* compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/a0$a$b;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/a0$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/a0$a;", "LQ1/a$b;", "APPLICATION_KEY", "LQ1/a$b;", "_instance", "Landroidx/lifecycle/a0$a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.a0$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final a a(Application application) {
                C3862t.g(application, "application");
                if (a.f25930g == null) {
                    a.f25930g = new a(application);
                }
                a aVar = a.f25930g;
                C3862t.d(aVar);
                return aVar;
            }

            private Companion() {
            }
        }

        private a(Application application, int i10) {
            this.application = application;
        }

        private final <T extends Y> T h(Class<T> modelClass, Application app) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!C2094b.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                C3862t.f(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
            }
        }

        @Override // androidx.lifecycle.a0.d, androidx.lifecycle.a0.c
        public <T extends Y> T a(Class<T> modelClass) {
            C3862t.g(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.a0.d, androidx.lifecycle.a0.c
        public <T extends Y> T c(Class<T> modelClass, Q1.a extras) {
            C3862t.g(modelClass, "modelClass");
            C3862t.g(extras, "extras");
            if (this.application != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f25931h);
            if (application != null) {
                return (T) h(modelClass, application);
            }
            if (C2094b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C3862t.g(application, "application");
        }
    }

    private a0(Q1.g gVar) {
        this.impl = gVar;
    }

    public /* synthetic */ a0(b0 b0Var, c cVar, Q1.a aVar, int i10, C3854k c3854k) {
        this(b0Var, cVar, (i10 & 4) != 0 ? a.C0211a.f14206b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(b0 store, c factory, Q1.a defaultCreationExtras) {
        this(new Q1.g(store, factory, defaultCreationExtras));
        C3862t.g(store, "store");
        C3862t.g(factory, "factory");
        C3862t.g(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(c0 owner) {
        C3862t.g(owner, "owner");
        b0 b0VarV = owner.v();
        g gVar = g.f14774a;
        this(b0VarV, gVar.d(owner), gVar.c(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(c0 owner, c factory) {
        this(owner.v(), factory, g.f14774a.c(owner));
        C3862t.g(owner, "owner");
        C3862t.g(factory, "factory");
    }
}
