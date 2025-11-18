package I9;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.Metadata;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LI9/F;", "", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "Loa/F;", "a", "(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface F {
    void a(Messenger callback, ServiceConnection serviceConnection);
}
