package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: AndroidTextStyle.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"LH0/y;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "LH0/g;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "(LH0/y;)LH0/y;", "a", "Z", "b", "()Z", "getIncludeFontPadding$annotations", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.y, reason: from toString */
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {

    /* renamed from: d, reason: collision with root package name */
    private static final PlatformParagraphStyle f5451d = new PlatformParagraphStyle();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeFontPadding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int emojiSupportMatch;

    public /* synthetic */ PlatformParagraphStyle(int i10, boolean z10, C3854k c3854k) {
        this(i10, z10);
    }

    /* renamed from: a, reason: from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final PlatformParagraphStyle c(PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && C1063g.g(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + C1063g.h(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) C1063g.i(this.emojiSupportMatch)) + ')';
    }

    public PlatformParagraphStyle(boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = C1063g.INSTANCE.b();
    }

    private PlatformParagraphStyle(int i10, boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = i10;
    }

    public PlatformParagraphStyle() {
        this(C1063g.INSTANCE.b(), false, null);
    }
}
