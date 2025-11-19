package n6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import m6.EnumC3966a;

/* compiled from: ThumbFetcher.java */
/* renamed from: n6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4068c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: B, reason: collision with root package name */
    private final Uri f45721B;

    /* renamed from: C, reason: collision with root package name */
    private final C4070e f45722C;

    /* renamed from: D, reason: collision with root package name */
    private InputStream f45723D;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: n6.c$a */
    static class a implements InterfaceC4069d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f45724b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f45725a;

        a(ContentResolver contentResolver) {
            this.f45725a = contentResolver;
        }

        @Override // n6.InterfaceC4069d
        public Cursor a(Uri uri) {
            return this.f45725a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f45724b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: n6.c$b */
    static class b implements InterfaceC4069d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f45726b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f45727a;

        b(ContentResolver contentResolver) {
            this.f45727a = contentResolver;
        }

        @Override // n6.InterfaceC4069d
        public Cursor a(Uri uri) {
            return this.f45727a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f45726b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C4068c(Uri uri, C4070e c4070e) {
        this.f45721B = uri;
        this.f45722C = c4070e;
    }

    private static C4068c c(Context context, Uri uri, InterfaceC4069d interfaceC4069d) {
        return new C4068c(uri, new C4070e(com.bumptech.glide.b.c(context).j().g(), interfaceC4069d, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static C4068c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static C4068c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f45722C.d(this.f45721B);
        int iA = inputStreamD != null ? this.f45722C.a(this.f45721B) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f45723D;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3966a d() {
        return EnumC3966a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f45723D = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
