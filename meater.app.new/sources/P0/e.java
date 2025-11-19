package P0;

import H0.L;
import H0.VerbatimTtsAnnotation;
import android.text.style.TtsSpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TtsAnnotationExtensions.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LH0/L;", "Landroid/text/style/TtsSpan;", "a", "(LH0/L;)Landroid/text/style/TtsSpan;", "LH0/N;", "b", "(LH0/N;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final TtsSpan a(L l10) {
        if (l10 instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) l10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
