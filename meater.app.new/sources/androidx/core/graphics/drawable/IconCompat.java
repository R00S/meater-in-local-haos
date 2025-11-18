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

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final PorterDuff.Mode f2224a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f2225b;

    /* renamed from: c */
    Object f2226c;

    /* renamed from: d */
    public byte[] f2227d;

    /* renamed from: e */
    public Parcelable f2228e;

    /* renamed from: f */
    public int f2229f;

    /* renamed from: g */
    public int f2230g;

    /* renamed from: h */
    public ColorStateList f2231h;

    /* renamed from: i */
    PorterDuff.Mode f2232i;

    /* renamed from: j */
    public String f2233j;

    /* renamed from: k */
    public String f2234k;

    public IconCompat() {
        this.f2225b = -1;
        this.f2227d = null;
        this.f2228e = null;
        this.f2229f = 0;
        this.f2230g = 0;
        this.f2231h = null;
        this.f2232i = f2224a;
        this.f2233j = null;
    }

    /* renamed from: a */
    static Bitmap m1786a(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static IconCompat m1787b(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2226c = bitmap;
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m1788c(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2229f = i2;
        if (resources != null) {
            try {
                iconCompat.f2226c = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2226c = str;
        }
        iconCompat.f2234k = str;
        return iconCompat;
    }

    /* renamed from: f */
    private static int m1789f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    /* renamed from: h */
    private static String m1790h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    /* renamed from: j */
    private static int m1791j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    /* renamed from: l */
    private static Uri m1792l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    /* renamed from: r */
    private static String m1793r(int i2) {
        switch (i2) {
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

    /* renamed from: d */
    public Bitmap m1794d() {
        int i2 = this.f2225b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2226c;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.f2226c;
        }
        if (i2 == 5) {
            return m1786a((Bitmap) this.f2226c, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: e */
    public int m1795e() {
        int i2 = this.f2225b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1789f((Icon) this.f2226c);
        }
        if (i2 == 2) {
            return this.f2229f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: g */
    public String m1796g() {
        int i2 = this.f2225b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1790h((Icon) this.f2226c);
        }
        if (i2 == 2) {
            return TextUtils.isEmpty(this.f2234k) ? ((String) this.f2226c).split(":", -1)[0] : this.f2234k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: i */
    public int m1797i() {
        int i2 = this.f2225b;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : m1791j((Icon) this.f2226c);
    }

    /* renamed from: k */
    public Uri m1798k() {
        int i2 = this.f2225b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1792l((Icon) this.f2226c);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f2226c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: m */
    public InputStream m1799m(Context context) {
        Uri uriM1798k = m1798k();
        String scheme = uriM1798k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM1798k);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM1798k, e2);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2226c));
        } catch (FileNotFoundException e3) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM1798k, e3);
            return null;
        }
    }

    /* renamed from: n */
    public void m1800n() {
        this.f2232i = PorterDuff.Mode.valueOf(this.f2233j);
        switch (this.f2225b) {
            case -1:
                Parcelable parcelable = this.f2228e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2226c = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2228e;
                if (parcelable2 != null) {
                    this.f2226c = parcelable2;
                    return;
                }
                byte[] bArr = this.f2227d;
                this.f2226c = bArr;
                this.f2225b = 3;
                this.f2229f = 0;
                this.f2230g = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2227d, Charset.forName("UTF-16"));
                this.f2226c = str;
                if (this.f2225b == 2 && this.f2234k == null) {
                    this.f2234k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2226c = this.f2227d;
                return;
        }
    }

    /* renamed from: o */
    public void m1801o(boolean z) {
        this.f2233j = this.f2232i.name();
        switch (this.f2225b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f2228e = (Parcelable) this.f2226c;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.f2228e = (Parcelable) this.f2226c;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2226c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2227d = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f2227d = ((String) this.f2226c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2227d = (byte[]) this.f2226c;
                return;
            case 4:
            case 6:
                this.f2227d = this.f2226c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    /* renamed from: p */
    public Icon m1802p() {
        return m1803q(null);
    }

    /* renamed from: q */
    public Icon m1803q(Context context) {
        Icon iconCreateWithBitmap;
        switch (this.f2225b) {
            case -1:
                return (Icon) this.f2226c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f2226c);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(m1796g(), this.f2229f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f2226c, this.f2229f, this.f2230g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f2226c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(m1786a((Bitmap) this.f2226c, false));
                    break;
                } else {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f2226c);
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(m1798k());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m1798k());
                    }
                    InputStream inputStreamM1799m = m1799m(context);
                    if (inputStreamM1799m == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m1798k());
                    }
                    if (i2 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m1786a(BitmapFactory.decodeStream(inputStreamM1799m), false));
                        break;
                    } else {
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamM1799m));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f2231h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2232i;
        if (mode != f2224a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public String toString() {
        if (this.f2225b == -1) {
            return String.valueOf(this.f2226c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1793r(this.f2225b));
        switch (this.f2225b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2226c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2226c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2234k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1795e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2229f);
                if (this.f2230g != 0) {
                    sb.append(" off=");
                    sb.append(this.f2230g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2226c);
                break;
        }
        if (this.f2231h != null) {
            sb.append(" tint=");
            sb.append(this.f2231h);
        }
        if (this.f2232i != f2224a) {
            sb.append(" mode=");
            sb.append(this.f2232i);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i2) {
        this.f2225b = -1;
        this.f2227d = null;
        this.f2228e = null;
        this.f2229f = 0;
        this.f2230g = 0;
        this.f2231h = null;
        this.f2232i = f2224a;
        this.f2233j = null;
        this.f2225b = i2;
    }
}
