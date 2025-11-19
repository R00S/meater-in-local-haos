package h;

import android.content.Context;
import android.content.Intent;
import g.C3369a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh/d;", "Lh/a;", "Landroid/content/Intent;", "Lg/a;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "d", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Lg/a;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3469d extends AbstractC3466a<Intent, C3369a> {
    @Override // h.AbstractC3466a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        C3862t.g(context, "context");
        C3862t.g(input, "input");
        return input;
    }

    @Override // h.AbstractC3466a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C3369a c(int resultCode, Intent intent) {
        return new C3369a(resultCode, intent);
    }
}
