package cm.aptoide.p092pt.notification;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ContentPuller {
    private final Context context;

    public ContentPuller(Context context) {
        this.context = context;
    }

    public void start() {
        this.context.startService(new Intent(this.context, (Class<?>) PullingContentService.class));
    }
}
