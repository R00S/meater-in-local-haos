package x4;

import android.content.Context;
import android.content.Intent;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x4.b;

/* compiled from: MeaterLinkServiceBridge.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lx4/i;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Loa/F;", "a", "()V", "b", "Landroid/content/Context;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public i(Context context) {
        C3862t.g(context, "context");
        this.context = context;
    }

    public final void a() {
        if (g.y()) {
            try {
                if (MeaterLinkService.e() == null) {
                    this.context.startService(new Intent(this.context, (Class<?>) MeaterLinkService.class));
                }
            } catch (Exception unused) {
                b.k(b.EnumC0768b.f52668Q1, b.a.f52616N, b.c.f52761M, null, 8, null);
            }
        }
    }

    public final void b() {
        try {
            this.context.stopService(new Intent(this.context, (Class<?>) MeaterLinkService.class));
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }
}
