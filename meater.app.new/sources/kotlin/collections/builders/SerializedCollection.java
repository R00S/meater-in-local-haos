package kotlin.collections.builders;

import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListBuilder.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "()V", "collection", HttpUrl.FRAGMENT_ENCODE_SET, StoreTabGridRecyclerFragment.BundleCons.TAG, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Collection;I)V", "readExternal", HttpUrl.FRAGMENT_ENCODE_SET, "input", "Ljava/io/ObjectInput;", "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: f */
    public static final a f41511f = new a(null);

    /* renamed from: g */
    private Collection<?> f41512g;

    /* renamed from: h */
    private final int f41513h;

    /* compiled from: ListBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "tagList", HttpUrl.FRAGMENT_ENCODE_SET, "tagSet", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public SerializedCollection(Collection<?> collection, int i2) {
        C9801m.m32346f(collection, "collection");
        this.f41512g = collection;
        this.f41513h = i2;
    }

    private final Object readResolve() {
        return this.f41512g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws InvalidObjectException {
        Collection<?> collectionM38879a;
        C9801m.m32346f(input, "input");
        byte b2 = input.readByte();
        int i2 = b2 & 1;
        if ((b2 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + '.');
        }
        int i3 = input.readInt();
        if (i3 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i3 + '.');
        }
        int i4 = 0;
        if (i2 == 0) {
            List listM38882d = C10815t.m38882d(i3);
            while (i4 < i3) {
                listM38882d.add(input.readObject());
                i4++;
            }
            collectionM38879a = C10815t.m38879a(listM38882d);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            Set setM38915b = C10820v0.m38915b(i3);
            while (i4 < i3) {
                setM38915b.add(input.readObject());
                i4++;
            }
            collectionM38879a = C10820v0.m38914a(setM38915b);
        }
        this.f41512g = collectionM38879a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        C9801m.m32346f(output, "output");
        output.writeByte(this.f41513h);
        output.writeInt(this.f41512g.size());
        Iterator<?> it = this.f41512g.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(C10817u.m38888j(), 0);
    }
}
