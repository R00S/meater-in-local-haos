package com.squareup.wire.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: -Platform.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a8\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010*\n\u0010\u0012\"\u00020\u00112\u00020\u0011*\n\u0010\u0013\"\u00020\u00112\u00020\u0011*\n\u0010\u0014\"\u00020\u00112\u00020\u0011*\n\u0010\u0015\"\u00020\u00112\u00020\u0011*\n\u0010\u0017\"\u00020\u00162\u00020\u0016*\n\u0010\u0019\"\u00020\u00182\u00020\u0018*\n\u0010\u001b\"\u00020\u001a2\u00020\u001a*\n\u0010\u001c\"\u00020\u00112\u00020\u0011¨\u0006\u001d"}, d2 = {"T", "", "", "toUnmodifiableList", "(Ljava/util/List;)Ljava/util/List;", "K", "V", "", "", "toUnmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", "", "string", "", "upperCamel", "camelCase", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "JvmDefaultWithCompatibility", "JvmField", "JvmStatic", "JvmSynthetic", "Ljava/io/ObjectStreamException;", "ObjectStreamException", "Ljava/net/ProtocolException;", "ProtocolException", "Ljava/io/Serializable;", "Serializable", "Throws", "wire-runtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class _PlatformKt {
    public static final String camelCase(String string, boolean z10) {
        C3862t.g(string, "string");
        StringBuilder sb2 = new StringBuilder(string.length());
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (iCodePointAt == 95) {
                z10 = true;
            } else {
                if (z10 && 97 <= iCodePointAt && iCodePointAt < 123) {
                    iCodePointAt -= 32;
                }
                sb2.appendCodePoint(iCodePointAt);
                z10 = false;
            }
        }
        String string2 = sb2.toString();
        C3862t.f(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ String camelCase$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return camelCase(str, z10);
    }

    public static final <T> List<T> toUnmodifiableList(List<T> list) {
        C3862t.g(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        C3862t.f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toUnmodifiableMap(Map<K, V> map) {
        C3862t.g(map, "<this>");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        C3862t.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }
}
