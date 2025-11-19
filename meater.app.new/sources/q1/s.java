package q1;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f47791a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final r f47792b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final r f47793c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f47794d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f47795e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f47796f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f47797b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f47798a;

        private a(boolean z10) {
            this.f47798a = z10;
        }

        @Override // q1.s.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = s.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f47798a) {
                        return 1;
                    }
                } else if (this.f47798a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f47798a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f47799a = new b();

        private b() {
        }

        @Override // q1.s.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = s.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static abstract class d implements r {

        /* renamed from: a, reason: collision with root package name */
        private final c f47800a;

        d(c cVar) {
            this.f47800a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int iA = this.f47800a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // q1.r
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f47800a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f47801b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f47801b = z10;
        }

        @Override // q1.s.d
        protected boolean b() {
            return this.f47801b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f47802b = new f();

        f() {
            super(null);
        }

        @Override // q1.s.d
        protected boolean b() {
            return t.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f47799a;
        f47793c = new e(bVar, false);
        f47794d = new e(bVar, true);
        f47795e = new e(a.f47797b, false);
        f47796f = f.f47802b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
