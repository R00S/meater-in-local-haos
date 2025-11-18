package com.airbnb.lottie.p111r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C5183g;
import com.airbnb.lottie.InterfaceC5178b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* renamed from: com.airbnb.lottie.r.b */
/* loaded from: classes.dex */
public class C5228b {

    /* renamed from: a */
    private static final Object f12643a = new Object();

    /* renamed from: b */
    private final Context f12644b;

    /* renamed from: c */
    private String f12645c;

    /* renamed from: d */
    private InterfaceC5178b f12646d;

    /* renamed from: e */
    private final Map<String, C5183g> f12647e;

    public C5228b(Drawable.Callback callback, String str, InterfaceC5178b interfaceC5178b, Map<String, C5183g> map) {
        this.f12645c = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.f12645c.charAt(r4.length() - 1) != '/') {
                this.f12645c += '/';
            }
        }
        if (callback instanceof View) {
            this.f12644b = ((View) callback).getContext();
            this.f12647e = map;
            m9590e(interfaceC5178b);
        } else {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f12647e = new HashMap();
            this.f12644b = null;
        }
    }

    /* renamed from: c */
    private Bitmap m9586c(String str, Bitmap bitmap) {
        synchronized (f12643a) {
            this.f12647e.get(str).m9485d(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap m9587a(String str) {
        C5183g c5183g = this.f12647e.get(str);
        if (c5183g == null) {
            return null;
        }
        Bitmap bitmapM9482a = c5183g.m9482a();
        if (bitmapM9482a != null) {
            return bitmapM9482a;
        }
        InterfaceC5178b interfaceC5178b = this.f12646d;
        if (interfaceC5178b != null) {
            Bitmap bitmapM9390a = interfaceC5178b.m9390a(c5183g);
            if (bitmapM9390a != null) {
                m9586c(str, bitmapM9390a);
            }
            return bitmapM9390a;
        }
        String strM9483b = c5183g.m9483b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strM9483b.startsWith("data:") && strM9483b.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strM9483b.substring(strM9483b.indexOf(44) + 1), 0);
                return m9586c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e2) {
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f12645c)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            return m9586c(str, BitmapFactory.decodeStream(this.f12644b.getAssets().open(this.f12645c + strM9483b), null, options));
        } catch (IOException e3) {
            Log.w("LOTTIE", "Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m9588b(Context context) {
        return (context == null && this.f12644b == null) || this.f12644b.equals(context);
    }

    /* renamed from: d */
    public void m9589d() {
        synchronized (f12643a) {
            Iterator<Map.Entry<String, C5183g>> it = this.f12647e.entrySet().iterator();
            while (it.hasNext()) {
                C5183g value = it.next().getValue();
                Bitmap bitmapM9482a = value.m9482a();
                if (bitmapM9482a != null) {
                    bitmapM9482a.recycle();
                    value.m9485d(null);
                }
            }
        }
    }

    /* renamed from: e */
    public void m9590e(InterfaceC5178b interfaceC5178b) {
        this.f12646d = interfaceC5178b;
    }
}
