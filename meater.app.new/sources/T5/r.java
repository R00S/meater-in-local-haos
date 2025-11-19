package T5;

import P5.C1609q;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.C2094b;
import android.view.View;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;

/* compiled from: TemperatureGraphViewModel.java */
/* loaded from: classes2.dex */
public class r extends C2094b {

    /* renamed from: e, reason: collision with root package name */
    public static int f16148e;

    /* renamed from: c, reason: collision with root package name */
    private Uri f16149c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<String> f16150d;

    /* compiled from: TemperatureGraphViewModel.java */
    public enum a {
        Graph,
        TakePhoto,
        ChoosePhoto
    }

    public r(Application application) {
        super(application);
        this.f16150d = new ArrayList<>();
    }

    public void i() {
        for (int i10 = 0; i10 < this.f16150d.size(); i10++) {
            File file = new File(this.f16150d.get(i10));
            if (file.exists() && file.delete()) {
                System.out.println("file deleted");
            }
        }
    }

    public void j(View view, C1609q.a aVar) {
        new C1609q(h(), view, aVar).execute(new Bitmap[0]);
    }

    public Intent k() {
        f16148e++;
        n(o());
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.f16149c);
        if (intent.resolveActivity(h().getPackageManager()) != null) {
            return intent;
        }
        return null;
    }

    public Intent l() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        if (intent.resolveActivity(h().getPackageManager()) != null) {
            return intent;
        }
        return null;
    }

    public Uri m() {
        return this.f16149c;
    }

    public void n(Uri uri) {
        this.f16149c = uri;
    }

    public Uri o() {
        File file = new File(h().getCacheDir(), "current_photo" + f16148e + ".png");
        this.f16150d.add(file.getAbsolutePath());
        return FileProvider.h(h(), "com.apptionlabs.meater_app", file);
    }
}
