package Ob;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13530a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13531b = new a();

        private a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final String f13532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            C3862t.g(error, "error");
            this.f13532b = error;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13533b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z10, C3854k c3854k) {
        this(z10);
    }

    public final boolean a() {
        return this.f13530a;
    }

    private g(boolean z10) {
        this.f13530a = z10;
    }
}
