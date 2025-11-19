package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

/* compiled from: AndroidUriHandler.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/U;", "Landroidx/compose/ui/platform/b1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "Loa/F;", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U implements b1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public U(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.b1
    public void a(String uri) {
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + uri + '.', e10);
        }
    }
}
