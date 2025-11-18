package com.squareup.wire.internal;

import Ba.l;
import Ia.d;
import Ia.g;
import Ub.C1786a;
import Ub.n;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3855l;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.InterfaceC4156a;
import wa.C5013c;

/* compiled from: Internal.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000f\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\r\u0010\u0013\u001a/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u000e\u001aA\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0012\u001aA\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0012\u001a#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a!\u0010#\u001a\u00020\"2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$\u001a)\u0010)\u001a\u00060'j\u0002`(2\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020+2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010,\u001a\u00020+2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b,\u0010.\u001a!\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00101\u001a+\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00103\u001aM\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f2\b\u00104\u001a\u0004\u0018\u00010\u001f2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00106\u001a\u0015\u00107\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b7\u00108\u001a\u001b\u00107\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b7\u0010:\u001a\u0015\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b<\u00108\u001a\u001d\u0010>\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t¢\u0006\u0004\b>\u0010?\u001a\u0015\u0010@\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b@\u00108\u001a%\u0010F\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bF\u0010G\u001a%\u0010H\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bH\u0010G\u001a%\u0010I\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bI\u0010G\u001a%\u0010J\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bJ\u0010G\u001a%\u0010K\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bK\u0010G\u001a%\u0010M\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bM\u0010N\u001a%\u0010O\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bO\u0010N\u001a%\u0010P\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bP\u0010N\u001a%\u0010Q\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bQ\u0010N\u001a%\u0010R\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bR\u0010N\u001a%\u0010T\u001a\u00020+2\u0006\u0010B\u001a\u00020S2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bT\u0010U\u001a%\u0010W\u001a\u00020+2\u0006\u0010B\u001a\u00020V2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bW\u0010X\u001a\u0015\u0010[\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0015\u0010]\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b]\u0010\\\u001a\u0015\u0010^\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b^\u0010\\\u001a\u0015\u0010_\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b_\u0010\\\u001a\u0015\u0010`\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b`\u0010\\\u001a\u0015\u0010b\u001a\u00020a2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bb\u0010c\u001a\u0015\u0010d\u001a\u00020a2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bd\u0010c\u001a\u0015\u0010e\u001a\u00020a2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\be\u0010c\u001a\u0015\u0010f\u001a\u00020a2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bf\u0010c\u001a\u0015\u0010g\u001a\u00020a2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bg\u0010c\u001a\u0015\u0010i\u001a\u00020h2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bi\u0010j\u001a\u0015\u0010l\u001a\u00020k2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bl\u0010m\u001a!\u0010q\u001a\u00020\"*\u00060nj\u0002`o2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bq\u0010r\u001a\u0017\u0010s\u001a\u00020/*\u00060nj\u0002`oH\u0000¢\u0006\u0004\bs\u0010t\u001a!\u0010q\u001a\u00020\"*\u00060uj\u0002`v2\b\u0010p\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bq\u0010w\u001a\u0017\u0010s\u001a\u00020/*\u00060uj\u0002`vH\u0000¢\u0006\u0004\bs\u0010x\"\u0014\u0010y\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010z\" \u0010~\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0{*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, d2 = {"T", "", "newMutableList", "()Ljava/util/List;", "K", "V", "", "newMutableMap", "()Ljava/util/Map;", "", "name", "", "list", "copyOf", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "", "map", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;)Ljava/util/Map;", "immutableCopyOf", "immutableCopyOfMapWithStructValues", "value", "immutableCopyOfStruct", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "-redactElements", "(Ljava/util/List;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/List;", "redactElements", "(Ljava/util/Map;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/Map;", "", "a", "b", "", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "args", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "missingRequiredFields", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "Loa/F;", "checkElementsNotNull", "(Ljava/util/List;)V", "(Ljava/util/Map;)V", "", "countNonNull", "(Ljava/lang/Object;Ljava/lang/Object;)I", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I", "d", "rest", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "values", "(Ljava/util/List;)Ljava/lang/String;", "oneOfName", "boxedOneOfClassName", "fieldName", "boxedOneOfKeyFieldName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "boxedOneOfKeysFieldName", "", "array", "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "tag", "encodeArray_int32", "([ILcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint32", "encodeArray_sint32", "encodeArray_fixed32", "encodeArray_sfixed32", "", "encodeArray_int64", "([JLcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint64", "encodeArray_sint64", "encodeArray_fixed64", "encodeArray_sfixed64", "", "encodeArray_float", "([FLcom/squareup/wire/ReverseProtoWriter;I)V", "", "encodeArray_double", "([DLcom/squareup/wire/ReverseProtoWriter;I)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decodePrimitive_int32", "(Lcom/squareup/wire/ProtoReader;)I", "decodePrimitive_uint32", "decodePrimitive_sint32", "decodePrimitive_fixed32", "decodePrimitive_sfixed32", "", "decodePrimitive_int64", "(Lcom/squareup/wire/ProtoReader;)J", "decodePrimitive_uint64", "decodePrimitive_sint64", "decodePrimitive_fixed64", "decodePrimitive_sfixed64", "", "decodePrimitive_float", "(Lcom/squareup/wire/ProtoReader;)F", "", "decodePrimitive_double", "(Lcom/squareup/wire/ProtoReader;)D", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "other", "commonEquals", "(Ljava/time/Instant;Ljava/lang/Object;)Z", "commonHashCode", "(Ljava/time/Instant;)I", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "(Ljava/time/Duration;Ljava/lang/Object;)Z", "(Ljava/time/Duration;)I", "ESCAPED_CHARS", "Ljava/lang/String;", "LIa/d;", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)LIa/d;", "typeName", "wire-runtime"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
/* loaded from: classes2.dex */
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* compiled from: Internal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C3859p implements l<String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "sanitize";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final g getOwner() {
            return P.d(Internal__InternalKt.class, "wire-runtime");
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
        }

        @Override // Ba.l
        public final String invoke(String p02) {
            C3862t.g(p02, "p0");
            return Internal.sanitize(p02);
        }
    }

    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m10redactElements(List<? extends T> list, ProtoAdapter<T> adapter) {
        C3862t.g(list, "<this>");
        C3862t.g(adapter, "adapter");
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final String boxedOneOfClassName(String oneOfName) {
        C3862t.g(oneOfName, "oneOfName");
        if (oneOfName.length() <= 0) {
            return oneOfName;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) C1786a.e(oneOfName.charAt(0)));
        String strSubstring = oneOfName.substring(1);
        C3862t.f(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final String boxedOneOfKeyFieldName(String oneOfName, String fieldName) {
        C3862t.g(oneOfName, "oneOfName");
        C3862t.g(fieldName, "fieldName");
        String upperCase = (oneOfName + '_' + fieldName).toUpperCase(Locale.ROOT);
        C3862t.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String oneOfName) {
        C3862t.g(oneOfName, "oneOfName");
        String upperCase = (oneOfName + "_keys").toUpperCase(Locale.ROOT);
        C3862t.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final void checkElementsNotNull(List<?> list) {
        C3862t.g(list, "list");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) == null) {
                throw new NullPointerException("Element at index " + i10 + " is null");
            }
        }
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        C3862t.g(instant, "<this>");
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(Instant instant) {
        C3862t.g(instant, "<this>");
        return (Long.hashCode(instant.getEpochSecond()) * 31) + Integer.hashCode(instant.getNano());
    }

    @InterfaceC4156a
    public static final <T> List<T> copyOf(String name, List<? extends T> list) {
        C3862t.g(name, "name");
        C3862t.d(list);
        return Internal.copyOf(list);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final double decodePrimitive_double(ProtoReader reader) {
        C3862t.g(reader, "reader");
        C3855l c3855l = C3855l.f44007a;
        return Double.longBitsToDouble(reader.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader reader) {
        C3862t.g(reader, "reader");
        C3856m c3856m = C3856m.f44008a;
        return Float.intBitsToFloat(reader.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader reader) {
        C3862t.g(reader, "reader");
        return reader.readVarint64();
    }

    public static final void encodeArray_double(double[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(Double.doubleToLongBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_float(float[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeFixed32(Float.floatToIntBits(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int32(int[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeSignedVarint32$wire_runtime(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int64(long[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        Internal.encodeArray_fixed32(array, writer, i10);
    }

    public static final void encodeArray_sfixed64(long[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        Internal.encodeArray_fixed64(array, writer, i10);
    }

    public static final void encodeArray_sint32(int[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint64(long[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(array[length]));
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        if (array.length == 0) {
            return;
        }
        int byteCount = writer.getByteCount();
        for (int length = array.length - 1; -1 < length; length--) {
            writer.writeVarint32(array[length]);
        }
        writer.writeVarint32(writer.getByteCount() - byteCount);
        writer.writeTag(i10, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] array, ReverseProtoWriter writer, int i10) {
        C3862t.g(array, "array");
        C3862t.g(writer, "writer");
        Internal.encodeArray_int64(array, writer, i10);
    }

    public static final boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && C3862t.b(obj, obj2));
    }

    private static final d<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return P.b(obj.getClass());
    }

    public static final <T> List<T> immutableCopyOf(String name, List<? extends T> list) {
        C3862t.g(name, "name");
        C3862t.g(list, "list");
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list == r.m() || (list instanceof ImmutableList)) {
            return (List<T>) list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (!immutableList.contains(null)) {
            return immutableList;
        }
        throw new IllegalArgumentException((name + ".contains(null)").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String name, Map<K, ? extends V> map) {
        C3862t.g(name, "name");
        C3862t.g(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException((name + ".containsKey(null)").toString());
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(name, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C3862t.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        C3862t.e(mapUnmodifiableMap, "null cannot be cast to non-null type kotlin.collections.Map<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues, V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOfMapWithStructValues>");
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(String name, T t10) {
        C3862t.g(name, "name");
        if (t10 == null || (t10 instanceof Boolean) || (t10 instanceof Double) || (t10 instanceof String)) {
            return t10;
        }
        if (t10 instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t10).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(name, it.next()));
            }
            T t11 = (T) Collections.unmodifiableList(arrayList);
            C3862t.f(t11, "unmodifiableList(...)");
            return t11;
        }
        if (!(t10 instanceof Map)) {
            throw new IllegalArgumentException("struct value " + name + " must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + getTypeName$Internal__InternalKt(t10) + ": " + t10);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t10).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(name, entry.getKey()), Internal.immutableCopyOfStruct(name, entry.getValue()));
        }
        T t12 = (T) Collections.unmodifiableMap(linkedHashMap);
        C3862t.f(t12, "unmodifiableMap(...)");
        return t12;
    }

    public static final IllegalStateException missingRequiredFields(Object... args) {
        C3862t.g(args, "args");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int iB = C5013c.b(0, args.length - 1, 2);
        String str = "";
        if (iB >= 0) {
            while (true) {
                if (args[i10] == null) {
                    if (sb2.length() > 0) {
                        str = "s";
                    }
                    sb2.append("\n  ");
                    sb2.append(args[i10 + 1]);
                }
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        throw new IllegalStateException("Required field" + str + " not set:" + string);
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(r.m());
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static final String sanitize(String value) {
        C3862t.g(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i10 = 0; i10 < value.length(); i10++) {
            char cCharAt = value.charAt(i10);
            if (n.K(ESCAPED_CHARS, cCharAt, false, 2, null)) {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        C3862t.g(list, "list");
        return (list == r.m() || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final int commonHashCode(Duration duration) {
        C3862t.g(duration, "<this>");
        return (Long.hashCode(duration.getSeconds()) * 31) + Integer.hashCode(duration.getNano());
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        C3862t.g(rest, "rest");
        int i10 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i10++;
        }
        if (obj3 != null) {
            i10++;
        }
        if (obj4 != null) {
            i10++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i10++;
            }
        }
        return i10;
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        C3862t.g(map, "map");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new NullPointerException("map.containsKey(null)");
            }
            if (value == null) {
                throw new NullPointerException("Value for key " + key + " is null");
            }
        }
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        C3862t.g(duration, "<this>");
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    @InterfaceC4156a
    public static final <K, V> Map<K, V> copyOf(String name, Map<K, ? extends V> map) {
        C3862t.g(name, "name");
        C3862t.d(map);
        return Internal.copyOf(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m11redactElements(Map<K, ? extends V> map, ProtoAdapter<V> adapter) {
        C3862t.g(map, "<this>");
        C3862t.g(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap(M.d(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), adapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        C3862t.g(map, "map");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String name, Map<K, ? extends V> map) {
        C3862t.g(name, "name");
        C3862t.g(map, "map");
        if (map.isEmpty()) {
            return M.h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        C3862t.e(setKeySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (!setKeySet.contains(null)) {
            Collection<V> collectionValues = linkedHashMap.values();
            C3862t.e(collectionValues, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
            if (!collectionValues.contains(null)) {
                Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                C3862t.f(mapUnmodifiableMap, "unmodifiableMap(...)");
                return mapUnmodifiableMap;
            }
            throw new IllegalArgumentException((name + ".containsValue(null)").toString());
        }
        throw new IllegalArgumentException((name + ".containsKey(null)").toString());
    }

    public static final String sanitize(List<String> values) {
        C3862t.g(values, "values");
        return r.s0(values, null, "[", "]", 0, null, AnonymousClass2.INSTANCE, 25, null);
    }
}
