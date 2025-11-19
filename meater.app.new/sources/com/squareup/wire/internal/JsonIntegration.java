package com.squareup.wire.internal;

import Aa.a;
import Cc.h;
import Ia.d;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JsonIntegration.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\b'()*+,-.B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJE\u0010\u000e\u001a\u00028\u0001\"\b\b\u0002\u0010\u000f*\u00020\u0003\"\b\b\u0003\u0010\u0010*\u00020\u00032\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u0014H\u0002¢\u0006\u0002\u0010\u0015JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0002\u0010\u000f*\u00020\u0003\"\b\b\u0003\u0010\u0010*\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u00192\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0015\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00028\u0001H&¢\u0006\u0002\u0010 J)\u0010!\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010#\u001a\u00028\u0001H&¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0015\u0010&\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010 ¨\u0006/"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration;", "F", "A", "", "()V", "formatterAdapter", "jsonStringAdapter", "Lcom/squareup/wire/internal/JsonFormatter;", "(Lcom/squareup/wire/internal/JsonFormatter;)Ljava/lang/Object;", "frameworkAdapter", "framework", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "jsonAdapter", "M", "B", "syntax", "Lcom/squareup/wire/Syntax;", "field", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "(Ljava/lang/Object;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/internal/FieldOrOneOfBinding;)Ljava/lang/Object;", "jsonAdapters", "", "adapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/lang/Object;)Ljava/util/List;", "jsonFormatter", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "listAdapter", "elementAdapter", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapAdapter", "keyFormatter", "valueAdapter", "(Ljava/lang/Object;Lcom/squareup/wire/internal/JsonFormatter;Ljava/lang/Object;)Ljava/lang/Object;", "mapKeyJsonFormatter", "structAdapter", "ByteStringJsonFormatter", "IntAsStringJsonFormatter", "LongAsStringJsonFormatter", "StringJsonFormatter", "UnsignedIntAsNumberJsonFormatter", "UnsignedIntAsStringJsonFormatter", "UnsignedLongAsNumberJsonFormatter", "UnsignedLongAsStringJsonFormatter", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class JsonIntegration<F, A> {

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$ByteStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "LCc/h;", "<init>", "()V", "value", "", "toStringOrNumber", "(LCc/h;)Ljava/lang/String;", "fromString", "(Ljava/lang/String;)LCc/h;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ByteStringJsonFormatter implements JsonFormatter<h> {
        public static final ByteStringJsonFormatter INSTANCE = new ByteStringJsonFormatter();

        private ByteStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public h fromString(String value) {
            C3862t.g(value, "value");
            return h.INSTANCE.a(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(h value) {
            C3862t.g(value, "value");
            return value.c();
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$IntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class IntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final IntAsStringJsonFormatter INSTANCE = new IntAsStringJsonFormatter();

        private IntAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            C3862t.g(value, "value");
            return Integer.valueOf(Integer.parseInt(value));
        }

        public String toStringOrNumber(int value) {
            return String.valueOf(value);
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$LongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Long;", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final LongAsStringJsonFormatter INSTANCE = new LongAsStringJsonFormatter();

        private LongAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l10) {
            return toStringOrNumber(l10.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) throws NumberFormatException {
            long jLongValueExact;
            C3862t.g(value, "value");
            try {
                jLongValueExact = Long.parseLong(value);
            } catch (Exception unused) {
                jLongValueExact = new BigDecimal(value).longValueExact();
            }
            return Long.valueOf(jLongValueExact);
        }

        public String toStringOrNumber(long value) {
            return String.valueOf(value);
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$StringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "fromString", "value", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class StringJsonFormatter implements JsonFormatter<String> {
        public static final StringJsonFormatter INSTANCE = new StringJsonFormatter();

        private StringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String fromString(String value) {
            C3862t.g(value, "value");
            return value;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(String value) {
            C3862t.g(value, "value");
            return value;
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "maxInt", "", "power32", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UnsignedIntAsNumberJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsNumberJsonFormatter INSTANCE = new UnsignedIntAsNumberJsonFormatter();
        private static final long maxInt = 2147483647L;
        private static final long power32 = 4294967296L;

        private UnsignedIntAsNumberJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            C3862t.g(value, "value");
            long j10 = (long) Double.parseDouble(value);
            if (j10 >= maxInt) {
                j10 -= power32;
            }
            return Integer.valueOf((int) j10);
        }

        public Object toStringOrNumber(int value) {
            return value < 0 ? Long.valueOf(value + power32) : Integer.valueOf(value);
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "power32", "", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UnsignedIntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsStringJsonFormatter INSTANCE = new UnsignedIntAsStringJsonFormatter();
        private static final long power32 = 4294967296L;

        private UnsignedIntAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            C3862t.g(value, "value");
            return Integer.valueOf((int) Long.parseLong(value));
        }

        public Object toStringOrNumber(int value) {
            return value < 0 ? String.valueOf(value + power32) : String.valueOf(value);
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "maxLong", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "power64", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Long;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UnsignedLongAsNumberJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsNumberJsonFormatter INSTANCE = new UnsignedLongAsNumberJsonFormatter();
        private static final BigInteger power64 = new BigInteger("18446744073709551616");
        private static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        private UnsignedLongAsNumberJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l10) {
            return toStringOrNumber(l10.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            BigInteger bigInteger;
            C3862t.g(value, "value");
            try {
                bigInteger = new BigInteger(value);
            } catch (Exception unused) {
                bigInteger = new BigDecimal(value).toBigInteger();
            }
            return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
        }

        public Object toStringOrNumber(long value) {
            Object objAdd = value < 0 ? power64.add(BigInteger.valueOf(value)) : Long.valueOf(value);
            C3862t.d(objAdd);
            return objAdd;
        }
    }

    /* compiled from: JsonIntegration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "()V", "fromString", "value", "", "(Ljava/lang/String;)Ljava/lang/Long;", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UnsignedLongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsStringJsonFormatter INSTANCE = new UnsignedLongAsStringJsonFormatter();

        private UnsignedLongAsStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l10) {
            return toStringOrNumber(l10.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            C3862t.g(value, "value");
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(value);
        }

        public String toStringOrNumber(long value) {
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.toStringOrNumber(value).toString();
        }
    }

    private final <M, B> A jsonAdapter(F framework, Syntax syntax, FieldOrOneOfBinding<M, B> field) {
        A aFrameworkAdapter;
        if (field.getSingleAdapter().isStruct$wire_runtime()) {
            return structAdapter(framework);
        }
        JsonFormatter<?> jsonFormatter = jsonFormatter(syntax, field.getSingleAdapter());
        if (jsonFormatter != null) {
            aFrameworkAdapter = formatterAdapter(jsonFormatter);
        } else {
            d<?> type = field.getSingleAdapter().getType();
            Class clsC = type != null ? a.c(type) : null;
            C3862t.e(clsC, "null cannot be cast to non-null type java.lang.reflect.Type");
            aFrameworkAdapter = frameworkAdapter(framework, clsC);
        }
        return field.getLabel().isRepeated() ? listAdapter(aFrameworkAdapter) : field.isMap() ? mapAdapter(framework, mapKeyJsonFormatter(field.getKeyAdapter()), aFrameworkAdapter) : aFrameworkAdapter;
    }

    private final JsonFormatter<?> jsonFormatter(Syntax syntax, ProtoAdapter<?> protoAdapter) {
        if (C3862t.b(protoAdapter, ProtoAdapter.BYTES) ? true : C3862t.b(protoAdapter, ProtoAdapter.BYTES_VALUE)) {
            return ByteStringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.DURATION)) {
            return DurationJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.INSTANT)) {
            return InstantJsonFormatter.INSTANCE;
        }
        if (protoAdapter instanceof EnumAdapter) {
            return new EnumJsonFormatter((EnumAdapter) protoAdapter);
        }
        if (syntax == Syntax.PROTO_2) {
            if (C3862t.b(protoAdapter, ProtoAdapter.UINT64) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
                return UnsignedLongAsNumberJsonFormatter.INSTANCE;
            }
            return null;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.UINT32) ? true : C3862t.b(protoAdapter, ProtoAdapter.FIXED32) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT32_VALUE)) {
            return UnsignedIntAsNumberJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.INT64) ? true : C3862t.b(protoAdapter, ProtoAdapter.SFIXED64) ? true : C3862t.b(protoAdapter, ProtoAdapter.SINT64) ? true : C3862t.b(protoAdapter, ProtoAdapter.INT64_VALUE)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.FIXED64) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT64) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        return null;
    }

    private final JsonFormatter<?> mapKeyJsonFormatter(ProtoAdapter<?> protoAdapter) {
        if (C3862t.b(protoAdapter, ProtoAdapter.STRING)) {
            return StringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.INT32) ? true : C3862t.b(protoAdapter, ProtoAdapter.SINT32) ? true : C3862t.b(protoAdapter, ProtoAdapter.SFIXED32)) {
            return IntAsStringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.FIXED32) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT32)) {
            return UnsignedIntAsStringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.INT64) ? true : C3862t.b(protoAdapter, ProtoAdapter.SFIXED64) ? true : C3862t.b(protoAdapter, ProtoAdapter.SINT64)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (C3862t.b(protoAdapter, ProtoAdapter.FIXED64) ? true : C3862t.b(protoAdapter, ProtoAdapter.UINT64)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        throw new IllegalStateException(("Unexpected map key type: " + protoAdapter.getType()).toString());
    }

    public abstract A formatterAdapter(JsonFormatter<?> jsonStringAdapter);

    public abstract A frameworkAdapter(F framework, Type type);

    public final <M, B> List<A> jsonAdapters(RuntimeMessageAdapter<M, B> adapter, F framework) {
        C3862t.g(adapter, "adapter");
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) adapter.getFields().values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(jsonAdapter(framework, adapter.getSyntax(), fieldOrOneOfBinding));
        }
        return arrayList;
    }

    public abstract A listAdapter(A elementAdapter);

    public abstract A mapAdapter(F framework, JsonFormatter<?> keyFormatter, A valueAdapter);

    public abstract A structAdapter(F framework);
}
