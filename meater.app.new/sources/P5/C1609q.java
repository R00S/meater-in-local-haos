package P5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import androidx.core.content.FileProvider;
import com.apptionlabs.meater_app.data.AsyncTaskCoroutine;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* compiled from: ImageGeneratorTask.java */
/* renamed from: P5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1609q extends AsyncTaskCoroutine<Bitmap, Uri> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f14058a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f14059b;

    /* renamed from: c, reason: collision with root package name */
    private final a f14060c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14061d;

    /* compiled from: ImageGeneratorTask.java */
    /* renamed from: P5.q$a */
    public interface a {
        void a(Uri uri);
    }

    public C1609q(Context context, View view, a aVar) {
        this(context, a(view), aVar);
    }

    private static Bitmap a(View view) {
        int height = view.getHeight();
        int width = view.getWidth();
        if (height <= 0) {
            height = 100;
        }
        if (width <= 0) {
            width = 100;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void b() {
        Bitmap bitmap = this.f14058a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f14058a.recycle();
    }

    private File e(Context context) {
        return new File(context.getCacheDir(), this.f14061d);
    }

    public void c() {
        Context context = this.f14059b.get();
        if (context != null) {
            File fileE = e(context);
            if (fileE.exists()) {
                fileE.delete();
            }
        }
    }

    @Override // com.apptionlabs.meater_app.data.AsyncTaskCoroutine
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Uri doInBackground(Bitmap... bitmapArr) {
        Context context = this.f14059b.get();
        if (context == null) {
            return null;
        }
        File fileE = e(context);
        try {
            this.f14058a.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(fileE));
            return FileProvider.h(context, "com.apptionlabs.meater_app", fileE);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.apptionlabs.meater_app.data.AsyncTaskCoroutine
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Uri uri) {
        super.onPostExecute(uri);
        b();
        if (uri == null) {
            return;
        }
        this.f14060c.a(uri);
    }

    @Override // com.apptionlabs.meater_app.data.AsyncTaskCoroutine
    public void onCancelled() {
        super.onCancelled();
        b();
        c();
    }

    @Override // com.apptionlabs.meater_app.data.AsyncTaskCoroutine
    public void onPreExecute() {
        super.onPreExecute();
    }

    public C1609q(Context context, Bitmap bitmap, a aVar) {
        this.f14061d = "image_" + System.currentTimeMillis() + ".png";
        this.f14059b = new WeakReference<>(context);
        this.f14060c = aVar;
        this.f14058a = bitmap;
    }
}
