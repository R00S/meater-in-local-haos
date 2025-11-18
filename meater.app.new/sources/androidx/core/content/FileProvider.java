package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: f */
    private static final String[] f2184f = {"_display_name", "_size"};

    /* renamed from: g */
    private static final File f2185g = new File("/");

    /* renamed from: h */
    private static HashMap<String, InterfaceC0253a> f2186h = new HashMap<>();

    /* renamed from: i */
    private InterfaceC0253a f2187i;

    /* renamed from: androidx.core.content.FileProvider$a */
    interface InterfaceC0253a {
        /* renamed from: a */
        File mo1669a(Uri uri);

        /* renamed from: b */
        Uri mo1670b(File file);
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    static class C0254b implements InterfaceC0253a {

        /* renamed from: a */
        private final String f2188a;

        /* renamed from: b */
        private final HashMap<String, File> f2189b = new HashMap<>();

        C0254b(String str) {
            this.f2188a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0253a
        /* renamed from: a */
        public File mo1669a(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f2189b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC0253a
        /* renamed from: b */
        public Uri mo1670b(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2189b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f2188a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: c */
        void m1671c(String str, File file) throws IOException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f2189b.put(str, file.getCanonicalFile());
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
            }
        }
    }

    /* renamed from: a */
    private static File m1662a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    private static Object[] m1663b(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    /* renamed from: c */
    private static String[] m1664c(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    /* renamed from: d */
    private static InterfaceC0253a m1665d(Context context, String str) {
        InterfaceC0253a interfaceC0253aM1668g;
        synchronized (f2186h) {
            interfaceC0253aM1668g = f2186h.get(str);
            if (interfaceC0253aM1668g == null) {
                try {
                    interfaceC0253aM1668g = m1668g(context, str);
                    f2186h.put(str, interfaceC0253aM1668g);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return interfaceC0253aM1668g;
    }

    /* renamed from: e */
    public static Uri m1666e(Context context, String str, File file) {
        return m1665d(context, str).mo1670b(file);
    }

    /* renamed from: f */
    private static int m1667f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: g */
    private static InterfaceC0253a m1668g(Context context, String str) throws XmlPullParserException, IOException {
        C0254b c0254b = new C0254b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0254b;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f2185g;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] fileArrM1679h = C0255a.m1679h(context, null);
                    if (fileArrM1679h.length > 0) {
                        externalStorageDirectory = fileArrM1679h[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] fileArrM1678g = C0255a.m1678g(context);
                    if (fileArrM1678g.length > 0) {
                        externalStorageDirectory = fileArrM1678g[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c0254b.m1671c(attributeValue, m1662a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f2187i = m1665d(context, providerInfo.authority.split(";")[0]);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f2187i.mo1669a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileMo1669a = this.f2187i.mo1669a(uri);
        int iLastIndexOf = fileMo1669a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo1669a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f2187i.mo1669a(uri), m1667f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File fileMo1669a = this.f2187i.mo1669a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f2184f;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? fileMo1669a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(fileMo1669a.length());
            }
            i3 = i2;
        }
        String[] strArrM1664c = m1664c(strArr3, i3);
        Object[] objArrM1663b = m1663b(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArrM1664c, 1);
        matrixCursor.addRow(objArrM1663b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
