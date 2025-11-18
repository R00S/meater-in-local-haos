package cm.aptoide.p092pt.networking.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.utils.AptoideUtils;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.EnumC5366b;
import com.bumptech.glide.load.engine.AbstractC5393j;
import com.bumptech.glide.load.p131o.p132c.C5486g;
import com.bumptech.glide.load.p131o.p132c.C5487h;
import com.bumptech.glide.load.p131o.p132c.C5488i;
import com.bumptech.glide.load.p131o.p132c.C5500u;
import com.bumptech.glide.load.p131o.p134e.C5509c;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.InterfaceFutureC5560c;
import com.bumptech.glide.p141p.p142l.AbstractC5575g;
import com.bumptech.glide.p141p.p142l.C5574f;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import p024c.p079s.p080a.C1002b;

/* loaded from: classes.dex */
public class ImageLoader {
    private static final String TAG = "cm.aptoide.pt.networking.image.ImageLoader";
    private final Resources resources;
    private final WeakReference<Context> weakContext;
    private final WindowManager windowManager;

    private ImageLoader(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.resources = context.getResources();
        this.windowManager = (WindowManager) context.getSystemService("window");
    }

    public static void cancel(Context context, View view) {
        ComponentCallbacks2C5349c.m9978t(context).m10035d(view);
    }

    private int getAttrColor(int i2) {
        if (this.weakContext.get() == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        this.weakContext.get().getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }

    private int getAttrDrawable(int i2) {
        if (this.weakContext.get() == null) {
            return C1146R.drawable.placeholder_square;
        }
        TypedValue typedValue = new TypedValue();
        this.weakContext.get().getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    @SuppressLint({"CheckResult"})
    private C5565h getRequestOptions() {
        EnumC5366b enumC5366b;
        C5565h c5565h = new C5565h();
        if (Build.VERSION.SDK_INT >= 26) {
            enumC5366b = EnumC5366b.PREFER_ARGB_8888;
            c5565h.m10896h();
        } else {
            enumC5366b = EnumC5366b.PREFER_RGB_565;
        }
        return c5565h.m10901k(enumC5366b).m10898i(AbstractC5393j.f13397d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadWithPalettePlaceholder$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8307a(String str, int i2, ImageView imageView, C1002b c1002b) {
        loadWithColorPlaceholder(str, c1002b.m6412f(i2), imageView);
    }

    public static ImageLoader with(Context context) {
        return new ImageLoader(context);
    }

    public InterfaceC5577i<Drawable> load(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10041j(Integer.valueOf(i2)).mo10026b(getRequestOptions()).m10017D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public Bitmap loadBitmap(String str) {
        Context context = this.weakContext.get();
        if (context == null) {
            Log.e(TAG, "::loadBitmap() Context is null");
            return null;
        }
        try {
            return ComponentCallbacks2C5349c.m9978t(context).m10033b().m10022K0(str).m10023O0().get();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return null;
        } catch (ExecutionException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public C5574f loadImageToNotification(C5574f c5574f, String str) {
        Context context = this.weakContext.get();
        if (context != null) {
            return (C5574f) ComponentCallbacks2C5349c.m9978t(context.getApplicationContext()).m10033b().m10022K0(str).mo10026b(getRequestOptions()).m10015A0(c5574f);
        }
        Log.e(TAG, "::loadImageToNotification() Context is null");
        return c5574f;
    }

    public void loadIntoTarget(String str, AbstractC5575g<Drawable> abstractC5575g) {
        Context context = this.weakContext.get();
        if (context != null) {
            ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions()).m10025Q0(C5509c.m10710j()).m10015A0(abstractC5575g);
        }
    }

    public InterfaceC5577i<Drawable> loadScreenshotToThumb(String str, String str2, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(AptoideUtils.IconSizeU.screenshotToThumb(str, str2, this.windowManager, this.resources)).mo10026b(getRequestOptions().m10889Z(getAttrDrawable(i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadScreenshotToThumb() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadUsingCircleTransform(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10041j(Integer.valueOf(i2)).mo10026b(getRequestOptions().m10904l0(new C5488i())).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadUsingCircleTransformAndPlaceholder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new C5488i()).m10889Z(i2)).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransformAndPlaceholder() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithCircleTransformAndPlaceHolder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new C5488i()).m10889Z(i2)).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithCircleTransformAndPlaceHolder() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithCircleTransformAndPlaceHolderAvatarSize(String str, ImageView imageView, int i2) {
        return loadWithCircleTransformAndPlaceHolder(AptoideUtils.IconSizeU.generateStringAvatar(str, this.resources, this.windowManager), imageView, i2);
    }

    public InterfaceC5577i<Drawable> loadWithColorAttrPlaceholder(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10890a0(new ColorDrawable(getAttrColor(i2)))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithColorPlaceholder(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10890a0(new ColorDrawable(i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithColorPlaceholderRoundCorners(String str, int i2, ImageView imageView, int i3, InterfaceC5564g<Drawable> interfaceC5564g) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10893e().m10890a0(new ColorDrawable(getAttrColor(i3))).m10913q0(new C5486g(), new C5500u(i2))).m10018F0(interfaceC5564g).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        return null;
    }

    public void loadWithPalettePlaceholder(final String str, BitmapDrawable bitmapDrawable, final int i2, final ImageView imageView) {
        C1002b.m6406b(bitmapDrawable.getBitmap()).m6421d(6).m6419a(new C1002b.d() { // from class: cm.aptoide.pt.networking.image.a
            @Override // p024c.p079s.p080a.C1002b.d
            /* renamed from: a */
            public final void mo6424a(C1002b c1002b) {
                this.f10321a.m8307a(str, i2, imageView, c1002b);
            }
        });
    }

    public void loadWithRoundCorners(String str, int i2, ImageView imageView, int i3) {
        Context context = this.weakContext.get();
        if (context != null) {
            ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10893e().m10889Z(getAttrDrawable(i3)).m10913q0(new C5487h(), new C5500u(i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, imageView))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context)).m10889Z(i2)).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public static <R> void cancel(Context context, InterfaceFutureC5560c<R> interfaceFutureC5560c) {
        ComponentCallbacks2C5349c.m9978t(context).m10036e(interfaceFutureC5560c);
    }

    public static <R> void cancel(Context context, InterfaceC5577i<R> interfaceC5577i) {
        ComponentCallbacks2C5349c.m9978t(context).m10036e(interfaceC5577i);
    }

    public InterfaceC5577i<Drawable> load(String str, int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10889Z(getAttrDrawable(i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadUsingCircleTransform(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new C5488i())).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadUsingCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i2, float f2, float f3) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, imageView, i2, f2, f3))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithRoundCorners(String str, int i2, ImageView imageView, int i3, InterfaceC5564g<Drawable> interfaceC5564g) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(str).mo10026b(getRequestOptions().m10893e().m10889Z(getAttrDrawable(i3)).m10913q0(new C5486g(), new C5500u(i2))).m10018F0(interfaceC5564g).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransformWithPlaceholder(String str, ImageView imageView, float f2, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, imageView, f2)).m10889Z(getAttrDrawable(i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> load(String str, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            String newImageUrl = AptoideUtils.IconSizeU.getNewImageUrl(str, this.resources, this.windowManager);
            if (newImageUrl != null) {
                return ComponentCallbacks2C5349c.m9978t(context).m10040i(Uri.parse(newImageUrl)).mo10026b(getRequestOptions()).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
            }
            Log.e(TAG, "newImageUrl is null");
            return null;
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransform(int i2, ImageView imageView) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10041j(Integer.valueOf(i2)).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, imageView))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransform(String str, ImageView imageView, int i2) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10042k(AptoideUtils.IconSizeU.generateSizeStoreString(str, this.resources, this.windowManager)).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, (View) imageView, i2))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Drawable load(int i2) {
        if (i2 == 0) {
            return null;
        }
        Context context = this.weakContext.get();
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return context.getResources().getDrawable(i2, context.getTheme());
            }
            return context.getResources().getDrawable(i2);
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }

    public InterfaceC5577i<Drawable> loadWithShadowCircleTransform(int i2, ImageView imageView, int i3) {
        Context context = this.weakContext.get();
        if (context != null) {
            return ComponentCallbacks2C5349c.m9978t(context).m10041j(Integer.valueOf(i2)).mo10026b(getRequestOptions().m10904l0(new ShadowCircleTransformation(context, (View) imageView, i3))).m10025Q0(C5509c.m10710j()).m10017D0(imageView);
        }
        Log.e(TAG, "::loadWithShadowCircleTransform() Context is null");
        return null;
    }

    public Bitmap load(String str) {
        Context context = this.weakContext.get();
        if (context != null) {
            try {
                return ComponentCallbacks2C5349c.m9978t(context).m10033b().m10022K0(str).m10023O0().get();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                return null;
            } catch (ExecutionException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        Log.e(TAG, "::load() Context is null");
        return null;
    }
}
