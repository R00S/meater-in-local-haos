package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "()V", "map", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)V", "readExternal", HttpUrl.FRAGMENT_ENCODE_SET, "input", "Ljava/io/ObjectInput;", "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: f */
    public static final a f41514f = new a(null);

    /* renamed from: g */
    private Map<?, ?> f41515g;

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m32267d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public SerializedMap(Map<?, ?> map) {
        C9801m.m32346f(map, "map");
        this.f41515g = map;
    }

    private final Object readResolve() {
        return this.f41515g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws InvalidObjectException {
        C9801m.m32346f(input, "input");
        byte b2 = input.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2));
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        Map mapM38792d = C10808p0.m38792d(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            mapM38792d.put(input.readObject(), input.readObject());
        }
        this.f41515g = C10808p0.m38790b(mapM38792d);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        C9801m.m32346f(output, "output");
        output.writeByte(0);
        output.writeInt(this.f41515g.size());
        for (Map.Entry<?, ?> entry : this.f41515g.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(C10810q0.m38797i());
    }
}
