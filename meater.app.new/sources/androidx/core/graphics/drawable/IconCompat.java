package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import r1.C4337d;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f24728k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f24729a;

    /* renamed from: b, reason: collision with root package name */
    Object f24730b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f24731c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f24732d;

    /* renamed from: e, reason: collision with root package name */
    public int f24733e;

    /* renamed from: f, reason: collision with root package name */
    public int f24734f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f24735g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f24736h;

    /* renamed from: i, reason: collision with root package name */
    public String f24737i;

    /* renamed from: j, reason: collision with root package name */
    public String f24738j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f24729a) {
                case -1:
                    return (Icon) iconCompat.f24730b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f24730b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f24733e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f24730b, iconCompat.f24733e, iconCompat.f24734f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f24730b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f24730b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f24735g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f24736h;
            if (mode != IconCompat.f24728k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f24729a = -1;
        this.f24731c = null;
        this.f24732d = null;
        this.f24733e = 0;
        this.f24734f = 0;
        this.f24735g = null;
        this.f24736h = f24728k;
        this.f24737i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        C4337d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f24730b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Context context, int i10) {
        C4337d.c(context);
        return d(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        C4337d.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f24733e = i10;
        if (resources != null) {
            try {
                iconCompat.f24730b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f24730b = str;
        }
        iconCompat.f24738j = str;
        return iconCompat;
    }

    private static String p(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i10 = this.f24729a;
        if (i10 == -1) {
            Object obj = this.f24730b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f24730b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f24730b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i10 = this.f24729a;
        if (i10 == -1) {
            return a.a(this.f24730b);
        }
        if (i10 == 2) {
            return this.f24733e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i10 = this.f24729a;
        if (i10 == -1) {
            return a.b(this.f24730b);
        }
        if (i10 == 2) {
            String str = this.f24738j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f24730b).split(":", -1)[0] : this.f24738j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i10 = this.f24729a;
        return i10 == -1 ? a.c(this.f24730b) : i10;
    }

    public Uri i() {
        int i10 = this.f24729a;
        if (i10 == -1) {
            return a.d(this.f24730b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f24730b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f24730b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e11);
            return null;
        }
    }

    public void k() {
        this.f24736h = PorterDuff.Mode.valueOf(this.f24737i);
        switch (this.f24729a) {
            case -1:
                Parcelable parcelable = this.f24732d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f24730b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f24732d;
                if (parcelable2 != null) {
                    this.f24730b = parcelable2;
                    return;
                }
                byte[] bArr = this.f24731c;
                this.f24730b = bArr;
                this.f24729a = 3;
                this.f24733e = 0;
                this.f24734f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f24731c, Charset.forName("UTF-16"));
                this.f24730b = str;
                if (this.f24729a == 2 && this.f24738j == null) {
                    this.f24738j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f24730b = this.f24731c;
                return;
        }
    }

    public void l(boolean z10) {
        this.f24737i = this.f24736h.name();
        switch (this.f24729a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f24732d = (Parcelable) this.f24730b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f24732d = (Parcelable) this.f24730b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f24730b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f24731c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f24731c = ((String) this.f24730b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f24731c = (byte[]) this.f24730b;
                return;
            case 4:
            case 6:
                this.f24731c = this.f24730b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f24729a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f24730b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f24730b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f24730b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f24730b);
                break;
        }
        bundle.putInt("type", this.f24729a);
        bundle.putInt("int1", this.f24733e);
        bundle.putInt("int2", this.f24734f);
        bundle.putString("string1", this.f24738j);
        ColorStateList colorStateList = this.f24735g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f24736h;
        if (mode != f24728k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f24729a == -1) {
            return String.valueOf(this.f24730b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(p(this.f24729a));
        switch (this.f24729a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f24730b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f24730b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f24738j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f24733e);
                if (this.f24734f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f24734f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f24730b);
                break;
        }
        if (this.f24735g != null) {
            sb2.append(" tint=");
            sb2.append(this.f24735g);
        }
        if (this.f24736h != f24728k) {
            sb2.append(" mode=");
            sb2.append(this.f24736h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f24731c = null;
        this.f24732d = null;
        this.f24733e = 0;
        this.f24734f = 0;
        this.f24735g = null;
        this.f24736h = f24728k;
        this.f24737i = null;
        this.f24729a = i10;
    }
}
