package O0;

import H0.AbstractC1064h;
import H0.C1060d;
import H0.UrlAnnotation;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: URLSpanCache.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"LO0/u;", "", "<init>", "()V", "LH0/M;", "urlAnnotation", "Landroid/text/style/URLSpan;", "c", "(LH0/M;)Landroid/text/style/URLSpan;", "LH0/d$c;", "LH0/h$b;", "urlRange", "b", "(LH0/d$c;)Landroid/text/style/URLSpan;", "LH0/h;", "linkRange", "Landroid/text/style/ClickableSpan;", "a", "(LH0/d$c;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "LO0/k;", "linkSpansWithListenerByAnnotation", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<C1060d.Range<AbstractC1064h.b>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<C1060d.Range<AbstractC1064h>, k> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan a(C1060d.Range<AbstractC1064h> linkRange) {
        WeakHashMap<C1060d.Range<AbstractC1064h>, k> weakHashMap = this.linkSpansWithListenerByAnnotation;
        k kVar = weakHashMap.get(linkRange);
        if (kVar == null) {
            kVar = new k(linkRange.g());
            weakHashMap.put(linkRange, kVar);
        }
        return kVar;
    }

    public final URLSpan b(C1060d.Range<AbstractC1064h.b> urlRange) {
        WeakHashMap<C1060d.Range<AbstractC1064h.b>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlRange.g().getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan c(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
