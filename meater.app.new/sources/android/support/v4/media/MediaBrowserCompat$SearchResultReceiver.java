package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo5a(int i2, Bundle bundle) {
        Parcelable[] parcelableArray;
        MediaSessionCompat.m54a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
