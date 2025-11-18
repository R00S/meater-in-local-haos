package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: MediaDescriptionCompatApi23.java */
/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
class C0009c {

    /* compiled from: MediaDescriptionCompatApi23.java */
    /* renamed from: android.support.v4.media.c$a */
    static class a {
        /* renamed from: a */
        public static void m45a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m44a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
