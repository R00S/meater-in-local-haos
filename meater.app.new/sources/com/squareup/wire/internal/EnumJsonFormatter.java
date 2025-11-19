package com.squareup.wire.internal;

import Aa.a;
import Ia.d;
import com.apptionlabs.meater_app.v1protobuf.V1AlarmState;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EnumJsonFormatter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", "adapter", "Lcom/squareup/wire/EnumAdapter;", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "fromString", "value", "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/String;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> adapter) {
        C3862t.g(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        d<?> type = adapter.getType();
        C3862t.d(type);
        Class clsB = a.b(type);
        C3862t.e(clsB, "null cannot be cast to non-null type java.lang.Class<E of com.squareup.wire.internal.EnumJsonFormatter>");
        Object[] enumConstants = clsB.getEnumConstants();
        C3862t.f(enumConstants, "getEnumConstants(...)");
        for (V1AlarmState v1AlarmState : (WireEnum[]) enumConstants) {
            C3862t.e(v1AlarmState, "null cannot be cast to non-null type kotlin.Enum<*>");
            String strName = v1AlarmState.name();
            linkedHashMap.put(strName, v1AlarmState);
            linkedHashMap.put(String.valueOf(v1AlarmState.getValue()), v1AlarmState);
            linkedHashMap2.put(v1AlarmState, strName);
            WireEnumConstant wireEnumConstant = (WireEnumConstant) clsB.getDeclaredField(strName).getAnnotation(WireEnumConstant.class);
            if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                linkedHashMap.put(wireEnumConstant.declaredName(), v1AlarmState);
                linkedHashMap2.put(v1AlarmState, wireEnumConstant.declaredName());
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        C3862t.g(value, "value");
        return this.stringToValue.get(value);
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(E value) {
        C3862t.g(value, "value");
        String str = this.valueToString.get(value);
        C3862t.d(str);
        return str;
    }
}
