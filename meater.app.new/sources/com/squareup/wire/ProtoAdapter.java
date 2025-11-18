package com.squareup.wire;

import Aa.a;
import Cc.C0982e;
import Cc.f;
import Cc.g;
import Cc.h;
import Cc.o;
import Ia.d;
import Ub.n;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapterKt;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 k*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002klBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\r\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0011B/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0012B9\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0013B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0015B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0016B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0017BC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0018J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020'2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010(J)\u0010)\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010*J)\u0010)\u001a\u00020$2\u0006\u0010#\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010+J\u001d\u0010%\u001a\u00020$2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u0010.J\u0015\u0010%\u001a\u00020/2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u00100J\u0015\u00102\u001a\u0002012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b2\u00103J\u001d\u0010%\u001a\u00020$2\u0006\u00105\u001a\u0002042\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u00106J\u0017\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J\u0015\u00109\u001a\u00028\u00002\u0006\u0010;\u001a\u00020/¢\u0006\u0004\b9\u0010<J\u0015\u00109\u001a\u00028\u00002\u0006\u0010;\u001a\u000201¢\u0006\u0004\b9\u0010=J\u0015\u00109\u001a\u00028\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b9\u0010@J#\u0010C\u001a\u00020$2\u0006\u00108\u001a\u0002072\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A¢\u0006\u0004\bC\u0010DJ\u0015\u00109\u001a\u00028\u00002\u0006\u00105\u001a\u00020E¢\u0006\u0004\b9\u0010FJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\bG\u0010HJ\u001b\u0010M\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0004\bK\u0010LJ\u0019\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0\u0000¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0\u0000¢\u0006\u0004\bQ\u0010PR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bS\u0010TR\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\ba\u0010ZR(\u0010b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010PR(\u0010e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010c\u001a\u0004\bf\u0010PR\u0014\u0010j\u001a\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "LIa/d;", "type", "", "typeUrl", "Lcom/squareup/wire/Syntax;", "syntax", "identity", "sourceFile", "<init>", "(Lcom/squareup/wire/FieldEncoding;LIa/d;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;LIa/d;)V", "(Lcom/squareup/wire/FieldEncoding;LIa/d;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;LIa/d;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;LIa/d;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "value", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "encodedSize", "(Ljava/lang/Object;)I", "tag", "encodedSizeWithTag", "(ILjava/lang/Object;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Loa/F;", "encode", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "LCc/f;", "sink", "(LCc/f;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "LCc/h;", "encodeByteString", "(Ljava/lang/Object;)LCc/h;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(LCc/h;)Ljava/lang/Object;", "LCc/g;", "source", "(LCc/g;)Ljava/lang/Object;", "", "destination", "tryDecode", "(Lcom/squareup/wire/ProtoReader;Ljava/util/List;)V", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "withLabel$wire_runtime", "(Lcom/squareup/wire/WireField$Label;)Lcom/squareup/wire/ProtoAdapter;", "withLabel", "", "asPacked", "()Lcom/squareup/wire/ProtoAdapter;", "asRepeated", "Lcom/squareup/wire/FieldEncoding;", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "LIa/d;", "getType", "()LIa/d;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "Ljava/lang/Object;", "getIdentity", "()Ljava/lang/Object;", "getSourceFile", "packedAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "", "isStruct$wire_runtime", "()Z", "isStruct", "Companion", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<h> BYTES;
    public static final ProtoAdapter<h> BYTES_VALUE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<C4153F> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<int[]> INT32_ARRAY;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<long[]> INT64_ARRAY;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<int[]> SINT32_ARRAY;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<long[]> SINT64_ARRAY;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<int[]> UINT32_ARRAY;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<long[]> UINT64_ARRAY;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final d<?> type;
    private final String typeUrl;

    /* compiled from: ProtoAdapter.kt */
    @Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0012\u0010\u0016J_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0012\u0010\u0019Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0012\u0010\u001cJ-\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\b\b\u0001\u0010\u001e*\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b \u0010!J/\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0010\b\u0001\u0010\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00028\u0001H\u0007¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u0014H\u0007¢\u0006\u0004\b#\u0010&J%\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b#\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u001e\u00106\u001a\f\u0012\b\u0012\u000604j\u0002`50\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010*R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010*R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010*R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010*R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010*R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010*R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010*R\u001e\u0010H\u001a\f\u0012\b\u0012\u00060Fj\u0002`G0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010*R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010*R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010*R\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010*R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010*R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010*R\u001c\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010*R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010*R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010*R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010*R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010*R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010*R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010*R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010*R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010*R\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010*R \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010Y0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010*R&\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010*R\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010*R\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010*R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010*R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010*R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010*R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010*R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010*R\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010*¨\u0006f"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "<init>", "()V", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "newMapAdapter", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/lang/Class;", "type", "newMessageAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/ProtoAdapter;", "", "typeUrl", "(Ljava/lang/Class;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Syntax;", "syntax", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)Lcom/squareup/wire/ProtoAdapter;", "Ljava/lang/ClassLoader;", "classLoader", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/wire/EnumAdapter;", "newEnumAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/EnumAdapter;", "message", "get", "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "adapterString", "(Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "BOOL_VALUE", "LCc/h;", "BYTES", "BYTES_VALUE", "", "DOUBLE", "", "DOUBLE_ARRAY", "DOUBLE_VALUE", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "DURATION", "Loa/F;", "EMPTY", "", "FIXED32", "", "FIXED32_ARRAY", "", "FIXED64", "", "FIXED64_ARRAY", "", "FLOAT", "", "FLOAT_ARRAY", "FLOAT_VALUE", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "INSTANT", "INT32", "INT32_ARRAY", "INT32_VALUE", "INT64", "INT64_ARRAY", "INT64_VALUE", "SFIXED32", "SFIXED32_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "SINT32", "SINT32_ARRAY", "SINT64", "SINT64_ARRAY", "STRING", "STRING_VALUE", "", "STRUCT_LIST", "STRUCT_MAP", "", "STRUCT_NULL", "STRUCT_VALUE", "UINT32", "UINT32_ARRAY", "UINT32_VALUE", "UINT64", "UINT64_ARRAY", "UINT64_VALUE", "UnsupportedTypeProtoAdapter", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: ProtoAdapter.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion$UnsupportedTypeProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "()V", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", "value", "Lcom/squareup/wire/ReverseProtoWriter;", "encodedSize", "redact", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (d<?>) P.b(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                C3862t.g(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void encodedSize(Void value) {
                C3862t.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                C3862t.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter writer, Void value) {
                C3862t.g(writer, "writer");
                C3862t.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter writer, Void value) {
                C3862t.g(writer, "writer");
                C3862t.g(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M message) {
            C3862t.g(message, "message");
            return get(message.getClass());
        }

        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> type) {
            C3862t.g(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            C3862t.g(keyAdapter, "keyAdapter");
            C3862t.g(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type) {
            C3862t.g(type, "type");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, null, false, 24, null);
        }

        private Companion() {
        }

        public final <M> ProtoAdapter<M> get(Class<M> type) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            C3862t.g(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                C3862t.e(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e10) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e10);
            } catch (NoSuchFieldException e11) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e11);
            }
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl) {
            C3862t.g(type, "type");
            C3862t.g(typeUrl, "typeUrl");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, null, false, 24, null);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax) {
            C3862t.g(type, "type");
            C3862t.g(typeUrl, "typeUrl");
            C3862t.g(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, null, false, 24, null);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax, ClassLoader classLoader) {
            C3862t.g(type, "type");
            C3862t.g(typeUrl, "typeUrl");
            C3862t.g(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, classLoader, false, 16, null);
        }

        public final ProtoAdapter<?> get(String adapterString) {
            C3862t.g(adapterString, "adapterString");
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        public final ProtoAdapter<?> get(String adapterString, ClassLoader classLoader) throws IllegalAccessException, IllegalArgumentException {
            C3862t.g(adapterString, "adapterString");
            try {
                int iX = n.X(adapterString, '#', 0, false, 6, null);
                String strSubstring = adapterString.substring(0, iX);
                C3862t.f(strSubstring, "substring(...)");
                String strSubstring2 = adapterString.substring(iX + 1);
                C3862t.f(strSubstring2, "substring(...)");
                Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
                C3862t.e(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e10) {
                throw new IllegalArgumentException("failed to access " + adapterString, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalArgumentException("failed to access " + adapterString, e11);
            } catch (NoSuchFieldException e12) {
                throw new IllegalArgumentException("failed to access " + adapterString, e12);
            }
        }
    }

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> protoAdapterCommonBool = ProtoAdapterKt.commonBool();
        BOOL = protoAdapterCommonBool;
        ProtoAdapter<Integer> protoAdapterCommonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = protoAdapterCommonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonInt32);
        ProtoAdapter<Integer> protoAdapterCommonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = protoAdapterCommonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonUint32);
        ProtoAdapter<Integer> protoAdapterCommonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = protoAdapterCommonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSint32);
        ProtoAdapter<Integer> protoAdapterCommonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = protoAdapterCommonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonFixed32);
        ProtoAdapter<Integer> protoAdapterCommonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = protoAdapterCommonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSfixed32);
        ProtoAdapter<Long> protoAdapterCommonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = protoAdapterCommonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonInt64);
        ProtoAdapter<Long> protoAdapterCommonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = protoAdapterCommonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonUint64);
        ProtoAdapter<Long> protoAdapterCommonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = protoAdapterCommonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSint64);
        ProtoAdapter<Long> protoAdapterCommonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = protoAdapterCommonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonFixed64);
        ProtoAdapter<Long> protoAdapterCommonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = protoAdapterCommonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSfixed64);
        FloatProtoAdapter floatProtoAdapterCommonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = floatProtoAdapterCommonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapterCommonFloat);
        DoubleProtoAdapter doubleProtoAdapterCommonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = doubleProtoAdapterCommonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(doubleProtoAdapterCommonDouble);
        ProtoAdapter<h> protoAdapterCommonBytes = ProtoAdapterKt.commonBytes();
        BYTES = protoAdapterCommonBytes;
        ProtoAdapter<String> protoAdapterCommonString = ProtoAdapterKt.commonString();
        STRING = protoAdapterCommonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(doubleProtoAdapterCommonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(floatProtoAdapterCommonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, d<?> dVar, String str, Syntax syntax, E e10, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = dVar;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e10;
        this.sourceFile = str2;
        boolean z10 = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z10 || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding() == fieldEncoding2) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z10) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m10) {
        return INSTANCE.get((Companion) m10);
    }

    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract E decode(ProtoReader reader);

    public final E decode(InputStream stream) {
        C3862t.g(stream, "stream");
        return decode(o.d(o.k(stream)));
    }

    public abstract void encode(ProtoWriter writer, E value);

    public final void encode(OutputStream stream, E value) {
        C3862t.g(stream, "stream");
        f fVarC = o.c(o.g(stream));
        encode(fVarC, (f) value);
        fVarC.M();
    }

    public final h encodeByteString(E value) {
        C0982e c0982e = new C0982e();
        encode((f) c0982e, (C0982e) value);
        return c0982e.u();
    }

    public void encodeWithTag(ProtoWriter writer, int tag, E value) {
        C3862t.g(writer, "writer");
        if (value != null) {
            writer.writeTag(tag, getFieldEncoding());
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(value));
            }
            encode(writer, (ProtoWriter) value);
        }
    }

    public abstract int encodedSize(E value);

    public int encodedSizeWithTag(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + iEncodedSize;
    }

    /* renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final d<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return C3862t.b(this, STRUCT_MAP) || C3862t.b(this, STRUCT_LIST) || C3862t.b(this, STRUCT_VALUE) || C3862t.b(this, STRUCT_NULL);
    }

    public abstract E redact(E value);

    public String toString(E value) {
        return String.valueOf(value);
    }

    public final void tryDecode(ProtoReader reader, List<E> destination) {
        C3862t.g(reader, "reader");
        C3862t.g(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        C3862t.g(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    /* compiled from: ProtoAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "value", "LIa/d;", "type", "<init>", "(ILIa/d;)V", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "I", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i10, d<?> dVar) {
            Class clsB;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown enum tag ");
            sb2.append(i10);
            sb2.append(" for ");
            sb2.append((dVar == null || (clsB = a.b(dVar)) == null) ? null : clsB.getName());
            super(sb2.toString());
            this.value = i10;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i10, Class<?> type) {
            this(i10, (d<?>) a.e(type));
            C3862t.g(type, "type");
        }
    }

    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return INSTANCE.get(cls);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return INSTANCE.newMessageAdapter(cls, str);
    }

    public final E decode(byte[] bytes) {
        C3862t.g(bytes, "bytes");
        return decode(new C0982e().i1(bytes));
    }

    public static final ProtoAdapter<?> get(String str) {
        return INSTANCE.get(str);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return INSTANCE.newMessageAdapter(cls, str, syntax);
    }

    public final E decode(h bytes) {
        C3862t.g(bytes, "bytes");
        return decode(new C0982e().t0(bytes));
    }

    public static final ProtoAdapter<?> get(String str, ClassLoader classLoader) {
        return INSTANCE.get(str, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        return INSTANCE.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public final E decode(g source) {
        C3862t.g(source, "source");
        return decode(new ProtoReader(source));
    }

    public void encode(ReverseProtoWriter writer, E value) {
        C3862t.g(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt.C29841(this, value));
    }

    public final void encode(f sink, E value) {
        C3862t.g(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, (ReverseProtoWriter) value);
        reverseProtoWriter.writeTo(sink);
    }

    public void encodeWithTag(ReverseProtoWriter writer, int tag, E value) {
        C3862t.g(writer, "writer");
        if (value != null) {
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, (ReverseProtoWriter) value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, (ReverseProtoWriter) value);
            }
            writer.writeTag(tag, getFieldEncoding());
        }
    }

    public final byte[] encode(E value) {
        C0982e c0982e = new C0982e();
        encode((f) c0982e, (C0982e) value);
        return c0982e.Z();
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, d dVar, String str, Syntax syntax, Object obj, String str2, int i10, C3854k c3854k) {
        this(fieldEncoding, (d<?>) dVar, str, syntax, (i10 & 16) != 0 ? null : obj, (i10 & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type) {
        this(fieldEncoding, (d<?>) a.e(type));
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, (d<?>) a.e(type), str, Syntax.PROTO_2);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax) {
        this(fieldEncoding, (d<?>) a.e(type), str, syntax);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e10) {
        this(fieldEncoding, (d<?>) a.e(type), str, syntax, e10, (String) null);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, d<?> dVar) {
        this(fieldEncoding, dVar, (String) null, Syntax.PROTO_2);
        C3862t.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, d<?> dVar, String str) {
        this(fieldEncoding, dVar, str, Syntax.PROTO_2);
        C3862t.g(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, d<?> dVar, String str, Syntax syntax) {
        this(fieldEncoding, dVar, str, syntax, (Object) null);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, d<?> dVar, String str, Syntax syntax, E e10) {
        this(fieldEncoding, dVar, str, syntax, e10, (String) null);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e10, String str2) {
        this(fieldEncoding, (d<?>) a.e(type), str, syntax, e10, str2);
        C3862t.g(fieldEncoding, "fieldEncoding");
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }
}
