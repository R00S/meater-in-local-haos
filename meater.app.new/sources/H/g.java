package H;

import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"LH/g;", "", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f5189a;

    /* compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"LH/g$a;", "", "<init>", "()V", "LH/g;", "b", "LH/g;", "a", "()LH/g;", "None", "c", "getCharacter", "Character", "d", "Word", "e", "Paragraph", "f", "getCharacterWithWordAccelerate", "CharacterWithWordAccelerate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5189a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final g None = new g() { // from class: H.f
        };

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final g Character = new g() { // from class: H.f
        };

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final g Word = new g() { // from class: H.f
        };

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final g Paragraph = new g() { // from class: H.f
        };

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final g CharacterWithWordAccelerate = new g() { // from class: H.f
        };

        private Companion() {
        }

        public final g a() {
            return None;
        }

        public final g b() {
            return Paragraph;
        }

        public final g c() {
            return Word;
        }
    }
}
