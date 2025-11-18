package com.bumptech.glide.load.p127m.p128o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C5369e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ThumbnailStreamOpener.java */
/* renamed from: com.bumptech.glide.load.m.o.e */
/* loaded from: classes.dex */
class C5448e {

    /* renamed from: a */
    private static final C5444a f13598a = new C5444a();

    /* renamed from: b */
    private final C5444a f13599b;

    /* renamed from: c */
    private final InterfaceC5447d f13600c;

    /* renamed from: d */
    private final InterfaceC5410b f13601d;

    /* renamed from: e */
    private final ContentResolver f13602e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f13603f;

    C5448e(List<ImageHeaderParser> list, InterfaceC5447d interfaceC5447d, InterfaceC5410b interfaceC5410b, ContentResolver contentResolver) {
        this(list, f13598a, interfaceC5447d, interfaceC5410b, contentResolver);
    }

    /* renamed from: b */
    private String m10504b(Uri uri) {
        Cursor cursorMo10503a = this.f13600c.mo10503a(uri);
        if (cursorMo10503a != null) {
            try {
                if (cursorMo10503a.moveToFirst()) {
                    return cursorMo10503a.getString(0);
                }
            } finally {
                cursorMo10503a.close();
            }
        }
        if (cursorMo10503a != null) {
        }
        return null;
    }

    /* renamed from: c */
    private boolean m10505c(File file) {
        return this.f13599b.m10491a(file) && 0 < this.f13599b.m10493c(file);
    }

    /* renamed from: a */
    int m10506a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f13602e.openInputStream(uri);
                int iM10156a = C5369e.m10156a(this.f13603f, inputStreamOpenInputStream, this.f13601d);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM10156a;
            } catch (IOException | NullPointerException e2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused2) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public InputStream m10507d(Uri uri) throws FileNotFoundException {
        String strM10504b = m10504b(uri);
        if (TextUtils.isEmpty(strM10504b)) {
            return null;
        }
        File fileM10492b = this.f13599b.m10492b(strM10504b);
        if (!m10505c(fileM10492b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM10492b);
        try {
            return this.f13602e.openInputStream(uriFromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e2));
        }
    }

    C5448e(List<ImageHeaderParser> list, C5444a c5444a, InterfaceC5447d interfaceC5447d, InterfaceC5410b interfaceC5410b, ContentResolver contentResolver) {
        this.f13599b = c5444a;
        this.f13600c = interfaceC5447d;
        this.f13601d = interfaceC5410b;
        this.f13602e = contentResolver;
        this.f13603f = list;
    }
}
