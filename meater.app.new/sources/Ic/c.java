package Ic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.internal.websocket.HandshakeFailedException;

/* compiled from: WebSocketHandshake.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    InputStream f7019a;

    /* renamed from: b, reason: collision with root package name */
    OutputStream f7020b;

    /* renamed from: c, reason: collision with root package name */
    String f7021c;

    /* renamed from: d, reason: collision with root package name */
    String f7022d;

    /* renamed from: e, reason: collision with root package name */
    int f7023e;

    public c(InputStream inputStream, OutputStream outputStream, String str, String str2, int i10) {
        this.f7019a = inputStream;
        this.f7020b = outputStream;
        this.f7021c = str;
        this.f7022d = str2;
        this.f7023e = i10;
    }

    private Map b(ArrayList arrayList) {
        HashMap map = new HashMap();
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            String[] strArrSplit = ((String) arrayList.get(i10)).split(":");
            map.put(strArrSplit[0].toLowerCase(), strArrSplit[1]);
        }
        return map;
    }

    private void c(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7019a));
        ArrayList arrayList = new ArrayList();
        String line = bufferedReader.readLine();
        if (line == null) {
            throw new IOException("WebSocket Response header: Invalid response from Server, It may not support WebSockets.");
        }
        while (!line.equals("")) {
            arrayList.add(line);
            line = bufferedReader.readLine();
        }
        Map mapB = b(arrayList);
        String str2 = (String) mapB.get("connection");
        if (str2 == null || str2.equalsIgnoreCase("upgrade")) {
            throw new IOException("WebSocket Response header: Incorrect connection header");
        }
        if (!((String) mapB.get("upgrade")).toLowerCase().contains("websocket")) {
            throw new IOException("WebSocket Response header: Incorrect upgrade.");
        }
        if (((String) mapB.get("sec-websocket-protocol")) == null) {
            throw new IOException("WebSocket Response header: empty sec-websocket-protocol");
        }
        if (!mapB.containsKey("sec-websocket-accept")) {
            throw new IOException("WebSocket Response header: Missing Sec-WebSocket-Accept");
        }
        try {
            f(str, (String) mapB.get("sec-websocket-accept"));
        } catch (NoSuchAlgorithmException e10) {
            throw new IOException(e10.getMessage());
        } catch (HandshakeFailedException unused) {
            throw new IOException("WebSocket Response header: Incorrect Sec-WebSocket-Key");
        }
    }

    private void d(String str) {
        try {
            String rawPath = "/mqtt";
            URI uri = new URI(this.f7021c);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                rawPath = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    rawPath = rawPath + "?" + uri.getRawQuery();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.f7020b);
            printWriter.print("GET " + rawPath + " HTTP/1.1\r\n");
            printWriter.print("Host: " + this.f7022d + ":" + this.f7023e + "\r\n");
            printWriter.print("Upgrade: websocket\r\n");
            printWriter.print("Connection: Upgrade\r\n");
            printWriter.print("Sec-WebSocket-Key: " + str + "\r\n");
            printWriter.print("Sec-WebSocket-Protocol: mqttv3.1\r\n");
            printWriter.print("Sec-WebSocket-Version: 13\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
        } catch (URISyntaxException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private byte[] e(String str) {
        return MessageDigest.getInstance("SHA1").digest(str.getBytes());
    }

    private void f(String str, String str2) throws HandshakeFailedException {
        String strTrim = a.b(e(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).trim();
        if (!strTrim.equals(strTrim)) {
            throw new HandshakeFailedException();
        }
    }

    public void a() throws IOException {
        String strA = a.a("mqtt-" + (System.currentTimeMillis() / 1000));
        d(strA);
        c(strA);
    }
}
