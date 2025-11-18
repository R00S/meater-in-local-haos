package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.C10773s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C10803n;
import kotlin.collections.C10817u;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9779b;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntProgression;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Headers.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 32\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000243B\u0017\b\u0002\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030.¢\u0006\u0004\b1\u00102J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001dH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u000fJ\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170+¢\u0006\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u00020\r8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, m32267d2 = {"Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/m;", HttpUrl.FRAGMENT_ENCODE_SET, "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", HttpUrl.FRAGMENT_ENCODE_SET, "names", "()Ljava/util/Set;", HttpUrl.FRAGMENT_ENCODE_SET, "values", "(Ljava/lang/String;)Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "()J", HttpUrl.FRAGMENT_ENCODE_SET, "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "toMultimap", "()Ljava/util/Map;", HttpUrl.FRAGMENT_ENCODE_SET, "namesAndValues", "[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0007\u0010\u0013J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0011J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m32267d2 = {"Lokhttp3/Headers$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "line", "addLenient$okhttp", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addLenient", "add", "name", "value", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "addUnsafeNonAscii", "Lokhttp3/Headers;", "headers", "addAll", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)Lokhttp3/Headers$Builder;", "Ljava/time/Instant;", "(Ljava/lang/String;Ljava/time/Instant;)Lokhttp3/Headers$Builder;", "set", "removeAll", "get", "(Ljava/lang/String;)Ljava/lang/String;", "build", "()Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "namesAndValues", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            C9801m.m32346f(line, "line");
            int iM37556V = C10547v.m37556V(line, ':', 0, false, 6, null);
            if (!(iM37556V != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iM37556V);
            C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (strSubstring == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string = C10547v.m37549O0(strSubstring).toString();
            String strSubstring2 = line.substring(iM37556V + 1);
            C9801m.m32345e(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            C9801m.m32346f(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            C9801m.m32346f(line, "line");
            int iM37556V = C10547v.m37556V(line, ':', 1, false, 4, null);
            if (iM37556V != -1) {
                String strSubstring = line.substring(0, iM37556V);
                C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iM37556V + 1);
                C9801m.m32345e(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                C9801m.m32345e(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, strSubstring3);
            } else {
                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, line);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String get(String name) {
            C9801m.m32346f(name, "name");
            IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32425h(this.namesAndValues.size() - 2, 0), 2);
            int f37215g = intProgressionM32427j.getF37215g();
            int f37216h = intProgressionM32427j.getF37216h();
            int f37217i = intProgressionM32427j.getF37217i();
            if (f37217i >= 0) {
                if (f37215g > f37216h) {
                    return null;
                }
            } else if (f37215g < f37216h) {
                return null;
            }
            while (!C10546u.m37515q(name, this.namesAndValues.get(f37215g), true)) {
                if (f37215g == f37216h) {
                    return null;
                }
                f37215g += f37217i;
            }
            return this.namesAndValues.get(f37215g + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            C9801m.m32346f(name, "name");
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (C10546u.m37515q(name, this.namesAndValues.get(i2), true)) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String name, Instant value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(C10547v.m37549O0(value).toString());
            return this;
        }

        public final Builder add(String name, Date value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String name, Instant value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0007¢\u0006\u0004\b\u000f\u0010\u0014J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0007¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, m32267d2 = {"Lokhttp3/Headers$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/u;", "checkName", "(Ljava/lang/String;)V", "value", "checkValue", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (!(name.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = name.charAt(i2);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = value.charAt(i2);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), name));
                    sb.append(Util.isSensitiveHeader(name) ? HttpUrl.FRAGMENT_ENCODE_SET : ": " + value);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            IntProgression intProgressionM32427j = C9848l.m32427j(C9848l.m32425h(namesAndValues.length - 2, 0), 2);
            int f37215g = intProgressionM32427j.getF37215g();
            int f37216h = intProgressionM32427j.getF37216h();
            int f37217i = intProgressionM32427j.getF37217i();
            if (f37217i >= 0) {
                if (f37215g > f37216h) {
                    return null;
                }
            } else if (f37215g < f37216h) {
                return null;
            }
            while (!C10546u.m37515q(name, namesAndValues[f37215g], true)) {
                if (f37215g == f37216h) {
                    return null;
                }
                f37215g += f37217i;
            }
            return namesAndValues[f37215g + 1];
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m41103deprecated_of(String... namesAndValues) {
            C9801m.m32346f(namesAndValues, "namesAndValues");
            return m39750of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        /* renamed from: of */
        public final Headers m39750of(String... namesAndValues) throws CloneNotSupportedException {
            C9801m.m32346f(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!(strArr[i2] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr[i2];
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i2] = C10547v.m37549O0(str).toString();
            }
            IntProgression intProgressionM32427j = C9848l.m32427j(C10803n.m38769y(strArr), 2);
            int f37215g = intProgressionM32427j.getF37215g();
            int f37216h = intProgressionM32427j.getF37216h();
            int f37217i = intProgressionM32427j.getF37217i();
            if (f37217i < 0 ? f37215g >= f37216h : f37215g <= f37216h) {
                while (true) {
                    String str2 = strArr[f37215g];
                    String str3 = strArr[f37215g + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (f37215g == f37216h) {
                        break;
                    }
                    f37215g += f37217i;
                }
            }
            return new Headers(strArr, null);
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m41102deprecated_of(Map<String, String> headers) {
            C9801m.m32346f(headers, "headers");
            return m39749of(headers);
        }

        /* renamed from: of */
        public final Headers m39749of(Map<String, String> map) {
            C9801m.m32346f(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    String string = C10547v.m37549O0(key).toString();
                    if (value != null) {
                        String string2 = C10547v.m37549O0(value).toString();
                        checkName(string);
                        checkValue(string2, string);
                        strArr[i2] = string;
                        strArr[i2 + 1] = string2;
                        i2 += 2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    /* renamed from: of */
    public static final Headers m39747of(Map<String, String> map) {
        return INSTANCE.m39749of(map);
    }

    /* renamed from: of */
    public static final Headers m39748of(String... strArr) {
        return INSTANCE.m39750of(strArr);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m41101deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            length += this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    public final String get(String name) {
        C9801m.m32346f(name, "name");
        return INSTANCE.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        C9801m.m32346f(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String name) {
        C9801m.m32346f(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = C10773s.m38547a(name(i2), value(i2));
        }
        return C9779b.m32281a(pairArr);
    }

    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C10546u.m37517s(StringCompanionObject.f37185a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        C9801m.m32345e(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        C10827z.m38930A(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C10546u.m37517s(StringCompanionObject.f37185a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            Locale locale = Locale.US;
            C9801m.m32345e(locale, "Locale.US");
            if (strName == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i2));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            String strValue = value(i2);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> values(String name) {
        C9801m.m32346f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (C10546u.m37515q(name, name(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return C10817u.m38888j();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C9801m.m32345e(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public /* synthetic */ Headers(String[] strArr, C9789g c9789g) {
        this(strArr);
    }
}
