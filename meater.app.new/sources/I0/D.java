package I0;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import oa.C4170o;

/* compiled from: LayoutIntrinsics.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "c", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "desiredWidth", "charSequence", "textPaint", "", "e", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new C1185w(charSequence, 0, charSequence.length()));
        PriorityQueue<C4170o> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: I0.C
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return D.d((C4170o) obj, (C4170o) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C4170o(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                C4170o c4170o = (C4170o) priorityQueue.peek();
                if (c4170o != null && ((Number) c4170o.d()).intValue() - ((Number) c4170o.c()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new C4170o(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (C4170o c4170o2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) c4170o2.a()).intValue(), ((Number) c4170o2.b()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C4170o c4170o, C4170o c4170o2) {
        return (((Number) c4170o.d()).intValue() - ((Number) c4170o.c()).intValue()) - (((Number) c4170o2.d()).intValue() - ((Number) c4170o2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!H.a(spanned, J0.f.class) && !H.a(spanned, J0.e.class)) {
                }
                return true;
            }
            if (textPaint.getLetterSpacing() != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
