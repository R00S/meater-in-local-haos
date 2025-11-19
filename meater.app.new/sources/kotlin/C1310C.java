package kotlin;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LL0/C;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1310C f8942a = new C1310C();

    private C1310C() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1311D.f8943a.a(context);
        }
        return 0;
    }
}
