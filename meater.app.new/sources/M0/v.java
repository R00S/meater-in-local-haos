package M0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: KeyboardCapitalization.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"LM0/v;", "", "", "value", "e", "(I)I", "", "h", "(I)Ljava/lang/String;", "g", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f11951b = e(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f11952c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f11953d = e(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f11954e = e(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f11955f = e(3);

    /* compiled from: KeyboardCapitalization.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"LM0/v$a;", "", "<init>", "()V", "LM0/v;", "None", "I", "b", "()I", "getNone-IUNYP9k$annotations", "Characters", "a", "getCharacters-IUNYP9k$annotations", "Words", "d", "getWords-IUNYP9k$annotations", "Sentences", "c", "getSentences-IUNYP9k$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: M0.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return v.f11953d;
        }

        public final int b() {
            return v.f11952c;
        }

        public final int c() {
            return v.f11955f;
        }

        public final int d() {
            return v.f11954e;
        }

        private Companion() {
        }
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f11951b) ? "Unspecified" : f(i10, f11952c) ? "None" : f(i10, f11953d) ? "Characters" : f(i10, f11954e) ? "Words" : f(i10, f11955f) ? "Sentences" : "Invalid";
    }

    private static int e(int i10) {
        return i10;
    }
}
