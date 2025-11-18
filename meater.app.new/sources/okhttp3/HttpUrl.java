package okhttp3;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntProgression;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.Regex;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p353j.C9703f;

/* compiled from: HttpUrl.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\u0013\u0018\u0000 W2\u00020\u0001:\u0002XWBc\b\u0000\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010.\u001a\u00020\n\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00104\u001a\u00020\n\u0012\u0006\u00106\u001a\u00020\u0011\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0010\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e\u0012\b\u0010M\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\bU\u0010VJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010\bJ\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010.\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u0017J\u000f\u00100\u001a\u00020\nH\u0007¢\u0006\u0004\b/\u0010\u0017J\u000f\u00102\u001a\u00020\nH\u0007¢\u0006\u0004\b1\u0010\u0017J\u000f\u00104\u001a\u00020\nH\u0007¢\u0006\u0004\b3\u0010\u0017J\u000f\u00106\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010$J\u000f\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b7\u0010$J\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\u0017J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b>\u0010<J\u0011\u0010A\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b@\u0010\u0017J\u0011\u0010C\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bB\u0010\u0017J\u000f\u0010E\u001a\u00020\u0011H\u0007¢\u0006\u0004\bD\u0010$J\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0FH\u0007¢\u0006\u0004\bG\u0010HJ\u0011\u0010K\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bJ\u0010\u0017J\u0011\u0010M\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bL\u0010\u0017R\u0019\u00102\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\b2\u0010\u0017R\u0019\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0F8G@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010HR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0019\u0010*\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\b*\u0010\u0017R\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b?\u0010P\u001a\u0004\b?\u0010<R\u001b\u0010M\u001a\u0004\u0018\u00010\n8\u0007@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010NR\u0013\u0010,\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0015\u0010C\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u0019\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0019\u0010Q\u001a\u00020 8\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR\u0013\u00100\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010\u0017R\u0013\u0010:\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0013\u0010E\u001a\u00020\u00118G@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010$R\u0019\u0010.\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b.\u0010N\u001a\u0004\b.\u0010\u0017R\u0015\u0010A\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u0019\u00104\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b4\u0010N\u001a\u0004\b4\u0010\u0017R\u0019\u00106\u001a\u00020\u00118\u0007@\u0006¢\u0006\f\n\u0004\b6\u0010T\u001a\u0004\b6\u0010$R\u0013\u00108\u001a\u00020\u00118G@\u0006¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0015\u0010K\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010\u0017¨\u0006Y"}, m32267d2 = {"Lokhttp3/HttpUrl;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", DeepLinkIntentReceiver.DeepLinksKeys.URI, "()Ljava/net/URI;", "toUri", HttpUrl.FRAGMENT_ENCODE_SET, "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "index", "queryParameterName", "(I)Ljava/lang/String;", "queryParameterValue", "redact", "()Ljava/lang/String;", "link", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "scheme", "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", "username", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "password", "-deprecated_host", "host", "-deprecated_port", "port", "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", "query", "-deprecated_querySize", "querySize", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "fragment", "Ljava/lang/String;", "queryNamesAndValues", "Ljava/util/List;", "isHttps", "Z", "()Z", "I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0019\u0018\u0000 e2\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\bd\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u001eJ\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\u001eJ\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010\u001eJ\u001d\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b0\u0010%J\u0015\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00103\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b3\u0010\u001eJ\u001f\u00106\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b:\u00107J\u001f\u0010;\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b;\u00107J\u001f\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b<\u00107J\u0015\u0010=\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0005¢\u0006\u0004\b=\u0010\u001eJ\u0015\u0010>\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\b>\u0010\u001eJ\u0017\u0010?\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b?\u0010\u001eJ\u0017\u0010@\u001a\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b@\u0010\u001eJ\u000f\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010E\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010HJ!\u0010L\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010D2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\bJ\u0010KR,\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010T\u001a\u0004\bU\u0010H\"\u0004\bV\u0010\u000eR\"\u0010\"\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010T\u001a\u0004\bW\u0010H\"\u0004\bX\u0010\u000eR$\u0010@\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010T\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010\u000eR\"\u0010 \u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010T\u001a\u0004\b[\u0010H\"\u0004\b\\\u0010\u000eR$\u0010#\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010T\u001a\u0004\b]\u0010H\"\u0004\b^\u0010\u000eR\"\u0010$\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010_\u001a\u0004\b`\u0010\u0004\"\u0004\ba\u0010bR\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050M8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010O\u001a\u0004\bc\u0010Q¨\u0006f"}, m32267d2 = {"Lokhttp3/HttpUrl$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "effectivePort", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "pathSegments", HttpUrl.FRAGMENT_ENCODE_SET, "alreadyEncoded", "addPathSegments", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Lkotlin/u;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "input", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "pop", "()V", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", HttpUrl.FRAGMENT_ENCODE_SET, "encodedQueryNamesAndValues", "Ljava/util/List;", "getEncodedQueryNamesAndValues$okhttp", "()Ljava/util/List;", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "getEncodedPathSegments$okhttp", "<init>", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
        private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m32267d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "input", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", "schemeDelimiterOffset", "(Ljava/lang/String;II)I", "slashCount", "portColonOffset", "parsePort", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) throws NumberFormatException {
                try {
                    int i2 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                    if (1 <= i2 && 65535 >= i2) {
                        return i2;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == ':') {
                        return pos;
                    }
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((C9801m.m32348h(cCharAt, 97) < 0 || C9801m.m32348h(cCharAt, 122) > 0) && (C9801m.m32348h(cCharAt, 65) < 0 || C9801m.m32348h(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }

            public /* synthetic */ Companion(C9789g c9789g) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            C9801m.m32343c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            return C9801m.m32341a(input, ".") || C10546u.m37515q(input, "%2e", true);
        }

        private final boolean isDotDot(String input) {
            return C9801m.m32341a(input, "..") || C10546u.m37515q(input, "%2e.", true) || C10546u.m37515q(input, ".%2e", true) || C10546u.m37515q(input, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            C9801m.m32343c(list);
            IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32425h(list.size() - 2, 0), 2);
            int f37215g = intProgressionM32427j.getF37215g();
            int f37216h = intProgressionM32427j.getF37216h();
            int f37217i = intProgressionM32427j.getF37217i();
            if (f37217i >= 0) {
                if (f37215g > f37216h) {
                    return;
                }
            } else if (f37215g < f37216h) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                C9801m.m32343c(list2);
                if (C9801m.m32341a(canonicalName, list2.get(f37215g))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    C9801m.m32343c(list3);
                    list3.remove(f37215g + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    C9801m.m32343c(list4);
                    list4.remove(f37215g);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    C9801m.m32343c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (f37215g == f37216h) {
                    return;
                } else {
                    f37215g += f37217i;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            while (true) {
                int i2 = startPos;
                if (i2 >= limit) {
                    return;
                }
                startPos = Util.delimiterOffset(input, "/\\", i2, limit);
                boolean z = startPos < limit;
                push(input, i2, startPos, z, true);
                if (z) {
                    startPos++;
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            C9801m.m32346f(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            C9801m.m32346f(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            C9801m.m32346f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C9801m.m32343c(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C9801m.m32343c(list2);
            list2.add(encodedValue != null ? Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            C9801m.m32346f(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            C9801m.m32346f(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String value) {
            C9801m.m32346f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C9801m.m32343c(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C9801m.m32343c(list2);
            list2.add(value != null ? Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.INSTANCE;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(C10819v.m38911u(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            C9801m.m32346f(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            C9801m.m32346f(encodedPath, "encodedPath");
            if (C10546u.m37511E(encodedPath, "/", false, 2, null)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.INSTANCE
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        public final Builder encodedUsername(String encodedUsername) {
            C9801m.m32346f(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            this.encodedFragment = fragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null) : null;
            return this;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            C9801m.m32346f(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final Builder parse$okhttp(HttpUrl base, String input) throws NumberFormatException {
            int iDelimiterOffset;
            int i2;
            int i3;
            String str;
            int i4;
            String str2;
            int i5;
            boolean z;
            boolean z2;
            C9801m.m32346f(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c2 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (C10546u.m37508B(input, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = BuildConfig.APTOIDE_WEB_SERVICES_SCHEME;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!C10546u.m37508B(input, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.scheme = base.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (iSlashCount >= 2 || base == null || (!C9801m.m32341a(base.scheme(), this.scheme))) {
                int i6 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i6, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : (char) 65535;
                    if (cCharAt == c2 || cCharAt == c4 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c3) {
                        break;
                    }
                    if (cCharAt != '@') {
                        str2 = str3;
                        i4 = iIndexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (z3) {
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str3;
                            i5 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, i6, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z = z4;
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, ':', i6, iDelimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            String str4 = str3;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i6, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z4) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                            z3 = z2;
                            str2 = str4;
                            z = true;
                            i5 = iDelimiterOffset;
                        }
                        i6 = i5 + 1;
                        z4 = z;
                    }
                    str3 = str2;
                    iIndexOfLastNonAsciiWhitespace$default = i4;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                String str5 = str3;
                i2 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int iPortColonOffset = companion3.portColonOffset(input, i6, iDelimiterOffset);
                int i7 = iPortColonOffset + 1;
                if (i7 < iDelimiterOffset) {
                    i3 = i6;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, input, i6, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(input, i7, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i7, iDelimiterOffset);
                        C9801m.m32345e(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i3 = i6;
                    str = str5;
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i3, iPortColonOffset, false, 4, null));
                    String str6 = this.scheme;
                    C9801m.m32343c(str6);
                    this.port = companion4.defaultPort(str6);
                }
                if (!(this.host != null)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i3, iPortColonOffset);
                    C9801m.m32345e(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i2 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i8 = i2;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i8);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i8 && input.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i8);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i8 && input.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, iDelimiterOffset3 + 1, i8, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            C9801m.m32346f(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 <= port && 65535 >= port) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.HttpUrl.Builder query(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.INSTANCE
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").m37439c(str, HttpUrl.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.encodedPathSegments;
                list.set(i2, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, list.get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = list2.get(i3);
                    list2.set(i3, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            C9801m.m32346f(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            C9801m.m32346f(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            C9801m.m32346f(scheme, "scheme");
            if (C10546u.m37515q(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!C10546u.m37515q(scheme, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = BuildConfig.APTOIDE_WEB_SERVICES_SCHEME;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            C9801m.m32346f(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            C9801m.m32346f(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            C9801m.m32346f(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i2) {
            this.port = i2;
        }

        public final Builder setQueryParameter(String name, String value) {
            C9801m.m32346f(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                kotlin.jvm.internal.C9801m.m32343c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.C10537l.m37455I(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.INSTANCE
                kotlin.jvm.internal.C9801m.m32343c(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.C9801m.m32343c(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C9801m.m32345e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            C9801m.m32346f(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            int i2 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i2, pathSegments.length());
                push(pathSegments, i2, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
                i2 = iDelimiterOffset + 1;
            } while (i2 <= pathSegments.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ]\u0010\u0016\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b\"\u0010 J\u001b\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$*\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010+\u001a\u00020(*\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u00020.H\u0007¢\u0006\u0004\b)\u0010/J\u0015\u0010-\u001a\u0004\u0018\u00010(*\u000200H\u0007¢\u0006\u0004\b)\u00101J\u0017\u0010)\u001a\u00020(2\u0006\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b3\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010(2\u0006\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b4\u0010*J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00102\u001a\u00020.H\u0007¢\u0006\u0004\b3\u0010/J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u00105\u001a\u000200H\u0007¢\u0006\u0004\b3\u00101J1\u00108\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u00107Jc\u0010;\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010D\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010=R\u0016\u0010E\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010F\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010=R\u0016\u0010G\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010H\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010=R\u0016\u0010I\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010=R\u0016\u0010J\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010=¨\u0006M"}, m32267d2 = {"Lokhttp3/HttpUrl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/f;", HttpUrl.FRAGMENT_ENCODE_SET, "encoded", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", HttpUrl.FRAGMENT_ENCODE_SET, "plusIsSpace", "Lkotlin/u;", "writePercentDecoded", "(Lj/f;Ljava/lang/String;IIZ)V", "isPercentEncoded", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "(Lj/f;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "defaultPort", "(Ljava/lang/String;)I", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", HttpUrl.FRAGMENT_ENCODE_SET, "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", DeepLinkIntentReceiver.DeepLinksKeys.URI, "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", HttpUrl.FRAGMENT_ENCODE_SET, "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4, Object obj) {
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.parseHexDigit(str.charAt(i2 + 1)) != -1 && Util.parseHexDigit(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i2, i3, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[LOOP:1: B:51:0x008d->B:53:0x0093, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(p353j.C9703f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc5
                if (r1 == 0) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2b
                r8 = 9
                if (r7 == r8) goto L26
                r8 = 10
                if (r7 == r8) goto L26
                r8 = 12
                if (r7 == r8) goto L26
                r8 = 13
                if (r7 == r8) goto L26
                goto L2b
            L26:
                r8 = r14
                r12 = r19
                goto Lb5
            L2b:
                r8 = 43
                if (r7 != r8) goto L3c
                if (r22 == 0) goto L3c
                if (r20 == 0) goto L36
                java.lang.String r8 = "+"
                goto L38
            L36:
                java.lang.String r8 = "%2B"
            L38:
                r15.mo32055r0(r8)
                goto L26
            L3c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4c
                if (r23 == 0) goto L6c
            L4c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.C10537l.m37455I(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6a
                if (r7 != r9) goto L65
                if (r20 == 0) goto L6a
                if (r21 == 0) goto L65
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L66
                goto L6f
            L65:
                r8 = r14
            L66:
                r15.m32039f1(r7)
                goto Lb5
            L6a:
                r8 = r14
                goto L6f
            L6c:
                r8 = r14
                r12 = r19
            L6f:
                if (r6 != 0) goto L76
                j.f r6 = new j.f
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C9801m.m32341a(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m32022T0(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.m32039f1(r7)
            L8d:
                boolean r10 = r6.mo32019R()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(j.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(C9703f c9703f, String str, int i2, int i3, boolean z) {
            int i4;
            while (i2 < i3) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i2);
                if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i2 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i4));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        c9703f.m32039f1(iCodePointAt);
                        i2 += Character.charCount(iCodePointAt);
                    } else {
                        c9703f.writeByte((hexDigit << 4) + hexDigit2);
                        i2 = Character.charCount(iCodePointAt) + i4;
                    }
                } else if (iCodePointAt == 43 && z) {
                    c9703f.writeByte(32);
                    i2++;
                } else {
                    c9703f.m32039f1(iCodePointAt);
                    i2 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m41123deprecated_get(String url) {
            C9801m.m32346f(url, "url");
            return get(url);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m41126deprecated_parse(String url) {
            C9801m.m32346f(url, "url");
            return parse(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String canonicalize$okhttp(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.C9801m.m32346f(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.C9801m.m32346f(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.794E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 0
                r7 = 2
                r8 = 0
                boolean r1 = kotlin.text.C10537l.m37455I(r5, r1, r6, r7, r8)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                j.f r12 = new j.f
                r12.<init>()
                r0 = r15
                r12.mo31997A0(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.m32021T()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C9801m.m32345e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int defaultPort(String scheme) {
            C9801m.m32346f(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            C9801m.m32346f(str, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            C9801m.m32346f(str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i2, int i3, boolean z) {
            C9801m.m32346f(str, "$this$percentDecode");
            for (int i4 = i2; i4 < i3; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    C9703f c9703f = new C9703f();
                    c9703f.mo31997A0(str, i2, i4);
                    writePercentDecoded(c9703f, str, i4, i3, z);
                    return c9703f.m32021T();
                }
            }
            String strSubstring = str.substring(i2, i3);
            C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            C9801m.m32346f(list, "$this$toPathString");
            C9801m.m32346f(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            C9801m.m32346f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int iM37556V = C10547v.m37556V(str, '&', i2, false, 4, null);
                if (iM37556V == -1) {
                    iM37556V = str.length();
                }
                int i3 = iM37556V;
                int iM37556V2 = C10547v.m37556V(str, '=', i2, false, 4, null);
                if (iM37556V2 == -1 || iM37556V2 > i3) {
                    String strSubstring = str.substring(i2, i3);
                    C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i2, iM37556V2);
                    C9801m.m32345e(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM37556V2 + 1, i3);
                    C9801m.m32345e(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            C9801m.m32346f(list, "$this$toQueryString");
            C9801m.m32346f(sb, "out");
            IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32428k(0, list.size()), 2);
            int f37215g = intProgressionM32427j.getF37215g();
            int f37216h = intProgressionM32427j.getF37216h();
            int f37217i = intProgressionM32427j.getF37217i();
            if (f37217i >= 0) {
                if (f37215g > f37216h) {
                    return;
                }
            } else if (f37215g < f37216h) {
                return;
            }
            while (true) {
                String str = list.get(f37215g);
                String str2 = list.get(f37215g + 1);
                if (f37215g > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (f37215g == f37216h) {
                    return;
                } else {
                    f37215g += f37217i;
                }
            }
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m41125deprecated_get(URL url) {
            C9801m.m32346f(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            C9801m.m32346f(url, "$this$toHttpUrlOrNull");
            String string = url.toString();
            C9801m.m32345e(string, "toString()");
            return parse(string);
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m41124deprecated_get(URI uri) {
            C9801m.m32346f(uri, DeepLinkIntentReceiver.DeepLinksKeys.URI);
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            C9801m.m32346f(uri, "$this$toHttpUrlOrNull");
            String string = uri.toString();
            C9801m.m32345e(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        C9801m.m32346f(str, "scheme");
        C9801m.m32346f(str2, "username");
        C9801m.m32346f(str3, "password");
        C9801m.m32346f(str4, "host");
        C9801m.m32346f(list, "pathSegments");
        C9801m.m32346f(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i2;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = C9801m.m32341a(str, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m41104deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m41105deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m41106deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m41107deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m41108deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m41109deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m41113deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m41114deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m41116deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m41117deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m41118deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m41120deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m41121deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int iM37556V = C10547v.m37556V(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iM37556V);
        C9801m.m32345e(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int iM37556V = C10547v.m37556V(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
        int iM37556V2 = C10547v.m37556V(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iM37556V, iM37556V2);
        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iM37556V = C10547v.m37556V(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM37556V, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iM37556V, iDelimiterOffset);
        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iM37556V = C10547v.m37556V(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM37556V, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM37556V < iDelimiterOffset) {
            int i2 = iM37556V + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i2, iDelimiterOffset);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i2, iDelimiterOffset2);
            C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM37556V = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM37556V = C10547v.m37556V(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, '#', iM37556V, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iM37556V, iDelimiterOffset);
        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iDelimiterOffset);
        C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && C9801m.m32341a(((HttpUrl) other).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        C9801m.m32346f(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32428k(0, list.size()), 2);
        int f37215g = intProgressionM32427j.getF37215g();
        int f37216h = intProgressionM32427j.getF37216h();
        int f37217i = intProgressionM32427j.getF37217i();
        if (f37217i < 0 ? f37215g >= f37216h : f37215g <= f37216h) {
            while (!C9801m.m32341a(name, this.queryNamesAndValues.get(f37215g))) {
                if (f37215g != f37216h) {
                    f37215g += f37217i;
                }
            }
            return this.queryNamesAndValues.get(f37215g + 1);
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        C9801m.m32343c(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C10822w0.m38917d();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32428k(0, this.queryNamesAndValues.size()), 2);
        int f37215g = intProgressionM32427j.getF37215g();
        int f37216h = intProgressionM32427j.getF37216h();
        int f37217i = intProgressionM32427j.getF37217i();
        if (f37217i < 0 ? f37215g >= f37216h : f37215g <= f37216h) {
            while (true) {
                String str = this.queryNamesAndValues.get(f37215g);
                C9801m.m32343c(str);
                linkedHashSet.add(str);
                if (f37215g == f37216h) {
                    break;
                }
                f37215g += f37217i;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C9801m.m32345e(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        C9801m.m32346f(name, "name");
        if (this.queryNamesAndValues == null) {
            return C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32428k(0, this.queryNamesAndValues.size()), 2);
        int f37215g = intProgressionM32427j.getF37215g();
        int f37216h = intProgressionM32427j.getF37216h();
        int f37217i = intProgressionM32427j.getF37217i();
        if (f37217i < 0 ? f37215g >= f37216h : f37215g <= f37216h) {
            while (true) {
                if (C9801m.m32341a(name, this.queryNamesAndValues.get(f37215g))) {
                    arrayList.add(this.queryNamesAndValues.get(f37215g + 1));
                }
                if (f37215g == f37216h) {
                    break;
                }
                f37215g += f37217i;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C9801m.m32345e(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        C9801m.m32343c(builderNewBuilder);
        return builderNewBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        C9801m.m32346f(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m37439c(string, FRAGMENT_ENCODE_SET));
                C9801m.m32345e(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String username() {
        return this.username;
    }

    public final Builder newBuilder(String link) {
        C9801m.m32346f(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
