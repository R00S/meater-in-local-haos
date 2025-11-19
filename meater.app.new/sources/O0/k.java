package O0;

import H0.AbstractC1064h;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Metadata;

/* compiled from: URLSpanCache.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LO0/k;", "Landroid/text/style/ClickableSpan;", "LH0/h;", "link", "<init>", "(LH0/h;)V", "Landroid/view/View;", "widget", "Loa/F;", "onClick", "(Landroid/view/View;)V", "a", "LH0/h;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1064h link;

    public k(AbstractC1064h abstractC1064h) {
        this.link = abstractC1064h;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.link.a();
    }
}
