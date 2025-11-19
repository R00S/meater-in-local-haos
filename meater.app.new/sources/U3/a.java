package U3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: B, reason: collision with root package name */
    private final HttpURLConnection f17536B;

    public a(HttpURLConnection httpURLConnection) {
        this.f17536B = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // U3.d
    public String B0() {
        try {
            if (f1()) {
                return null;
            }
            return "Unable to fetch " + this.f17536B.getURL() + ". Failed with " + this.f17536B.getResponseCode() + "\n" + a(this.f17536B);
        } catch (IOException e10) {
            X3.d.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // U3.d
    public InputStream H0() {
        return this.f17536B.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17536B.disconnect();
    }

    @Override // U3.d
    public boolean f1() {
        try {
            return this.f17536B.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // U3.d
    public String z0() {
        return this.f17536B.getContentType();
    }
}
