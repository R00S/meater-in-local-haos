package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {

    /* renamed from: i */
    private final Bundle f2i;

    /* renamed from: j */
    private final AbstractC0007a f3j;

    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo5a(int i2, Bundle bundle) {
        if (this.f3j == null) {
            return;
        }
        MediaSessionCompat.m54a(bundle);
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            throw null;
        }
        Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.f2i + ", resultData=" + bundle + ")");
    }
}
