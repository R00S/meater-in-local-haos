package l8;

/* compiled from: CharMatcher.java */
/* renamed from: l8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3911d implements n<Character> {

    /* compiled from: CharMatcher.java */
    /* renamed from: l8.d$a */
    static abstract class a extends AbstractC3911d {
        a() {
        }

        @Override // l8.n
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: l8.d$b */
    private static final class b extends a {

        /* renamed from: B, reason: collision with root package name */
        private final char f44430B;

        b(char c10) {
            this.f44430B = c10;
        }

        @Override // l8.AbstractC3911d
        public boolean e(char c10) {
            return c10 == this.f44430B;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC3911d.g(this.f44430B) + "')";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: l8.d$c */
    static abstract class c extends a {

        /* renamed from: B, reason: collision with root package name */
        private final String f44431B;

        c(String str) {
            this.f44431B = (String) m.l(str);
        }

        public final String toString() {
            return this.f44431B;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: l8.d$d, reason: collision with other inner class name */
    private static final class C0592d extends c {

        /* renamed from: C, reason: collision with root package name */
        static final AbstractC3911d f44432C = new C0592d();

        private C0592d() {
            super("CharMatcher.none()");
        }

        @Override // l8.AbstractC3911d
        public int c(CharSequence charSequence, int i10) {
            m.n(i10, charSequence.length());
            return -1;
        }

        @Override // l8.AbstractC3911d
        public boolean e(char c10) {
            return false;
        }
    }

    protected AbstractC3911d() {
    }

    public static AbstractC3911d d(char c10) {
        return new b(c10);
    }

    public static AbstractC3911d f() {
        return C0592d.f44432C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        m.n(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
