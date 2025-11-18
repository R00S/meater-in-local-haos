package kotlin;

import kotlin.Metadata;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"LL0/I;", "", "LL0/l;", "fontFamily", "b", "(LL0/l;)LL0/l;", "LL0/B;", "fontWeight", "a", "(LL0/B;)LL0/B;", "LL0/w;", "fontStyle", "c", "(I)I", "LL0/x;", "fontSynthesis", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1316I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f8949a;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LL0/I$a;", "", "<init>", "()V", "LL0/I;", "b", "LL0/I;", "a", "()LL0/I;", "Default", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.I$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8949a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC1316I Default = new C0175a();

        /* compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"L0/I$a$a", "LL0/I;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: L0.I$a$a, reason: collision with other inner class name */
        public static final class C0175a implements InterfaceC1316I {
            C0175a() {
            }
        }

        private Companion() {
        }

        public final InterfaceC1316I a() {
            return Default;
        }
    }

    default FontWeight a(FontWeight fontWeight) {
        return fontWeight;
    }

    default AbstractC1341l b(AbstractC1341l fontFamily) {
        return fontFamily;
    }

    default int c(int fontStyle) {
        return fontStyle;
    }

    default int d(int fontSynthesis) {
        return fontSynthesis;
    }
}
