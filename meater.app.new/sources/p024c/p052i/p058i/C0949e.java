package p024c.p052i.p058i;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: c.i.i.e */
/* loaded from: classes.dex */
public final class C0949e {

    /* renamed from: a */
    public static final InterfaceC0948d f6392a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC0948d f6393b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC0948d f6394c;

    /* renamed from: d */
    public static final InterfaceC0948d f6395d;

    /* renamed from: e */
    public static final InterfaceC0948d f6396e;

    /* renamed from: f */
    public static final InterfaceC0948d f6397f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$a */
    private static class a implements c {

        /* renamed from: a */
        static final a f6398a = new a(true);

        /* renamed from: b */
        private final boolean f6399b;

        private a(boolean z) {
            this.f6399b = z;
        }

        @Override // p024c.p052i.p058i.C0949e.c
        /* renamed from: a */
        public int mo6049a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int iM6047a = C0949e.m6047a(Character.getDirectionality(charSequence.charAt(i2)));
                if (iM6047a != 0) {
                    if (iM6047a != 1) {
                        continue;
                        i2++;
                    } else if (!this.f6399b) {
                        return 1;
                    }
                } else if (this.f6399b) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.f6399b ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$b */
    private static class b implements c {

        /* renamed from: a */
        static final b f6400a = new b();

        private b() {
        }

        @Override // p024c.p052i.p058i.C0949e.c
        /* renamed from: a */
        public int mo6049a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int iM6048b = 2;
            while (i2 < i4 && iM6048b == 2) {
                iM6048b = C0949e.m6048b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return iM6048b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$c */
    private interface c {
        /* renamed from: a */
        int mo6049a(CharSequence charSequence, int i2, int i3);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$d */
    private static abstract class d implements InterfaceC0948d {

        /* renamed from: a */
        private final c f6401a;

        d(c cVar) {
            this.f6401a = cVar;
        }

        /* renamed from: c */
        private boolean m6050c(CharSequence charSequence, int i2, int i3) {
            int iMo6049a = this.f6401a.mo6049a(charSequence, i2, i3);
            if (iMo6049a == 0) {
                return true;
            }
            if (iMo6049a != 1) {
                return mo6051b();
            }
            return false;
        }

        @Override // p024c.p052i.p058i.InterfaceC0948d
        /* renamed from: a */
        public boolean mo6046a(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.f6401a == null ? mo6051b() : m6050c(charSequence, i2, i3);
        }

        /* renamed from: b */
        protected abstract boolean mo6051b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$e */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f6402b;

        e(c cVar, boolean z) {
            super(cVar);
            this.f6402b = z;
        }

        @Override // p024c.p052i.p058i.C0949e.d
        /* renamed from: b */
        protected boolean mo6051b() {
            return this.f6402b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.i.i.e$f */
    private static class f extends d {

        /* renamed from: b */
        static final f f6403b = new f();

        f() {
            super(null);
        }

        @Override // p024c.p052i.p058i.C0949e.d
        /* renamed from: b */
        protected boolean mo6051b() {
            return C0950f.m6053b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f6400a;
        f6394c = new e(bVar, false);
        f6395d = new e(bVar, true);
        f6396e = new e(a.f6398a, false);
        f6397f = f.f6403b;
    }

    /* renamed from: a */
    static int m6047a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m6048b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
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
