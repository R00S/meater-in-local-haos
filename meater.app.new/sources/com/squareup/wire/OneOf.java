package com.squareup.wire;

import com.squareup.wire.OneOf.Key;
import com.squareup.wire.internal.Internal;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: OneOf.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0010\b\u0000\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001(B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0002\u0010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006)"}, d2 = {"Lcom/squareup/wire/OneOf;", "Lcom/squareup/wire/OneOf$Key;", "K", "T", "", "key", "value", "<init>", "(Lcom/squareup/wire/OneOf$Key;Ljava/lang/Object;)V", "X", "getOrNull", "(Lcom/squareup/wire/OneOf$Key;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "encodedSizeWithTag", "()I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Loa/F;", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;)V", "component1", "()Lcom/squareup/wire/OneOf$Key;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/squareup/wire/OneOf$Key;Ljava/lang/Object;)Lcom/squareup/wire/OneOf;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/squareup/wire/OneOf$Key;", "getKey", "Ljava/lang/Object;", "getValue", "Key", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OneOf<K extends Key<T>, T> {
    private final K key;
    private final T value;

    public OneOf(K key, T t10) {
        C3862t.g(key, "key");
        this.key = key;
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOf copy$default(OneOf oneOf, Key key, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            key = oneOf.key;
        }
        if ((i10 & 2) != 0) {
            obj = oneOf.value;
        }
        return oneOf.copy(key, obj);
    }

    public final K component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    public final OneOf<K, T> copy(K key, T value) {
        C3862t.g(key, "key");
        return new OneOf<>(key, value);
    }

    public final void encodeWithTag(ProtoWriter writer) {
        C3862t.g(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), (int) this.value);
    }

    public final int encodedSizeWithTag() {
        return this.key.getAdapter().encodedSizeWithTag(this.key.getTag(), this.value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneOf)) {
            return false;
        }
        OneOf oneOf = (OneOf) other;
        return C3862t.b(this.key, oneOf.key) && C3862t.b(this.value, oneOf.value);
    }

    public final K getKey() {
        return this.key;
    }

    public final <X> X getOrNull(Key<X> key) {
        C3862t.g(key, "key");
        if (C3862t.b(this.key, key)) {
            return this.value;
        }
        return null;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        T t10 = this.value;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        ProtoAdapter<T> adapter = this.key.getAdapter();
        return this.key.getDeclaredName() + '=' + (C3862t.b(adapter, ProtoAdapter.STRING) ? true : C3862t.b(adapter, ProtoAdapter.STRING_VALUE) ? Internal.sanitize(String.valueOf(this.value)) : String.valueOf(this.value));
    }

    public final void encodeWithTag(ReverseProtoWriter writer) {
        C3862t.g(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), (int) this.value);
    }

    /* compiled from: OneOf.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/squareup/wire/OneOf$Key;", "T", "", "tag", "", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "declaredName", "", "redacted", "", "jsonName", "(ILcom/squareup/wire/ProtoAdapter;Ljava/lang/String;ZLjava/lang/String;)V", "getAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getDeclaredName", "()Ljava/lang/String;", "getJsonName", "getRedacted", "()Z", "getTag", "()I", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Key<T> {
        private final ProtoAdapter<T> adapter;
        private final String declaredName;
        private final String jsonName;
        private final boolean redacted;
        private final int tag;

        public Key(int i10, ProtoAdapter<T> adapter, String declaredName, boolean z10, String jsonName) {
            C3862t.g(adapter, "adapter");
            C3862t.g(declaredName, "declaredName");
            C3862t.g(jsonName, "jsonName");
            this.tag = i10;
            this.adapter = adapter;
            this.declaredName = declaredName;
            this.redacted = z10;
            this.jsonName = jsonName;
        }

        public final ProtoAdapter<T> getAdapter() {
            return this.adapter;
        }

        public final String getDeclaredName() {
            return this.declaredName;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final boolean getRedacted() {
            return this.redacted;
        }

        public final int getTag() {
            return this.tag;
        }

        public /* synthetic */ Key(int i10, ProtoAdapter protoAdapter, String str, boolean z10, String str2, int i11, C3854k c3854k) {
            this(i10, protoAdapter, str, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? "" : str2);
        }
    }
}
