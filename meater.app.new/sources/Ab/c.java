package Ab;

import Ab.d;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1106a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f1107b;

        static {
            d.a aVar = d.f1109c;
            f1107b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // Ab.c
        public int a() {
            return f1107b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1108a = new b();

        private b() {
        }

        @Override // Ab.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
