package cm.aptoide.p092pt.dataprovider.cache;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p353j.InterfaceC9709h;

/* loaded from: classes.dex */
public class ResponseCacheEntry {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private String body;
    private String bodyMediaType;
    private int code;
    private Map<String, List<String>> headers;
    private String message;
    private String protocol;
    private long validity;

    public ResponseCacheEntry() {
    }

    public static String getDefaultCharset() {
        return DEFAULT_CHARSET;
    }

    public String getBody() {
        return this.body;
    }

    public String getBodyMediaType() {
        return this.bodyMediaType;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Response getResponse(Request request) {
        Response.Builder builder = new Response.Builder();
        builder.code(this.code);
        builder.message(this.message);
        try {
            builder.protocol(Protocol.get(this.protocol));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        builder.body(ResponseBody.create(MediaType.parse(this.bodyMediaType), this.body));
        Headers.Builder builder2 = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder2.add(entry.getKey(), it.next());
            }
        }
        builder.headers(builder2.build());
        builder.request(request);
        return builder.build();
    }

    public long getValidity() {
        return this.validity;
    }

    @JsonIgnore
    boolean isValid() {
        return System.currentTimeMillis() <= this.validity;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setBodyMediaType(String str) {
        this.bodyMediaType = str;
    }

    public void setCode(int i2) {
        this.code = i2;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setValidity(long j2) {
        this.validity = j2;
    }

    public ResponseCacheEntry(Response response, int i2) {
        this.validity = System.currentTimeMillis() + (i2 * 1000);
        this.code = response.code();
        this.message = response.message();
        this.protocol = response.protocol().getProtocol();
        this.headers = response.headers().toMultimap();
        ResponseBody responseBodyBody = response.body();
        this.bodyMediaType = responseBodyBody.get$contentType().getMediaType();
        Charset charset = responseBodyBody.get$contentType().charset(Charset.forName(DEFAULT_CHARSET));
        try {
            InterfaceC9709h bodySource = responseBodyBody.getBodySource();
            bodySource.request(Long.MAX_VALUE);
            this.body = bodySource.mo32056t().clone().mo32060w0(charset);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
