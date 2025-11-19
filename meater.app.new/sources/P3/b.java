package P3;

import L3.InterfaceC1358c;
import L3.u;
import X3.d;
import X3.j;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f13923d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f13924a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13925b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, u> f13926c;

    public b(Drawable.Callback callback, String str, InterfaceC1358c interfaceC1358c, Map<String, u> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f13925b = str;
        } else {
            this.f13925b = str + '/';
        }
        this.f13926c = map;
        d(interfaceC1358c);
        if (callback instanceof View) {
            this.f13924a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f13924a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f13923d) {
            this.f13926c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        u uVar = this.f13926c.get(str);
        if (uVar == null) {
            return null;
        }
        Bitmap bitmapB = uVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f13924a;
        if (context == null) {
            return null;
        }
        String strC = uVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                return c(str, j.l(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), uVar.f(), uVar.d()));
            } catch (IllegalArgumentException e10) {
                d.d("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f13925b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f13925b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, j.l(bitmapDecodeStream, uVar.f(), uVar.d()));
                }
                d.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e11) {
                d.d("Unable to decode image `" + str + "`.", e11);
                return null;
            }
        } catch (IOException e12) {
            d.d("Unable to open asset.", e12);
            return null;
        }
    }

    public boolean b(Context context) {
        if (this.f13924a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f13924a;
    }

    public void d(InterfaceC1358c interfaceC1358c) {
    }
}
