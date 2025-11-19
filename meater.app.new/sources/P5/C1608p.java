package P5;

import android.content.Context;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.versions.Versions;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;

/* compiled from: FileUtils.java */
/* renamed from: P5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1608p {
    public static ByteBuffer a(Context context, String str) {
        ByteBuffer byteBufferG = g(context, str);
        return byteBufferG != null ? byteBufferG : d(context, str);
    }

    public static String b(String str) {
        String strTrim;
        int iLastIndexOf;
        int i10;
        if (str == null || (iLastIndexOf = (strTrim = str.trim()).lastIndexOf("/")) < 0 || (i10 = iLastIndexOf + 1) >= strTrim.length()) {
            return null;
        }
        return strTrim.substring(i10);
    }

    public static Versions c(Context context) {
        Config.getInstance();
        String strH = h(context, Config.VERSION_CHECK_CACHE_FILENAME);
        Config.getInstance();
        U4.b.x("getVersionsFromCache %s, %s, %s", Config.VERSION_CHECK_CACHE_FILENAME, "local file", strH);
        if (strH == null) {
            Config.getInstance();
            strH = e(context, Config.VERSION_CHECK_ASSETS_FILENAME);
            Config.getInstance();
            U4.b.x("getVersionsFromCache %s, %s, %s", Config.VERSION_CHECK_ASSETS_FILENAME, "ASSETS", strH);
        }
        if (strH == null) {
            return null;
        }
        try {
            return (Versions) new Gson().k(strH, Versions.class);
        } catch (JsonSyntaxException | IllegalStateException e10) {
            Log.error("FileUtils", "getVersionsFromCache failed reason " + e10.getLocalizedMessage());
            return null;
        }
    }

    public static ByteBuffer d(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.isEmpty()) {
                return null;
            }
            return f(context.getAssets().open(str));
        } catch (IOException e10) {
            Log.error("FileUtils", "readAssetsFile, IO could not read file " + str + " " + e10.getMessage());
            return null;
        }
    }

    public static String e(Context context, String str) {
        try {
            return j(context.getAssets().open(str));
        } catch (IOException e10) {
            Log.error("FileUtils", "readAssetsTextFile, IO could not read file " + str + " " + e10.getMessage());
            return null;
        }
    }

    private static ByteBuffer f(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (IOException e10) {
                Log.error("FileUtils", "readBytes, IO could not read file" + e10.getMessage());
                return null;
            }
        }
    }

    public static ByteBuffer g(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.isEmpty()) {
                return null;
            }
            return f(context.openFileInput(str));
        } catch (FileNotFoundException e10) {
            Log.warn("FileUtils", "readLocalFile, not found file " + str + " " + e10.getMessage());
            return null;
        }
    }

    public static String h(Context context, String str) {
        try {
            return j(context.openFileInput(str));
        } catch (FileNotFoundException e10) {
            Log.warn("FileUtils", "readLocalTextFile, not found file " + str + " " + e10.getMessage());
            return null;
        }
    }

    public static String i(File file) throws IOException {
        try {
            StringBuilder sb2 = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append("\n");
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (IOException unused) {
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        } catch (Exception e10) {
            Log.warn("FileUtils", "readLocalTextFile, not found file " + file + " " + e10.getMessage());
            return null;
        }
    }

    private static String j(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStream.close();
                    return sb2.toString();
                }
                sb2.append(line);
            }
        } catch (FileNotFoundException e10) {
            Log.warn("FileUtils", "readLocalTextFile, not found file " + e10.getMessage());
            return null;
        } catch (IOException e11) {
            Log.error("FileUtils", "readTextFile, IO could not read file " + e11.getMessage());
            return null;
        }
    }

    public static boolean k(Context context, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, ByteBuffer byteBuffer7) {
        if (versions == null) {
            return false;
        }
        U4.b.x("setCacheVersions write versions json file to disk", new Object[0]);
        Config.getInstance();
        boolean zL = l(context, Config.VERSION_CHECK_CACHE_FILENAME, new Gson().t(versions));
        if (byteBuffer != null) {
            U4.b.x("setCacheVersions write file firmware plus", new Object[0]);
            m(context, b(versions.plus.url), byteBuffer);
        }
        if (byteBuffer2 != null) {
            U4.b.x("setCacheVersions write file firmware plus", new Object[0]);
            m(context, b(versions.se.url), byteBuffer2);
        }
        if (byteBuffer3 != null) {
            U4.b.x("setCacheVersions write file firmware plusV2", new Object[0]);
            m(context, b(versions.plusV2.url), byteBuffer3);
        }
        if (byteBuffer4 != null) {
            U4.b.x("setCacheVersions write file firmware pro", new Object[0]);
            m(context, b(versions.pro.url), byteBuffer4);
        }
        if (byteBuffer5 != null) {
            U4.b.x("setCacheVersions write file firmware block", new Object[0]);
            m(context, b(versions.block.url), byteBuffer5);
        }
        if (byteBuffer7 != null) {
            U4.b.x("setCacheVersions write file firmware blockV2", new Object[0]);
            m(context, b(versions.blockV2.url), byteBuffer7);
        }
        if (byteBuffer6 != null) {
            U4.b.x("setCacheVersions write file firmware duo", new Object[0]);
            m(context, b(versions.duo.url), byteBuffer6);
        }
        return zL;
    }

    public static boolean l(Context context, String str, String str2) throws IOException {
        if (str != null && str2 != null) {
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(str, 0));
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                Log.info("FileUtils", "writeFile wrote file to disk" + str);
                return true;
            } catch (IOException e10) {
                Log.error("FileUtils", "writeFile io error " + e10.getMessage());
            }
        }
        return false;
    }

    public static boolean m(Context context, String str, ByteBuffer byteBuffer) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e10;
        FileNotFoundException e11;
        if (str == null || byteBuffer == null) {
            return false;
        }
        File file = new File(context.getFilesDir(), str);
        file.delete();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e12) {
                fileOutputStream = null;
                e11 = e12;
            } catch (IOException e13) {
                fileOutputStream = null;
                e10 = e13;
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
                throw th;
            }
            try {
                fileOutputStream.write(byteBuffer.array());
                Log.info("FileUtils", "writeFile wrote file to disk" + str);
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
                return true;
            } catch (FileNotFoundException e14) {
                e11 = e14;
                Log.error("FileUtils", "writeFile file not found " + e11.getMessage());
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            } catch (IOException e15) {
                e10 = e15;
                Log.error("FileUtils", "writeFile io error " + e10.getMessage());
                fileOutputStream.close();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2.close();
            throw th;
        }
    }

    public static boolean n(File file, String str) throws IOException {
        if (file != null && str != null) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                Log.info("FileUtils", "writeFile wrote file to disk" + file);
                return true;
            } catch (IOException e10) {
                Log.error("FileUtils", "writeFile io error " + e10.getMessage());
            }
        }
        return false;
    }
}
